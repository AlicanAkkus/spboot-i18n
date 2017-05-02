package com.caysever.controller;

import com.caysever.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.NumberFormat;
import java.util.Locale;


/**
 * Created by alican on 01.05.2017.
 */
@Controller
public class HomeController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
    public String home(Model model, Locale locale){
        model.addAttribute("products", productService.findAllProduct());
        model.addAttribute("currenyFormatter", NumberFormat.getCurrencyInstance(new Locale(locale.getLanguage(),locale.getCountry())));
        return "home";
    }

}
