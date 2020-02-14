package com.example.nitinassignment1and2;

import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class locaListAdapter extends RecyclerView.Adapter<locaListAdapter.listViewHolder> {

    private List<Places> locations;

    public locaListAdapter(List<Places> Locations) {
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
        final Places pl = locations.get(position);
        holder.txtAdd.setText(pl.getAddress());
        holder.txtDate.setText(pl.getDate());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                PlaceInfoServices placeInfoServices = new PlaceInfoServices(v.getContext());
                placeInfoServices.delete(pl);

                MainActivity mainActivity = (MainActivity) v.getContext();
                mainActivity.getFromRoomDatabase();



//                Intent vAct = new Intent(v.getContext(), MapActivity.class);
//
//                vAct.putExtra("plDetail", pl);
//                vAct.putExtra("editBool", true);

//                v.getContext().startActivity(vAct);

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
