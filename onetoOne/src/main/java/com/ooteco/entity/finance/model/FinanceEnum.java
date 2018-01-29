package com.ooteco.entity.finance.model;

public class FinanceEnum {

    public enum ProductStatus{
        RAISING("2"),
        PAUSING("3"),
        OVER("4");

        public String value;
        ProductStatus(String value){
            this.value = value;
        }

    }
}
