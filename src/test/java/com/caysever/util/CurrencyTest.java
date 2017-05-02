package com.caysever.util;

import org.junit.Test;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by alican on 02.05.2017.
 */
public class CurrencyTest {


    @Test
    public void currencyTest(){
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale("EN","US"));
        String format = currencyInstance.format(125);
        System.out.println(format);
    }
}
