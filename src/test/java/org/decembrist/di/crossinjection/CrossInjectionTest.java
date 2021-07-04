package org.decembrist.di.crossinjection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ЗАДАЧА №5
 *
 * 1. Инъектирую бины типов {@link ABean} и {@link BBean}
 * 2. Проверяю что бин типа {@link BBean} при вызове getABean возвращает бин типа {@link ABean}
 * 3. Проверяю что бин типа {@link ABean} при вызове getBBean возвращает бин типа {@link BBean}
 */
@SpringBootTest
class CrossInjectionTest {

    @Autowired
    private ABean aBean;

    @Autowired
    private BBean bBean;

    @Test
    @DisplayName("Циркулярные зависимости должны работать корректно")
    public void crossInjectionTest() {
        assertEquals(aBean, bBean.getABean(), "Метод getABean вернул объект не эквивалентный бину типа ABean");
        assertEquals(bBean, aBean.getBBean(), "Метод getBBean вернул объект не эквивалентный бину типа BBean");
    }

}