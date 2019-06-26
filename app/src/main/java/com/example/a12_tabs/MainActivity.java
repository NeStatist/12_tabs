package com.example.a12_tabs;

import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

import java.util.Random;

    public class MainActivity extends AppCompatActivity
            implements NavigationView.OnNavigationItemSelectedListener {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            NavigationView navigationView = findViewById(R.id.nav_view);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.addDrawerListener(toggle);
            toggle.syncState();
            navigationView.setNavigationItemSelectedListener(this);

        }

        @Override
        public void onBackPressed() {
            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }


        Random random = new Random();

        int c1 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        int c2 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        int c3 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        int c4 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        int c5 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        int c6 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        int c7 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        int c8 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        int c9 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        int c10 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        int c11 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        int c12 = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));

        @Override
        public boolean onNavigationItemSelected(MenuItem mt) {

            ConstraintLayout constraintLayout = findViewById(R.id.cola);
            TextView view = findViewById(R.id.textView2);
            int id = mt.getItemId();


            if (id == R.id.first) {

                int a = c1;
                view.setText("1");
                constraintLayout.setBackgroundColor(a);

            } else if (id == R.id.second) {

                int a = c2;
                view.setText("2");
                constraintLayout.setBackgroundColor(a);
            } else if (id == R.id.three) {

                int a = c3;
                view.setText("3");
                constraintLayout.setBackgroundColor(a);
            } else if (id == R.id.four) {

                int a = c4;
                view.setText("4");
                constraintLayout.setBackgroundColor(a);
            } else if (id == R.id.five) {

                int a = c5;
                view.setText("5");
                constraintLayout.setBackgroundColor(a);
            } else if (id == R.id.six) {

                int a = c6;
                view.setText("6");
                constraintLayout.setBackgroundColor(a);
            } else if (id == R.id.seven) {

                int a = c7;
                view.setText("7");
                constraintLayout.setBackgroundColor(a);
            } else if (id == R.id.eight) {

                int a = c8;
                view.setText("8");
                constraintLayout.setBackgroundColor(a);
            } else if (id == R.id.nine) {

                int a = c9;
                view.setText("9");
                constraintLayout.setBackgroundColor(a);
            } else if (id == R.id.ten) {

                int a = c10;
                view.setText("10");
                constraintLayout.setBackgroundColor(a);
            } else if (id == R.id.eleven) {

                int a = c11;
                view.setText("11");
                constraintLayout.setBackgroundColor(a);
            } else if (id == R.id.twelve) {

                int a = c12;
                view.setText("12");
                constraintLayout.setBackgroundColor(a);
            }


            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }
    }

