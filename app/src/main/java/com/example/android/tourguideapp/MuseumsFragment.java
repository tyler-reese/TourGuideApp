package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.hollywood_star_cars, R.string.hollywood_star_cars_info));
        attractions.add(new Attraction(R.string.ripleys_aquarium, R.string.ripleys_aquarium_info));
        attractions.add(new Attraction(R.string.salt_and_pepper_shaker, R.string.salt_and_pepper_shaker_info));
        attractions.add(new Attraction(R.string.world_of_illusions, R.string.world_of_illusions_info));

        // Setup the ListView's adapter
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.greenBackground);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}