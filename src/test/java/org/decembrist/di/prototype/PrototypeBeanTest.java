package org.decembrist.di.prototype;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ЗАДАЧА №4
 *
 * 1. Инъектирую бин типа {@link PrototypeBean} дважды
 * 2. Проверяю, что второй бин не равен первому
 */
@SpringBootTest
class PrototypeBeanTest {

    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Проверка что бин типа PrototypeBean существует и имеет скоуп прототип")
    public void prototypeTest() {
        PrototypeBean bean = context.getBean(PrototypeBean.class);
        assertNotNull(bean, "Бин типа PrototypeBean не найден");
        assertNotEquals(bean, context.getBean(PrototypeBean.class), "Бин PrototypeBean - синглтон");
    }

}