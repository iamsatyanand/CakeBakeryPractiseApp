package com.satyanand.CakeBakery.Syrup.impl;

import com.satyanand.CakeBakery.Syrup.Syrup;
import org.springframework.stereotype.Service;

@Service
public class StrawberrySyrup implements Syrup {
    @Override
    public String getSyrupType() {
        return "Strawberry Syrup";
    }
}
