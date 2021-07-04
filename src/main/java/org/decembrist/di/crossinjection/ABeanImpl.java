package org.decembrist.di.crossinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ABeanImpl implements ABean {

    @Autowired
    private BBean bBean;

    @Override
    public BBean getBBean() {
        return bBean;
    }

}
