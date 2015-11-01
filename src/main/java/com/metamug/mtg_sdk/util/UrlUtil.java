package com.metamug.mtg_sdk.util;

import com.metamug.mtg_sdk.rest.RestClient;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.Map;

/**
 * Created by Metamug on 10/30/2015.
 */
public class UrlUtil {

    public static String makeUrl(String appName, String appVersion, String dataCollection){

        String url = MessageFormat.format(RestClient.API_URL, appName, appVersion, dataCollection);

        return url;
    }

    public static String makeUrl(String appName, String appVersion, String dataItem, String itemId){

        String url = MessageFormat.format(RestClient.API_URL, appName, appVersion, dataItem + "/" + itemId);

        return url;
    }

    public static String makeUrl(String appName, String appVersion, String dataCollection, Map<String,String> params)
            throws UnsupportedEncodingException{

        String url = MessageFormat.format(RestClient.API_URL, appName, appVersion, dataCollection);
        url += "?" + encodeUrlParams(params);

        return url;
    }

    public static String makeUrl(String appName, String appVersion, String dataItem, String itemId, Map<String,String> params)
            throws UnsupportedEncodingException{

        String url = MessageFormat.format(RestClient.API_URL, appName, appVersion, dataItem + "/" + itemId);
        url += "?" + encodeUrlParams(params);

        return url;
    }

    public static String encodeUrlParams(Map<String,String> params) throws UnsupportedEncodingException{

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, String> e : params.entrySet()){
            if(sb.length() > 0){
                sb.append('&');
            }
            sb.append(URLEncoder.encode(e.getKey(), "UTF-8")).append('=').append(URLEncoder.encode(e.getValue(), "UTF-8"));
        }
        return sb.toString();
    }

}
