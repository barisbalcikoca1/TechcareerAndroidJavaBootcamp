package com.barisbalcikoca.odev6.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.barisbalcikoca.odev6.databinding.CardImageBinding;
import com.barisbalcikoca.odev6.entity.Image;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.CardTasarimTutucu>{

    private Context mContext;
    List<Image> imageList;

    public ImageAdapter(Context mContext, List<Image> imageList) {
        this.mContext = mContext;
        this.imageList = imageList;
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder{
        private CardImageBinding tasarimBinding;

        public CardTasarimTutucu( CardImageBinding tasarimBinding) {
            super(tasarimBinding.getRoot());
            this.tasarimBinding = tasarimBinding;
        }
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardImageBinding binding = CardImageBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Image image = imageList.get(position);
        CardImageBinding t = holder.tasarimBinding;
        t.ivChildImage.setImageResource(mContext.getResources().getIdentifier(image.getFilm_ad(),"drawable",mContext.getPackageName()));

    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }


}
