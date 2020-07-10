package utilities;

import pojos.Character;

public class ApiUtility {

    public static boolean isBoolean( String array){

            if(array.equals("true") || array.equals("false")){
                return true;
            }
            return  false;
    }

    public static void main(String[] args) {

        System.out.println( isBoolean("false") );
    }



}
