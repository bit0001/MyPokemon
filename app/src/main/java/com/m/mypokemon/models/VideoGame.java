package com.m.mypokemon.models;

import com.m.mypokemon.R;

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

    public static final VideoGame GOLD_AND_SILVER = new VideoGame(
            new HashMap<String, Integer>() {
                {
                    put("Gold", R.drawable.gold);
                    put("Silver", R.drawable.silver);
                }
            },
            new HashMap<String, String>(){
                {
                    put("Gold", "http://www.amazon.com/Pokemon-Gold-Game-Boy-Color/dp/B00004TEYR/ref=sr_1_1?ie=UTF8&qid=1460499464&sr=8-1&keywords=pokemon+gold");
                    put("Silver", "http://www.amazon.com/Pokemon-Silver-Version-Game-Boy-Color/dp/B00004TCT3/ref=sr_1_1?ie=UTF8&qid=1460499522&sr=8-1&keywords=pokemon+silver");
                }
            },
            "Game Freak",
            "Game Boy Color",
            "Nintendo",
            "October 15, 2000");

    public static final VideoGame CRYSTAL = new VideoGame(
            new HashMap<String, Integer>() {
                {
                    put("Crystal", R.drawable.crystal);
                }
            },
            new HashMap<String, String>(){
                {
                    put("Crystal", "http://www.amazon.com/Pokemon-Crystal-Version-Game-Boy-Color/dp/B00005LBHM/ref=sr_1_1?ie=UTF8&qid=1460499797&sr=8-1&keywords=pokemon+crystal");
                }
            },
            "Game Freak",
            "Game Boy Color",
            "Nintendo",
            "July 30, 2001");

    public static final VideoGame RUBY_AND_SAPPHIRE = new VideoGame(
            new HashMap<String, Integer>() {
                {
                    put("Ruby", R.drawable.ruby);
                    put("Sapphire", R.drawable.sapphire);
                }
            },
            new HashMap<String, String>(){
                {
                    put("Ruby", "http://www.amazon.com/Pok%C3%A9mon-Ruby-Version-Game-Boy-Advance/dp/B000084313/ref=sr_1_2?ie=UTF8&qid=1460509065&sr=8-2&keywords=pokemon+ruby");
                    put("Sapphire", "http://www.amazon.com/Pokemon-Sapphire-Version-Game-Boy-Advance/dp/B000084314/ref=sr_1_2?ie=UTF8&qid=1460509237&sr=8-2&keywords=pokemon+sapphire");
                }
            },
            "Game Freak",
            "Game Boy Advance",
            "Nintendo",
            "March 19, 2003");

    public static final VideoGame FIRERED_AND_LEAFGREEN = new VideoGame(
            new HashMap<String, Integer>() {
                {
                    put("FireRed", R.drawable.fire_red);
                    put("LeafGreen", R.drawable.leaf_green);
                }
            },
            new HashMap<String, String>(){
                {
                    put("FireRed", "http://www.amazon.com/Pokemon-FireRed-Version-Game-Boy-Advance/dp/B0006GBCZU/ref=sr_1_1?ie=UTF8&qid=1460508428&sr=8-1&keywords=firered");
                    put("LeafGreen", "http://www.amazon.com/Pokemon-Green-Version-Game-Boy-Advance/dp/B0006GBD04/ref=sr_1_1?ie=UTF8&qid=1460508401&sr=8-1&keywords=leafgreen");
                }
            },
            "Game Freak",
            "Game Boy Advance",
            "Nintendo",
            "September 9, 2004");

    public static final VideoGame EMERALD = new VideoGame(
            new HashMap<String, Integer>() {
                {
                    put("Emerald", R.drawable.emerald);
                }
            },
            new HashMap<String, String>(){
                {
                    put("Emerald", "http://www.amazon.com/Pokemon-Emerald-Version-Game-Boy-Advance/dp/B0007D4MVI/ref=sr_1_1?ie=UTF8&qid=1460509340&sr=8-1&keywords=pokemon+emerald");
                }
            },
            "Game Freak",
            "Game Boy Advance",
            "Nintendo",
            "May 1, 2005");

    public static final VideoGame DIAMOND_AND_PEARL = new VideoGame(
            new HashMap<String, Integer>() {
                {
                    put("Diamond", R.drawable.diamond);
                    put("Pearl", R.drawable.pearl);
                }
            },
            new HashMap<String, String>(){
                {
                    put("Diamond", "http://www.amazon.com/Pokemon-Diamond-Version-nintendo-ds/dp/B000MJB0H6/ref=sr_1_1?ie=UTF8&qid=1460510643&sr=8-1&keywords=pokemon+diamond");
                    put("Pearl", "http://www.amazon.com/Pokemon-Pearl-Version-nintendo-ds/dp/B000MJB1WU/ref=sr_1_1?ie=UTF8&qid=1460510653&sr=8-1&keywords=pokemon+perl");
                }
            },
            "Game Freak",
            "Nintendo DS",
            "Nintendo",
            "April 22, 2007");

    public static final VideoGame PLATINUM = new VideoGame(
            new HashMap<String, Integer>() {
                {
                    put("Platinum", R.drawable.platinum);
                }
            },
            new HashMap<String, String>(){
                {
                    put("Platinum", "http://www.amazon.com/Pokemon-Platinum-Nintendo-DS/dp/B001O1OBFY/ref=sr_1_1?ie=UTF8&qid=1460510847&sr=8-1&keywords=pokemon+platinum");
                }
            },
            "Game Freak",
            "Nintendo DS",
            "Nintendo",
            "March 22, 2009");

    public static final VideoGame HEARTGOLD_AND_SOULSILVER = new VideoGame(
            new HashMap<String, Integer>() {
                {
                    put("HeartGold", R.drawable.heart_gold);
                    put("SoulSilver", R.drawable.soul_silver);
                }
            },
            new HashMap<String, String>(){
                {
                    put("HeartGold", "http://www.amazon.com/Pokemon-HeartGold-Version-Nintendo-DS/dp/B0038MVFYC/ref=sr_1_1?ie=UTF8&qid=1460511097&sr=8-1&keywords=pokemon+heart+gold");
                    put("SoulSilver", "http://www.amazon.com/Pokemon-SoulSilver-Version-Nintendo-DS/dp/B0038MTE7C/ref=sr_1_1?ie=UTF8&qid=1460511117&sr=8-1&keywords=pokemon+soul+silver");
                }
            },
            "Game Freak",
            "Nintendo DS",
            "Nintendo",
            "March 14, 2010");

    public static final VideoGame BLACK_AND_WHITE = new VideoGame(
            new HashMap<String, Integer>() {
                {
                    put("Black", R.drawable.black);
                    put("White", R.drawable.white);
                }
            },
            new HashMap<String, String>(){
                {
                    put("Black", "http://www.amazon.com/Pokemon-Black-Version-Nintendo-DS/dp/B004EW2PC6/ref=sr_1_1?ie=UTF8&qid=1460511662&sr=8-1&keywords=pokemon+black");
                    put("White", "http://www.amazon.com/Pokemon-White-Version-Nintendo-DS/dp/B004EVWYYG/ref=sr_1_1?ie=UTF8&qid=1460511680&sr=8-1&keywords=pokemon+white");
                }
            },
            "Game Freak",
            "Nintendo DS",
            "Nintendo",
            "March 6, 2011");

    public static final VideoGame BLACK2_AND_WHITE2 = new VideoGame(
            new HashMap<String, Integer>() {
                {
                    put("Black 2", R.drawable.black2);
                    put("White 2", R.drawable.white2);
                }
            },
            new HashMap<String, String>(){
                {
                    put("Black 2", "http://www.amazon.com/Pok%C3%A9mon-Black-Version-2-Nintendo-DS/dp/B0050SVNSU/ref=sr_1_1?ie=UTF8&qid=1460511825&sr=8-1&keywords=pokemon+black+2");
                    put("White 2", "http://www.amazon.com/Pok%C3%A9mon-White-Version-2-Nintendo-DS/dp/B0050SVNP8/ref=sr_1_1?ie=UTF8&qid=1460511838&sr=8-1&keywords=pokemon+white+2");
                }
            },
            "Game Freak",
            "Nintendo DS",
            "Nintendo",
            "October 7, 2012");

    public static final VideoGame X_AND_Y = new VideoGame(
            new HashMap<String, Integer>() {
                {
                    put("X", R.drawable.x);
                    put("Y", R.drawable.y);
                }
            },
            new HashMap<String, String>(){
                {
                    put("X", "http://www.amazon.com/Pok%C3%A9mon-X-nintendo-3ds/dp/B0053B5RGI/ref=sr_1_1?s=videogames&ie=UTF8&qid=1460512827&sr=1-1&keywords=pokemon+x");
                    put("Y", "http://www.amazon.com/Pok%C3%A9mon-Y-nintendo-3ds/dp/B0053B66KE/ref=sr_1_1?s=videogames&ie=UTF8&qid=1460512838&sr=1-1&keywords=pokemon+y");
                }
            },
            "Game Freak",
            "Nintendo 3DS",
            "Nintendo",
            "October 12, 2013");

    public static final VideoGame OMEGA_RUBY_AND_ALPHA_SAPPHIRE = new VideoGame(
            new HashMap<String, Integer>() {
                {
                    put("Omega Ruby", R.drawable.omega_ruby);
                    put("Alpha Sapphire", R.drawable.alpha_sapphire);
                }
            },
            new HashMap<String, String>(){
                {
                    put("Omega Ruby", "http://www.amazon.com/Pok%C3%A9mon-Omega-Ruby-Nintendo-3DS/dp/B00KI2OZ9M/ref=sr_1_1?s=videogames&ie=UTF8&qid=1460513066&sr=1-1&keywords=pokemon+omega+ruby");
                    put("Alpha Sapphire", "http://www.amazon.com/Pok%C3%A9mon-Alpha-Sapphire-Nintendo-3DS/dp/B00K848IH0/ref=sr_1_2?s=videogames&ie=UTF8&qid=1460513087&sr=1-2&keywords=pokemon+omega+ruby");
                }
            },
            "Game Freak",
            "Nintendo 3DS",
            "Nintendo",
            "November 21, 2014");

    public static final VideoGame SUN_AND_MOON = new VideoGame(
            new HashMap<String, Integer>() {
                {
                    put("Sun", R.drawable.sun);
                    put("Moon", R.drawable.moon);
                }
            },
            new HashMap<String, String>(){
                {
                    put("Sun", "http://www.amazon.com/Pokemon-Sun-Nintendo-3DS/dp/B01C93CWU6/ref=sr_1_1?s=videogames&ie=UTF8&qid=1460513218&sr=1-1&keywords=pokemon+sun");
                    put("Moon", "http://www.amazon.com/Pokemon-Sun-Nintendo-3DS/dp/B01C93CWU6/ref=sr_1_1?s=videogames&ie=UTF8&qid=1460513218&sr=1-1&keywords=pokemon+sun");
                }
            },
            "Game Freak",
            "Nintendo 3DS",
            "Nintendo",
            "Holiday 2016");

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
