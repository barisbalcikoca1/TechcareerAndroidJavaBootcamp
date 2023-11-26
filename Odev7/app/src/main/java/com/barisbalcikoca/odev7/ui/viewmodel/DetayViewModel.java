package com.barisbalcikoca.odev7.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.barisbalcikoca.odev7.data.repo.YapilacaklarDaoRepository;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel

public class DetayViewModel extends ViewModel {
    public YapilacaklarDaoRepository yrepo ;

    @Inject
    public DetayViewModel (YapilacaklarDaoRepository yrepo){
        this.yrepo = yrepo;
    }

    public void guncelle(int id, String name) {
        yrepo.guncelle(id,name);

    }
}
