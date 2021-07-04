package org.decembrist.di.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyBeanImpl implements PropertyBean {

    private final int testProperty;

    public PropertyBeanImpl(@Value("${test.property}") int testProperty) {
        this.testProperty = testProperty;
    }

    @Override
    public int getTestPropertyValue() {
        return testProperty;
    }

}
