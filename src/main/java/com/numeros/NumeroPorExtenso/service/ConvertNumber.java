package com.numeros.NumeroPorExtenso.service;
import org.springframework.stereotype.Service;

@Service
public class ConvertNumber {
    public String convertNumberToWord(int number){
        String[] numbersMap = {
            "zero", "um", "dois", "três", "quatro",
            "cinco", "seis", "sete", "oito", "nove", 
            "dez", "onze", "doze", "treze", "quatorze",
            "quinze",
        };
        if (number <=15 && number>= 0) {
            return numbersMap[number];
        }else{
            return "Escolha um número entre 0 e 15.";
        }
        
    }
}
