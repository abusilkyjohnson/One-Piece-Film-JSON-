package com.example.onepiecefilmsusingjson.modelAbu;

import android.content.Intent;

import java.util.List;

public class Result {
    //fetchs the whole results

    private Integer pagination;
    private List<OnePieceCollection> data;

    public Integer getPagination() {
        return pagination;
    }

    public void setPagination(Integer pagination) {
        this.pagination = pagination;
    }

    public List<OnePieceCollection> getData() {
        return data;
    }

    public void setData(List<OnePieceCollection> data) {
        this.data = data;
    }

    public Result() {

        //empty to prevent null pointer exceptions
    }
}
