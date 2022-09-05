package com.generic_corp.animefillerlist;

public class ParseItems {
    private String title;
    private String filler_type;
    private  String release_date;
    private  String image_url;

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public ParseItems(String title, String filler_type, String release_date, String image_url) {
        this.title = title;
        this.filler_type = filler_type;
        this.release_date = release_date;
        this.image_url = image_url;
    }

    public String getFiller_type() {
        return filler_type;
    }

    public void setFiller_type(String filler_type) {
        this.filler_type = filler_type;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
