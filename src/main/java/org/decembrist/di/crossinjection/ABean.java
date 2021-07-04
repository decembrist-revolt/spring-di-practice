package org.decembrist.di.crossinjection;

/**
 * ЗАДАЧА №5
 *
 * Создать бин этого типа
 *
 * Инъектировать в него бин типа {@link BBean}
 */
public interface ABean {

    /**
     * Метод должен возвращать бин типа {@link BBean}
     */
    BBean getBBean();

}
