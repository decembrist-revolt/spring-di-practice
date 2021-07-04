package org.decembrist.di.singleton;

/**
 * ЗАДАЧА №1.2
 *
 * Создать бин этого типа
 *
 * Инъектировать бин {@link Singleton} для работы метода getSingletonInstance
 */
public interface SingletonStorage {

    /**
     * Метод должен возвращать бин типа {@link Singleton}
     */
    Singleton getSingletonInstance();

}
