package com.bathroomgaming.servicetutorials.recyclerviews;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.bathroomgaming.servicetutorials.R;

/**
 * Created by jmo on 3/28/2016.
 */
public class ServiceListItemViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextView;

    public ServiceListItemViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.main_text_view);
    }

    public void setText(String text) {
        mTextView.setText(text);
    }
}
