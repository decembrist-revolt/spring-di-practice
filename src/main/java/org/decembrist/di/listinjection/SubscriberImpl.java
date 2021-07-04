package org.decembrist.di.listinjection;

import org.springframework.stereotype.Component;

import static org.decembrist.di.listinjection.Subscriber.SUBSCRIBER_BEAN_NAME;

@Component(SUBSCRIBER_BEAN_NAME)
public class SubscriberImpl implements Subscriber {

    @Override
    public void onNewMessage(String message) {

    }

}
