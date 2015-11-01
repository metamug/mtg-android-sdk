package com.metamug.mtg_sdk.util;

/**
 * Created by Metamug on 10/30/2015.
 */
public class StringUtil {

    //Will return 'true' if the input string is not empty or null
    public static boolean stringNotNull(String string){
        return !("".equals(string)) && !(null == string) && !(string.isEmpty());
    }

}
