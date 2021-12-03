package com.bridgelabz.greetingapp.dto;

import lombok.Data;
/**
 * Purpose : To describe greeting details
 *
 * @author : DAMINI CHANDRAKAR
 * @since : 03-12-2021
 */
@Data
public class Greeting {

    private long id;
    private String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
