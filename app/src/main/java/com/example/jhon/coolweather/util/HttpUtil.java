package com.example.jhon.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Jhon on 2020/1/26.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String adress,okhttp3.Callback callback)
    {
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder()
                .url(adress)
                .build();
        client.newCall(request).enqueue(callback);
    }

}
