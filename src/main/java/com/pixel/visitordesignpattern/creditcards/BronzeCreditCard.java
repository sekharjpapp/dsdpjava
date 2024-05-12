package com.pixel.visitordesignpattern.creditcards;

import com.pixel.visitordesignpattern.offer.OfferVisitor;

public class BronzeCreditCard implements CreditCard{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void accept(OfferVisitor v) {

    }
}
