package com.example.suspectdetectionapp.retrofit;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class AppConstants {
    public final static String API_KEY="PASTE_YOUR_API_HERE";
    public final static String BASE_URL = "52.77.226.241:8080/image/identify/";
    public static String EncodedImageBase64 = "";
    public JSONObject objectJson = new JSONObject();

    public void writeJSON() {
        try {
            objectJson.put("image",EncodedImageBase64);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        Log.d("json",objectJson.toString());
    }



}
