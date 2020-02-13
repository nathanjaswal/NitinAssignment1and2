package com.example.nitinassignment1and2;


import java.util.List;

import android.content.Context;
import com.example.nitinassignment1and2.Places;

public class PlaceInfoServices implements PlaceService {

    private PlaceDao placeDao;

    public PlaceInfoServices(Context context) {
        placeDao = AppDatabase.getInstance(context).placeDao();
    }

    @Override
    public List<Places> getAll() {
        return placeDao.getPlaces();
    }

    @Override
    public void insertAll(Places... places) {
        placeDao.insertAll(places);
    }

    @Override
    public void delete(Places place) {
        placeDao.delete(place);
    }

    @Override
    public void update(Places place) {
        placeDao.update(place);
    }
}
