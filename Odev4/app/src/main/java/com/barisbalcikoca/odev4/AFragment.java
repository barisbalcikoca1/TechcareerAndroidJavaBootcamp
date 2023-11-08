package com.barisbalcikoca.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.barisbalcikoca.odev4.databinding.FragmentABinding;
import com.barisbalcikoca.odev4.databinding.FragmentAnasayfaBinding;


public class AFragment extends Fragment {


    private FragmentABinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentABinding.inflate(inflater, container, false);
        binding.btnSayfaB.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.gecisB);
        });

        return binding.getRoot();

    }
}