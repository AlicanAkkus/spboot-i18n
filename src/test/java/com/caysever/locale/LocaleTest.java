package com.caysever.locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Locale;

/**
 * Created by alican on 01.05.2017.
 */
@RunWith(SpringRunner.class)
public class LocaleTest {

    @Test
    public void listAllLocale(){
        Arrays.stream(Locale.getAvailableLocales()).forEach(System.out::println);
    }
}
