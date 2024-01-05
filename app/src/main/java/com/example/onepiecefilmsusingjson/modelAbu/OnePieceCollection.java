package com.example.onepiecefilmsusingjson.modelAbu;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
//our class online from json to pojo converter
public class OnePieceCollection {


    public class Broadcast{
        public String day;
        public String time;
        public String timezone;
        public String string;
    }

    public class Data{
        public String url;
        public Images images;
        public Trailer trailer;
        public ArrayList<Title> titles;
        public String title;
        public int episodes;
        public String synopsis;
        public String background;
        public int year;
        public Broadcast broadcast;
    }



    public class Images{
        public String image_url;
        public String small_image_url;
        public String medium_image_url;
        public String large_image_url;
        public String maximum_image_url;
    }




    public class Title{
        public String type;
        public String title;
    }


    public class Trailer{
        public String youtube_id;
        public String url;
        public String embed_url;
        public Images images;
    }


}
