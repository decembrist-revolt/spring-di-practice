package org.decembrist.di.listinjection;

/**
 * ЗАДАЧА №3.2
 *
 * Создать бин наследник этого интерфейса
 */
public interface Producer {

    /**
     * Метод должен вызывать метод onNewMessage всех бинов с интерфейсом {@link Subscriber}
     * ВСЕХ бинов которые есть в контексте спринга
     */
    void notifySubscribers(String message);
}
