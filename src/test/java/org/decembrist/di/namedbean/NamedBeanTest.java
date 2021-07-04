package org.decembrist.di.namedbean;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * ЗАДАЧА №2.1
 *
 * 1. Проверяю что в контексте есть бины с именами named1 и named2
 * 2. Проверяю что они имеют типа NamedBean
 */
@SpringBootTest
public class NamedBeanTest {

    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Проверка существования бинов типа NamedBean с именами named1 и named2")
    public void namedBeanTest() {
        var named1 = context.getBean(NamedBean.FIRST_NAMED_BEAN_NAME);
        assertNotNull(named1, "бин с именем named1 не найден");
        assertTrue(named1 instanceof NamedBean, "именованый бин named1 должен быть типа NamedBean");
        var named2 = context.getBean(NamedBean.SECOND_NAMED_BEAN_NAME);
        assertNotNull(named2, "бин с именем named2 не найден");
        assertTrue(named2 instanceof NamedBean, "именованый бин named2 должен быть типа NamedBean");
    }

}
