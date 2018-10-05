package com.edwin.cobos.patterns.composite;

public class DataService {

    public static String loadHTML() {
        String result = "<HTML>" +
                "<HEAD>" +
                "<TITLE>Your Title Here</TITLE>" +
                "</HEAD>" +
                "<BODY>" +
                "<CENTER><IMG SRC=\"clouds.jpg\" ></IMG> </CENTER>" +
                "<a href=\"http://somegreatsite.com\">Link Name</a>" +
                "<H1>This is a Header</H1>" +
                "<H2>This is a Medium Header</H2>" +
                "<B>This is a new paragraph!</B>" +
                "<B><I>This is a new sentence without a paragraph break, in bold italics.</I></B>" +
                "</BODY>" +
                "</HTML>";

        return result;
    }

}
