package org.decembrist.di.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class PrototypeBeanImpl implements PrototypeBean {
}
