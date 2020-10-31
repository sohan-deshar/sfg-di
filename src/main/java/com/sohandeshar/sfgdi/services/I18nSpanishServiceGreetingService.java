package com.sohandeshar.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpanishServiceGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Holla Mundo - ES";
    }
}
