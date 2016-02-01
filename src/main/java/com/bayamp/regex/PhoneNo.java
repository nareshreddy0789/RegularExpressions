package com.bayamp.regex;

import com.mifmif.common.regex.Generex;

/**
 * Created by naresh on 2/1/2016.
 */
public class PhoneNo {
    public static String phoneNo() {
        Generex generex = new Generex("[2-9]\\d{2}-\\d{3}-\\d{4}");
        // Generate random String
        String randomNo = generex.random();
        return randomNo;
    }
}
