package com.wazedrifat.covid19;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Dashboard extends Fragment {
	GridView gridView;

	public Dashboard() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

		gridView = view.findViewById(R.id.dashboardGridViewID);

		CustomDashboardGridViewAdapter adapter = new CustomDashboardGridViewAdapter(getContext());
		gridView.setAdapter(adapter);

		return view;
	}
}
