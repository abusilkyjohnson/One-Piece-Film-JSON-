package com.example.onepiecefilmsusingjson.modelAbu;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

//our class online from json to pojo converter
public class OnePieceCollection {


    public OnePieceCollection() {
    }


    public class Items
    {
        private int count;

        private int total;

        private int per_page;

        public void setCount(int count){
            this.count = count;
        }
        public int getCount(){
            return this.count;
        }
        public void setTotal(int total){
            this.total = total;
        }
        public int getTotal(){
            return this.total;
        }
        public void setPer_page(int per_page){
            this.per_page = per_page;
        }
        public int getPer_page(){
            return this.per_page;
        }
    }

    public class Pagination
    {
        private int last_visible_page;

        private boolean has_next_page;

        private int current_page;

        private Items items;

        public void setLast_visible_page(int last_visible_page){
            this.last_visible_page = last_visible_page;
        }
        public int getLast_visible_page(){
            return this.last_visible_page;
        }
        public void setHas_next_page(boolean has_next_page){
            this.has_next_page = has_next_page;
        }
        public boolean getHas_next_page(){
            return this.has_next_page;
        }
        public void setCurrent_page(int current_page){
            this.current_page = current_page;
        }
        public int getCurrent_page(){
            return this.current_page;
        }
        public void setItems(Items items){
            this.items = items;
        }
        public Items getItems(){
            return this.items;
        }
    }

    public class Jpg
    {
        private String image_url;

        private String small_image_url;

        private String large_image_url;

        public void setImage_url(String image_url){
            this.image_url = image_url;
        }
        public String getImage_url(){
            return this.image_url;
        }
        public void setSmall_image_url(String small_image_url){
            this.small_image_url = small_image_url;
        }
        public String getSmall_image_url(){
            return this.small_image_url;
        }
        public void setLarge_image_url(String large_image_url){
            this.large_image_url = large_image_url;
        }
        public String getLarge_image_url(){
            return this.large_image_url;
        }
    }

    public class Webp
    {
        private String image_url;

        private String small_image_url;

        private String large_image_url;

        public void setImage_url(String image_url){
            this.image_url = image_url;
        }
        public String getImage_url(){
            return this.image_url;
        }
        public void setSmall_image_url(String small_image_url){
            this.small_image_url = small_image_url;
        }
        public String getSmall_image_url(){
            return this.small_image_url;
        }
        public void setLarge_image_url(String large_image_url){
            this.large_image_url = large_image_url;
        }
        public String getLarge_image_url(){
            return this.large_image_url;
        }
    }

    public class Images
    {
        private String image_url;

        private String small_image_url;

        private String medium_image_url;

        private String large_image_url;

        private String maximum_image_url;

        public void setImage_url(String image_url){
            this.image_url = image_url;
        }
        public String getImage_url(){
            return this.image_url;
        }
        public void setSmall_image_url(String small_image_url){
            this.small_image_url = small_image_url;
        }
        public String getSmall_image_url(){
            return this.small_image_url;
        }
        public void setMedium_image_url(String medium_image_url){
            this.medium_image_url = medium_image_url;
        }
        public String getMedium_image_url(){
            return this.medium_image_url;
        }
        public void setLarge_image_url(String large_image_url){
            this.large_image_url = large_image_url;
        }
        public String getLarge_image_url(){
            return this.large_image_url;
        }
        public void setMaximum_image_url(String maximum_image_url){
            this.maximum_image_url = maximum_image_url;
        }
        public String getMaximum_image_url(){
            return this.maximum_image_url;
        }
    }


    public class Trailer
    {
        private String youtube_id;

        private String url;

        private String embed_url;

        private Images images;

        public void setYoutube_id(String youtube_id){
            this.youtube_id = youtube_id;
        }
        public String getYoutube_id(){
            return this.youtube_id;
        }
        public void setUrl(String url){
            this.url = url;
        }
        public String getUrl(){
            return this.url;
        }
        public void setEmbed_url(String embed_url){
            this.embed_url = embed_url;
        }
        public String getEmbed_url(){
            return this.embed_url;
        }
        public void setImages(Images images){
            this.images = images;
        }
        public Images getImages(){
            return this.images;
        }
    }


    public class Titles
    {
        private String type;

        private String title;

        public void setType(String type){
            this.type = type;
        }
        public String getType(){
            return this.type;
        }
        public void setTitle(String title){
            this.title = title;
        }
        public String getTitle(){
            return this.title;
        }
    }


    public class From
    {
        private int day;

        private int month;

        private int year;

        public void setDay(int day){
            this.day = day;
        }
        public int getDay(){
            return this.day;
        }
        public void setMonth(int month){
            this.month = month;
        }
        public int getMonth(){
            return this.month;
        }
        public void setYear(int year){
            this.year = year;
        }
        public int getYear(){
            return this.year;
        }
    }

    public class To
    {
        private String day;

        private String month;

        private String year;

        public void setDay(String day){
            this.day = day;
        }
        public String getDay(){
            return this.day;
        }
        public void setMonth(String month){
            this.month = month;
        }
        public String getMonth(){
            return this.month;
        }
        public void setYear(String year){
            this.year = year;
        }
        public String getYear(){
            return this.year;
        }
    }


    public class Prop
    {
        private From from;

        private To to;

        public void setFrom(From from){
            this.from = from;
        }
        public From getFrom(){
            return this.from;
        }
        public void setTo(To to){
            this.to = to;
        }
        public To getTo(){
            return this.to;
        }
    }

    public class Aired
    {
        private String from;

        private String to;

        private Prop prop;

        private String string;

        public void setFrom(String from){
            this.from = from;
        }
        public String getFrom(){
            return this.from;
        }
        public void setTo(String to){
            this.to = to;
        }
        public String getTo(){
            return this.to;
        }
        public void setProp(Prop prop){
            this.prop = prop;
        }
        public Prop getProp(){
            return this.prop;
        }
        public void setString(String string){
            this.string = string;
        }
        public String getString(){
            return this.string;
        }
    }


    public class Broadcast
    {
        private String day;

        private String time;

        private String timezone;

        private String string;

        public void setDay(String day){
            this.day = day;
        }
        public String getDay(){
            return this.day;
        }
        public void setTime(String time){
            this.time = time;
        }
        public String getTime(){
            return this.time;
        }
        public void setTimezone(String timezone){
            this.timezone = timezone;
        }
        public String getTimezone(){
            return this.timezone;
        }
        public void setString(String string){
            this.string = string;
        }
        public String getString(){
            return this.string;
        }
    }

    public class Studios
    {
        private int mal_id;

        private String type;

        private String name;

        private String url;

        public void setMal_id(int mal_id){
            this.mal_id = mal_id;
        }
        public int getMal_id(){
            return this.mal_id;
        }
        public void setType(String type){
            this.type = type;
        }
        public String getType(){
            return this.type;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public void setUrl(String url){
            this.url = url;
        }
        public String getUrl(){
            return this.url;
        }
    }

    public class Genres
    {
        private int mal_id;

        private String type;

        private String name;

        private String url;

        public void setMal_id(int mal_id){
            this.mal_id = mal_id;
        }
        public int getMal_id(){
            return this.mal_id;
        }
        public void setType(String type){
            this.type = type;
        }
        public String getType(){
            return this.type;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public void setUrl(String url){
            this.url = url;
        }
        public String getUrl(){
            return this.url;
        }
    }

    public class Demographics
    {
        private int mal_id;

        private String type;

        private String name;

        private String url;

        public void setMal_id(int mal_id){
            this.mal_id = mal_id;
        }
        public int getMal_id(){
            return this.mal_id;
        }
        public void setType(String type){
            this.type = type;
        }
        public String getType(){
            return this.type;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public void setUrl(String url){
            this.url = url;
        }
        public String getUrl(){
            return this.url;
        }
    }

    public class Data
    {
        private int mal_id;

        private String url;

        private Images images;

        private Trailer trailer;

        private boolean approved;

        private List<Titles> titles;

        private String title;

        private String title_english;

        private String title_japanese;

        private List<String> title_synonyms;

        private String type;

        private String source;

        private int episodes;

        private String status;

        private boolean airing;

        private Aired aired;

        private String duration;

        private String rating;

        private double score;

        private int scored_by;

        private int rank;

        private int popularity;

        private int members;

        private int favorites;

        private String synopsis;

        private String background;

        private String season;

        private String year;

        private Broadcast broadcast;

        private List<String> producers;

        private List<String> licensors;

        private List<Studios> studios;

        private List<Genres> genres;

        private List<String> explicit_genres;

        private List<String> themes;

        private List<Demographics> demographics;

        public void setMal_id(int mal_id){
            this.mal_id = mal_id;
        }
        public int getMal_id(){
            return this.mal_id;
        }
        public void setUrl(String url){
            this.url = url;
        }
        public String getUrl(){
            return this.url;
        }
        public void setImages(Images images){
            this.images = images;
        }
        public Images getImages(){
            return this.images;
        }
        public void setTrailer(Trailer trailer){
            this.trailer = trailer;
        }
        public Trailer getTrailer(){
            return this.trailer;
        }
        public void setApproved(boolean approved){
            this.approved = approved;
        }
        public boolean getApproved(){
            return this.approved;
        }
        public void setTitles(List<Titles> titles){
            this.titles = titles;
        }
        public List<Titles> getTitles(){
            return this.titles;
        }
        public void setTitle(String title){
            this.title = title;
        }
        public String getTitle(){
            return this.title;
        }
        public void setTitle_english(String title_english){
            this.title_english = title_english;
        }
        public String getTitle_english(){
            return this.title_english;
        }
        public void setTitle_japanese(String title_japanese){
            this.title_japanese = title_japanese;
        }
        public String getTitle_japanese(){
            return this.title_japanese;
        }
        public void setTitle_synonyms(List<String> title_synonyms){
            this.title_synonyms = title_synonyms;
        }
        public List<String> getTitle_synonyms(){
            return this.title_synonyms;
        }
        public void setType(String type){
            this.type = type;
        }
        public String getType(){
            return this.type;
        }
        public void setSource(String source){
            this.source = source;
        }
        public String getSource(){
            return this.source;
        }
        public void setEpisodes(int episodes){
            this.episodes = episodes;
        }
        public int getEpisodes(){
            return this.episodes;
        }
        public void setStatus(String status){
            this.status = status;
        }
        public String getStatus(){
            return this.status;
        }
        public void setAiring(boolean airing){
            this.airing = airing;
        }
        public boolean getAiring(){
            return this.airing;
        }
        public void setAired(Aired aired){
            this.aired = aired;
        }
        public Aired getAired(){
            return this.aired;
        }
        public void setDuration(String duration){
            this.duration = duration;
        }
        public String getDuration(){
            return this.duration;
        }
        public void setRating(String rating){
            this.rating = rating;
        }
        public String getRating(){
            return this.rating;
        }
        public void setScore(double score){
            this.score = score;
        }
        public double getScore(){
            return this.score;
        }
        public void setScored_by(int scored_by){
            this.scored_by = scored_by;
        }
        public int getScored_by(){
            return this.scored_by;
        }
        public void setRank(int rank){
            this.rank = rank;
        }
        public int getRank(){
            return this.rank;
        }
        public void setPopularity(int popularity){
            this.popularity = popularity;
        }
        public int getPopularity(){
            return this.popularity;
        }
        public void setMembers(int members){
            this.members = members;
        }
        public int getMembers(){
            return this.members;
        }
        public void setFavorites(int favorites){
            this.favorites = favorites;
        }
        public int getFavorites(){
            return this.favorites;
        }
        public void setSynopsis(String synopsis){
            this.synopsis = synopsis;
        }
        public String getSynopsis(){
            return this.synopsis;
        }
        public void setBackground(String background){
            this.background = background;
        }
        public String getBackground(){
            return this.background;
        }
        public void setSeason(String season){
            this.season = season;
        }
        public String getSeason(){
            return this.season;
        }
        public void setYear(String year){
            this.year = year;
        }
        public String getYear(){
            return this.year;
        }
        public void setBroadcast(Broadcast broadcast){
            this.broadcast = broadcast;
        }
        public Broadcast getBroadcast(){
            return this.broadcast;
        }
        public void setProducers(List<String> producers){
            this.producers = producers;
        }
        public List<String> getProducers(){
            return this.producers;
        }
        public void setLicensors(List<String> licensors){
            this.licensors = licensors;
        }
        public List<String> getLicensors(){
            return this.licensors;
        }
        public void setStudios(List<Studios> studios){
            this.studios = studios;
        }
        public List<Studios> getStudios(){
            return this.studios;
        }
        public void setGenres(List<Genres> genres){
            this.genres = genres;
        }
        public List<Genres> getGenres(){
            return this.genres;
        }
        public void setExplicit_genres(List<String> explicit_genres){
            this.explicit_genres = explicit_genres;
        }
        public List<String> getExplicit_genres(){
            return this.explicit_genres;
        }
        public void setThemes(List<String> themes){
            this.themes = themes;
        }
        public List<String> getThemes(){
            return this.themes;
        }
        public void setDemographics(List<Demographics> demographics){
            this.demographics = demographics;
        }
        public List<Demographics> getDemographics(){
            return this.demographics;
        }
    }

    public class Root
    {
        private Pagination pagination;

        private List<Data> data;

        public void setPagination(Pagination pagination){
            this.pagination = pagination;
        }
        public Pagination getPagination(){
            return this.pagination;
        }
        public void setData(List<Data> data){
            this.data = data;
        }
        public List<Data> getData(){
            return this.data;
        }
    }
}
