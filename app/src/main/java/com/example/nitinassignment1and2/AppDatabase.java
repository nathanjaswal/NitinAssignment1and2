package com.example.nitinassignment1and2;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.nitinassignment1and2.Places;

@Database(entities = {Places.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase appDatabase = null;

    public static AppDatabase getInstance(Context context) {
        if (appDatabase == null) {
            appDatabase = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "database_lab_assignment").allowMainThreadQueries().build();
        }
        return appDatabase;
    }

    public abstract PlaceDao placeDao();
}