package com.example.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.domain.Work;

import java.util.List;


public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private List<Work> movies;

    public MainAdapter(List<Work> movies) {
        this.movies = movies;
    }

    //@Override
    //public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
        //return new ViewHolder(view);
    //}

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Work movie = movies.get(position);
        //holder.titleTextView.setText(movie.getTitle());
        //holder.genreTextView.setText(movie.getGenre());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public TextView genreTextView;

        public ViewHolder(View itemView) {
            super(itemView);
           // titleTextView = itemView.findViewById(R.id.title);
            //genreTextView = itemView.findViewById(R.id.genre);
        }
    }
}
