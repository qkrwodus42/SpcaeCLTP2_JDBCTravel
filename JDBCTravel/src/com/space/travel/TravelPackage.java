package com.space.travel;

import java.sql.Date;

public class TravelPackage {
    private int packageNumber;
    private String packageName;
    private int packagePrice;
    private Date packageDeparture;
    private Date packageArrival;


    public TravelPackage() {
    }

    public TravelPackage(int packageNumber, String packageName, int packagePrice, Date packageDeparture, Date packageArrival) {
        this.packageNumber = packageNumber;
        this.packageName = packageName;
        this.packagePrice = packagePrice;
        this.packageDeparture = packageDeparture;
        this.packageArrival = packageArrival;
    }

    public int getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(int packageNumber) {
        this.packageNumber = packageNumber;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(int packagePrice) {
        this.packagePrice = packagePrice;
    }

    public Date getPackageDeparture() {
        return packageDeparture;
    }

    public void setPackageDeparture(Date packageDeparture) {
        this.packageDeparture = packageDeparture;
    }

    public Date getPackageArrival() {
        return packageArrival;
    }

    public void setPackageArrival(Date packageArrival) {
        this.packageArrival = packageArrival;
    }

    @Override
    public String toString() {
        return "[여행패키지 번호: " + packageNumber +
                " / 여행패키지 이름: " + packageName +
                " / 여행패키지 가격: " + packagePrice +
                " / 여행패키지 출발일:" + packageDeparture +
                " / 여행패키지 도착일:" + packageArrival +
                "]";
    }
}
