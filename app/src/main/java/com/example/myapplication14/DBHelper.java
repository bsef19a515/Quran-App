package com.example.myapplication14;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    public static final String AyaID = "AyaID";
    public static final String SurahID = "SuraID";
    public static final String AyaNo = "AyaNo";
    public static final String RakuID = "RakuID";
    public static final String PRakuID = "PRakuID";
    public static final String ParaID = "ParaID";

    public static final String ArabicText = "ArabicText";
        public static final String FatehMuhammadJalandhri = "FatehMuhammadJalandhri";
        public static final String MehmoodulHassan = "MehmoodulHassan";
        public static final String DrMohsinKhan = "DrMohsinKhan";
        public static final String MuftiTaqiUsmani = "MuftiTaqiUsmani";
        public static final String Table_name="tayah";


        public DBHelper(@Nullable Context context) {
            super(context, "quran.db", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
           // String createTableSTatementOne = "CREATE TABLE CustTable(CustomerID Integer PRIMARY KEY AUTOINCREMENT, " + CUSTOMER_NAME_FIRST + " Text, CustomerAge Int, ActiveCustomer BOOL) ";
                      String createTableSTatement = "CREATE TABLE " + Table_name + "(" +
                    AyaID + " Integer PRIMARY KEY AUTOINCREMENT," + SurahID + " Integer,"
                    + AyaNo + " Integer, " + ArabicText + " String, "+FatehMuhammadJalandhri+" String," +
                    MehmoodulHassan+" String,"+DrMohsinKhan+" String,"+MuftiTaqiUsmani+" String," +
                    RakuID+" Integer,"+PRakuID+" Integer,"+ParaID+" Integer ) ";
           db.execSQL(createTableSTatement);
        }


        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + Table_name);
            onCreate(db);
        }


    public ArrayList<String> getEnglishTranslation() {

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursorCourses = db.rawQuery("SELECT "+FatehMuhammadJalandhri+" FROM " + Table_name, null);
//        Log.d("query executed",cursorCourses.getString(0));
//        ArrayList<Quran> studentArrayList = new ArrayList<>();
        ArrayList<String> studentArrayList = new ArrayList<>();


        // moving our cursor to first position.
        if (cursorCourses.moveToFirst()) {
            do {
//
//                studentArrayList.add(new Quran(cursorCourses.getInt(1),
//                        cursorCourses.getInt(2),
//                        cursorCourses.getInt(3),
//                        cursorCourses.getString(4)));
                studentArrayList.add(cursorCourses.getString(0));
            } while (cursorCourses.moveToNext());

        }

        cursorCourses.close();
        return studentArrayList;
    }

    public ArrayList<String> getUrduTranslation() {

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursorCourses = db.rawQuery("SELECT "+MuftiTaqiUsmani+" FROM " + Table_name, null);
//        Log.d("query executed",cursorCourses.getString(0));
//        ArrayList<Quran> studentArrayList = new ArrayList<>();
        ArrayList<String> studentArrayList = new ArrayList<>();


        // moving our cursor to first position.
        if (cursorCourses.moveToFirst()) {
            do {
//
//                studentArrayList.add(new Quran(cursorCourses.getInt(1),
//                        cursorCourses.getInt(2),
//                        cursorCourses.getInt(3),
//                        cursorCourses.getString(4)));
                studentArrayList.add(cursorCourses.getString(0));
            } while (cursorCourses.moveToNext());

        }

        cursorCourses.close();
        return studentArrayList;
    }






    }

