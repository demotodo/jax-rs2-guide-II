package com.example.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
public class JsonHybridBook {
    @JsonProperty("book-id")
    private String bookId;

    @JsonProperty("book-name")
    private String bookName;

    public JsonHybridBook() {
        bookId = "2";
        bookName = "Java Restful Web Services实战";
    }
}
