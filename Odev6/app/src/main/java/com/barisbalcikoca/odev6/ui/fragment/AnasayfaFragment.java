package com.barisbalcikoca.odev6.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.barisbalcikoca.odev6.databinding.FragmentAnasayfaBinding;
import com.barisbalcikoca.odev6.entity.FilmResim;
import com.barisbalcikoca.odev6.entity.Image;
import com.barisbalcikoca.odev6.entity.TextImage;
import com.barisbalcikoca.odev6.ui.adapter.FilmResimAdapter;
import com.barisbalcikoca.odev6.ui.adapter.TextImageAdapter;


import java.util.ArrayList;


public class AnasayfaFragment extends Fragment {
    FragmentAnasayfaBinding binding;
    ArrayList<TextImage> textImageListesi;
    ArrayList<Image> altYazili;
    ArrayList<Image> seslendirmeli;
    ArrayList<Image> cokIzlenen;

    TextImageAdapter textImageAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.filmResimRv.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));

        ArrayList<FilmResim> filmResimListesi = new ArrayList<>();
        FilmResim fatherstu = new FilmResim(1,"Father STU","fatherstu");
        FilmResim prestijmeselesi = new FilmResim(2,"Prestij Meselesi","prestijmeselesi");
        FilmResim gameofthrones = new FilmResim(3,"Game Of Thrones","gameofthrones");
        FilmResim cenaze = new FilmResim(4,"Cenaze","cenaze");
        FilmResim ucus811 = new FilmResim(5,"Uçuş 811","ucus811");
        filmResimListesi.add(fatherstu);
        filmResimListesi.add(prestijmeselesi);
        filmResimListesi.add(gameofthrones);
        filmResimListesi.add(cenaze);
        filmResimListesi.add(ucus811);

        FilmResimAdapter filmResimAdapter = new FilmResimAdapter(requireContext(),filmResimListesi);
        binding.filmResimRv.setAdapter(filmResimAdapter);



        textImageListesi =  new ArrayList<>();//Hem text Hem Image
        altYazili = new ArrayList<>();//sadece image
        seslendirmeli = new ArrayList<>();//sadece image
        cokIzlenen = new ArrayList<>();//sadece image

        altYazili.add(new Image("cenaze"));
        altYazili.add(new Image("fatherstu"));
        altYazili.add(new Image("prestijmeselesi"));
        altYazili.add(new Image("gameofthrones"));
        altYazili.add(new Image("ucus811"));
        textImageListesi.add(new TextImage("- Alt yazılı TV dizileri ve filmler >",altYazili));

        seslendirmeli.add(new Image("fatherstu"));
        seslendirmeli.add(new Image("cenaze"));
        seslendirmeli.add(new Image("prestijmeselesi"));
        seslendirmeli.add(new Image("gameofthrones"));
        seslendirmeli.add(new Image("ucus811"));
        textImageListesi.add(new TextImage("- Seslendirmeli TV dizileri ve filmler >",seslendirmeli));



        cokIzlenen.add(new Image("gameofthrones"));
        cokIzlenen.add(new Image("prestijmeselesi"));
        cokIzlenen.add(new Image("fatherstu"));
        cokIzlenen.add(new Image("cenaze"));
        cokIzlenen.add(new Image("ucus811"));
        textImageListesi.add(new TextImage("- Çok İzlenen Filmler >",cokIzlenen));


        textImageAdapter = new TextImageAdapter(requireContext(),textImageListesi);
        binding.rvTextImage.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.rvTextImage.setAdapter(textImageAdapter);




        return binding.getRoot();
    }
}