package org.decembrist.di.listinjection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.decembrist.di.listinjection.Subscriber.SUBSCRIBER_BEAN_NAME;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

/**
 * ЗАДАЧА №3.1, 3.2
 *
 * 1. Инъектирую созданный тобой бин типа {@link Subscriber} с именем "subscriber"
 * 2. Инъектирую созданный тобой бин типа {@link Producer}
 * 3. Создаю при запуске теста ещё 2 бина типа {@link Subscriber}
 * 4. Вызываю у твоего бина типа {@link Producer} метод notifySubscribers("test message")
 * 5. Проверяю что у каждого бина типа {@link Subscriber} вызвался метод onNewMessage с аргументом "test message"
 * 6. Проверяю что для каждого бина типа {@link Subscriber} метод onNewMessage вызвался только 1 раз
 */
@SpringBootTest
public class ProducerTest {

    @Autowired
    private Producer producer;

    @MockBean(name = "first-subscriber")
    private Subscriber subscriber1;

    @MockBean(name = "second-subscriber")
    private Subscriber subscriber2;

    @SpyBean(name = SUBSCRIBER_BEAN_NAME)
    private Subscriber subscriber;

    @Test
    @DisplayName("Проверка вызова метода onNewMessage на всех существующих наследниках Subscriber")
    public void testProducer() {
        var messageText = "test message";
        setUpSubscriber(subscriber1, messageText);
        setUpSubscriber(subscriber2, messageText);
        setUpSubscriber(subscriber, messageText);
        producer.notifySubscribers(messageText);
        verify(subscriber1, times(1)).onNewMessage(messageText);
        verify(subscriber2, times(1)).onNewMessage(messageText);
        verify(subscriber, times(1)).onNewMessage(messageText);
    }

    private void setUpSubscriber(Subscriber subscriber, String testMessage) {
        doAnswer(invocation -> {
            Object argument = invocation.getArgument(0);
            assertNotNull(argument, "Subscriber получил null, ожидался " + testMessage);
            String actual = argument.toString();
            assertEquals(testMessage, actual, "Subscriber получил " + actual + ", ожидался " + testMessage);
            return invocation;
        }).when(subscriber).onNewMessage(anyString());
    }

}
