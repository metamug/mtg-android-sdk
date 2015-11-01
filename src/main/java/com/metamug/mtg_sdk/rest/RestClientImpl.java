package com.metamug.mtg_sdk.rest;

import com.metamug.mtg_sdk.errors.ErrorGroup;
import com.metamug.mtg_sdk.exception.RestException;
import com.metamug.mtg_sdk.util.JsonUtil;
import com.metamug.mtg_sdk.util.MapUtil;
import com.metamug.mtg_sdk.util.StringUtil;
import com.metamug.mtg_sdk.util.UrlUtil;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.util.Map;

/**
 * Created by Metamug on 10/30/2015.
 */
public class RestClientImpl implements RestClient {

    private String appName, version, accessKey, accessSecret;

    protected RestClientImpl(String appName, String version, String accessKey, String accessSecret) {
        this.appName = appName;
        this.version = version;
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
    }

    @Override
    public JSONArray get(String collection) throws IOException, RestException, JSONException {
        if (StringUtil.stringNotNull(collection)) {
            String url = UrlUtil.makeUrl(appName, version, collection);
            String response = RestAgent.getRequest(url);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else {
            throw new RestException(ErrorGroup.ERROR_COLLECTION);
        }
    }

    @Override
    public JSONArray get(String item, String id) throws IOException, RestException, JSONException {
        if (StringUtil.stringNotNull(item) && StringUtil.stringNotNull(id)) {
            String url = UrlUtil.makeUrl(appName, version, item, id);
            String response = RestAgent.getRequest(url);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else {
            throw new RestException(ErrorGroup.ERROR_ITEM_ID);
        }
    }

    @Override
    public JSONArray get(String collection, Map<String, String> params) throws IOException, RestException, JSONException {
        if (StringUtil.stringNotNull(collection) && !MapUtil.isMapEmpty(params)) {
            String url = UrlUtil.makeUrl(appName, version, collection, params);
            String response = RestAgent.getRequest(url);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else {
            throw new RestException(ErrorGroup.ERROR_COLLECTION_PARAMS);
        }
    }

    @Override
    public JSONArray get(String item, String id, Map<String, String> params) throws IOException, RestException, JSONException {
        if (StringUtil.stringNotNull(item) && StringUtil.stringNotNull(id) && !MapUtil.isMapEmpty(params)) {
            String url = UrlUtil.makeUrl(appName, version, item, id, params);
            String response = RestAgent.getRequest(url);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else {
            throw new RestException(ErrorGroup.ERROR_ITEM_ID_PARAMS);
        }
    }

    @Override
    public JSONArray post(String collection) throws IOException, RestException, JSONException{
        if(StringUtil.stringNotNull(collection)){
            String url = UrlUtil.makeUrl(appName, version, collection);
            String response = RestAgent.postRequest(url, null);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else{
            throw new RestException(ErrorGroup.ERROR_COLLECTION);
        }
    }

    @Override
    public JSONArray post(String item, String id) throws IOException, RestException, JSONException{
        if(StringUtil.stringNotNull(item) && StringUtil.stringNotNull(id)){
            String url = UrlUtil.makeUrl(appName, version, item, id);
            String response = RestAgent.postRequest(url, null);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else{
            throw new RestException(ErrorGroup.ERROR_ITEM_ID);
        }
    }

    @Override
    public JSONArray post(String collection, Map<String,String> params) throws IOException, RestException, JSONException{
        if(StringUtil.stringNotNull(collection) && !MapUtil.isMapEmpty(params)){
            String url = UrlUtil.makeUrl(appName, version, collection);
            String response = RestAgent.postRequest(url, UrlUtil.encodeUrlParams(params));
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else{
            throw new RestException(ErrorGroup.ERROR_COLLECTION_PARAMS);
        }
    }

    @Override
    public JSONArray post(String item, String id, Map<String,String> params) throws IOException, RestException, JSONException{
        if(StringUtil.stringNotNull(item) && StringUtil.stringNotNull(id) && !MapUtil.isMapEmpty(params)){
            String url = UrlUtil.makeUrl(appName, version, item, id);
            String response = RestAgent.postRequest(url, UrlUtil.encodeUrlParams(params));
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else {
            throw new RestException(ErrorGroup.ERROR_ITEM_ID_PARAMS);
        }
    }

    @Override
    public JSONArray put(String collection) throws IOException, RestException, JSONException{
        if(StringUtil.stringNotNull(collection)){
            String url = UrlUtil.makeUrl(appName, version, collection);
            String response = RestAgent.putRequest(url, null);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else{
            throw new RestException(ErrorGroup.ERROR_COLLECTION);
        }
    }

    @Override
    public JSONArray put(String item, String id) throws IOException, RestException, JSONException{
        if(StringUtil.stringNotNull(item) && StringUtil.stringNotNull(id)){
            String url = UrlUtil.makeUrl(appName, version, item, id);
            String response = RestAgent.putRequest(url, null);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else{
            throw new RestException(ErrorGroup.ERROR_ITEM_ID);
        }
    }

    @Override
    public JSONArray put(String collection, Map<String,String> params) throws IOException, RestException, JSONException{
        if(StringUtil.stringNotNull(collection) && !MapUtil.isMapEmpty(params)){
            String url = UrlUtil.makeUrl(appName, version, collection);
            String response = RestAgent.putRequest(url, UrlUtil.encodeUrlParams(params));
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else{
            throw new RestException(ErrorGroup.ERROR_COLLECTION_PARAMS);
        }
    }

    @Override
    public JSONArray put(String item, String id, Map<String,String> params) throws IOException, RestException, JSONException{
        if(StringUtil.stringNotNull(item) && StringUtil.stringNotNull(id) && !MapUtil.isMapEmpty(params)){
            String url = UrlUtil.makeUrl(appName, version, item, id);
            String response = RestAgent.putRequest(url, UrlUtil.encodeUrlParams(params));
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else {
            throw new RestException(ErrorGroup.ERROR_ITEM_ID_PARAMS);
        }
    }

    @Override
    public JSONArray delete(String collection) throws IOException, RestException, JSONException{
        if(StringUtil.stringNotNull(collection)){
            String url = UrlUtil.makeUrl(appName, version, collection);
            String response = RestAgent.deleteRequest(url);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else{
            throw new RestException(ErrorGroup.ERROR_COLLECTION);
        }
    }

    @Override
    public JSONArray delete(String item, String id) throws IOException, RestException, JSONException{
        if(StringUtil.stringNotNull(item) && StringUtil.stringNotNull(id)){
            String url = UrlUtil.makeUrl(appName, version, item, id);
            String response = RestAgent.deleteRequest(url);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else{
            throw new RestException(ErrorGroup.ERROR_ITEM_ID);
        }
    }

    @Override
    public JSONArray delete(String collection, Map<String,String> params) throws IOException, RestException, JSONException{
        if(StringUtil.stringNotNull(collection) && !MapUtil.isMapEmpty(params)){
            String url = UrlUtil.makeUrl(appName, version, collection, params);
            String response = RestAgent.deleteRequest(url);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else{
            throw new RestException(ErrorGroup.ERROR_COLLECTION_PARAMS);
        }
    }

    @Override
    public JSONArray delete(String item, String id, Map<String,String> params) throws IOException, RestException, JSONException{
        if(StringUtil.stringNotNull(item) && StringUtil.stringNotNull(id) && !MapUtil.isMapEmpty(params)){
            String url = UrlUtil.makeUrl(appName, version, item, id, params);
            String response = RestAgent.deleteRequest(url);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else {
            throw new RestException(ErrorGroup.ERROR_ITEM_ID_PARAMS);
        }
    }

    @Override
    public JSONArray head(String collection) throws IOException, RestException, JSONException {
        if(StringUtil.stringNotNull(collection)){
            String url = UrlUtil.makeUrl(appName, version, collection);
            String response = RestAgent.headRequest(url);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else{
            throw new RestException(ErrorGroup.ERROR_COLLECTION);
        }
    }

    @Override
    public JSONArray head(String item, String id) throws IOException, RestException, JSONException {
        if(StringUtil.stringNotNull(item) && StringUtil.stringNotNull(id)){
            String url = UrlUtil.makeUrl(appName, version, item, id);
            String response = RestAgent.headRequest(url);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else{
            throw new RestException(ErrorGroup.ERROR_ITEM_ID);
        }
    }

    @Override
    public JSONArray head(String collection, Map<String,String> params) throws IOException, RestException, JSONException {
        if(StringUtil.stringNotNull(collection) && !MapUtil.isMapEmpty(params)){
            String url = UrlUtil.makeUrl(appName, version, collection, params);
            String response = RestAgent.headRequest(url);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else{
            throw new RestException(ErrorGroup.ERROR_COLLECTION_PARAMS);
        }
    }

    @Override
    public JSONArray head(String item, String id, Map<String,String> params) throws IOException, RestException, JSONException {
        if(StringUtil.stringNotNull(item) && StringUtil.stringNotNull(id) && !MapUtil.isMapEmpty(params)){
            String url = UrlUtil.makeUrl(appName, version, item, id, params);
            String response = RestAgent.headRequest(url);
            JSONArray jsonResponse = JsonUtil.stringToJsonArray(response);
            return jsonResponse;
        } else {
            throw new RestException(ErrorGroup.ERROR_ITEM_ID_PARAMS);
        }
    }

}