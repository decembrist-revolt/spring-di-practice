package org.decembrist.di.listinjection;

/**
 * ЗАДАЧА №3.1
 *
 * Подписчик на новые сообщения для {@link Producer}
 *
 * Создать один бин наследник этого интерфейса, который должен работать без ошибок (логика работы не имеет значения)
 *
 * Задать имя бина = "subscriber"
 */
public interface Subscriber {

    /**
     * Можно использовать эту константу для имени бина
     */
    String SUBSCRIBER_BEAN_NAME = "subscriber";

    void onNewMessage(String message);

}
