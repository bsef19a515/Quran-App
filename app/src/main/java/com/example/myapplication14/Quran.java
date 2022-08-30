package com.example.myapplication14;

public class Quran {
    private  int SurahID ;
    private  String ArabicText ;

    public Quran(){

    }

    public Quran( int surahID, String arabicText) {
       this.SurahID = surahID;
        this.ArabicText = arabicText;
    }


    public int getSurahID() {
        return SurahID;
    }

    public void setSurahID(int surahID) {
        SurahID = surahID;
    }


    public String getArabicText() {
        return ArabicText;
    }

    public void setArabicText(String arabicText) {
        ArabicText = arabicText;
    }
}
