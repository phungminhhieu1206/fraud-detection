package com.hieudev.frauddetection.config;

public class Config {
    public static final long SDT_DECAY_TIME = 1800000L; // 30p
    public static final long IMEI_DECAY_TIME = 3600000L; // 60p
    public static final long IP_DECAY_TIME = 600000L; // 10p
    public static final long GTTT_DECAY_TIME = 2592000000L; // 1 month

    // threshold score
    public static final float SAFE_SCORE_THRESHOLD = 0.3F;
    public static final float FAKE_SCORE_THRESHOLD = 0.5F;

    // for add in score
    public static final int SDT_POINT = 1;
    public static final int IMEI_POINT = 2;
    public static final int IP_POINT = 2;
    public static final int GTTT_POINT = 1;

    // Config name
    public static final String FAKE_RESULT = "Giả mạo!";
    public static final String SAFE_RESULT = "An toàn!";
    public static final String CONSIDER_RESULT = "Xem xét tiếp!";
}
