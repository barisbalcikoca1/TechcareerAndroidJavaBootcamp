package com.barisbalcikoca.odev7.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.barisbalcikoca.odev7.R;
import com.barisbalcikoca.odev7.databinding.FragmentKayitBinding;
import com.barisbalcikoca.odev7.ui.viewmodel.KayitViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint

public class KayitFragment extends Fragment {

    private FragmentKayitBinding binding;
    private KayitViewModel viewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentKayitBinding.inflate(inflater,container,false);

        binding.toolbarKayit.setTitle("Kayıt");
        binding.btnYapilacakKaydet.setOnClickListener(view -> {
            String yapilacak = binding.editTextYapilacak.getText().toString();


            viewModel.kaydet(yapilacak);

        });

        return binding.getRoot();
    }
    //VİEW MODEL İÇİN EKLENDİ
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(KayitViewModel.class);
    }
}