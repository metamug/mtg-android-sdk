package com.metamug.mtg_sdk.errors;

/**
 * Created by Metamug on 10/27/2015.
 */
public class ErrorGroup {

    public static String ERROR_COLLECTION = "'Collection' cannot be empty or null!";
    public static String ERROR_COLLECTION_PARAMS = "'Collection' and 'params' cannot be empty or null!";
    public static String ERROR_ITEM_ID = "'Item' and 'id' cannot be empty or null!";
    public static String ERROR_ITEM_ID_PARAMS = "'Item', 'id' and 'params' cannot be empty or null!";

    public static String serverError(int responseCode){
        return "Server Error: " + Integer.toString(responseCode);
    }

}
