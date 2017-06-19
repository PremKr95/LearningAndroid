package com.example.premkchoudhary.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Premk.Choudhary on 16-06-2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Details> ld;
    public MyAdapter(List<Details> det) {
        ld = det;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView txtTitile;
        public ViewHolder(View itemView) {
            super(itemView);
            txtTitile = (TextView) itemView.findViewById(R.id.tvTitle);
            }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View tv = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder vh = new ViewHolder(tv);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Data set and event perform hota hai on data;
        Details details = ld.get(position);
        holder.txtTitile.setText(details.getTitle());
    }



    @Override
    public int getItemCount() {
        //How much item are there in the list.
        return ld.size();
    }
}
