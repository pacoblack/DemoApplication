package com.github.gang.utils;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtils {

    public static JSONObject readFile(Context context, String assertFile){
        try {
            InputStream inputstream = context.getResources().getAssets().open(assertFile);
            StringBuilder data = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputstream));
            String line;
            while ((line=reader.readLine())!=null){
                data.append(line);
            }
            return new JSONObject(data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
