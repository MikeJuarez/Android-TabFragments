package com.michaeljuarez.mycompany.tabfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by user on 3/30/2017.
 */

public class Tab3Fragment extends Fragment {

    private static final String TAG = "Tab3Fragment";

    private Button btnTEST3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3_fragment,container,false);
        btnTEST3 = (Button) view.findViewById(R.id.btnTest3);

        btnTEST3.setOnClickListener(new View.OnClickListener()  {

            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 3", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
