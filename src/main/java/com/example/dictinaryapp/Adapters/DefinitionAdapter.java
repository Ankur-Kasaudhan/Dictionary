package com.example.dictinaryapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictinaryapp.R;
import com.example.dictinaryapp.ViewHolder.DefinitionViewHolder;
import com.example.dictinaryapp.model_.Definitions;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DefinitionAdapter extends RecyclerView.Adapter<DefinitionViewHolder> {
    private Context context;
    private List<Definitions> definitionsList;

    public DefinitionAdapter(Context context, List<Definitions> definitionsList) {
        this.context = context;
        this.definitionsList = definitionsList;
    }

    @NonNull
    @NotNull
    @Override
    public DefinitionViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new DefinitionViewHolder(LayoutInflater.from(context).inflate(R.layout.definitions_list_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DefinitionViewHolder holder, int position) {
        holder.textview_difinition.setText("Definition :" + definitionsList.get(position).getDefinition());
        holder.textview_example.setText("Example: " + definitionsList.get(position).getExample());
        StringBuilder synonyms = new StringBuilder();
        StringBuilder antonyms = new StringBuilder();

        synonyms.append(definitionsList.get(position).getSynonyms());
        antonyms.append(definitionsList.get(position).getAntonyms());

        holder.textview_synonyms.setText(synonyms);
        holder.textview_antonyms.setText(antonyms);

        holder.textview_synonyms.setSelected(true);
        holder.textview_antonyms.setSelected(true);
    }

    @Override
    public int getItemCount() {
        return definitionsList.size();
    }
}
