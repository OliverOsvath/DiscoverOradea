package com.sda.discover.oradea.controller.dto;

public class SearchDto {
    private String value;

    public SearchDto() {
    }

    public SearchDto(String value) {

        this.value = value;
    }



    public SearchDto(String name, String s) {

    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
