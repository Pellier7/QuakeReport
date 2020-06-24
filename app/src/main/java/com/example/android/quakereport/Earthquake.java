package com.example.android.quakereport;

public class Earthquake {

    /* 地震の震度 */
    private String mMagnitude;
    /* 地震の場所 */
    private String mLocation;
    /* 地震の日時 */
    private String mDate;


    /**
     *
     * @param Magnitude 地震の震度
     * @param Location 地震の場所
     * @param Date 地震の日時
     */
    public Earthquake(String Magnitude, String Location, String Date) {
        this.mMagnitude = Magnitude;
        this.mLocation = Location;
        this.mDate = Date;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public void setmMagnitude(String mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }
}
