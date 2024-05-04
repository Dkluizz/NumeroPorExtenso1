package com.numeros.NumeroPorExtenso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.numeros.NumeroPorExtenso.service.ConvertNumber;
import com.numeros.NumeroPorExtenso.model.NumberRequest;


@RestController
public class NumberController {

    @Autowired
    private ConvertNumber convertNumber;

    @PostMapping("/convert")
    public ResponseEntity<String> convertToWord(@RequestBody NumberRequest numberRequest) {
        String result = convertNumber.convertNumberToWord(numberRequest.getNumber());
        return ResponseEntity.ok(result);
    }
}

