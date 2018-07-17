package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.country_inn_and_suites, R.string.country_inn_and_suites_info));
        attractions.add(new Attraction(R.string.courtyard, R.string.courtyard_info));
        attractions.add(new Attraction(R.string.park_vista, R.string.park_vista_info));
        attractions.add(new Attraction(R.string.river_edge_motor_lodge, R.string.river_edge_motor_lodge_info));

        // Setup the ListView's adapter
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.greenBackground);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}