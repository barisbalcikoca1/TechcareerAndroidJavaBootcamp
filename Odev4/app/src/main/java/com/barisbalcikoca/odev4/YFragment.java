package com.barisbalcikoca.odev4;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.barisbalcikoca.odev4.databinding.FragmentABinding;
import com.barisbalcikoca.odev4.databinding.FragmentYBinding;


public class YFragment extends Fragment {


    private FragmentYBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentYBinding.inflate(inflater, container, false);


        OnBackPressedCallback geriTusu = new OnBackPressedCallback(true) {
            //true olursa geri tuşu çalışmıyor demektir ve istedipimizi yaptırabiliriz.
            @Override
            public void handleOnBackPressed() {
                Navigation.findNavController(binding.textView5).navigate(R.id.gecisAnasayfa);
                //Anasayfaya geçiş yaptırdığım yer
            }
        };

        //Oluşturduğum geri tuşun çalıştırıması
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),geriTusu);


        return binding.getRoot();

    }
}