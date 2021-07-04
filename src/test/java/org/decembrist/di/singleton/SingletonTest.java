package org.decembrist.di.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * ЗАДАЧА №1.1
 *
 * 1. Инъектируется бин типа {@link Singleton}
 * 2. Вызывается метод returnInput c input = 1, проверяется что метод вернул 1
 * 3. Вызывается метод returnInput c input = 2147483647, проверяется что метод вернул 2147483647
 * 4. Вызывается метод returnInput c input = -2147483648, проверяется что метод вернул -2147483648
 * 5. Проверяется что метод returnInput вызвался 3 раза
 */
@SpringBootTest
class SingletonTest {

    @SpyBean
    private Singleton singleton;

    @Test
    @DisplayName("Проверка что бин типа Singleton существует и метод returnInput возвращает input")
    public void testSingleton() {
        var result = singleton.returnInput(1);
        assertEquals(1, result, message(1));
        result = singleton.returnInput(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, result, message(Integer.MAX_VALUE));
        result = singleton.returnInput(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, result, message(Integer.MIN_VALUE));
        verify(singleton, times(3)).returnInput(anyInt());
    }

    private String message(int input) {
        return "при input = " + input + " ожидался результат " + input;
    }
}