package com.barisbalcikoca.odev6.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.barisbalcikoca.odev6.databinding.FragmentIndirilenlerBinding;


public class IndirilenlerFragment extends Fragment {

    FragmentIndirilenlerBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentIndirilenlerBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}