package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    public FoodFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.crocketts_breakfast_camp, R.string.crocketts_breakfast_camp_info));
        attractions.add(new Attraction(R.string.little_house_of_pancakes, R.string.little_house_of_pancakes_info));
        attractions.add(new Attraction(R.string.log_cabin_pancake, R.string.log_cabin_pancake_info));
        attractions.add(new Attraction(R.string.pancake_pantry, R.string.pancake_pantry_info));

        // Setup the ListView's adapter
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.greenBackground);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}