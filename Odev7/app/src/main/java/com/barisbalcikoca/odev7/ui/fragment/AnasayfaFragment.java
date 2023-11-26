package com.barisbalcikoca.odev7.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.barisbalcikoca.odev7.R;
import com.barisbalcikoca.odev7.databinding.FragmentAnasayfaBinding;
import com.barisbalcikoca.odev7.ui.adapter.YapilacaklarAdapter;
import com.barisbalcikoca.odev7.ui.viewmodel.AnasayfaViewModel;

import dagger.hilt.android.AndroidEntryPoint;


@AndroidEntryPoint
public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding;
    private AnasayfaViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);
        binding.toolbarAnasayfa.setTitle("Yapılacaklar");


        binding.rv.setLayoutManager(new LinearLayoutManager(requireContext()));//alt alta linear şekilde olacak bir yapı


        viewModel.yapilacaklarListesi.observe(getViewLifecycleOwner(),yapilacaklarListesi->{
            //Bir adapter yani tutucu oluşturduk. Adapter bizden bir CONTEXT istiyordu onu verdik ve LİSTE istiyordu onu da oluşturduğumuz Listeyi verdik.
            YapilacaklarAdapter yapilacaklarAdapter = new YapilacaklarAdapter(requireContext(),yapilacaklarListesi,viewModel);//requireContext alt yapı getContext() demek
            //Adapter içerisine yükledik.
            binding.rv.setAdapter(yapilacaklarAdapter);
        });


        binding.fab.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.kayitGecis);
        });

        //ARAMA
        binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            //Klavye üzerindeki arama iconu ile çalışır
            public boolean onQueryTextSubmit(String s) {
                viewModel.ara(s);
                return true;
            }

            @Override
            //Her değişiklik olduğunda çalışır
            public boolean onQueryTextChange(String s) {
                viewModel.ara(s);
                return true;
            }
        });

        return binding.getRoot();
    }


    //VİEW MODEL İÇİN EKLENDİ
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(AnasayfaViewModel.class);
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.yapilacaklariYukle();
    }
}