package com.m.mypokemon;

import java.util.HashMap;

public class VideoGame {
    private int coverId;
    private String platform;
    private String developer;
    private String publisher;
    private String releaseDate;
    private HashMap<String, Integer> versions;

    public VideoGame(int coverId, String developer, String platform, String publisher,
                     String releaseDate, HashMap<String, Integer> versions) {
        this.coverId = coverId;
        this.developer = developer;
        this.platform = platform;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.versions = versions;
    }

    public int getCoverId() {
        return coverId;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getPlatform() {
        return platform;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public HashMap<String, Integer> getVersions() {
        return versions;
    }
}
