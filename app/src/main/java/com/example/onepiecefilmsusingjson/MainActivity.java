package com.example.onepiecefilmsusingjson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;

import com.example.onepiecefilmsusingjson.databinding.ActivityMainBinding;
import com.example.onepiecefilmsusingjson.modelAbu.OnePieceCollection;
import com.example.onepiecefilmsusingjson.modelAbu.OnePieceCollection.Data;
import com.example.onepiecefilmsusingjson.view.OnePieceAdapter;
import com.example.onepiecefilmsusingjson.viewmodel.OnePieceViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<OnePieceCollection.Titles> opCollection;
    private RecyclerView recyclerView;
    private OnePieceAdapter opAdapter;
    private SwipeRefreshLayout swipeRefreshLayout;
    private ActivityMainBinding binding;
    private OnePieceViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );

        viewModel = new ViewModelProvider(this)
                .get(OnePieceViewModel.class);

        GetOnePiece();

        swipeRefreshLayout = binding.swipeLayout;
        swipeRefreshLayout.setColorSchemeResources(R.color.black);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                GetOnePiece();
            }
        });
    }


    private void GetOnePiece(){

        viewModel.getAllOnePiece().observe(this, new Observer<List<OnePieceCollection.Titles>>(){
            @Override
            public void onChanged(List<OnePieceCollection.Titles> onePieceCollectionsLive) {
                opCollection = (List<OnePieceCollection.Titles>) onePieceCollectionsLive;
                displayMoviesInRecyclerView();
            }
        });

    }
    private void displayMoviesInRecyclerView() {
        recyclerView = binding.recyclerView;

        opAdapter = new OnePieceAdapter(this, opCollection);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(opAdapter);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        // notify an adapter associated with a RecyclerView
        // that the underlying dataset hase changed
        opAdapter.notifyDataSetChanged();
    }
}