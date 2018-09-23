package com.example.rabby.finalproject_v1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ProfileLists extends AppCompatActivity {

    private ListView listView;
    private int[] proPics = {R.drawable.jim};
    private String[] skills = {"C Programming","Java"};
    private String[] profileNames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_lists);
        listView = (ListView) findViewById(R.id.listViewId);
        profileNames = getResources().getStringArray(R.array.profile_names);
        CustomAdapter adapter = new CustomAdapter(this,profileNames,skills,proPics);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = profileNames[i];
                Toast.makeText(ProfileLists.this, value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
