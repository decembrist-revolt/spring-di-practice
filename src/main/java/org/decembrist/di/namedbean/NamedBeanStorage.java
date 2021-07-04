package org.decembrist.di.namedbean;

/**
 * ЗАДАЧА №2.2
 *
 * Создать бин этого типа
 *
 * Инъектировать в него 2 именованых бина типа {@link NamedBean}
 */
public interface NamedBeanStorage {

    /**
     * Должен возвращать бин типа {@link NamedBean} с именем "named1"
     */
    NamedBean namedBean1();

    /**
     * Должен возвращать бин типа {@link NamedBean} с именем "named2"
     */
    NamedBean namedBean2();

}
