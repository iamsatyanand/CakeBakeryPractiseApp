package com.satyanand.CakeBakery.Frosting.impl;

import com.satyanand.CakeBakery.Frosting.Frosting;
import org.springframework.stereotype.Service;

@Service("strawberryFrosting")
public class StrawberryFrosting implements Frosting {
    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }
}
