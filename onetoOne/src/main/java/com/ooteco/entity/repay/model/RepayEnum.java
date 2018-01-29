package com.ooteco.entity.repay.model;

public class RepayEnum {

    public enum Status{
        NORMAL("1"),
        PREPAY("2"),
        BAD_DEBT("3");
        private String value;
        Status(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }
    }
}
