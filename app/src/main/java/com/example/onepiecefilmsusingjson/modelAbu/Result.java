package com.example.onepiecefilmsusingjson.modelAbu;

import android.content.Intent;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {
    //fetchs the whole results FROM our json collection class

    @SerializedName("pagination") //we really dont neeed would specifiy/page the name here in my variable name differ from the json field
    @Expose// from Json library.These annotations are used to customize the serialization and deserialization of Json data when working
            //with Json as the Json converter, these annotations allow you to control the mapping between your java object and jason key
    private Integer pagination;

    @SerializedName("data")
    @Expose
    private List<OnePieceCollection.Titles> data;

    public Integer getPagination() {
        return pagination;
    }

    public void setPagination(Integer pagination) {
        this.pagination = pagination;
    }

    public List<OnePieceCollection.Titles> getData() {
        return data;
    }

    public void setData(List<OnePieceCollection.Titles> data) {
        this.data = data;
    }

    public Result() {

        //empty to prevent null pointer exceptions
    }
}
