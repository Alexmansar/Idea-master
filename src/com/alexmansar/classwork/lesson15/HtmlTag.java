package com.alexmansar.classwork.lesson15;

public class HtmlTag {
    String name, text;
    HtmlTag child;

    public HtmlTag(String name, HtmlTag child){
        this.name=name;
        this.child =child;

    }
    public HtmlTag(String name, String text){
        this.name=name;
        this.text=text;
    }

}
