package com.barisbalcikoca.odev6.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.barisbalcikoca.odev6.databinding.CardImageBinding;
import com.barisbalcikoca.odev6.databinding.CardRvTextImageBinding;
import com.barisbalcikoca.odev6.entity.TextImage;

import org.w3c.dom.Text;

import java.util.List;

public class TextImageAdapter extends RecyclerView.Adapter<TextImageAdapter.CardTasarimTutucu> {

    private Context mContext;

    List<TextImage> textImageList;

    public TextImageAdapter(Context mContext, List<TextImage> textImageList) {
        this.mContext = mContext;
        this.textImageList = textImageList;
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private CardRvTextImageBinding tasarimBinding;

        public CardTasarimTutucu(CardRvTextImageBinding tasarimBinding) {
            super(tasarimBinding.getRoot());
            this.tasarimBinding = tasarimBinding;
        }
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardRvTextImageBinding binding = CardRvTextImageBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new TextImageAdapter.CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {

        TextImage textImage = textImageList.get(position);
        CardRvTextImageBinding t = holder.tasarimBinding;

        t.tvBilgi.setText(textImageList.get(position).getTitle());
        ImageAdapter imageAdapter = new ImageAdapter(mContext,textImageList.get(position).getImageList());
        t.rvFilm.setLayoutManager(new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false));
        t.rvFilm.setAdapter(imageAdapter);
        imageAdapter.notifyDataSetChanged();


    }

    @Override
    public int getItemCount() {
        return textImageList.size();
    }


}