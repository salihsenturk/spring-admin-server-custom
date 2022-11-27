package com.salix.admin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController("/")
public class CustomController {
    @GetMapping("/getList")
    ResponseEntity<List<String>> getList() {
        return new ResponseEntity<>(Arrays.asList("Item 1", "Item 2"), HttpStatus.OK);
    }
}
