package org.decembrist.di.crossinjection;

/**
 * ЗАДАЧА №5
 *
 * Создать бин этого типа
 *
 * Инъектировать в него бин типа {@link ABean}
 */
public interface BBean {

    /**
     * Метод должен возвращать бин типа {@link ABean}
     */
    ABean getABean();

}
