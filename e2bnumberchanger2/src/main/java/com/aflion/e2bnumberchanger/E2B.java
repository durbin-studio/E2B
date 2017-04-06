package com.aflion.e2bnumberchanger;

/**
 * Created by user on 4/6/2017.
 */

public class E2B {

    /**
     * @param numberToConvert type String
     * @return convertedNumber type String
     * @throws NumberFormatException if any unwanted input is provided
     * call this method with a number and it will return the converted bangla number **/
    public static String convertNumber(String numberToConvert) throws NumberFormatException{
        try{
            String convertedNumber="";

            char[] strTochar = new char[numberToConvert.length()];
            strTochar = numberToConvert.toCharArray();

            for(int i=0;i<strTochar.length;i++){
                convertedNumber += checkNumber(strTochar[i]);
            }

            return convertedNumber;
        }catch (Exception e){
            throw new NumberFormatException();
        }
    }

    //call to check the character
    private static char checkNumber(char xChar){
        char charToReturn = '০';
        //convert the character to int
        int xNumb = Integer.parseInt(""+xChar);
        switch (xNumb){
            case 0:
                charToReturn='০';
                break;
            case 1:
                charToReturn='১';
                break;
            case 2:
                charToReturn='২';
                break;
            case 3:
                charToReturn='৩';
                break;
            case 4:
                charToReturn='৪';
                break;
            case 5:
                charToReturn='৫';
                break;
            case 6:
                charToReturn='৬';
                break;
            case 7:
                charToReturn='৭';
                break;
            case 8:
                charToReturn='৮';
                break;
            case 9:
                charToReturn='৯';
                break;
        }
        return  charToReturn;
    }
}
