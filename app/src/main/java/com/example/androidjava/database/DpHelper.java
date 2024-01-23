package com.example.androidjava.database;

import android.content.Context;
import android.database.sqlLite.SQLiteDatabase;
import android.database.sqLite.SQLiteOpenHelper;

public class DpHelper extends SQLiteOpenHelper{
    public DbHelper(Context context){
        super(context, "MD18302_DB", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1){

    }
}
