package com.generic_corp.animefillerlist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MainAdapter adapter;
    RecyclerView recyclerView;
    String showLink;
    Button canonButton;
    Button fillerButton;
    LoadingDialog obj = new LoadingDialog(this);
    ArrayList<ParseItems> episodeLists = new ArrayList<>();
    TextView showNameText;

    Description_webscraping description_webscraping = new Description_webscraping();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        canonButton = findViewById(R.id.canonButton);
        fillerButton = findViewById(R.id.fillerButton);
        showNameText = findViewById(R.id.showNameText);
        showNameText.setText(getIntent().getStringExtra("showNameText"));
        recyclerView =(RecyclerView) findViewById(R.id.recView);
        ////////////////////////////////////
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ////////////////////////////////////
        showLink =getIntent().getStringExtra("showLink");
////////////////////////
        recyclerView.setAdapter(adapter);
        //adapter.notifyDataSetChanged();
///////////////////////////
        description_webscraping.execute();


         obj.startLoadingDialog();

        //System.out.println(episodeLists);
//        description_webscraping.execute();

    }





    public   class Description_webscraping extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPostExecute(Void aVoid){
            super.onPostExecute(aVoid);


            try {

                adapter = new MainAdapter(episodeLists,this);
                recyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }catch (Exception e){
                e.printStackTrace();
            }
            obj.stopLoadingDialog();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            ArrayList<String> sys1= new ArrayList<>();
            ArrayList<String> sys2_fillerType= new ArrayList<>();

            ArrayList<String> sys3_releaseDate= new ArrayList<>();
            org.jsoup.nodes.Document document = null;
            try {
                document = (Document) Jsoup.connect(showLink).get();

            } catch (IOException e) {
                e.printStackTrace();
            }
            org.jsoup.select.Elements elements = document.getElementsByClass("Title");
            org.jsoup.select.Elements elements_fillerType = document.getElementsByClass("Type");
            org.jsoup.select.Elements elements_releaseDate = document.getElementsByClass("Date");
            org.jsoup.select.Elements img = document.getElementsByClass("field-item even");
            int size = elements.size();

            String imgUrl = img.select("img").attr("src");
            System.out.println("imggggggggggggggggggggggggggggggggggUrllllllllllllllll"+imgUrl);
            elements.forEach(element -> sys1.add(element.text()));
            elements_fillerType.forEach(element -> sys2_fillerType.add(element.text()));
            elements_releaseDate.forEach(element -> sys3_releaseDate.add(element.text()));
            sys3_releaseDate.remove(0);
            sys3_releaseDate.remove(1);

           // System.out.println("Filler= "+sys2_fillerType);
            //System.out.println("date= "+sys3_releaseDate);

            for (int i = 0; i < size; i++) {
                String temp = "Episode "+Integer.toString(i+1)+") ";
                temp= temp+sys1.get(i);
                String temp_filler = sys2_fillerType.get(i);
                String temp_date = sys3_releaseDate.get(i);
                // System.out.println(elements.select("td"));

                episodeLists.add(new ParseItems(temp,temp_filler,temp_date,imgUrl));
            }
            ////////////////////////////////////////////////////////////////////////////////
            ////////////Searching data//////////////////////////




            return null;
            
            ///////////////////////////////////////////////////////////////////////////////





        }


    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        MenuItem menuItem = menu.findItem(R.id.search_action);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.setQueryHint("Search Here..");
        canonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = "canon";
                adapter.getFilter().filter(x);
            }
        });
        fillerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = "filler";
                adapter.getFilter().filter(x);
            }
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {


                adapter.getFilter().filter(newText);
                return true;
            }
        });
        return super.onCreateOptionsMenu(menu);

    }
}
