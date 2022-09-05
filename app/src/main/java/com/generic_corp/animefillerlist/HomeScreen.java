package com.generic_corp.animefillerlist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity{
    ArrayList<ParseShowsHomeScreen> list1 = new ArrayList<>();
    ArrayList<ParseShowsHomeScreen> temp_list1 = new ArrayList<>();
    ParseShowsHomeScreen arr[];
    RecyclerView show_recView;
    HomeScreenAdapter homeScreenAdapter;
    LoadingDialog obj = new LoadingDialog(this);
    ArrayList<Integer> pics = new ArrayList<>();
    Button discButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Description_webscraping_Shows shows = new Description_webscraping_Shows(this);
        discButton = findViewById(R.id.disclaimerButton);
        discButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Disclaimer.class));
                finish();
            }
        });



        setShowsInArrayList();
        setImages();

        show_recView =(RecyclerView) findViewById(R.id.show_recView);
        show_recView.setHasFixedSize(true);
        show_recView.setLayoutManager(new LinearLayoutManager(this));

        shows.execute();


        obj.startLoadingDialog();


    }

    public void setImages(){
        pics.add(R.drawable.f1);
        pics.add(R.drawable.f2);
        pics.add(R.drawable.f3);
        pics.add(R.drawable.f4);
        pics.add(R.drawable.f5);
        pics.add(R.drawable.f6);
        pics.add(R.drawable.f7);
        pics.add(R.drawable.f7);
        pics.add(R.drawable.f8);
        pics.add(R.drawable.f9);
        pics.add(R.drawable.f10);
        pics.add(R.drawable.f11);
        pics.add(R.drawable.f12);
        pics.add(R.drawable.f13);
        pics.add(R.drawable.f14);
        pics.add(R.drawable.f15);
        pics.add(R.drawable.f16);
        pics.add(R.drawable.f17);
        pics.add(R.drawable.f18);
        pics.add(R.drawable.f19);
        pics.add(R.drawable.f20);
        pics.add(R.drawable.f21);
        pics.add(R.drawable.f22);
        pics.add(R.drawable.f23);
        pics.add(R.drawable.f24);
        pics.add(R.drawable.f25);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f27);
        pics.add(R.drawable.f28);
        pics.add(R.drawable.f29);
        pics.add(R.drawable.f30);
        pics.add(R.drawable.f31);
        pics.add(R.drawable.f32);
        pics.add(R.drawable.f33);
        pics.add(R.drawable.f34);
        pics.add(R.drawable.f35);
        pics.add(R.drawable.f36);
        pics.add(R.drawable.f37);
        pics.add(R.drawable.f38);
        pics.add(R.drawable.f39);
        pics.add(R.drawable.f40);
        pics.add(R.drawable.f41);
        pics.add(R.drawable.f42);
        pics.add(R.drawable.f43);
        pics.add(R.drawable.f44);
        pics.add(R.drawable.f45);
        pics.add(R.drawable.f46);
        pics.add(R.drawable.f47);
        pics.add(R.drawable.f48);
        pics.add(R.drawable.f49);
        pics.add(R.drawable.f50);
        pics.add(R.drawable.f51);
        pics.add(R.drawable.f52);
        pics.add(R.drawable.f53);
        pics.add(R.drawable.f54);
        pics.add(R.drawable.f55);
        pics.add(R.drawable.f56);
        pics.add(R.drawable.f57);
        pics.add(R.drawable.f59);
        pics.add(R.drawable.f60);
        pics.add(R.drawable.f61);
        pics.add(R.drawable.f62);
        pics.add(R.drawable.f63);
        pics.add(R.drawable.f64);
        pics.add(R.drawable.f65);
        pics.add(R.drawable.f66);
        pics.add(R.drawable.f67);
        pics.add(R.drawable.f68);
        pics.add(R.drawable.f69);
        pics.add(R.drawable.f70);
        pics.add(R.drawable.f71);
        pics.add(R.drawable.f72);
        pics.add(R.drawable.f73);
        pics.add(R.drawable.f74);
        pics.add(R.drawable.f75);
        pics.add(R.drawable.f76);
        pics.add(R.drawable.f77);
        pics.add(R.drawable.f78);
        pics.add(R.drawable.f79);
        pics.add(R.drawable.f80);
        pics.add(R.drawable.f81);
        pics.add(R.drawable.f82);
        pics.add(R.drawable.f83);
        pics.add(R.drawable.f84);
        pics.add(R.drawable.f86);
        pics.add(R.drawable.f87);
        pics.add(R.drawable.f88);
        pics.add(R.drawable.f89);
        pics.add(R.drawable.f90);
        pics.add(R.drawable.f91);
        pics.add(R.drawable.f92);
        pics.add(R.drawable.f93);
        pics.add(R.drawable.f94);
        pics.add(R.drawable.f95);
        pics.add(R.drawable.f96);
        pics.add(R.drawable.f97);
        pics.add(R.drawable.f98);
        pics.add(R.drawable.f99);
        pics.add(R.drawable.f100);
        pics.add(R.drawable.f101);
        pics.add(R.drawable.f102);
        pics.add(R.drawable.f103);
        pics.add(R.drawable.f104);
        pics.add(R.drawable.f105);
        pics.add(R.drawable.f106);
        pics.add(R.drawable.f107);
        pics.add(R.drawable.f108);
        pics.add(R.drawable.f109);
        pics.add(R.drawable.f110);
        pics.add(R.drawable.f111);
        pics.add(R.drawable.f112);
        pics.add(R.drawable.f113);
        pics.add(R.drawable.f114);
        pics.add(R.drawable.f115);
        pics.add(R.drawable.f116);
        pics.add(R.drawable.f117);
        pics.add(R.drawable.f118);
        pics.add(R.drawable.f119);
        pics.add(R.drawable.f120);
        pics.add(R.drawable.f121);
        pics.add(R.drawable.f122);
        pics.add(R.drawable.f123);
        pics.add(R.drawable.f124);
        pics.add(R.drawable.f125);
        pics.add(R.drawable.f126);
        pics.add(R.drawable.f128);
        pics.add(R.drawable.f129);
        pics.add(R.drawable.f130);
        pics.add(R.drawable.f131);
        pics.add(R.drawable.f132);
        pics.add(R.drawable.f133);
        pics.add(R.drawable.f134);
        pics.add(R.drawable.f135);
        pics.add(R.drawable.f136);
        pics.add(R.drawable.f138);
        pics.add(R.drawable.f139);
        pics.add(R.drawable.f140);
        pics.add(R.drawable.f141);
        pics.add(R.drawable.f142);
        pics.add(R.drawable.f144);
        pics.add(R.drawable.f145);
        pics.add(R.drawable.f146);
        pics.add(R.drawable.f147);
        pics.add(R.drawable.f148);
        pics.add(R.drawable.f149);
        pics.add(R.drawable.f149);
        pics.add(R.drawable.f151);
        pics.add(R.drawable.f152);
        pics.add(R.drawable.f153);
        pics.add(R.drawable.f154);
        pics.add(R.drawable.f155);
        pics.add(R.drawable.f156);
        pics.add(R.drawable.f157);
        pics.add(R.drawable.f158);
        pics.add(R.drawable.f159);
        pics.add(R.drawable.f160);
        pics.add(R.drawable.f161);
        pics.add(R.drawable.f162);
        pics.add(R.drawable.f163);
        pics.add(R.drawable.f164);
        pics.add(R.drawable.f165);
        pics.add(R.drawable.f167);
        pics.add(R.drawable.f168);
        pics.add(R.drawable.f169);
        pics.add(R.drawable.f170);
        pics.add(R.drawable.f171);
        pics.add(R.drawable.f172);
        pics.add(R.drawable.f173);
        pics.add(R.drawable.f174);
        pics.add(R.drawable.f175);
        pics.add(R.drawable.f176);
        pics.add(R.drawable.f177);
        pics.add(R.drawable.f178);
        pics.add(R.drawable.f179);
        pics.add(R.drawable.f180);
        pics.add(R.drawable.f182);
        pics.add(R.drawable.f183);
        pics.add(R.drawable.f184);
        pics.add(R.drawable.f185);
        pics.add(R.drawable.f186);
        pics.add(R.drawable.f187);
        pics.add(R.drawable.f188);
        pics.add(R.drawable.f189);
        pics.add(R.drawable.f190);
        pics.add(R.drawable.f191);
        pics.add(R.drawable.f192);
        pics.add(R.drawable.f193);
        pics.add(R.drawable.f194);
        pics.add(R.drawable.f195);
        pics.add(R.drawable.f196);
        pics.add(R.drawable.f197);
        pics.add(R.drawable.f198);
        pics.add(R.drawable.f199);
        pics.add(R.drawable.f200);
        pics.add(R.drawable.f201);
        pics.add(R.drawable.f202);
        pics.add(R.drawable.f203);
        pics.add(R.drawable.f204);
        pics.add(R.drawable.f205);
        pics.add(R.drawable.f206);
        pics.add(R.drawable.f207);
        pics.add(R.drawable.f208);
        pics.add(R.drawable.f209);
        pics.add(R.drawable.f210);
        pics.add(R.drawable.f211);
        pics.add(R.drawable.f212);
        pics.add(R.drawable.f213);
        pics.add(R.drawable.f214);
        pics.add(R.drawable.f215);
        pics.add(R.drawable.f216);
        pics.add(R.drawable.f217);
        pics.add(R.drawable.f218);
        pics.add(R.drawable.f219);
        pics.add(R.drawable.f220);
        pics.add(R.drawable.f221);
        pics.add(R.drawable.f222);
        pics.add(R.drawable.f223);
        pics.add(R.drawable.f224);
        pics.add(R.drawable.f225);
        pics.add(R.drawable.f226);
        pics.add(R.drawable.f227);
        pics.add(R.drawable.f228);
        pics.add(R.drawable.f229);
        pics.add(R.drawable.f230);
        pics.add(R.drawable.f231);
        pics.add(R.drawable.f232);
        pics.add(R.drawable.f233);
        pics.add(R.drawable.f234);
        pics.add(R.drawable.f235);
        pics.add(R.drawable.f236);
        pics.add(R.drawable.f237);
        pics.add(R.drawable.f238);
        pics.add(R.drawable.f239);
        pics.add(R.drawable.f240);
        pics.add(R.drawable.f241);
        pics.add(R.drawable.f242);
        pics.add(R.drawable.f243);
        pics.add(R.drawable.f244);
        pics.add(R.drawable.f245);
        pics.add(R.drawable.f246);
        pics.add(R.drawable.f247);
        pics.add(R.drawable.f248);
        pics.add(R.drawable.f249);
        pics.add(R.drawable.f250);
        pics.add(R.drawable.f251);
        pics.add(R.drawable.f252);
        pics.add(R.drawable.f253);
        pics.add(R.drawable.f254);
        pics.add(R.drawable.f255);
        pics.add(R.drawable.f256);
        pics.add(R.drawable.f257);
        pics.add(R.drawable.f258);
        pics.add(R.drawable.f259);
        pics.add(R.drawable.f260);
        pics.add(R.drawable.f261);
        pics.add(R.drawable.f262);
        pics.add(R.drawable.f263);
        pics.add(R.drawable.f264);
        pics.add(R.drawable.f265);
        pics.add(R.drawable.f266);
        pics.add(R.drawable.f267);
        pics.add(R.drawable.f268);
        pics.add(R.drawable.f269);
        pics.add(R.drawable.f270);
        pics.add(R.drawable.f272);
        pics.add(R.drawable.f273);
        pics.add(R.drawable.f274);
        pics.add(R.drawable.f275);
        pics.add(R.drawable.f276);
        pics.add(R.drawable.f277);
        pics.add(R.drawable.f278);
        pics.add(R.drawable.f279);
        pics.add(R.drawable.f280);
        pics.add(R.drawable.f281);
        pics.add(R.drawable.f282);
        pics.add(R.drawable.f283);
        pics.add(R.drawable.f284);
        pics.add(R.drawable.f285);
        pics.add(R.drawable.f286);
        pics.add(R.drawable.f287);
        pics.add(R.drawable.f288);
        pics.add(R.drawable.f289);
        pics.add(R.drawable.f290);
        pics.add(R.drawable.f291);
        pics.add(R.drawable.f292);
        pics.add(R.drawable.f293);
        pics.add(R.drawable.f294);
        pics.add(R.drawable.f295);
        pics.add(R.drawable.f296);
        pics.add(R.drawable.f297);
        pics.add(R.drawable.f298);
        pics.add(R.drawable.f299);
        pics.add(R.drawable.f300);
        pics.add(R.drawable.f301);
        pics.add(R.drawable.f302);
        pics.add(R.drawable.f303);
        pics.add(R.drawable.f304);
        pics.add(R.drawable.f305);
        pics.add(R.drawable.f306);
        pics.add(R.drawable.f307);
        pics.add(R.drawable.f308);
        pics.add(R.drawable.f309);
        pics.add(R.drawable.f310);
        pics.add(R.drawable.f311);
        pics.add(R.drawable.f312);
        pics.add(R.drawable.f313);
        pics.add(R.drawable.f314);
        pics.add(R.drawable.f315);
        pics.add(R.drawable.f316);
        pics.add(R.drawable.f317);
        pics.add(R.drawable.f318);
        pics.add(R.drawable.f319);
        pics.add(R.drawable.f320);
        pics.add(R.drawable.f321);
        pics.add(R.drawable.f322);
        pics.add(R.drawable.f323);
        pics.add(R.drawable.f324);
        pics.add(R.drawable.f325);
        pics.add(R.drawable.f326);
        pics.add(R.drawable.f327);
        pics.add(R.drawable.f328);
        pics.add(R.drawable.f329);
        pics.add(R.drawable.f330);
        pics.add(R.drawable.f331);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
        pics.add(R.drawable.f26);
    }

    public void setShowsInArrayList(){
        list1.add(new ParseShowsHomeScreen("86 EIGHTY-SIX",R.drawable.f1,"https://www.animefillerlist.com/shows/86-eighty-six"));
        list1.add(new ParseShowsHomeScreen("A Certain Magical Index (Toaru Majutsu No Index)",R.drawable.f2,"https://www.animefillerlist.com/shows/certain-magical-index"));
        list1.add(new ParseShowsHomeScreen("A Certain Scientific Accelerator (Toaru Kagaku no Accelerator)",R.drawable.f3,"https://www.animefillerlist.com/shows/sh%C5%8Dnan-pure-love-gang"));
        list1.add(new ParseShowsHomeScreen("A Certain Scientific Railgun (Toaru Kagaku No Railgun)",R.drawable.f4,"https://www.animefillerlist.com/shows/a-certain-scientific-railgun"));
        list1.add(new ParseShowsHomeScreen("A Sister's All You Need",R.drawable.f5,"https://www.animefillerlist.com/shows/super-dragon-ball-heroes"));
        list1.add(new ParseShowsHomeScreen("Ace Attorney (Gyakuten Saiban)",R.drawable.f6,"https://www.animefillerlist.com/shows/ace-attorney"));
        list1.add(new ParseShowsHomeScreen("Ace of the Diamond",R.drawable.f7,"https://www.animefillerlist.com/shows/ace-diamond"));
        list1.add(new ParseShowsHomeScreen("Ace of the Diamond: Act II",R.drawable.f2,"https://www.animefillerlist.com/shows/ace-diamond-act-ii"));
        list1.add(new ParseShowsHomeScreen("AJIN: Demi-Human",R.drawable.f2,"https://www.animefillerlist.com/shows/ajin-demi-human"));
        list1.add(new ParseShowsHomeScreen("Akame ga Kill!",R.drawable.f2,"https://www.animefillerlist.com/shows/akame-ga-kill"));
        list1.add(new ParseShowsHomeScreen("Angel Beats!",R.drawable.f2,"https://www.animefillerlist.com/shows/angel-beats"));
        list1.add(new ParseShowsHomeScreen("Angel Heart",R.drawable.f2,"https://www.animefillerlist.com/shows/angel-heart"));
        list1.add(new ParseShowsHomeScreen("Another",R.drawable.f2,"https://www.animefillerlist.com/shows/another"));
        list1.add(new ParseShowsHomeScreen("Aoashi",R.drawable.f2,"https://www.animefillerlist.com/shows/aoashi"));
        list1.add(new ParseShowsHomeScreen("Assassination Classroom (Ansatsu Kyoushitsu)",R.drawable.f2,"https://www.animefillerlist.com/shows/ansatsu-kyoushitsu-assassination-classroom"));
        list1.add(new ParseShowsHomeScreen("Attack on Titan (Shingeki no Kyojin)",R.drawable.f2,"https://www.animefillerlist.com/shows/attack-titan"));
        list1.add(new ParseShowsHomeScreen("Attack on Titan OADs",R.drawable.f2,"https://www.animefillerlist.com/shows/attack-titan-ova-0"));
        list1.add(new ParseShowsHomeScreen("Attack on Titan: Junior High",R.drawable.f2,"https://www.animefillerlist.com/shows/attack-on-titan-junior-high"));
        list1.add(new ParseShowsHomeScreen("Bakemonogatari",R.drawable.f1,"https://www.animefillerlist.com/shows/bakemonogatari"));
        list1.add(new ParseShowsHomeScreen("Beastars",R.drawable.f1,"https://www.animefillerlist.com/shows/beastars"));
        list1.add(new ParseShowsHomeScreen("Beelzebub",R.drawable.f1,"https://www.animefillerlist.com/shows/beelzebub"));
        list1.add(new ParseShowsHomeScreen("Berserk (Berserk Kenpuden)",R.drawable.f1,"https://www.animefillerlist.com/shows/berserk"));
        list1.add(new ParseShowsHomeScreen("Berserk (2016)",R.drawable.f1,"https://www.animefillerlist.com/shows/berserk-2016"));
        list1.add(new ParseShowsHomeScreen("Berserk: The Golden Age Arc",R.drawable.f1,"https://www.animefillerlist.com/shows/berserk-golden-age-arc"));
        list1.add(new ParseShowsHomeScreen("Beyblade Burst",R.drawable.f1,"https://www.animefillerlist.com/shows/beyblade-burst-all-seasons"));
        list1.add(new ParseShowsHomeScreen("Black Butler (Kuroshitsuji)",R.drawable.f1,"https://www.animefillerlist.com/shows/black-butler"));
        list1.add(new ParseShowsHomeScreen("Black Cat",R.drawable.f1,"https://www.animefillerlist.com/shows/black-cat"));
        list1.add(new ParseShowsHomeScreen("Black Clover",R.drawable.f1,"https://www.animefillerlist.com/shows/black-clover"));
        list1.add(new ParseShowsHomeScreen("Black Lagoon",R.drawable.f1,"https://www.animefillerlist.com/shows/black-lagoon"));
        list1.add(new ParseShowsHomeScreen("Blade Dance of the Elementalers",R.drawable.f1,"https://www.animefillerlist.com/shows/seirei-tsukai-no-blade-dance"));
        list1.add(new ParseShowsHomeScreen("Blade of the Immortal (2019)",R.drawable.f1,"https://www.animefillerlist.com/shows/blade-immortal-2019"));
        list1.add(new ParseShowsHomeScreen("Bleach",R.drawable.f1,"https://www.animefillerlist.com/shows/bleach"));
        list1.add(new ParseShowsHomeScreen("Bleach: Thousand Year Blood War",R.drawable.f1,"https://www.animefillerlist.com/shows/bleach-thousand-year-blood-war"));
        list1.add(new ParseShowsHomeScreen("Blood Blockade Battlefront (Kekkai Sensen)",R.drawable.f1,"https://www.animefillerlist.com/shows/blood-blockade-battlefront"));
        list1.add(new ParseShowsHomeScreen("Blue Exorcist (Ao no Exorcist)",R.drawable.f1,"https://www.animefillerlist.com/shows/blue-exorcist"));
        list1.add(new ParseShowsHomeScreen("Blue Period",R.drawable.f1,"https://www.animefillerlist.com/shows/blue-period"));
        list1.add(new ParseShowsHomeScreen("BLUELOCK",R.drawable.f1,"https://www.animefillerlist.com/shows/blue-lock"));
        list1.add(new ParseShowsHomeScreen("Bobobo-bo Bo-bobo",R.drawable.f1,"https://www.animefillerlist.com/shows/bobobo-bo-bobo"));
        list1.add(new ParseShowsHomeScreen("Boruto: Naruto Next Generations",R.drawable.f1,"https://www.animefillerlist.com/shows/boruto-naruto-next-generations"));
        list1.add(new ParseShowsHomeScreen("Boruto: Naruto Next Generations (Manga Only)",R.drawable.f1,"https://www.animefillerlist.com/shows/boruto-naruto-next-generations-manga-canon"));
        list1.add(new ParseShowsHomeScreen("Boruto: Naruto the Movie",R.drawable.f1,"https://www.animefillerlist.com/shows/boruto-naruto-movie"));
        list1.add(new ParseShowsHomeScreen("BTOOOM!",R.drawable.f1,"https://www.animefillerlist.com/shows/btooom"));
        list1.add(new ParseShowsHomeScreen("Bungo Stray Dogs",R.drawable.f1,"https://www.animefillerlist.com/shows/bungo-stray-dogs"));
        list1.add(new ParseShowsHomeScreen("BURN THE WITCH",R.drawable.f1,"https://www.animefillerlist.com/shows/burn-witch"));
        list1.add(new ParseShowsHomeScreen("Buso Renkin",R.drawable.f1,"https://www.animefillerlist.com/shows/buso-renkin"));
        list1.add(new ParseShowsHomeScreen("Campione!",R.drawable.f1,"https://www.animefillerlist.com/shows/campione"));
        list1.add(new ParseShowsHomeScreen("Cardcaptor Sakura",R.drawable.f1,"https://www.animefillerlist.com/shows/cardcaptor-sakura"));
        list1.add(new ParseShowsHomeScreen("Carnival Phantasm",R.drawable.f1,"https://www.animefillerlist.com/shows/carnival-phantasm"));
        list1.add(new ParseShowsHomeScreen("Case Closed (Detective Conan)",R.drawable.f1,"https://www.animefillerlist.com/shows/detective-conan"));
        list1.add(new ParseShowsHomeScreen("Cells at Work! (Hataraku Saibou)",R.drawable.f1,"https://www.animefillerlist.com/shows/cells-work"));
        list1.add(new ParseShowsHomeScreen("Cells at Work! CODE BLACK (Hataraku Saibou Black)",R.drawable.f1,"https://www.animefillerlist.com/shows/cells-work-code-black"));
        list1.add(new ParseShowsHomeScreen("Chainsaw Man",R.drawable.f1,"https://www.animefillerlist.com/shows/chainsaw-man"));
        list1.add(new ParseShowsHomeScreen("Charlotte",R.drawable.f1,"https://www.animefillerlist.com/shows/charlotte"));
        list1.add(new ParseShowsHomeScreen("City Hunter",R.drawable.f1,"https://www.animefillerlist.com/shows/city-hunter"));
        list1.add(new ParseShowsHomeScreen("Clannad",R.drawable.f1,"https://www.animefillerlist.com/shows/clannad"));
        list1.add(new ParseShowsHomeScreen("Classroom of the Elite",R.drawable.f1,"https://www.animefillerlist.com/shows/classroom-elite"));
        list1.add(new ParseShowsHomeScreen("Claymore",R.drawable.f1,"https://www.animefillerlist.com/shows/claymore"));
        list1.add(new ParseShowsHomeScreen("Cobra: The Animation",R.drawable.f1,"https://www.animefillerlist.com/shows/cobra-animation"));
        list1.add(new ParseShowsHomeScreen("Code Geass",R.drawable.f1,"https://www.animefillerlist.com/shows/code-geass"));
        list1.add(new ParseShowsHomeScreen("Cowboy Bebop",R.drawable.f1,"https://www.animefillerlist.com/shows/cowboy-bebop"));
        list1.add(new ParseShowsHomeScreen("D-Frag!",R.drawable.f1,"https://www.animefillerlist.com/shows/d-frag"));
        list1.add(new ParseShowsHomeScreen("D.Gray-man",R.drawable.f1,"https://www.animefillerlist.com/shows/d-gray-man"));
        list1.add(new ParseShowsHomeScreen("Dagashi Kashi",R.drawable.f1,"https://www.animefillerlist.com/shows/dagashi-kashi"));
        list1.add(new ParseShowsHomeScreen("Darwin's Game",R.drawable.f1,"https://www.animefillerlist.com/shows/darwins-game"));
        list1.add(new ParseShowsHomeScreen("Deadman Wonderland",R.drawable.f1,"https://www.animefillerlist.com/shows/deadman-wonderland"));
        list1.add(new ParseShowsHomeScreen("Death Note",R.drawable.f1,"https://www.animefillerlist.com/shows/death-note"));
        list1.add(new ParseShowsHomeScreen("Death Parade",R.drawable.f1,"https://www.animefillerlist.com/shows/death-parade"));
        list1.add(new ParseShowsHomeScreen("Demon Slayer: Kimetsu no Yaiba",R.drawable.f1,"https://www.animefillerlist.com/shows/demon-slayer-kimetsu-no-yaiba"));
        list1.add(new ParseShowsHomeScreen("Demon Slayer: Kimetsu no Yaiba the Movie: Mugen Train",R.drawable.f1,"https://www.animefillerlist.com/shows/demon-slayer-kimetsu-no-yaiba-movie-mugen-train"));
        list1.add(new ParseShowsHomeScreen("Den-Noh Coil",R.drawable.f1,"https://www.animefillerlist.com/shows/dennou-coil"));
        list1.add(new ParseShowsHomeScreen("Devilman",R.drawable.f1,"https://www.animefillerlist.com/shows/devilman-birth"));
        list1.add(new ParseShowsHomeScreen("Devilman Crybaby",R.drawable.f1,"https://www.animefillerlist.com/shows/devilman-crybaby"));
        list1.add(new ParseShowsHomeScreen("Digimon Adventure",R.drawable.f1,"https://www.animefillerlist.com/shows/digimon-adventure"));
        list1.add(new ParseShowsHomeScreen("Digimon Adventure 02",R.drawable.f1,"https://www.animefillerlist.com/shows/digimon-adventure-02"));
        list1.add(new ParseShowsHomeScreen("Digimon Adventure tri.",R.drawable.f1,"https://www.animefillerlist.com/shows/digimon-adventure-tri"));
        list1.add(new ParseShowsHomeScreen("Digimon Adventure:",R.drawable.f1,"https://www.animefillerlist.com/shows/digimon-adventure-2020"));
        list1.add(new ParseShowsHomeScreen("Digimon Frontier",R.drawable.f1,"https://www.animefillerlist.com/shows/digimon-frontier"));
        list1.add(new ParseShowsHomeScreen("Digimon Tamers",R.drawable.f1,"https://www.animefillerlist.com/shows/digimon-tamers"));
        list1.add(new ParseShowsHomeScreen("DON'T TOY WITH ME, MISS NAGATORO (Ijiranaide, Nagatoro-san)",R.drawable.f1,"https://www.animefillerlist.com/shows/don%E2%80%99t-toy-me-miss-nagatoro"));
        list1.add(new ParseShowsHomeScreen("Dorohedoro",R.drawable.f1,"https://www.animefillerlist.com/shows/dragon-ball-super-broly"));
        list1.add(new ParseShowsHomeScreen("Dororo (2019)",R.drawable.f1,"https://www.animefillerlist.com/shows/dororo"));
        list1.add(new ParseShowsHomeScreen("Dr. STONE",R.drawable.f1,"https://www.animefillerlist.com/shows/dr-stone"));
        list1.add(new ParseShowsHomeScreen("Dragon Ball",R.drawable.f1,"https://www.animefillerlist.com/shows/dragon-ball"));
        list1.add(new ParseShowsHomeScreen("Dragon Ball GT",R.drawable.f1,"https://www.animefillerlist.com/shows/dragon-ball-gt"));
        list1.add(new ParseShowsHomeScreen("Dragon Ball Super",R.drawable.f1,"https://www.animefillerlist.com/shows/dragon-ball-super"));
        list1.add(new ParseShowsHomeScreen("Dragon Ball Super: Broly",R.drawable.f1,"https://www.animefillerlist.com/shows/dragon-ball-super-broly-0"));
        list1.add(new ParseShowsHomeScreen("Dragon Ball Z",R.drawable.f1,"https://www.animefillerlist.com/shows/dragon-ball-z"));
        list1.add(new ParseShowsHomeScreen("Dragon Ball Z Kai",R.drawable.f1,"https://www.animefillerlist.com/shows/dragon-ball-z-kai"));
        list1.add(new ParseShowsHomeScreen("DRAGON QUEST The Adventure of Dai (2020)",R.drawable.f1,"https://www.animefillerlist.com/shows/dragon-quest-adventure-dai"));
        list1.add(new ParseShowsHomeScreen("Drifters",R.drawable.f1,"https://www.animefillerlist.com/shows/drifters"));
        list1.add(new ParseShowsHomeScreen("DURARARA!!",R.drawable.f1,"https://www.animefillerlist.com/shows/durarara"));
        list1.add(new ParseShowsHomeScreen("EDENS ZERO",R.drawable.f1,"https://www.animefillerlist.com/shows/edens-zero"));
        list1.add(new ParseShowsHomeScreen("Elemental Gelade",R.drawable.f1,"https://www.animefillerlist.com/shows/elemental-gelade"));
        list1.add(new ParseShowsHomeScreen("Elfen Lied",R.drawable.f1,"https://www.animefillerlist.com/shows/elfen-lied"));
        list1.add(new ParseShowsHomeScreen("Emma: A Victorian Romance (Eikoku Koi Monogatari Emma)",R.drawable.f1,"https://www.animefillerlist.com/shows/emma-victorian-romance"));
        list1.add(new ParseShowsHomeScreen("ERASED (Boku Dake ga Inai Machi)",R.drawable.f1,"https://www.animefillerlist.com/shows/erased"));
        list1.add(new ParseShowsHomeScreen("Excel Saga",R.drawable.f1,"https://www.animefillerlist.com/shows/excel-saga"));
        list1.add(new ParseShowsHomeScreen("Fairy Tail",R.drawable.f1,"https://www.animefillerlist.com/shows/fairy-tail"));
        list1.add(new ParseShowsHomeScreen("Fate/Apocrypha",R.drawable.f1,"https://www.animefillerlist.com/shows/fate-apocrypha"));
        list1.add(new ParseShowsHomeScreen("Fate/Kaleid Liner Prisma Illya",R.drawable.f1,"https://www.animefillerlist.com/shows/fatekaleid-liner-prisma-illya"));
        list1.add(new ParseShowsHomeScreen("Fate/stay night",R.drawable.f1,"https://www.animefillerlist.com/shows/fatestay-night"));
        list1.add(new ParseShowsHomeScreen("Fate/stay night [Unlimited Blade Works]",R.drawable.f1,"https://www.animefillerlist.com/shows/fatestay-night-unlimited-blade-works"));
        list1.add(new ParseShowsHomeScreen("Fate/Zero",R.drawable.f1,"https://www.animefillerlist.com/shows/fate-zero"));
        list1.add(new ParseShowsHomeScreen("Fighting Spirit (Hajime no Ippo)",R.drawable.f1,"https://www.animefillerlist.com/shows/fighting-spirit"));
        list1.add(new ParseShowsHomeScreen("Fire Force (Enen no Shouboutai)",R.drawable.f1,"https://www.animefillerlist.com/shows/fire-force"));
        list1.add(new ParseShowsHomeScreen("Fist of the Blue Sky",R.drawable.f1,"https://www.animefillerlist.com/shows/fist-of-the-blue-sky"));
        list1.add(new ParseShowsHomeScreen("Fist of the Blue Sky: Regenesis",R.drawable.f1,"https://www.animefillerlist.com/shows/fist-of-the-blue-sky-regenesis"));
        list1.add(new ParseShowsHomeScreen("Fist of the North Star",R.drawable.f1,"https://www.animefillerlist.com/shows/hokuto-no-ken"));
        list1.add(new ParseShowsHomeScreen("Food Wars! (Shokugeki no Souma)",R.drawable.f1,"https://www.animefillerlist.com/shows/shokugeki-no-soma"));
        list1.add(new ParseShowsHomeScreen("Food Wars! The Fifth Plate (Shokugeki no Souma: Gou no Sara)",R.drawable.f1,"https://www.animefillerlist.com/shows/food-wars-fifth-plate"));
        list1.add(new ParseShowsHomeScreen("Food Wars! The Fourth Plate (Shokugeki no Souma: Shin no Sara)",R.drawable.f1,"https://www.animefillerlist.com/shows/food-wars-fourth-plate"));
        list1.add(new ParseShowsHomeScreen("Food Wars! The Second Plate (Shokugeki no Souma: Ni no Sara)",R.drawable.f1,"https://www.animefillerlist.com/shows/food-wars-second-plate-1"));
        list1.add(new ParseShowsHomeScreen("Food Wars! The Third Plate (Shokugeki no Souma: San no Sara)",R.drawable.f1,"https://www.animefillerlist.com/shows/food-wars-third-plate-1"));
        list1.add(new ParseShowsHomeScreen("Fruits Basket (Furuba)",R.drawable.f1,"https://www.animefillerlist.com/shows/fruits-basket-2001"));
        list1.add(new ParseShowsHomeScreen("Fruits Basket (2019)",R.drawable.f1,"https://www.animefillerlist.com/shows/fruits-basket-2019"));
        list1.add(new ParseShowsHomeScreen("Full Metal Panic!",R.drawable.f1,"https://www.animefillerlist.com/shows/full-metal-panic"));
        list1.add(new ParseShowsHomeScreen("Fullmetal Alchemist",R.drawable.f1,"https://www.animefillerlist.com/shows/fullmetal-alchemist"));
        list1.add(new ParseShowsHomeScreen("Fullmetal Alchemist: Brotherhood",R.drawable.f1,"https://www.animefillerlist.com/shows/fullmetal-alchemist-brotherhood"));
        list1.add(new ParseShowsHomeScreen("GANGSTA",R.drawable.f1,"https://www.animefillerlist.com/shows/gangsta"));
        list1.add(new ParseShowsHomeScreen("GANTZ",R.drawable.f1,"https://www.animefillerlist.com/shows/gantz"));
        list1.add(new ParseShowsHomeScreen("Ghost in the Shell: Arise",R.drawable.f1,"https://www.animefillerlist.com/shows/ghost-shell-arise"));
        list1.add(new ParseShowsHomeScreen("Ghost In the Shell: Stand Alone Complex",R.drawable.f1,"https://www.animefillerlist.com/shows/ghost-shell-stand-alone-complex"));
        list1.add(new ParseShowsHomeScreen("Gintama",R.drawable.f1,"https://www.animefillerlist.com/shows/gintama"));
        list1.add(new ParseShowsHomeScreen("Girlfriend, Girlfriend (Kanojo mo Kanojo)",R.drawable.f1,"https://www.animefillerlist.com/shows/girlfriend-girlfriend"));
        list1.add(new ParseShowsHomeScreen("Goblin Slayer",R.drawable.f1,"https://www.animefillerlist.com/shows/goblin-slayer"));
        list1.add(new ParseShowsHomeScreen("Golden Kamuy",R.drawable.f1,"https://www.animefillerlist.com/shows/golden-kamuy"));
        list1.add(new ParseShowsHomeScreen("Gosick",R.drawable.f1,"https://www.animefillerlist.com/shows/gosick"));
        list1.add(new ParseShowsHomeScreen("Great Teacher Onizuka",R.drawable.f1,"https://www.animefillerlist.com/shows/great-teacher-onizuka"));
        list1.add(new ParseShowsHomeScreen("GURREN LAGANN",R.drawable.f1,"https://www.animefillerlist.com/shows/gurren-lagann"));
        list1.add(new ParseShowsHomeScreen("Haikyu!!",R.drawable.f1,"https://www.animefillerlist.com/shows/haikyuu"));
        list1.add(new ParseShowsHomeScreen("Hakyu Hoshin Engi",R.drawable.f1,"https://www.animefillerlist.com/shows/hakyu-hoshin-engi"));
        list1.add(new ParseShowsHomeScreen("Hanamonogatari",R.drawable.f1,"https://www.animefillerlist.com/shows/hanamonogatari"));
        list1.add(new ParseShowsHomeScreen("Handa-kun",R.drawable.f1,"https://www.animefillerlist.com/shows/handa-kun"));
        list1.add(new ParseShowsHomeScreen("HAPPY-GO-LUCKY DAYS (Dounika no Hibi)",R.drawable.f1,"https://www.animefillerlist.com/shows/happy-go-lucky-days"));
        list1.add(new ParseShowsHomeScreen("Hayate the Combat Butler (Hayate no Gotoku!)",R.drawable.f1,"https://www.animefillerlist.com/shows/hayate-combat-butler"));
        list1.add(new ParseShowsHomeScreen("Heaven's Lost Property",R.drawable.f1,"https://www.animefillerlist.com/shows/heavens-lost-property"));
        list1.add(new ParseShowsHomeScreen("Hell Girl (Jigoku Shōjo Girl)",R.drawable.f1,"https://www.animefillerlist.com/shows/hell-girl"));
        list1.add(new ParseShowsHomeScreen("Hellsing",R.drawable.f1,"https://www.animefillerlist.com/shows/hellsing"));
        list1.add(new ParseShowsHomeScreen("Hellsing Ultimate",R.drawable.f1,"https://www.animefillerlist.com/shows/hellsing-ultimate"));
        list1.add(new ParseShowsHomeScreen("Highschool DxD",R.drawable.f1,"https://www.animefillerlist.com/shows/high-school-dxd"));
        list1.add(new ParseShowsHomeScreen("Highschool of the Dead",R.drawable.f1,"https://www.animefillerlist.com/shows/highschoool-dead"));
        list1.add(new ParseShowsHomeScreen("Hikaru no Go",R.drawable.f1,"https://www.animefillerlist.com/shows/hikaru-no-go"));
        list1.add(new ParseShowsHomeScreen("Hunter × Hunter",R.drawable.f1,"https://www.animefillerlist.com/shows/hunter-x-hunter-1999"));
        list1.add(new ParseShowsHomeScreen("Hunter × Hunter (2011)",R.drawable.f1,"https://www.animefillerlist.com/shows/hunter-x-hunter"));
        list1.add(new ParseShowsHomeScreen("Initial D",R.drawable.f1,"https://www.animefillerlist.com/shows/initial-d"));
        list1.add(new ParseShowsHomeScreen("Inuyasha",R.drawable.f1,"https://www.animefillerlist.com/shows/inuyasha"));
        list1.add(new ParseShowsHomeScreen("Inuyashiki Last Hero",R.drawable.f1,"https://www.animefillerlist.com/shows/inuyashiki-last-hero"));
        list1.add(new ParseShowsHomeScreen("Is It Wrong to Try to Pick Up Girls in a Dungeon? (Dungeon ni Deai wo Motomeru no wa Machigatteiru Darou ka)",R.drawable.f1,"https://www.animefillerlist.com/shows/it-wrong-try-pick-girls-dungeon"));
        list1.add(new ParseShowsHomeScreen("Is It Wrong to Try to Pick Up Girls In a Dungeon? On the Side: Sword Oratoria",R.drawable.f1,"https://www.animefillerlist.com/shows/it-wrong-try-pick-girls-dungeon-side-sword-oratoria"));
        list1.add(new ParseShowsHomeScreen("JoJo's Bizarre Adventure (OVA)",R.drawable.f1,"https://www.animefillerlist.com/shows/jojos-biarre-adenture-ova"));
        list1.add(new ParseShowsHomeScreen("JoJo's Bizarre Adventure (TV)",R.drawable.f1,"https://www.animefillerlist.com/shows/jojos-bizarre-adventure-tv"));
        list1.add(new ParseShowsHomeScreen("Jujutsu Kaisen",R.drawable.f1,"https://www.animefillerlist.com/shows/jujutsu-kaisen"));
        list1.add(new ParseShowsHomeScreen("K (K Project)",R.drawable.f1,"https://www.animefillerlist.com/shows/k"));
        list1.add(new ParseShowsHomeScreen("K: Seven Stories",R.drawable.f1,"https://www.animefillerlist.com/shows/k-seven-stories"));
        list1.add(new ParseShowsHomeScreen("Kabaneri of the Iron Fortress",R.drawable.f1,"https://www.animefillerlist.com/shows/kabaneri-iron-fortress"));
        list1.add(new ParseShowsHomeScreen("Kakegurui",R.drawable.f1,"https://www.animefillerlist.com/shows/kakegurui"));
        list1.add(new ParseShowsHomeScreen("Kamisama Kiss (Kamisama Hajimemashita)",R.drawable.f1,"https://www.animefillerlist.com/shows/kamisama-kiss"));
        list1.add(new ParseShowsHomeScreen("KenIchi: The Mightiest Disciple",R.drawable.f1,"https://www.animefillerlist.com/shows/kenIchi-mightiest-disciple"));
        list1.add(new ParseShowsHomeScreen("KILL la KILL",R.drawable.f1,"https://www.animefillerlist.com/shows/kill-la-kill"));
        list1.add(new ParseShowsHomeScreen("Killing Bites",R.drawable.f1,"https://www.animefillerlist.com/shows/killing-bites"));
        list1.add(new ParseShowsHomeScreen("Kingdom",R.drawable.f1,"https://www.animefillerlist.com/shows/kingdom"));
        list1.add(new ParseShowsHomeScreen("Kinnikuman",R.drawable.f1,"https://www.animefillerlist.com/shows/kinnikuman"));
        list1.add(new ParseShowsHomeScreen("Kiznaiver",R.drawable.f1,"https://www.animefillerlist.com/shows/kiznaiver"));
        list1.add(new ParseShowsHomeScreen("Kizumonogatari",R.drawable.f1,"https://www.animefillerlist.com/shows/kizumonogatari"));
        list1.add(new ParseShowsHomeScreen("Komi Can’t Communicate (Komi-san wa, Comyushou desu.)",R.drawable.f1,"https://www.animefillerlist.com/shows/blue-period-0"));
        list1.add(new ParseShowsHomeScreen("KONOSUBA -God's blessing on this wonderful world! (Kono Subarashii Sekai ni Shukufuku wo!)",R.drawable.f1,"https://www.animefillerlist.com/shows/konosuba-gods-blessing-wonderful-world"));
        list1.add(new ParseShowsHomeScreen("Kuroko’s Basketball (Kuroko no Basket)",R.drawable.f1,"https://www.animefillerlist.com/shows/kuroko%E2%80%99s-basketball"));
        list1.add(new ParseShowsHomeScreen("Land of the Lustrous (Houseki no Kuni)",R.drawable.f1,"https://www.animefillerlist.com/shows/land-lustrous"));
        list1.add(new ParseShowsHomeScreen("Lord Marksman and Vanadis (Madan No Ou to Vanadis)",R.drawable.f1,"https://www.animefillerlist.com/shows/madan-no-ou-vanadis-lord-marksman-and-vanadis"));
        list1.add(new ParseShowsHomeScreen("Lupin the Third Part I",R.drawable.f1,"https://www.animefillerlist.com/shows/lupin-third-part-i"));
        list1.add(new ParseShowsHomeScreen("Made in Abyss",R.drawable.f1,"https://www.animefillerlist.com/shows/made-abyss"));
        list1.add(new ParseShowsHomeScreen("Magi",R.drawable.f1,"https://www.animefillerlist.com/shows/magi-labyrinth-magic"));
        list1.add(new ParseShowsHomeScreen("Magi: Adventure of Sinbad",R.drawable.f1,"https://www.animefillerlist.com/shows/magi-adventure-sinbad-tv"));
        list1.add(new ParseShowsHomeScreen("Magic Knight Rayearth",R.drawable.f1,"https://www.animefillerlist.com/shows/magic-knight-rayearth"));
        list1.add(new ParseShowsHomeScreen("Maid-Sama! (Kaichou wa maid sama)",R.drawable.f1,"https://www.animefillerlist.com/shows/maid-sama"));
        list1.add(new ParseShowsHomeScreen("Masamune-kun's Revenge (Masamune-kun no Revenge)",R.drawable.f1,"https://www.animefillerlist.com/shows/masamune-kuns-revenge"));
        list1.add(new ParseShowsHomeScreen("Michiko & Hatchin",R.drawable.f1,"https://www.animefillerlist.com/shows/michiko-hatchin"));
        list1.add(new ParseShowsHomeScreen("Miraculous - Tales of Ladybug & Cat Noir",R.drawable.f1,"https://www.animefillerlist.com/shows/miraculous-ladybug"));
        list1.add(new ParseShowsHomeScreen("Miss Kobayashi's Dragon Maid",R.drawable.f1,"https://www.animefillerlist.com/shows/miss-kobayashis-dragon-maid"));
        list1.add(new ParseShowsHomeScreen("Mob Psycho 100",R.drawable.f1,"https://www.animefillerlist.com/shows/mob-psycho-100"));
        list1.add(new ParseShowsHomeScreen("Mobile Suit Gundam (Kidou Senshi Gundam)",R.drawable.f1,"https://www.animefillerlist.com/shows/mobile-suit-gundam"));
        list1.add(new ParseShowsHomeScreen("Mobile Suit Gundam ZZ (Kidou Senshi Gundam ZZ)",R.drawable.f1,"https://www.animefillerlist.com/shows/mobile-suit-gundam-zz"));
        list1.add(new ParseShowsHomeScreen("Mobile Suit Zeta Gundam (Kidou Senshi Zeta Gundam)",R.drawable.f1,"https://www.animefillerlist.com/shows/mobile-suit-zeta-gundam"));
        list1.add(new ParseShowsHomeScreen("Monogatari",R.drawable.f1,"https://www.animefillerlist.com/shows/monogatari-series"));
        list1.add(new ParseShowsHomeScreen("Monogatari Series Second Season",R.drawable.f1,"https://www.animefillerlist.com/shows/monogatari-series-second-season"));
        list1.add(new ParseShowsHomeScreen("Monster",R.drawable.f1,"https://www.animefillerlist.com/shows/monster"));
        list1.add(new ParseShowsHomeScreen("My Dress-Up Darling (Sono Bisque Doll wa Koi wo Suru)",R.drawable.f1,"https://www.animefillerlist.com/shows/my-dress-darling"));
        list1.add(new ParseShowsHomeScreen("My Hero Academia (Boku no Hero Academia)",R.drawable.f1,"https://www.animefillerlist.com/shows/my-hero-academia"));
        list1.add(new ParseShowsHomeScreen("My Hero Academia Movies",R.drawable.f1,"https://www.animefillerlist.com/shows/my-hero-academia-movies"));
        list1.add(new ParseShowsHomeScreen("My Next Life as a Villainess: All Routes Lead to Doom! (Bakarina)",R.drawable.f1,"https://www.animefillerlist.com/shows/my-next-life-villainess-all-routes-lead-doom"));
        list1.add(new ParseShowsHomeScreen("Nadia: The Secret of Blue Water (Fushigi no Umi no Nadia)",R.drawable.f1,"https://www.animefillerlist.com/shows/nadia-secret-blue-water"));
        list1.add(new ParseShowsHomeScreen("Naruto",R.drawable.f1,"https://www.animefillerlist.com/shows/naruto"));
        list1.add(new ParseShowsHomeScreen("Naruto Shippuden",R.drawable.f1,"https://www.animefillerlist.com/shows/naruto-shippuden"));
        list1.add(new ParseShowsHomeScreen("Naruto the Movie: Legend of the Stone of Gelel",R.drawable.f1,"https://www.animefillerlist.com/shows/naruto-movie-legend-stone-gelel"));
        list1.add(new ParseShowsHomeScreen("Naruto the Movie: Ninja Clash in the Land of Snow",R.drawable.f1,"https://www.animefillerlist.com/shows/naruto-movie-ninja-clash-land-snow"));
        list1.add(new ParseShowsHomeScreen("Negima OVA/OAD",R.drawable.f1,"https://www.animefillerlist.com/shows/negima-ovaoad"));
        list1.add(new ParseShowsHomeScreen("Negima! (Mahou Sensei Negima!)",R.drawable.f1,"https://www.animefillerlist.com/shows/magister-negi-magi"));
        list1.add(new ParseShowsHomeScreen("Negima!? (Mahou Sensei Negima?!)",R.drawable.f1,"https://www.animefillerlist.com/shows/noragami-aragoto"));
        list1.add(new ParseShowsHomeScreen("Nekomonogatari (Kuro)",R.drawable.f1,"https://www.animefillerlist.com/shows/nekomonogatari-kuro"));
        list1.add(new ParseShowsHomeScreen("Neon Genesis Evangelion",R.drawable.f1,"https://www.animefillerlist.com/shows/neon-genesis-evangelion"));
        list1.add(new ParseShowsHomeScreen("Nisekoi: False Love",R.drawable.f1,"https://www.animefillerlist.com/shows/nisekoi-false-love"));
        list1.add(new ParseShowsHomeScreen("Nisemonogatari",R.drawable.f1,"https://www.animefillerlist.com/shows/nisemonogatari"));
        list1.add(new ParseShowsHomeScreen("No Game, No Life",R.drawable.f1,"https://www.animefillerlist.com/shows/no-game-no-life"));
        list1.add(new ParseShowsHomeScreen("Noragami",R.drawable.f1,"https://www.animefillerlist.com/shows/noragami"));
        list1.add(new ParseShowsHomeScreen("One Pace (One Piece Kai)",R.drawable.f1,"https://www.animefillerlist.com/shows/one-pace"));
        list1.add(new ParseShowsHomeScreen("One Piece",R.drawable.f1,"https://www.animefillerlist.com/shows/one-piece"));
        list1.add(new ParseShowsHomeScreen("One Piece Movies",R.drawable.f1,"https://www.animefillerlist.com/shows/one-piece-movies"));
        list1.add(new ParseShowsHomeScreen("One-Punch Man",R.drawable.f1,"https://www.animefillerlist.com/shows/one-punch-man"));
        list1.add(new ParseShowsHomeScreen("Orange",R.drawable.f1,"https://www.animefillerlist.com/shows/orange"));
        list1.add(new ParseShowsHomeScreen("ORIENT",R.drawable.f1,"https://www.animefillerlist.com/shows/orient"));
        list1.add(new ParseShowsHomeScreen("Ouran High School Host Club",R.drawable.f1,"https://www.animefillerlist.com/shows/ouran-high-school-host-club"));
        list1.add(new ParseShowsHomeScreen("Outlaw Star",R.drawable.f1,"https://www.animefillerlist.com/shows/outlaw-star"));
        list1.add(new ParseShowsHomeScreen("Overlord",R.drawable.f1,"https://www.animefillerlist.com/shows/overlord"));
        list1.add(new ParseShowsHomeScreen("Owarimonogatari",R.drawable.f1,"https://www.animefillerlist.com/shows/owarimonogatari"));
        list1.add(new ParseShowsHomeScreen("Panty & Stocking with Garterbelt",R.drawable.f1,"https://www.animefillerlist.com/shows/tokyo-ghoul-%E2%88%9A-5"));
        list1.add(new ParseShowsHomeScreen("Parasyte -the Maxim- (Kiseijuu)",R.drawable.f1,"https://www.animefillerlist.com/shows/parasyte-maxim"));
        list1.add(new ParseShowsHomeScreen("Platinum End",R.drawable.f1,"https://www.animefillerlist.com/shows/platinum-end"));
        list1.add(new ParseShowsHomeScreen("Platinum End - Duplicate",R.drawable.f1,"https://www.animefillerlist.com/shows/your-eternity-0"));
        list1.add(new ParseShowsHomeScreen("Pokémon",R.drawable.f1,"https://www.animefillerlist.com/shows/pokemon"));
        list1.add(new ParseShowsHomeScreen("Pokemon - Duplicate",R.drawable.f1,"https://www.animefillerlist.com/shows/pok%C3%A9mon-series-xyz"));
        list1.add(new ParseShowsHomeScreen("Pokémon Advanced Generation",R.drawable.f1,"https://www.animefillerlist.com/shows/pok%C3%A9mon-advanced-generation"));
        list1.add(new ParseShowsHomeScreen("Pokémon Black & White (Pocket Monsters: Best Wishes)",R.drawable.f1,"https://www.animefillerlist.com/shows/pok%C3%A9mon-black-and-white"));
        list1.add(new ParseShowsHomeScreen("Pokémon Diamond and Pearl",R.drawable.f1,"https://www.animefillerlist.com/shows/pok%C3%A9mon-diamond-and-pearl"));
        list1.add(new ParseShowsHomeScreen("Pokémon Journeys: The Series",R.drawable.f1,"https://www.animefillerlist.com/shows/pok%C3%A9mon-journeys"));
        list1.add(new ParseShowsHomeScreen("Pokémon Origins (Pocket Monsters: The Origin)",R.drawable.f1,"https://www.animefillerlist.com/shows/pok%C3%A9mon-origins-0"));
        list1.add(new ParseShowsHomeScreen("Pokémon the Series: Sun & Moon",R.drawable.f1,"https://www.animefillerlist.com/shows/pok%C3%A9mon-sun-and-moon"));
        list1.add(new ParseShowsHomeScreen("Pokémon the Series: XY",R.drawable.f1,"https://www.animefillerlist.com/shows/pok%C3%A9mon-x-and-y"));
        list1.add(new ParseShowsHomeScreen("Pokémon: Original series",R.drawable.f1,"https://www.animefillerlist.com/shows/pok%C3%A9mon-original-series"));
        list1.add(new ParseShowsHomeScreen("Prison School",R.drawable.f1,"https://www.animefillerlist.com/shows/prison-school"));
        list1.add(new ParseShowsHomeScreen("Project ARMS (ARMS)",R.drawable.f1,"https://www.animefillerlist.com/shows/project-arms"));
        list1.add(new ParseShowsHomeScreen("PSYCHO-PASS",R.drawable.f1,"https://www.animefillerlist.com/shows/psycho-pass"));
        list1.add(new ParseShowsHomeScreen("Puella Magi Madoka Magica",R.drawable.f1,"https://www.animefillerlist.com/shows/puella-magi-madoka-magica"));
        list1.add(new ParseShowsHomeScreen("Ranking of Kings (Ousama Ranking)",R.drawable.f1,"https://www.animefillerlist.com/shows/ranking-kings"));
        list1.add(new ParseShowsHomeScreen("Ranma ½",R.drawable.f1,"https://www.animefillerlist.com/shows/ranma-%C2%BD"));
        list1.add(new ParseShowsHomeScreen("Rave Master (Groove Adventure Rave)",R.drawable.f1,"https://www.animefillerlist.com/shows/rave-master"));
        list1.add(new ParseShowsHomeScreen("Re:ZERO -Starting Life in Another World- (Re: Zero- Kara Hajimeru Isekai Seikatsu)",R.drawable.f1,"https://www.animefillerlist.com/shows/re-zero-starting-life-another-world"));
        list1.add(new ParseShowsHomeScreen("Reborn! (Katekyō Hitman Reborn!)",R.drawable.f1,"https://www.animefillerlist.com/shows/katekyo-hitman-reborn"));
        list1.add(new ParseShowsHomeScreen("Record of Ragnarok (Shuumatsu no Walküre)",R.drawable.f1,"https://www.animefillerlist.com/shows/record-ragnarok"));
        list1.add(new ParseShowsHomeScreen("Redo of Healer (Kaifuku Jutsushi no Yarinaoshi)",R.drawable.f1,"https://www.animefillerlist.com/shows/redo-healer"));
        list1.add(new ParseShowsHomeScreen("ReLIFE",R.drawable.f1,"https://www.animefillerlist.com/shows/relife"));
        list1.add(new ParseShowsHomeScreen("Rosario + Vampire",R.drawable.f1,"https://www.animefillerlist.com/shows/rosario-vampire"));
        list1.add(new ParseShowsHomeScreen("Rurouni Kenshin",R.drawable.f1,"https://www.animefillerlist.com/shows/rurouni-kenshin"));
        list1.add(new ParseShowsHomeScreen("RWBY",R.drawable.f1,"https://www.animefillerlist.com/shows/rwby"));
        list1.add(new ParseShowsHomeScreen("Saga of Tanya the Evil",R.drawable.f1,"https://www.animefillerlist.com/shows/sage-tanya-evil"));
        list1.add(new ParseShowsHomeScreen("Saga of Tanya the Evil - Duplicate",R.drawable.f1,"https://www.animefillerlist.com/shows/yakusoku-no-neverland"));
        list1.add(new ParseShowsHomeScreen("Sailor Moon (Bishoujo Sailor Moon)",R.drawable.f1,"https://www.animefillerlist.com/shows/sailor-moon"));
        list1.add(new ParseShowsHomeScreen("Sailor Moon Crystal",R.drawable.f1,"https://www.animefillerlist.com/shows/sailor-moon-crystal"));
        list1.add(new ParseShowsHomeScreen("Saint Seiya",R.drawable.f1,"https://www.animefillerlist.com/shows/saint-seiya"));
        list1.add(new ParseShowsHomeScreen("Samurai Champloo",R.drawable.f1,"https://www.animefillerlist.com/shows/samurai-champloo"));
        list1.add(new ParseShowsHomeScreen("School Days",R.drawable.f1,"https://www.animefillerlist.com/shows/school-days"));
        list1.add(new ParseShowsHomeScreen("Seraph of the End: Vampire Reign (Owari no Seraph)",R.drawable.f1,"https://www.animefillerlist.com/shows/seraph-end"));
        list1.add(new ParseShowsHomeScreen("Serial Experiments Lain",R.drawable.f1,"https://www.animefillerlist.com/shows/serial-experiments-lain"));
        list1.add(new ParseShowsHomeScreen("Sgt. Frog (Keroro Gunsou)",R.drawable.f1,"https://www.animefillerlist.com/shows/keroro-gunsou-sgtfrog"));
        list1.add(new ParseShowsHomeScreen("Shaman King",R.drawable.f1,"https://www.animefillerlist.com/shows/shaman-king"));
        list1.add(new ParseShowsHomeScreen("Shaman King (2021)",R.drawable.f1,"https://www.animefillerlist.com/shows/shaman-king-2021"));
        list1.add(new ParseShowsHomeScreen("Shugo Chara",R.drawable.f1,"https://www.animefillerlist.com/shows/shugo-chara"));
        list1.add(new ParseShowsHomeScreen("Silver Spoon",R.drawable.f1,"https://www.animefillerlist.com/shows/silver-spoon"));
        list1.add(new ParseShowsHomeScreen("SKET Dance",R.drawable.f1,"https://www.animefillerlist.com/shows/sket-dance"));
        list1.add(new ParseShowsHomeScreen("Skip Beat!",R.drawable.f1,"https://www.animefillerlist.com/shows/skip-beat"));
        list1.add(new ParseShowsHomeScreen("Slam Dunk",R.drawable.f1,"https://www.animefillerlist.com/shows/slam-dunk-0"));
        list1.add(new ParseShowsHomeScreen("Soul Eater",R.drawable.f1,"https://www.animefillerlist.com/shows/soul-eater"));
        list1.add(new ParseShowsHomeScreen("Soul Eater Not!",R.drawable.f1,"https://www.animefillerlist.com/shows/soul-eater-not"));
        list1.add(new ParseShowsHomeScreen("Soul Hunter (Hoshin Engi)",R.drawable.f1,"https://www.animefillerlist.com/shows/soul-hunter"));
        list1.add(new ParseShowsHomeScreen("Space Cobra",R.drawable.f1,"https://www.animefillerlist.com/shows/space-cobra"));
        list1.add(new ParseShowsHomeScreen("SPACE PATROL LULUCO",R.drawable.f1,"https://www.animefillerlist.com/shows/space-patrol-luloco"));
        list1.add(new ParseShowsHomeScreen("SPY x FAMILY",R.drawable.f1,"https://www.animefillerlist.com/shows/spy-x-family"));
        list1.add(new ParseShowsHomeScreen("Steins;Gate",R.drawable.f1,"https://www.animefillerlist.com/shows/steinsgate"));
        list1.add(new ParseShowsHomeScreen("Steins;Gate 0",R.drawable.f1,"https://www.animefillerlist.com/shows/steins-gate-0"));
        list1.add(new ParseShowsHomeScreen("Summertime Render",R.drawable.f1,"https://www.animefillerlist.com/shows/summertime-render"));
        list1.add(new ParseShowsHomeScreen("Super Dragon Ball Heroes",R.drawable.f1,"https://www.animefillerlist.com/shows/dragon-ball-heroes"));
        list1.add(new ParseShowsHomeScreen("Sword Art Online",R.drawable.f1,"https://www.animefillerlist.com/shows/sword-art-online"));
        list1.add(new ParseShowsHomeScreen("Sword Art Online Alternative: Gun Gale Online",R.drawable.f1,"https://www.animefillerlist.com/shows/sword-art-online-alternative-ggo"));
        list1.add(new ParseShowsHomeScreen("Sword Art Online: Alicization",R.drawable.f1,"https://www.animefillerlist.com/shows/sword-art-online-alicization"));
        list1.add(new ParseShowsHomeScreen("Terror in Resonance (Zankyou no Terror)",R.drawable.f1,"https://www.animefillerlist.com/shows/terror-resonance"));
        list1.add(new ParseShowsHomeScreen("That Time I Got Reincarnated as a Slime (Tensei shitara Slime Datta Ken)",R.drawable.f1,"https://www.animefillerlist.com/shows/time-i-got-reincarnated-slime"));
        list1.add(new ParseShowsHomeScreen("The Ancient Magus' Bride (Mahoutsukai no Yome)",R.drawable.f1,"https://www.animefillerlist.com/shows/ancient-magus-bride"));
        list1.add(new ParseShowsHomeScreen("The Asterisk War (Gakusen no Asterisk)",R.drawable.f1,"https://www.animefillerlist.com/shows/asterisk-war"));
        list1.add(new ParseShowsHomeScreen("The Devil Is a Part-Timer! (Hataraku Maou-Sama!)",R.drawable.f1,"https://www.animefillerlist.com/shows/devil-part-timer"));
        list1.add(new ParseShowsHomeScreen("The Familiar Of Zero (Zero No Tsukaima)",R.drawable.f1,"https://www.animefillerlist.com/shows/familiar-zero"));
        list1.add(new ParseShowsHomeScreen("The Future Diary (Mirai Nikki)",R.drawable.f1,"https://www.animefillerlist.com/shows/future-diary"));
        list1.add(new ParseShowsHomeScreen("The God of High School (Gat Obeu Hai Seukul)",R.drawable.f1,"https://www.animefillerlist.com/shows/god-high-school"));
        list1.add(new ParseShowsHomeScreen("The Heroic Legend of Arslan (Arslan Senki)",R.drawable.f1,"https://www.animefillerlist.com/shows/heroic-legend-arslan"));
        list1.add(new ParseShowsHomeScreen("The Melancholy of Haruhi Suzumiya (Suzumiya Haruhi no Yuuutsu)",R.drawable.f1,"https://www.animefillerlist.com/shows/melancholy-haruhi-suzumiya"));
        list1.add(new ParseShowsHomeScreen("The Prince of Tennis (Tenisu no Ōjisama)",R.drawable.f1,"https://www.animefillerlist.com/shows/prince-tennis-0"));
        list1.add(new ParseShowsHomeScreen("The Promised Neverland (Yakusoku no Neverland)",R.drawable.f1,"https://www.animefillerlist.com/shows/promised-neverland"));
        list1.add(new ParseShowsHomeScreen("The Rising of the Shield Hero (Tate no Yuusha no Nariagari)",R.drawable.f1,"https://www.animefillerlist.com/shows/rising-shield-hero"));
        list1.add(new ParseShowsHomeScreen("The Seven Deadly Sins (Nanatsu no Taizai)",R.drawable.f1,"https://www.animefillerlist.com/shows/nanatsu-no-taizai"));
        list1.add(new ParseShowsHomeScreen("Thus Spoke Kishibe Rohan",R.drawable.f1,"https://www.animefillerlist.com/shows/chrono-crusade"));
        list1.add(new ParseShowsHomeScreen("To Love Ru",R.drawable.f1,"https://www.animefillerlist.com/shows/love-ru"));
        list1.add(new ParseShowsHomeScreen("To Love Ru: Darkness",R.drawable.f1,"https://www.animefillerlist.com/shows/love-ru-darkness"));
        list1.add(new ParseShowsHomeScreen("To the Abandoned Sacred Beasts (Katsute Kami Datta Kemono-tachi e)",R.drawable.f1,"https://www.animefillerlist.com/shows/abandoned-sacred-beasts"));
        list1.add(new ParseShowsHomeScreen("To Your Eternity (Fumetsu no Anata e)",R.drawable.f1,"https://www.animefillerlist.com/shows/your-eternity"));
        list1.add(new ParseShowsHomeScreen("Tokyo Ghoul",R.drawable.f1,"https://www.animefillerlist.com/shows/tokyo-ghoul"));
        list1.add(new ParseShowsHomeScreen("Tokyo Ghoul:re",R.drawable.f1,"https://www.animefillerlist.com/shows/tokyo-ghoul-re-0"));
        list1.add(new ParseShowsHomeScreen("Tokyo Mew Mew",R.drawable.f1,"https://www.animefillerlist.com/shows/tokyo-mew-mew"));
        list1.add(new ParseShowsHomeScreen("Tokyo Revengers",R.drawable.f1,"https://www.animefillerlist.com/shows/tokyo-revengers"));
        list1.add(new ParseShowsHomeScreen("Toradora!",R.drawable.f1,"https://www.animefillerlist.com/shows/toradora"));
        list1.add(new ParseShowsHomeScreen("Toriko",R.drawable.f1,"https://www.animefillerlist.com/shows/toriko"));
        list1.add(new ParseShowsHomeScreen("Trigun",R.drawable.f1,"https://www.animefillerlist.com/shows/trigun"));
        list1.add(new ParseShowsHomeScreen("Tsugumomo",R.drawable.f1,"https://www.animefillerlist.com/shows/tsugumomo"));
        list1.add(new ParseShowsHomeScreen("Tsukimonogatari",R.drawable.f1,"https://www.animefillerlist.com/shows/tsukimonogatari"));
        list1.add(new ParseShowsHomeScreen("UQ Holder! Magister Negi Magi! 2",R.drawable.f1,"https://www.animefillerlist.com/shows/uq-holder-magister-negi-magi-2"));
        list1.add(new ParseShowsHomeScreen("Urusei Yatsura",R.drawable.f1,"https://www.animefillerlist.com/shows/urusei-yatsura"));
        list1.add(new ParseShowsHomeScreen("Vampire Knight",R.drawable.f1,"https://www.animefillerlist.com/shows/vampire-knight"));
        list1.add(new ParseShowsHomeScreen("Vinland Saga",R.drawable.f1,"https://www.animefillerlist.com/shows/vinland-saga"));
        list1.add(new ParseShowsHomeScreen("We Never Learn!: BOKUBEN (Bokutachi wa Benkyou ga Dekinai)",R.drawable.f1,"https://www.animefillerlist.com/shows/we-never-learn-bokuben"));
        list1.add(new ParseShowsHomeScreen("When They Cry (Higurashi no naku koro ni)",R.drawable.f1,"https://www.animefillerlist.com/shows/when-they-cry"));
        list1.add(new ParseShowsHomeScreen("X",R.drawable.f1,"https://www.animefillerlist.com/shows/x"));
        list1.add(new ParseShowsHomeScreen("Yashahime: Princess Half-Demon",R.drawable.f1,"https://www.animefillerlist.com/shows/yashahime-princess-half-demon"));
        list1.add(new ParseShowsHomeScreen("Yona of the Dawn (Akatsuki no Yona)",R.drawable.f1,"https://www.animefillerlist.com/shows/akatsuki-no-yona"));
        list1.add(new ParseShowsHomeScreen("Your lie in April (Shigatsu wa Kimi no Uso)",R.drawable.f1,"https://www.animefillerlist.com/shows/your-lie-april"));
        list1.add(new ParseShowsHomeScreen("Yowamushi Pedal",R.drawable.f1,"https://www.animefillerlist.com/shows/yowamushi-pedal"));
        list1.add(new ParseShowsHomeScreen("Yu Yu Hakusho",R.drawable.f1,"https://www.animefillerlist.com/shows/yuyu-hakusho"));
        list1.add(new ParseShowsHomeScreen("Yu-Gi-Oh!",R.drawable.f1,"https://www.animefillerlist.com/shows/yu-gi-oh"));
        list1.add(new ParseShowsHomeScreen("Yu-Gi-Oh! 5D's",R.drawable.f1,"https://www.animefillerlist.com/shows/yu-gi-oh-5ds"));
        list1.add(new ParseShowsHomeScreen("Yu-Gi-Oh! ARC-V",R.drawable.f1,"https://www.animefillerlist.com/shows/yu-gi-oh-arc-v"));
        list1.add(new ParseShowsHomeScreen("Yu-Gi-Oh! Capsule Monsters",R.drawable.f1,"https://www.animefillerlist.com/shows/yu-gi-oh-capsule-monsters"));
        list1.add(new ParseShowsHomeScreen("Yu-Gi-Oh! Duel Monsters",R.drawable.f1,"https://www.animefillerlist.com/shows/yu-gi-oh-duel-monsters"));
        list1.add(new ParseShowsHomeScreen("Yu-Gi-Oh! GX",R.drawable.f1,"https://www.animefillerlist.com/shows/yu-gi-oh-gx"));
        list1.add(new ParseShowsHomeScreen("Yu-Gi-Oh! Sevens",R.drawable.f1,"https://www.animefillerlist.com/shows/yu-gi-oh-sevens"));
        list1.add(new ParseShowsHomeScreen("Yu-Gi-Oh! VRAINS",R.drawable.f1,"https://www.animefillerlist.com/shows/yu-gi-oh-vrains"));
        list1.add(new ParseShowsHomeScreen("Yu-Gi-Oh! Zexal",R.drawable.f1,"https://www.animefillerlist.com/shows/yu-gi-oh-zexal"));
        list1.add(new ParseShowsHomeScreen("YU-NO: A Girl Who Chants Love at the Bound of This World",R.drawable.f1,"https://www.animefillerlist.com/shows/yu-no-girl-who-chants-love-bound-world"));
        list1.add(new ParseShowsHomeScreen("Zatch Bell! (Konjiki no Gash Bell!!)",R.drawable.f1,"https://www.animefillerlist.com/shows/zatch-bell"));




















    }


    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {

        getMenuInflater().inflate(R.menu.menu_item,menu);
        MenuItem menuItem = menu.findItem(R.id.search_action);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.setQueryHint("Search Here..");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                homeScreenAdapter.getFilter().filter(newText);
                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    public   class Description_webscraping_Shows extends AsyncTask<Void, Void, Void> {

        private WeakReference<Context> contextRef;

        public Description_webscraping_Shows(Context con) {
            contextRef = new WeakReference<>(con);
        }

        @Override
        protected void onPostExecute(Void aVoid){
            super.onPostExecute(aVoid);
            Context v = contextRef.get();
            homeScreenAdapter = new HomeScreenAdapter(temp_list1,v);
            show_recView.setAdapter(homeScreenAdapter);
            homeScreenAdapter.notifyDataSetChanged();
            obj.stopLoadingDialog();
        }

        @Override
        protected Void doInBackground(Void... voids) {

            ArrayList<String> showLinkss = new ArrayList<>();




            //link.forEach(element -> showLinkss.add(link.text()));
//            for (int i = 11; i < 335; i++) {
//                org.jsoup.nodes.Document document2 = null;
//                try {
//                    document2 = (Document) Jsoup.connect("https://www.animefillerlist.com/shows").get();
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//
//                //link.forEach(element -> showLinks.add(element.text()));
//                Element link = document2.select("a").eq(i).first();
//
//
//                String relHref = link.attr("href"); // == "/"
//                String absHref = link.attr("abs:href");
//                //System.out.println("tempLinks-------->"+absHref);
//                showLinkss.add(absHref);
//            }
//            for (int i = 0; i < showLinkss.size(); i++) {
//                System.out.println("xcccccccccccccccccccccc----->>>>"+showLinkss.get(i));
//            }





            for (int i = 0; i < list1.size(); i++) {
                org.jsoup.nodes.Document document = null;
                int url= pics.get(i);
                String sName = list1.get(i).getShow_name();
                String showLink = list1.get(i).getShow_link();

//                try {
//                    document = (Document) Jsoup.connect(url).get();
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//                org.jsoup.select.Elements elements = document.getElementsByClass("Title");
//                org.jsoup.select.Elements img = document.getElementsByClass("field-item even");
//                int size = elements.size();
//
//
//
//                String imgUrl = img.select("img").attr("src");
//                System.out.println("imggggggggggggggggggggggggggggggggggUrllllllllllllllll--->"+imgUrl);
                //elements.forEach(element -> sys1.add(element.text()));
                temp_list1.add(new ParseShowsHomeScreen(sName,url,showLink));

            }




            return null;







        }


    }






}