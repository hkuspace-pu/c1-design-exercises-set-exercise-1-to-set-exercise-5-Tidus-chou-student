package com.example.assessment;

public class BookItem {
    private String name;
    private String text;
    private String person;

    public BookItem(String name, String text, String person) {
        this.name = name;
        this.person = person;
        this.text = text;
    }

    public String getName() { return name; }
    public String getText() { return text; }
    public String getPerson() { return person; }


}
