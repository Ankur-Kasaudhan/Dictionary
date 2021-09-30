package com.example.dictinaryapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictinaryapp.R;

public class DefinitionViewHolder extends RecyclerView.ViewHolder {
    public TextView textview_difinition,textview_example,textview_synonyms,textview_antonyms;
    public DefinitionViewHolder(@NonNull View itemView) {
        super(itemView);
        textview_difinition = itemView.findViewById(R.id.textview_difinition);
        textview_example = itemView.findViewById(R.id.textview_example);
        textview_synonyms = itemView.findViewById(R.id.textview_synonyms);
        textview_antonyms = itemView.findViewById(R.id.textview_antonyms);
    }
}
