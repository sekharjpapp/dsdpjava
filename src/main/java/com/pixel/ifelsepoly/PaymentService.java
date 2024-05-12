package com.pixel.ifelsepoly;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PaymentService {

    //Based on single condition
    public Long calculateShipping(Integer distanceInMiles) {
        return (distanceInMiles < 50) ? 350L: 400L;
    }

}
