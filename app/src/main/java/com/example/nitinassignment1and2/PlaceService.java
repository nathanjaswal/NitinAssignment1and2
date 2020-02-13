package com.example.nitinassignment1and2;

import com.example.nitinassignment1and2.Places;

import java.util.List;

public interface PlaceService {

    List<Places> getAll();

    void insertAll(Places... places);

    void delete(Places place);

    void update(Places place);
}
