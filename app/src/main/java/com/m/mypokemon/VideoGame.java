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
                    new HashMap<String, String>(){
                        {
                            put("Red", "http://www.amazon.com/Pok%C3%A9mon-Red-Version-Digital-Code/dp/B017WJY65Q/ref=sr_1_1?s=videogames&ie=UTF8&qid=1460471573&sr=1-1&keywords=pokemon+red");
                            put("Blue", "http://www.amazon.com/Pok%C3%A9mon-Blue-Version-Digital-Code/dp/B017WJYCZA/ref=sr_1_1?s=videogames&ie=UTF8&qid=1460471669&sr=1-1&keywords=pokemon+blue");
                        }
                    },
                    "Game Freak",
                    "Game Boy and Nintendo 3DS",
                    "Nintendo",
                    "September 28, 1998");
    public static final VideoGame YELLOW = new VideoGame(
                    new HashMap<String, Integer>() {
                        {
                            put("Yellow", R.drawable.yellow);
                        }
                    },
                    new HashMap<String, String>(){
                        {
                            put("Yellow", "http://www.amazon.com/Pok%C3%A9mon-Yellow-Version-Digital-Code/dp/B017WJY9V2/ref=sr_1_1?s=videogames&ie=UTF8&qid=1460471716&sr=1-1&keywords=pokemon+yellow");
                        }
                    },
                    "Game Freak",
                    "Game Boy and Nintendo 3DS",
                    "Nintendo",
                    "October 18, 1999");

    private HashMap<String, Integer> coverIds;
    private HashMap<String, String> urls;
    private String platform;
    private String developer;
    private String publisher;
    private String releaseDate;

    public VideoGame(HashMap<String, Integer> coverIds, HashMap<String, String> urls, String developer, String platform, String publisher, String releaseDate) {
        this.coverIds = coverIds;
        this.urls = urls;
        this.developer = developer;
        this.platform = platform;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
    }

    public HashMap<String, Integer> getCoverIds() {
        return coverIds;
    }

    public HashMap<String, String> getUrls() {
        return urls;
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
