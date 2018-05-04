package com.example.mussabaheen.vengineers;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import javax.crypto.NullCipher;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private static int SPLASH_TIMEOUT=0;
    private WebView webView;
    public boolean web_Cheaker=false;
    Intent homeIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle extras = getIntent().getExtras();
        if(extras==null) {
            homeIntent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(homeIntent);
            finish();
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager fragmentManager=getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame,new welcome_screen()).commit();




    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager=getFragmentManager();
        if (id == R.id.accomudation_xml) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,new accumadation()).commit();
            // Handle the camera action
        } else if (id == R.id.jobsearch_xml) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,new job_search()).commit();

        } else if (id == R.id.shopping_xml) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,new shopping()).commit();

        }  else if (id == R.id.language) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,new language_learn()).commit();

        } else if (id == R.id.Socialization) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,new Socialiy()).commit();

        } else if (id == R.id.tech_news) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,new Technology_news()).commit();

        } else if (id == R.id.tech_chatters) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,new Tech_chaters()).commit();

        }
        else if (id == R.id.translater_1) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,new google_translater()).commit();

        }
        else if (id == R.id.aboutus) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,new about_us_1()).commit();

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void dosomething(View view) {
        web_Cheaker=true;
        webView=new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://nya.boplats.se/");
    }
    public void monster(View view) {
        web_Cheaker=true;
        webView=new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.monster.se/jobb/sok/");
    }
    public void shopping_link(View view) {
        web_Cheaker=true;
        webView=new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://reningsborg.se/");
    }
    public void social_pakistan_in_gothemburg(View view) {
        web_Cheaker=true;
        webView=new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://m.facebook.com/groups/273657819641951/");
    }
    public void social_indian_in_gothemburg(View view) {
        web_Cheaker=true;
        webView=new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://m.facebook.com/groups/indiansingothenburg/");
    }
    public void language_link(View view) {
        web_Cheaker=true;
        webView=new WebView(this);
        setContentView(webView);
        webView.loadUrl("http://www.stockholm.se/ForskolaSkola/Vuxenutbildning/SFI---Utbildning-i-svenska-for-invandrare/Swedish-for-immigrants-/");
    }

    public void language_link2(View view) {
        web_Cheaker=true;
        webView=new WebView(this);
        setContentView(webView);
        webView.loadUrl("http://www.stockholm.se/ForskolaSkola/Vuxenutbildning/SFI---Utbildning-i-svenska-for-invandrare/Swedish-for-immigrants-/");
    }
    public void tech_news_open(View view) {
        web_Cheaker = true;
        webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.thelocal.se/tag/technews");
    }
    public void translater_link(View view) {
        web_Cheaker = true;
        webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://translate.google.com/");
    }
    public void open_linkedin_mussabaheen(View view) {
        web_Cheaker = true;
        webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.linkedin.com/in/mussabaheen-malik-2a35b9129/");
    }
    public void login(View view) {
        FragmentManager fragmentManager=getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame,new accumadation()).commit();

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (web_Cheaker == true) {
            if (event.getAction() == KeyEvent.ACTION_DOWN) {
                switch (keyCode) {
                    case KeyEvent.KEYCODE_BACK:
                        if (webView.canGoBack()) {
                            webView.goBack();
                        } else {
                            Intent i1 = new Intent(this, MainActivity.class);
                            i1.putExtra("run",true);
                            startActivity(i1);
                            finish();
                        }
                        return true;
                }

            }
        }
            web_Cheaker=false;
            return super.onKeyDown(keyCode, event);
        }
}
