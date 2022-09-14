package com.alexmansar.classwork.lesson15;

public class HtmlGeneration {
    public static void main(String[] args) {
        String htmlText = "<html>" +
                "<body>" +
                "<div>Hello!</div>" +
                "<div>" +
                "</body>" +
                "<html>";
        HtmlTag div = new HtmlTag("div", "Hello!");
        HtmlTag div1 = new HtmlTag("div",  div);
        HtmlTag body=new HtmlTag("body", div1);
        HtmlTag html=new HtmlTag("html",body);

        System.out.println(generateHtml(div));


    }

    public static String generateHtml (HtmlTag htmlTag){
       /* if (htmlTag.child!=null){
            return generateHtml(htmlTag.child);
        }
        если у объекта есть child то нужно рекурсивно вызвать ее
       */ return "<"+ htmlTag.name+">"+htmlTag.text+"</"+htmlTag.name+">";
    }
}