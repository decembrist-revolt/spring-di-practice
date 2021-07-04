package org.decembrist.di.property;

/**
 * ЗАДАЧА №6
 *
 * Создать бин этого типа
 */
public interface PropertyBean {

    /**
     * Имя свойства
     */
    String TEST_PROPERTY_NAME = "test.property";

    /**
     * Метод должен возвращать значение свойства "test.property" из файла resources/application.properties (число)
     */
    int getTestPropertyValue();

}
