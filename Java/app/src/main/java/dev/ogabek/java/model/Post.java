package dev.ogabek.java.model;

import java.util.ArrayList;
import java.util.List;

public class Post {

    private final int profile;
    private int photo;
    private final String fullName;
    private List<Photos> photos = new ArrayList<>();
    private final boolean isAds;

    public Post(int profile, int photo, String fullName, boolean isAds) {
        this.profile = profile;
        this.photo = photo;
        this.fullName = fullName;
        this.isAds = isAds;
    }

    public Post(int profile, int photo, String fullName) {
        this.profile = profile;
        this.photo = photo;
        this.fullName = fullName;
        this.isAds = false;
    }

    public Post(int profile, List<Photos> photos, String fullName) {
        this.profile = profile;
        this.photos = photos;
        this.fullName = fullName;
        isAds = false;
    }

    public boolean isAds() {
        return isAds;
    }

    public List<Photos> getPhotos() {
        return photos;
    }

    public int getProfile() {
        return profile;
    }

    public int getPhoto() {
        return photo;
    }

    public String getFullName() {
        return fullName;
    }
}
