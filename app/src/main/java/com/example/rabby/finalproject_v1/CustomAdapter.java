package com.example.rabby.finalproject_v1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends BaseAdapter {

    Context context;
    String[] profileNames;
    String[] skills;
    int[] proPics;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, String[] profileNames, String[] skills, int[] proPics) {
        this.context = context;
        this.profileNames = profileNames;
        this.skills = skills;
        this.proPics = proPics;
    }

    @Override
    public int getCount() {
        return profileNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.sample_profile_lists_view,viewGroup,false);

        }
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        TextView profileNameTV = (TextView) view.findViewById(R.id.profileNameTV);
        TextView skillTV = (TextView) view.findViewById(R.id.skillTV);


        imageView.setImageResource(proPics[0]);
        profileNameTV.setText(profileNames[i]);
        skillTV.setText("Skill: "+skills[0]+","+skills[1]);

        return view;
    }
}
