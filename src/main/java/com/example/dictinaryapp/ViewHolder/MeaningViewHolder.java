package com.example.dictinaryapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictinaryapp.R;

public class MeaningViewHolder extends RecyclerView.ViewHolder {
    public RecyclerView recycler_definitions;
    public TextView textview_partsOfSpeech;
    public MeaningViewHolder(@NonNull  View itemView) {
        super(itemView);
        recycler_definitions = itemView.findViewById(R.id.recycler_definitions);
        textview_partsOfSpeech = itemView.findViewById(R.id.textview_partsOfSpeech);
    }
}
