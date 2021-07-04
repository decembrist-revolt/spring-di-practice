package org.decembrist.di.namedbean;

import org.springframework.stereotype.Service;

@Service
public class NamedBeanStorageImpl implements NamedBeanStorage {

    private NamedBean named1;
    private NamedBean named2;

    public NamedBeanStorageImpl(NamedBean named1, NamedBean named2) {

        this.named1 = named1;
        this.named2 = named2;
    }

    @Override
    public NamedBean namedBean1() {
        return named1;
    }

    @Override
    public NamedBean namedBean2() {
        return named2;
    }

}
