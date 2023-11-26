package com.barisbalcikoca.odev7.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.barisbalcikoca.odev7.data.entitiy.Yapilacaklar;
import com.barisbalcikoca.odev7.databinding.CardTasarimBinding;
import com.barisbalcikoca.odev7.ui.fragment.AnasayfaFragmentDirections;
import com.barisbalcikoca.odev7.ui.viewmodel.AnasayfaViewModel;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class YapilacaklarAdapter extends RecyclerView.Adapter<YapilacaklarAdapter.CardTasarimTutucu> {


    private Context mContext; //Android parçası anlamına gelir. -->fragment veya activity parçası

    private List<Yapilacaklar> yapilacaklarListesi;
    private AnasayfaViewModel viewModel;

    public YapilacaklarAdapter(Context mContext, List<Yapilacaklar> yapilacaklarListesi, AnasayfaViewModel viewModel) {
        this.mContext = mContext;
        this.yapilacaklarListesi = yapilacaklarListesi;
        this.viewModel = viewModel;
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder{ //CardTasarımXML indeki her şeye bunun sayesinde erişilececk, bağlanma olayı
        private CardTasarimBinding tasarimBinding;

        public CardTasarimTutucu( CardTasarimBinding tasarimBinding) {
            super(tasarimBinding.getRoot());
            this.tasarimBinding = tasarimBinding;
        }
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //parent yazılımsal tasarımı ifade ediyor
        //false başka tasarım eklenmeyeceğini ifade ediyor

        CardTasarimBinding binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false);

        return new CardTasarimTutucu(binding);//CardTasarimTutucudan bir nesne istiyor.
    }

    @Override
    public void onBindViewHolder(@NonNull YapilacaklarAdapter.CardTasarimTutucu holder, int position) {
        //CART İÇERİSİNDE BİR İŞLEM YAPILACAKSA BUTONA TIKLANMA VS BURADA YAPILIR

        //position değeri kadar burası çalışacak tekrar sanki while gibi for gibi

        Yapilacaklar yapilacaklar = yapilacaklarListesi.get(position);
        CardTasarimBinding t = holder.tasarimBinding;

        t.textViewVeri.setText(yapilacaklar.getName());


        t.cardViewSatir.setOnClickListener(view -> {
            AnasayfaFragmentDirections.DetayGecis gecis = AnasayfaFragmentDirections.detayGecis(yapilacaklar);
            Navigation.findNavController(view).navigate(gecis);
        });


        //Silme
        t.imageViewSil.setOnClickListener(view -> {
            Snackbar.make(view,"Yapılacaklar Notu Silinsin Mi",Snackbar.LENGTH_SHORT)
                    .setAction("Evet",view1 -> {
                        viewModel.sil(yapilacaklar.getId());
                    }).show();
        });
    }


    @Override
    public int getItemCount() {
        return yapilacaklarListesi.size();
    }
}
