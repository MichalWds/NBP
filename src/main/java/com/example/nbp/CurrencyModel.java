package com.example.nbp;



import java.util.ArrayList;

import java.util.List;



public class CurrencyModel {

    private List<ExchangeRate> rates = new ArrayList<>();
private Double gold;

    public Double getGold() {
        return gold;
    }

    @Override
    public String toString() {
        return "CurrencyModel{" +
                "gold=" + gold +
                '}';
    }

    public void setGold(Double gold) {
        this.gold = gold;
    }

    public CurrencyModel(Double gold) {
        this.gold = gold;
    }

    public List<ExchangeRate> getRates() {

        return rates;

    }

    public void setRates(List<ExchangeRate> rates) {

        this.rates = rates;

    }



    public static class ExchangeRate{

        private Double bid;

        public void setGold(Double gold) {
            this.gold = gold;
        }

        @Override
        public String toString() {
            return "ExchangeRate{" +
                    "gold=" + gold +
                    '}';
        }

        private Double ask;
        private Double gold;

        public ExchangeRate(Double gold) {
            this.gold = gold;
        }

        public Double getGold() {
            return gold;
        }


        public Double getBid() {

            return bid;

        }

        public void setBid(Double bid) {

            this.bid = bid;

        }

        public Double getAsk() {

            return ask;

        }

        public void setAsk(Double ask) {

            this.ask = ask;
        }

    }

}