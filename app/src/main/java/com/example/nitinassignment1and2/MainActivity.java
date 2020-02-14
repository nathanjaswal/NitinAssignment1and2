package com.example.nitinassignment1and2;

////

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Properties
    private Button addBtn;
    private RecyclerView locRecyclerView;
    private locaListAdapter locListAdapter;
    private List<Places> locations = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        initView();
        getFromRoomDatabase();

    }


    public void getFromRoomDatabase() {
        locations.removeAll(locations);
        PlaceInfoServices placeInfoServices = new PlaceInfoServices(getApplicationContext());
        locations.addAll(placeInfoServices.getAll());
        locListAdapter.notifyDataSetChanged();

    }

    private void initView() {
        // initialize
        addBtn = findViewById(R.id.addNL);
        locRecyclerView = findViewById(R.id.locationsRV);
        locListAdapter = new locaListAdapter(locations);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext(), LinearLayoutManager.VERTICAL, false);
        locRecyclerView.setLayoutManager(layoutManager);
        locRecyclerView.setAdapter(locListAdapter);

        //
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mapDClicked();
            }
        });

    }

    public void getData() {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }

    /** ACTION
     * */
    public void mapDClicked() {
        //
        Intent dAct = new Intent(MainActivity.this, MapActivity.class);

        dAct.putExtra("editBool", false);

        startActivity(dAct);
    }
}
