package com.bayamp.regex;

import com.mifmif.common.regex.Generex;

import java.util.Random;

/**
 * Created by naresh on 1/31/2016.
 */
public class RegexSsn {
        public static String ssnGenerate() {
            Generex generex = new Generex("\\d{3}-\\d{2}-\\d{4}");
            // Generate random String
            String randomStr = generex.random();
            return randomStr;
        }

    }

