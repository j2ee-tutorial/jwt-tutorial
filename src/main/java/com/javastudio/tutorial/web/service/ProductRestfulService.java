package com.javastudio.tutorial.web.service;

import com.javastudio.tutorial.api.dto.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Set;

@RequestMapping("/product")
@RestController
public class ProductRestfulService {
    @GetMapping("/index")
    public ResponseEntity<Set<Product>> list() {

        Set<Product> products = Collections.singleton(new Product("Needle"));
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
