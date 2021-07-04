package org.decembrist.di.listinjection;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerImpl implements Producer {

    private List<Subscriber> subscribers;

    public ProducerImpl(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public void notifySubscribers(String message) {
        subscribers.forEach(subscriber -> subscriber.onNewMessage(message));
    }

}
