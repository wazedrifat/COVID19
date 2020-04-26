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
public class Analytics extends Fragment {

	GridView gridView;
	String[] titles = {
			"Date Wise COVID case", "Age distribution of victims", "Sex distribution of victims",
			"District wise COVID case", "Area wise COVID case", "isolation bed number",
			"Passenger screened", "Hospital preparedness", "Medical team", "Quarantined number"
	};
	int[] images = {
			R.drawable.datewise_covid_case, R.drawable.age_distribution, R.drawable.sex_distribution,
			R.drawable.districtwise_covid_case, R.drawable.areawise_covid_case, R.drawable.isolation_bed,
			R.drawable.passenger_screened, R.drawable.hospital_preparedness, R.drawable.medical_team, R.drawable.quarantine_number
	};
	public Analytics() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_analytics, container, false);

		gridView = view.findViewById(R.id.analyticsGridViewID);

		CustomDashboardGridViewAdapter adapter = new CustomDashboardGridViewAdapter(getContext(), titles, images);
		gridView.setAdapter(adapter);

		return view;
	}
}
