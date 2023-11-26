package com.barisbalcikoca.odev7.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.barisbalcikoca.odev7.data.repo.YapilacaklarDaoRepository;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel

public class KayitViewModel extends ViewModel {
    public YapilacaklarDaoRepository yrepo ;

    @Inject
    public KayitViewModel (YapilacaklarDaoRepository yrepo){
        this.yrepo = yrepo;

    }
    public void kaydet (String name){
        yrepo.kaydet(name);

    }
}
