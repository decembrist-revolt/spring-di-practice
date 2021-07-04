package org.decembrist.di.namedbean;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ЗАДАЧА №2.2
 *
 * 1. Инъектирую бины типов {@link NamedBeanStorage}, {@link NamedBean}
 * 2. Вызываю методы namedBean1 и namedBean2 бина типа NamedBeanStorage
 * 3. Проверяю что методы вернули объекты равные бинам типа {@link NamedBean} с именами named1 и named2
 */
@SpringBootTest
class NamedBeanStorageTest {

    @Autowired
    private NamedBeanStorage namedBeanStorage;

    @MockBean(name = NamedBean.FIRST_NAMED_BEAN_NAME)
    private NamedBean named1;

    @MockBean(name = NamedBean.SECOND_NAMED_BEAN_NAME)
    private NamedBean named2;

    @Test
    @DisplayName("Проверка что бин типа NamedBeanStorage существует и методы namedBean1 и namedBean2 работают")
    public void namedBeanTest() {
        var named1Result = namedBeanStorage.namedBean1();
        assertNotNull(named1Result, "метод namedBean1 вернул null");
        assertEquals(named1, named1Result, "метод namedBean1 венул объект отличный от бина с именем named1");
        var named2Result = namedBeanStorage.namedBean2();
        assertNotNull(named2Result, "метод namedBean2 вернул null");
        assertEquals(named2, named2Result, "метод namedBean2 венул объект отличный от бина с именем named2");
    }

}