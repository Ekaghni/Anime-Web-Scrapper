package com.generic_corp.animefillerlist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Locale;

public class HomeScreenAdapter extends RecyclerView.Adapter<HomeScreenAdapter.MyViewHolder> implements Filterable {
    private ArrayList<ParseShowsHomeScreen> showList1;
    private ArrayList<ParseShowsHomeScreen> newsArrayListFull;

    Context con2;

    public HomeScreenAdapter(ArrayList<ParseShowsHomeScreen> showList1, Context con2) {
        this.newsArrayListFull = showList1;
        this.showList1 = new ArrayList<>(newsArrayListFull);
        //this.context = context;
        this.con2 = con2;
    }

    @NonNull
    @Override
    public HomeScreenAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.shows_icon,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeScreenAdapter.MyViewHolder holder, int position) {
        ParseShowsHomeScreen parseShowsHomeScreen = showList1.get(position);
        holder.textView_shows.setText(parseShowsHomeScreen.getShow_name());
        //holder.imageView_shows.setImageAlpha(parseShowsHomeScreen.getShow_picture());
        Picasso.get().load(parseShowsHomeScreen.getShow_picture()).into(holder.imageView_shows);
    }

    @Override
    public int getItemCount() {
        return showList1.size();
    }

    @Override
    public Filter getFilter() {
        return newsFilter;
    }

    private final Filter newsFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            ArrayList<ParseShowsHomeScreen> filteredNewsList = new ArrayList<>();
            if (constraint==null || constraint.length()==0){
                filteredNewsList.addAll(newsArrayListFull);
            }
            else {
                String filterPattern = constraint.toString().toLowerCase(Locale.ROOT).trim();
                for (ParseShowsHomeScreen p: newsArrayListFull
                ) {
                    if (p.getShow_name().toLowerCase(Locale.ROOT).contains(filterPattern)){
                        filteredNewsList.add(p);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values= filteredNewsList;
            results.count = filteredNewsList.size();
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            showList1.clear();
            showList1.addAll((ArrayList)results.values);
            notifyDataSetChanged();
        }
    };

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView imageView_shows;
        private TextView textView_shows;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView_shows = itemView.findViewById(R.id.imageView_show);
            textView_shows = itemView.findViewById(R.id.show_episode_title);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            ParseShowsHomeScreen parseShowsHomeScreen = showList1.get(position);
            Intent intent = new Intent(con2,MainActivity.class);
            intent.putExtra("showNameText",parseShowsHomeScreen.getShow_name());
            intent.putExtra("showLink",parseShowsHomeScreen.getShow_link());
            con2.startActivity(intent);
        }
    }
}
