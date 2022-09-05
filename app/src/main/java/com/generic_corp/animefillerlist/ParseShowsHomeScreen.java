package com.generic_corp.animefillerlist;

public class ParseShowsHomeScreen {
    private String show_name;
    private int show_picture;
    private String show_link;

    public String getShow_link() {
        return show_link;
    }

    public void setShow_link(String show_link) {
        this.show_link = show_link;
    }

    public ParseShowsHomeScreen(String show_name, int show_picture, String show_link) {
        this.show_name = show_name;
        this.show_picture = show_picture;
        this.show_link = show_link;
    }

    public String getShow_name() {
        return show_name;
    }

    public void setShow_name(String show_name) {
        this.show_name = show_name;
    }

    public int getShow_picture() {
        return show_picture;
    }

    public void setShow_picture(int show_picture) {
        this.show_picture = show_picture;
    }


}
