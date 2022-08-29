package com.example.myapplication14;

public class Quran {
    private  int AyaID ;
    private  int SurahID ;
    private int AyaNo ;
    private  String ArabicText ;

    public Quran(){

    }

    public Quran(int ayaID, int surahID, int ayaNo, String arabicText) {
        AyaID = ayaID;
        SurahID = surahID;
        AyaNo = ayaNo;
        ArabicText = arabicText;
    }

    public int getAyaID() {
        return AyaID;
    }

    public void setAyaID(int ayaID) {
        AyaID = ayaID;
    }

    public int getSurahID() {
        return SurahID;
    }

    public void setSurahID(int surahID) {
        SurahID = surahID;
    }

    public int getAyaNo() {
        return AyaNo;
    }

    public void setAyaNo(int ayaNo) {
        AyaNo = ayaNo;
    }

    public String getArabicText() {
        return ArabicText;
    }

    public void setArabicText(String arabicText) {
        ArabicText = arabicText;
    }
}
