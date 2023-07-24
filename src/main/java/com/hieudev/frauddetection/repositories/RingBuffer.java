package com.hieudev.frauddetection.repositories;


import java.util.HashMap;
import java.util.Map;

public class RingBuffer {
    public static Map<String, Long> SDT = new HashMap<String, Long>();
    public static Map<String, Long> IMEI = new HashMap<String, Long>();
    public static Map<String, Long> IP = new HashMap<String, Long>();
    public static Map<String, Long> GTTT = new HashMap<String, Long>();
}
