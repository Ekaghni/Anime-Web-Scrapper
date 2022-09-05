package com.generic_corp.animefillerlist;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
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
import java.util.List;
import java.util.Locale;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> implements Filterable {
     ArrayList<ParseItems> arrayList;
     MainActivity.Description_webscraping context;
     ArrayList<ParseItems> filteredList;


    public MainAdapter(ArrayList<ParseItems> arrayList, MainActivity.Description_webscraping context) {
        this.filteredList = arrayList;
        this.context = context;
        this.arrayList= new ArrayList<>(filteredList);
    }

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.iconxm,parent,false);
        return new ViewHolder(view);
    }
    int i=0;
    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {
        ParseItems parseItem = arrayList.get(position);
        System.out.println("Getting titleeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"+parseItem.getTitle());
        holder.textView.setText(parseItem.getTitle());
        if (parseItem.getFiller_type().equals("Filler") ){
            holder.textView_filler.setText(parseItem.getFiller_type());
            holder.textView_filler.setTextColor(Color.parseColor("#f54242"));
            holder.textView_filler.setTypeface(null, Typeface.BOLD);
        }
        else if(parseItem.getFiller_type().equals("Manga Canon") || parseItem.getFiller_type().equals("Mixed Canon/Filler") || parseItem.getFiller_type().equals("Anime Canon"))
        {
            holder.textView_filler.setText(parseItem.getFiller_type());
            holder.textView_filler.setTextColor(Color.parseColor("#8ecaf5"));
            holder.textView_filler.setTypeface(null, Typeface.BOLD);
        }





        holder.textView_date.setText(parseItem.getRelease_date());
        Picasso.get().load(parseItem.getImage_url()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public Filter getFilter() {
        return newsFilter;
    }
    private final Filter newsFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            ArrayList<ParseItems> filteredNewsList = new ArrayList<>();
            if (constraint==null || constraint.length()==0){
                filteredNewsList.addAll(filteredList);
            }
            else {
                String filterPattern = constraint.toString().toLowerCase(Locale.ROOT).trim();
                for (ParseItems p: filteredList
                     ) {
                    if (p.getTitle().toLowerCase(Locale.ROOT).contains(filterPattern) || p.getFiller_type().toLowerCase(Locale.ROOT).contains(filterPattern) || p.getRelease_date().toLowerCase(Locale.ROOT).contains(filterPattern)){
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
            arrayList.clear();
            arrayList.addAll((ArrayList)results.values);
            notifyDataSetChanged();
        }
    };

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        TextView textView_filler;
        TextView textView_date;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            textView = itemView.findViewById(R.id.anime_episode_title);
            textView_filler = itemView.findViewById(R.id.anime_filler_or_not);
            textView_date = itemView.findViewById(R.id.anime_release_date);
            imageView = itemView.findViewById(R.id.imageView);

        }
    }

}
