package com.example.dictinaryapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictinaryapp.R;
import com.example.dictinaryapp.ViewHolder.MeaningViewHolder;
import com.example.dictinaryapp.model_.Meanings;

import org.jetbrains.annotations.NotNull;

import java.security.PrivateKey;
import java.util.List;

public class MeaningAdapter extends RecyclerView.Adapter<MeaningViewHolder> {
    private Context context;
    private List<Meanings> meaningsList;

    public MeaningAdapter(Context context, List<Meanings> meaningsList) {
        this.context = context;
        this.meaningsList = meaningsList;
    }

    @NonNull
    @NotNull
    @Override
    public MeaningViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new MeaningViewHolder(LayoutInflater.from(context).inflate(R.layout.meanings_list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MeaningViewHolder holder, int position) {

        holder.textview_partsOfSpeech.setText("Parts of Speech:" + meaningsList.get(position).getPartOfSpeech());
        holder.recycler_definitions.setHasFixedSize(true);
        holder.recycler_definitions.setLayoutManager(new GridLayoutManager(context, 1));
        DefinitionAdapter definitionAdapter = new DefinitionAdapter(context, meaningsList.get(position).getDefinitions());
        holder.recycler_definitions.setAdapter(definitionAdapter);

    }

    @Override
    public int getItemCount() {
        return meaningsList.size();
    }
}
