package org.decembrist.di.property;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

import java.util.concurrent.ThreadLocalRandom;

import static org.decembrist.di.property.PropertyBean.TEST_PROPERTY_NAME;
import static org.junit.jupiter.api.Assertions.*;

/**
 * ЗАДАЧА №6
 *
 * 1. Инъектирую бин типа {@link PropertyBean}
 * 2. Создаю фэйковый ключ test.property со значением TEST_PROPERTY_VALUE
 * 3. Проверяю что метод {@link PropertyBean} getTestPropertyValue возвращает TEST_PROPERTY_VALUE
 */
@SpringBootTest
class PropertyBeanTest {

    public static int TEST_PROPERTY_VALUE = ThreadLocalRandom.current().nextInt();

    @Autowired
    private PropertyBean propertyBean;

    @Test
    @DisplayName("Проверка что бин типа PropertyBean существует " +
            "и getTestPropertyValue возвращает значение свойства test.property")
    public void propertyBeanTest() {
        int propertyValue = propertyBean.getTestPropertyValue();
        assertEquals(TEST_PROPERTY_VALUE, propertyValue);
    }

    @DynamicPropertySource
    public static void mockProperties(DynamicPropertyRegistry registry) {
        registry.add(TEST_PROPERTY_NAME, () -> TEST_PROPERTY_VALUE);
    }
}