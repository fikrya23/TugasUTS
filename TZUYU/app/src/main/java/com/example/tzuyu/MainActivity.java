package com.example.tzuyu;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    /*
    NIM : 10116362
    NAMA : FIKRI AHMAD RAMDHAN
    KELAS : AKB-8
    TGL KERJA : 19 MEI 2019
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);

        final HomeFragment homeFragment = new HomeFragment();
        final ProfileFragment profileFragment = new ProfileFragment();
        final ContactFragment contactFragment = new ContactFragment();
        final FriendFragment friendFragment = new FriendFragment();

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if(id == R.id.homeb) {
                    setFragment(homeFragment);
                    return true;
                } else if (id ==R.id.profilb) {
                    setFragment(profileFragment);
                    return true;
                } else if (id == R.id.kontakb) {
                    setFragment(contactFragment);
                    return true;
                } else if (id == R.id.temanb) {
                    setFragment(friendFragment);
                    return true;
                }

                return false;
            }
        });
        navigationView.setSelectedItemId(R.id.homeb);
    }

    private void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }
}
