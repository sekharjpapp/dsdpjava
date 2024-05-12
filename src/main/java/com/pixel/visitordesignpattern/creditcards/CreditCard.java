package com.pixel.visitordesignpattern.creditcards;

import com.pixel.visitordesignpattern.offer.OfferVisitor;

public interface CreditCard {
    String getName();
    void accept(OfferVisitor v);
}
