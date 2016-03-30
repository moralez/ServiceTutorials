package com.bathroomgaming.servicetutorials.recyclerviews;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bathroomgaming.servicetutorials.R;

/**
 * Created by jmo on 3/28/2016.
 */
public class ServiceListViewAdapter extends RecyclerView.Adapter<ServiceListItemViewHolder> {

    private String[] mDataset;

    public ServiceListViewAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @Override
    public ServiceListItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.service_list_view_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ServiceListItemViewHolder vh = new ServiceListItemViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ServiceListItemViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.setText(mDataset[position]);

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
