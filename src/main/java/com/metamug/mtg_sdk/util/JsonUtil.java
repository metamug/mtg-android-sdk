package com.metamug.mtg_sdk.util;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by Metamug on 10/30/2015.
 */
public class JsonUtil {

    public static JSONArray stringToJsonArray(String string) throws JSONException{
        JSONArray jsonArray = null;
        jsonArray = new JSONArray(string);

        return jsonArray;
    }

}
