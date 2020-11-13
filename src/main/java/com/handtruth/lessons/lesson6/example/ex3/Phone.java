package com.handtruth.lessons.lesson6.example.ex3;

import java.util.Random;

public class Phone {
    private String name;
    private Integer battery;
    private Integer camera;
    private Integer androidVersion;
    private Integer uiVersion;
    private Integer ram;
    private Integer wifiVersion;
    private Integer wifiHz;
    private Integer minBatteryV;
    private Integer maxBatteryV;
    private String modelNumber;
    private Integer freq;

    public Phone(
            String name, Integer battery, Integer camera, Integer androidVersion, Integer uiVersion,
            Integer ram, Integer wifiVersion, Integer wifiHz, Integer minBatteryV, Integer maxBatteryV,
            String modelNumber, Integer freq
    ) {
        this.name = name;
        this.battery = battery;
        this.camera = camera;
        this.androidVersion = androidVersion;
        this.uiVersion = uiVersion;
        this.ram = ram;
        this.wifiVersion = wifiVersion;
        this.wifiHz = wifiHz;
        this.minBatteryV = minBatteryV;
        this.maxBatteryV = maxBatteryV;
        this.modelNumber = modelNumber;
        this.freq = freq;
    }

    public String getName() {
        return this.name;
    }

    public Integer getBattery() {
        return battery;
    }

    public Integer getCamera() {
        return camera;
    }

    public Integer getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(Integer newVersion) {
        this.androidVersion = newVersion;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", battery=" + battery +
                ", camera=" + camera +
                ", androidVersion=" + androidVersion +
                ", uiVersion=" + uiVersion +
                ", ram=" + ram +
                ", wifiVersion=" + wifiVersion +
                ", wifiHz=" + wifiHz +
                ", minBatteryV=" + minBatteryV +
                ", maxBatteryV=" + maxBatteryV +
                ", modelNumber='" + modelNumber + '\'' +
                ", freq=" + freq +
                '}';
    }

    public static Phone create(String name, Integer battery, Integer camera, Integer androidVersion) {
        Random random = new Random();
        int minBatteryV = random.nextInt(100);
        int maxBatteryV = minBatteryV + random.nextInt(10);
        return new Phone(
                name,
                battery,
                camera,
                androidVersion,
                random.nextInt(100),
                random.nextInt(10000),
                random.nextInt(10),
                random.nextInt(6000),
                minBatteryV,
                maxBatteryV,
                "sdkljfnljksdfmnlsdf",
                random.nextInt(6000)
                );
    }
}
