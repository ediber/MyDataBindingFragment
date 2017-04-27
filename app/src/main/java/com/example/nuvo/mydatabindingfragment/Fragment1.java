package com.example.nuvo.mydatabindingfragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nuvo.mydatabindingfragment.databinding.FragmentFragment1Binding;


public class Fragment1 extends Fragment {

    public Fragment1() {
        // Required empty public constructor
    }


    public static Fragment1 newInstance() {
        Fragment1 fragment = new Fragment1();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentFragment1Binding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_fragment1, container, false);

        binding.setData(new Data());

        View view =  binding.getRoot();
//        binding.setVariable(new Data());

        return view;
    }

}
