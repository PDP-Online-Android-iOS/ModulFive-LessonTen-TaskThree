package dev.ogabek.kotlin.model

class Post {
    val profile: Int
    var photo = 0
    val fullName: String
    var photos: List<Photos> = ArrayList()
    var isAds: Boolean;

    constructor(profile: Int, photo: Int, fullName: String) {
        this.profile = profile
        this.photo = photo
        this.fullName = fullName
        isAds = false;
    }

    constructor(profile: Int, photo: Int, fullName: String, isAds: Boolean) {
        this.profile = profile
        this.photo = photo
        this.fullName = fullName
        this.isAds = isAds
    }

    constructor(profile: Int, photos: List<Photos>, fullName: String) {
        this.profile = profile
        this.photos = photos
        this.fullName = fullName
        isAds = false;
    }
}
