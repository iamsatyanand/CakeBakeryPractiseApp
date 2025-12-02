package com.satyanand.CakeBakery.Syrup.impl;

import com.satyanand.CakeBakery.Syrup.Syrup;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ChocolateSyrup implements Syrup {
    @Override
    public String getSyrupType() {
        return "Chocolate Syrup";
    }
}
