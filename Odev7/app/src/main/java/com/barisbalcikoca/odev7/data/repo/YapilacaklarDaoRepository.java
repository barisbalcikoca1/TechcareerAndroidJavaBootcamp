package com.barisbalcikoca.odev7.data.repo;

import androidx.lifecycle.MutableLiveData;

import com.barisbalcikoca.odev7.data.entitiy.Yapilacaklar;
import com.barisbalcikoca.odev7.room.YapilacaklarDao;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class YapilacaklarDaoRepository {
    public MutableLiveData<List<Yapilacaklar>> yapilacaklarListesi = new MutableLiveData<>();

    private YapilacaklarDao ydao;
    public YapilacaklarDaoRepository(YapilacaklarDao ydao){

        this.ydao = ydao;
    }

    public void kaydet (String name){
        Yapilacaklar yeniYapilacak = new Yapilacaklar(0,name);
        ydao.kaydet(yeniYapilacak).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }
                    @Override
                    public void onComplete() {
                    }
                    @Override
                    public void onError(Throwable e) {
                    }
                });

    }

    public void guncelle(int id,String name){
        Yapilacaklar yapilacakGuncelle = new Yapilacaklar(id,name);
        ydao.guncelle(yapilacakGuncelle).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onComplete() {
                    }

                    @Override
                    public void onError(Throwable e) {
                    }
                });
    }

    public void ara(String aramaKelimesi){
        ydao.ara(aramaKelimesi).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<Yapilacaklar>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onSuccess(List<Yapilacaklar> yapilacaklars) {
                        //Veritabanında kişilerin listesini getiriyor
                        yapilacaklarListesi.setValue(yapilacaklars);

                    }

                    @Override
                    public void onError(Throwable e) {
                    }
                });
    }

    public void sil(int id){
        Yapilacaklar yapilacakSil = new Yapilacaklar(id,"");
        ydao.sil(yapilacakSil).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onComplete() {
                        yapilacaklariYukle();
                    }

                    @Override
                    public void onError(Throwable e) {
                    }
                });
    }


    public void yapilacaklariYukle(){

        ydao.yapilacaklariYukle().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<Yapilacaklar>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onSuccess(List<Yapilacaklar> yapilacaklars) {
                        //Veritabanında kişilerin listesini getiriyor
                        yapilacaklarListesi.setValue(yapilacaklars);

                    }

                    @Override
                    public void onError(Throwable e) {
                    }
                });

    }
}
