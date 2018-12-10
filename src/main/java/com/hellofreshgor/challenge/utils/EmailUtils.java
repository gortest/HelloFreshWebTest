package com.hellofreshgor.challenge.utils;

import java.util.UUID;

public class EmailUtils {

    public static String generateEmail() {
        return "hf_chalange_" + UUID.randomUUID().toString() + "@hf.com";
    }
}
