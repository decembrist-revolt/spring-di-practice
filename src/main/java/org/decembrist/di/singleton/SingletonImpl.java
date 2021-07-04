package org.decembrist.di.singleton;

import org.springframework.stereotype.Component;

@Component
public class SingletonImpl implements Singleton {

    @Override
    public int returnInput(int input) {
        return input;
    }

}
