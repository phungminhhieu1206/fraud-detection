package com.hieudev.frauddetection.models;

public class FakeDTO {
    private String sdt;
    private String imei;
    private String ip;
    private String gttt;

    public FakeDTO() { }

    public FakeDTO(String sdt, String imei, String ip, String gttt) {
        this.sdt = sdt;
        this.imei = imei;
        this.ip = ip;
        this.gttt = gttt;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getGttt() {
        return gttt;
    }

    public void setGttt(String gttt) {
        this.gttt = gttt;
    }

    @Override
    public String toString() {
        return "FakeDTO{" +
                "sdt='" + sdt + '\'' +
                ", imei='" + imei + '\'' +
                ", ip='" + ip + '\'' +
                ", gttt='" + gttt + '\'' +
                '}';
    }
}
