package org.decembrist.di.singleton;

import org.springframework.stereotype.Service;

@Service
public class SingletonStorageImpl implements SingletonStorage {

    private final Singleton singleton;

    public SingletonStorageImpl(Singleton singleton) {
        this.singleton = singleton;
    }

    @Override
    public Singleton getSingletonInstance() {
        return singleton;
    }

}
