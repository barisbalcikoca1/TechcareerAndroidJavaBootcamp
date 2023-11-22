package com.barisbalcikoca.odev6.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.barisbalcikoca.odev6.databinding.CardResimTasarimBinding;
import com.barisbalcikoca.odev6.entity.FilmResim;

import java.util.List;

public class FilmResimAdapter extends RecyclerView.Adapter<FilmResimAdapter.CardTasarimTutucu>{

    private Context mContext;
    private List<FilmResim> filmResimListesi;

    public FilmResimAdapter(Context mContext, List<FilmResim> filmResimListesi) {
        this.mContext = mContext;
        this.filmResimListesi = filmResimListesi;
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder{
        private CardResimTasarimBinding tasarimBinding;

        public CardTasarimTutucu( CardResimTasarimBinding tasarimBinding) {
            super(tasarimBinding.getRoot());
            this.tasarimBinding = tasarimBinding;
        }
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        CardResimTasarimBinding binding = CardResimTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {

        FilmResim filmResim = filmResimListesi.get(position);
        CardResimTasarimBinding t = holder.tasarimBinding;

        t.ivFilm.setImageResource(mContext.getResources().getIdentifier(filmResim.getResim_ad(),"drawable",mContext.getPackageName()));


    }

    @Override
    public int getItemCount() {
        return filmResimListesi.size();
    }


}
