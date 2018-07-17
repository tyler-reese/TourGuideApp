package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NationalParkFragment extends Fragment {

    public NationalParkFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.cades_cove, R.string.cades_cove_info, R.drawable.cadescove));
        attractions.add(new Attraction(R.string.cataloochee, R.string.cataloochee_info, R.drawable.cataloochee));
        attractions.add(new Attraction(R.string.clingmans_dome, R.string.clingmans_dome_info, R.drawable.clingmansdome));
        attractions.add(new Attraction(R.string.roaring_fork, R.string.roaring_fork_info, R.drawable.roaringforks));

        // Setup the ListView's adapter
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.greenBackground);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}