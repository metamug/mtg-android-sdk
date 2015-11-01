package com.metamug.mtg_sdk.rest;

/**
 * Created by Metamug on 10/27/2015.
 */
public class RestClientGen {

    private static RestClient instance;

    private RestClientGen(){

    }

    public static RestClient getInstance(String appName, String version, String accessKey, String accessSecret){
        if(instance == null){
            return new RestClientImpl(appName, version, accessKey, accessSecret);
        }else{
            return instance;
        }
    }

}
