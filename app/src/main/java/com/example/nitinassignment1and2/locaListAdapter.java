package com.example.nitinassignment1and2;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class locaListAdapter extends RecyclerView.Adapter<locaListAdapter.listViewHolder> {

    private List<LocM> locations;

    public locaListAdapter(List<LocM> Locations) {
        this.locations = Locations;
    }

    @NonNull
    @Override
    public listViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_locations, parent, false);
        return new listViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listViewHolder holder, int position) {
        final LocM vehicle = locations.get(position);
        holder.txtAdd.setText(vehicle.getAddress());
        holder.txtDate.setText(vehicle.getDate());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent vAct = new Intent(v.getContext(), MapActivity.class);

                //vAct.putExtra("vehDetail", vehicle);

                v.getContext().startActivity(vAct);

            }

        });
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    public static class listViewHolder extends RecyclerView.ViewHolder {
        public TextView txtAdd;
        public TextView txtDate;
        public listViewHolder(@NonNull View itemView) {
            super(itemView);
            txtAdd = itemView.findViewById(R.id.addressTV);
            txtDate = itemView.findViewById(R.id.dateTV);

        }
    }

}
