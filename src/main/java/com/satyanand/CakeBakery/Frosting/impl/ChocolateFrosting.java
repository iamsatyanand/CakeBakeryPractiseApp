package com.satyanand.CakeBakery.Frosting.impl;

import com.satyanand.CakeBakery.Frosting.Frosting;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ChocolateFrosting implements Frosting {
    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
