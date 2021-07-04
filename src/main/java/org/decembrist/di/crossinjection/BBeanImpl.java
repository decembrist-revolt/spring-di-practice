package org.decembrist.di.crossinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BBeanImpl implements BBean {

    @Autowired
    private ABean aBean;

    @Override
    public ABean getABean() {
        return aBean;
    }

}
