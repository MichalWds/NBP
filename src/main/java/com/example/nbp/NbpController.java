package com.example.nbp;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;


@RestController

public class NbpController {      ////w { } moze byc cokolwike w srodku. mozemy zmieniac  ,np USD, EURO, PLN , tak dziala nawias
                                    //PathVariable daje nam mozliwsc podmiany pod Stringa (w naszym wypadku) currencyCode

    @GetMapping("/exchangerates/{currencyCode}/today")

    public CurrencyModel index(@PathVariable String currencyCode){
        //currency model to typ zwracanej zmiennej , wczesniej bylo String jesli chcialem String
        //currency model zwraca nam Jasona
        RestTemplate restTemplate = new RestTemplate();

        CurrencyModel currencyModel = restTemplate

                .getForObject("http://api.nbp.pl/api/exchangerates/rates/c/"+currencyCode

                        +"/today/?format=json",CurrencyModel.class);

        return  currencyModel;

    }

}

