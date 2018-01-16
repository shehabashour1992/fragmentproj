package com.order.fragment;


import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondFragment extends Fragment{
View v;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.second_layout, container, false);

        Bundle bundle=getArguments();
        TextView text=v.findViewById(R.id.text1);

        if(bundle!=null)
        {
            String numb=bundle.getString("num");
            text.setText(numb);


        }



        return v;
    }
}
