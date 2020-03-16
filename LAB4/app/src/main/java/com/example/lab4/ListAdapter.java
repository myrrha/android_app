package com.example.lab4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder>{

    private final MainActivity mainActivity;
    private final List<DummyContent.DummyItem> values;

    ListAdapter(MainActivity parent, List<DummyContent.DummyItem> items) {
        mainActivity = parent;
        values = items;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ListViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final ListViewHolder holder, int position) {
        holder.item_number.setText(values.get(position).id);
        holder.item_text.setText(values.get(position).content);
        holder.itemView.setTag(values.get(position));
        //holder.itemView.setOnClickListener(onClickListener);
    }
    @Override
    public int getItemCount() { return values.size(); }

    class ListViewHolder extends RecyclerView.ViewHolder{
        TextView item_number;
        TextView item_text;

        public ListViewHolder( View itemView ){
            super(itemView);

            item_number = itemView.findViewById(R.id.item_number);
            item_text = itemView.findViewById(R.id.item_text);
        }

    }
}