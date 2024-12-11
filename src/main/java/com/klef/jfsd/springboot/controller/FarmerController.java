package com.klef.jfsd.springboot.controller;

import com.klef.jfsd.springboot.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FarmerController {

    private List<Product> productList = new ArrayList<>();

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("products", productList);
        return "dashboard";
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestParam String productName, 
                              @RequestParam double productPrice, 
                              @RequestParam String productDescription, 
                              Model model) {
        Product newProduct = new Product(productName, productPrice, productDescription);
        productList.add(newProduct);
        model.addAttribute("products", productList);
        model.addAttribute("productAdded", true);
        return "dashboard";
    }
}

