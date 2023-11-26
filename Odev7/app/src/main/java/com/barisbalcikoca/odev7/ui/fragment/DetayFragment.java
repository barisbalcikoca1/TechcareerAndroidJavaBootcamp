package com.barisbalcikoca.odev7.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.barisbalcikoca.odev7.R;
import com.barisbalcikoca.odev7.data.entitiy.Yapilacaklar;
import com.barisbalcikoca.odev7.databinding.FragmentDetayBinding;
import com.barisbalcikoca.odev7.ui.viewmodel.DetayViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint

public class DetayFragment extends Fragment {

    private FragmentDetayBinding binding;
    private DetayViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetayBinding.inflate(inflater, container, false);
        binding.toolbarDetay.setTitle("Detay");

        DetayFragmentArgs bundle = DetayFragmentArgs.fromBundle(getArguments());
        Yapilacaklar gelenYapilacak = bundle.getYapilacak();


        binding.editTextYapilacak.setText(gelenYapilacak.getName());
        binding.btnYapilacakGuncelle.setOnClickListener(view -> {
            String yapilacak = binding.editTextYapilacak.getText().toString();


            viewModel.guncelle(gelenYapilacak.getId(),yapilacak);
        });
        return binding.getRoot();
    }

    //VİEW MODEL İÇİN EKLENDİ
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(DetayViewModel.class);
    }
}