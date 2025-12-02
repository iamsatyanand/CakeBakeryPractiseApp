package com.satyanand.CakeBakery.Baker;

import com.satyanand.CakeBakery.Frosting.Frosting;
import com.satyanand.CakeBakery.Syrup.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    private final Frosting frosting;

    private final Syrup syrup;

    public CakeBaker(
            @Qualifier("strawberryFrosting") Frosting frosting,
            @Qualifier("chocolateSyrup") Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake(){
        System.out.println("baking a cake with : ");
        System.out.println(frosting.getFrostingType());
        System.out.println(syrup.getSyrupType());
        System.out.println("Cake is ready . . .!");
    }
}
