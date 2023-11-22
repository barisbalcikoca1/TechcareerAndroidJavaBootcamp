package com.barisbalcikoca.odev6.entity;

public class FilmResim {
    private int film_id;
    private String film_ad;
    private String resim_ad;

    public FilmResim() {
    }

    public FilmResim(int film_id, String film_ad, String resim_ad) {
        this.film_id = film_id;
        this.film_ad = film_ad;
        this.resim_ad = resim_ad;
    }



    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getFilm_ad() {
        return film_ad;
    }

    public void setFilm_ad(String film_ad) {
        this.film_ad = film_ad;
    }

    public String getResim_ad() {
        return resim_ad;
    }

    public void setResim_ad(String resim_ad) {
        this.resim_ad = resim_ad;
    }
}
