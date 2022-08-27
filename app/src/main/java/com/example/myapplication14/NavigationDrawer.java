package com.example.myapplication14;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class NavigationDrawer extends AppCompatActivity {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbars;
    ActionBarDrawerToggle toggle;

    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(getApplicationContext(),"End",Toast.LENGTH_LONG).show();
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);



        toolbars = findViewById(R.id.toolbar);
        setSupportActionBar(toolbars);

        navigationView=findViewById(R.id.nav_view);
        drawerLayout=findViewById(R.id.drawer);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbars,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.nav_engsurah:
                        Toast.makeText(getApplicationContext(),"Eng_surah is Clicked",Toast.LENGTH_LONG).show();
                        Intent engsurah = new Intent(NavigationDrawer.this, EngSurahNames.class);
                        startActivity(engsurah);
                        break;

                    case R.id.nav_urdusurah:
                        Toast.makeText(getApplicationContext(),"Urdu_surah is Clicked",Toast.LENGTH_LONG).show();
                        Intent urdusurah = new Intent(NavigationDrawer.this, UrduSurahNames.class);
                        startActivity(urdusurah);
                        break;

                    case R.id.nav_engparah:
                        Toast.makeText(getApplicationContext(),"Eng_parah is Clicked",Toast.LENGTH_LONG).show();
                        Intent engparah = new Intent(NavigationDrawer.this, EngParahNames.class);
                        startActivity(engparah);
                        break;

                    case R.id.nav_urduparah:
                        Toast.makeText(getApplicationContext(),"Urdu_parah is Clicked",Toast.LENGTH_LONG).show();
                        Intent urduparah = new Intent(NavigationDrawer.this, UrduParahNames.class);
                        startActivity(urduparah);
                        break;

                    case R.id.nav_chrome_reader :
                        Toast.makeText(getApplicationContext(),"Chrome Reader is clicked",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }

                return true;
            }

        });
}
}