package com.m.mypokemon;

import java.util.HashMap;

public class VideoGame {

    public static final VideoGame RED_AND_BLUE = new VideoGame(
                    new HashMap<String, Integer>(){
                        {
                            put("Red", R.drawable.red);
                            put("Blue", R.drawable.blue);
                        }
                    },
                    "Game Freak",
                    "Game Boy",
                    "Nintendo",
                    "September 28, 1998");
    public static final VideoGame YELLOW = new VideoGame(
                    new HashMap<String, Integer>() {
                        {
                            put("Yellow", R.drawable.yellow);
                        }
                    },
                    "Game Freak",
                    "Game Boy",
                    "Nintendo",
                    "October 18, 1999");

    private HashMap<String, Integer> coverIds;
    private String platform;
    private String developer;
    private String publisher;
    private String releaseDate;

    public VideoGame(HashMap<String, Integer> coverIds, String developer, String platform, String publisher, String releaseDate) {
        this.coverIds = coverIds;
        this.developer = developer;
        this.platform = platform;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
    }

    public HashMap<String, Integer> getCoverIds() {
        return coverIds;
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

}
