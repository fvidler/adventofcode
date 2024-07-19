package com.sainsburys.app.day3;

public class isDotNumberOrSymbol {

    public static String isDotNumberOrSymbol(char subject){
        String type;
        if(subject == '.'){
            type = "dot";
        }
        else if (Character.isDigit(subject)){
            type = "digit";
        }
        else{
            type = "symbol";
        }
        return type;
    }

}
