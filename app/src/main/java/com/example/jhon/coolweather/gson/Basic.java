package com.example.jhon.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jhon on 2020/1/27.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update
    {
        @SerializedName("loc")
        public String updateTime;
    }

}
