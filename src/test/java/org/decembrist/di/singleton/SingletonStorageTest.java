package org.decembrist.di.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ЗАДАЧА №1.2
 *
 * 1. Инъектирую бин типа {@link SingletonStorage}
 * 2. Создаю бин типа {@link Singleton}
 * 3. Вызываю у бин типа {@link SingletonStorage} метод getSingletonInstance
 * 4. Проверяю что метод getSingletonInstance вернул объект который равен бину типа {@link Singleton}
 */
@SpringBootTest
class SingletonStorageTest {

    @Autowired
    private SingletonStorage singletonStorage;

    @MockBean
    private Singleton singleton;

    @Test
    @DisplayName("Проверка что бин типа SingletonStorage существует и метод getSingletonInstance возвращает singleton")
    public void testSingletonStorage() {
        Singleton result = singletonStorage.getSingletonInstance();
        assertNotNull(result, "getSingletonInstance вернул null");
        assertEquals(singleton, result, "getSingletonInstance вернул singleton который не равен бину типа Singleton");
    }

}