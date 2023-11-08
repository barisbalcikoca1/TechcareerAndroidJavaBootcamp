package com.barisbalcikoca.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.barisbalcikoca.odev4.databinding.FragmentABinding;
import com.barisbalcikoca.odev4.databinding.FragmentXBinding;


public class XFragment extends Fragment {


    private FragmentXBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentXBinding.inflate(inflater, container, false);
        binding.btnGitY.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.gecisXtoY);
        });

        return binding.getRoot();

    }
}