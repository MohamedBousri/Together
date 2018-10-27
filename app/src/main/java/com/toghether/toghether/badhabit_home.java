package com.toghether.toghether;



 import android.support.v4.app.Fragment;
 import android.app.FragmentTransaction;
 import android.os.Bundle;
 import android.support.annotation.NonNull;
 import android.support.design.widget.BottomNavigationView;
 import android.support.fragment.*;
 import android.support.v4.app.FragmentManager;
 import android.support.v7.app.AppCompatActivity;
 import android.view.MenuItem;
 import android.widget.FrameLayout;
 import android.widget.TextView;
 public class badhabit_home extends AppCompatActivity {

 private FrameLayout fl;
 private TextView mTextMessage;
 private statis statfrag;

 private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
 = new BottomNavigationView.OnNavigationItemSelectedListener() {

@Override
public boolean onNavigationItemSelected(@NonNull MenuItem item) {
Fragment fr=null;
switch (item.getItemId()) {
case R.id.navigation_home2:
mTextMessage.setText(R.string.title_home);
break;
case R.id.navigation_dashboard:
fr=new statis();break;
case R.id.navigation_notifications2:
mTextMessage.setText(R.string.title_notifications);
break;
case R.id.navigation_achievment:
fr=new Achivment();break;
}
FragmentManager fragmentManager =
getSupportFragmentManager();

fragmentManager.beginTransaction()
.replace(R.id.main_frame, fr)
.commit();
return true;
}
};

 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main2);
 BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
 navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
 FragmentManager fm =
 getSupportFragmentManager();

 fm.beginTransaction()
 .replace(R.id.main_frame, new statis())
 .commit();
 }


 }