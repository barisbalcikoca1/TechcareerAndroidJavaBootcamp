package com.barisbalcikoca.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.barisbalcikoca.odev4.databinding.FragmentABinding;
import com.barisbalcikoca.odev4.databinding.FragmentBBinding;


public class BFragment extends Fragment {


    private FragmentBBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBBinding.inflate(inflater, container, false);

        binding.btnSayfaY.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.gecisY);
        });

        return binding.getRoot();

    }
}