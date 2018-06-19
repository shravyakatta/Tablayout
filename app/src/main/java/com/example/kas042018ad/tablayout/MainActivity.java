package com.example.kas042018ad.tablayout;

import android.annotation.SuppressLint;


import android.support.design.widget.TabLayout;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;

    //This is our viewPager
    private ViewPager viewPager;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        TabLayout tabLayout = (TabLayout) findViewById( R.id.tab );
        tabLayout.addTab( tabLayout.newTab().setText( "Tab 1" ).setIcon( R.drawable.ic_favo ) );
        tabLayout.addTab( tabLayout.newTab().setText( "Tab 2" ).setIcon( R.drawable.ic_favo ) );
        tabLayout.addTab( tabLayout.newTab().setText( "Tab 3" ) .setIcon( R.drawable.ic_favo ));
        tabLayout.setTabGravity( TabLayout.GRAVITY_FILL );
        //tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        final ViewPager viewPager = (ViewPager) findViewById( R.id.pager );
        final Pager adapter = new Pager
                ( getSupportFragmentManager(), tabLayout.getTabCount() );
        viewPager.setAdapter( adapter );
        viewPager.addOnPageChangeListener( new TabLayout.TabLayoutOnPageChangeListener( tabLayout ) );
        tabLayout.setOnTabSelectedListener( new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem( tab.getPosition() );
//                int tabIconColor = ContextCompat.getColor(MainActivity.this, R.color.colorAccent);
//                tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
//                int tabIconColor = ContextCompat.getColor(MainActivity.this, R.color.colorPrimary);
//                tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
             //   super.onTabReselected(tab);
            }
        } );
    }
}

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }true

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        returnturn super.onOptionsItemSelected(item);
//    }
//}

