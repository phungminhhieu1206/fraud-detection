package com.hieudev.frauddetection.repositories;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BlackList {
    public static final Set<String> SDT;
    public static final Set<String> IMEI;
    public static final Set<String> IP;
    public static final Set<String> GTTT;

    static {
        Set<String > tempSet = new HashSet<>();
        tempSet.add("84981932985");
        tempSet.add("84123444555");
        tempSet.add("84123555666");
        tempSet.add("84123666777");
        tempSet.add("84123777888");

        SDT = Collections.unmodifiableSet(tempSet);
    }

    static {
        Set<String > tempSet = new HashSet<>();
        tempSet.add("009974836278000");
        tempSet.add("173840078393712");
        tempSet.add("080230221555666");
        tempSet.add("802233136667077");
        tempSet.add("008412377780088");

        IMEI = Collections.unmodifiableSet(tempSet);
    }

    static {
        Set<String > tempSet = new HashSet<>();
        tempSet.add("10.23.4.125");
        tempSet.add("25.7.19.111");
        tempSet.add("192.168.1.1");
        tempSet.add("234.22.111.22");
        tempSet.add("13.4.55.11");

        IP = Collections.unmodifiableSet(tempSet);
    }

    static {
        Set<String > tempSet = new HashSet<>();
        tempSet.add("001200022211");
        tempSet.add("001300011224");
        tempSet.add("001200050367");
        tempSet.add("001202826781");
        tempSet.add("001373612221");

        GTTT = Collections.unmodifiableSet(tempSet);
    }
}
