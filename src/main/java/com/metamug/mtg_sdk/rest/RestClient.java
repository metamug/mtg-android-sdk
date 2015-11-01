package com.metamug.mtg_sdk.rest;

import com.metamug.mtg_sdk.exception.RestException;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.util.Map;

/**
 * Created by Metamug on 10/30/2015.
 */
public interface RestClient {

    public static final String API_URL = "https://{0}.metamug.com/v{1}/{2}";

    /**
     * GET request default with no parameters.
     * @param collection string representing REST collection
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray get(String collection) throws IOException, RestException, JSONException;

    /**
     * GET request default with no parameters.
     * @param item string representing REST item
     * @param id string representing item id
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray get(String item, String id) throws IOException, RestException, JSONException;

    /**
     * GET request with parameters as a list of name-value pairs.
     * @param collection string representing REST collection
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray get(String collection, Map<String,String> params) throws IOException, RestException, JSONException;

    /**
     * GET request with parameters as a list of name-value pairs.
     * @param item string representing REST item
     * @param id string representing item id
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray get(String item, String id, Map<String,String> params) throws IOException, RestException, JSONException;


    /**
     * POST request default with no parameters.
     * @param collection string representing REST collection
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray post(String collection) throws IOException, RestException, JSONException;

    /**
     * POST request default with no parameters.
     * @param item string representing REST item
     * @param id string representing item id
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray post(String item, String id) throws IOException, RestException, JSONException;

    /**
     * POST request with parameters as a list of name-value pairs.
     * @param collection string representing REST collection
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray post(String collection, Map<String,String> params) throws IOException, RestException, JSONException;

    /**
     * POST request with parameters as a list of name-value pairs.
     * @param item string representing REST item
     * @param id string representing item id
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray post(String item, String id, Map<String,String> params) throws IOException, RestException, JSONException;



    /**
     * PUT request default with no parameters.
     * @param collection string representing REST collection
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray put(String collection) throws IOException, RestException, JSONException;

    /**
     * PUT request default with no parameters.
     * @param item string representing REST item
     * @param id string representing item id
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray put(String item, String id) throws IOException, RestException, JSONException;

    /**
     * PUT request with parameters as a list of name-value pairs.
     * @param collection string representing REST collection
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray put(String collection, Map<String,String> params) throws IOException, RestException, JSONException;

    /**
     * PUT request with parameters as a list of name-value pairs.
     * @param item string representing REST item
     * @param id string representing item id
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray put(String item, String id, Map<String,String> params) throws IOException, RestException, JSONException;



    /**
     * DELETE request default with no parameters.
     * @param collection string representing REST collection
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray delete(String collection) throws IOException, RestException, JSONException;

    /**
     * DELETE request default with no parameters.
     * @param item string representing REST item
     * @param id string representing item id
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray delete(String item, String id) throws IOException, RestException, JSONException;

    /**
     * DELETE request with parameters as a list of name-value pairs.
     * @param collection string representing REST collection
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray delete(String collection, Map<String,String> params) throws IOException, RestException, JSONException;

    /**
     * DELETE request with parameters as a list of name-value pairs.
     * @param item string representing REST item
     * @param id string representing item id
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray delete(String item, String id, Map<String,String> params) throws IOException, RestException, JSONException;



    /**
     * HEAD request default with no parameters.
     * @param collection string representing REST collection
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray head(String collection) throws IOException, RestException, JSONException;

    /**
     * HEAD request default with no parameters.
     * @param item string representing REST item
     * @param id string representing item id
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray head(String item, String id) throws IOException, RestException, JSONException;

    /**
     * HEAD request with parameters as a list of name-value pairs.
     * @param collection string representing REST collection
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray head(String collection, Map<String,String> params) throws IOException, RestException, JSONException;

    /**
     * HEAD request with parameters as a list of name-value pairs.
     * @param item string representing REST item
     * @param id string representing item id
     * @return JSONArray returned by the server.
     * @throws java.io.IOException
     * @throws com.metamug.mtg_sdk.exception.RestException
     */
    public JSONArray head(String item, String id, Map<String,String> params) throws IOException, RestException, JSONException;
}
