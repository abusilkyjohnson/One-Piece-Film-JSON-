package com.example.onepiecefilmsusingjson.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onepiecefilmsusingjson.R;
import com.example.onepiecefilmsusingjson.databinding.OnepieceListItemBinding;
import com.example.onepiecefilmsusingjson.modelAbu.OnePieceCollection;

import java.util.ArrayList;
import java.util.List;

public class OnePieceAdapter extends RecyclerView.Adapter<OnePieceAdapter.OnePieceViewHolder> {
    private Context context;
    private List<OnePieceCollection> onePieceCollectionList;

    public OnePieceAdapter(Context context, List<OnePieceCollection.Titles> onePieceCollectionList) {
        this.context = context;
        this.onePieceCollectionList = onePieceCollectionList;
    }

    @NonNull
    @Override
    public OnePieceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        OnepieceListItemBinding binding = DataBindingUtil
                                            .inflate(LayoutInflater.from(context),
                                                    R.layout.onepiece_list_item,parent,false);

        return new OnePieceViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull OnePieceViewHolder holder, int position) {
        OnePieceCollection.Titles opCollection = onePieceCollectionList.get(position);
        holder.onepieceListItemBinding.setFilm(opCollection);
        //////////////////look at this to see how it binds may need to change

    }

    @Override
    public int getItemCount() {
        return onePieceCollectionList.size();
    }


    public class OnePieceViewHolder extends RecyclerView.ViewHolder{
        private OnepieceListItemBinding onepieceListItemBinding;

        public OnePieceViewHolder(OnepieceListItemBinding onepieceListItemBinding) {
            super(onepieceListItemBinding.getRoot());
            this.onepieceListItemBinding = onepieceListItemBinding;

            onepieceListItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}
