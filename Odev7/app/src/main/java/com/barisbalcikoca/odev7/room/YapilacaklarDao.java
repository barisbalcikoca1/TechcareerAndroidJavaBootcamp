package com.barisbalcikoca.odev7.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.barisbalcikoca.odev7.data.entitiy.Yapilacaklar;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

@Dao
public interface YapilacaklarDao {
    @Query("SELECT * FROM yapilacaklar")
    Single<List<Yapilacaklar>> yapilacaklariYukle();

    @Insert
    Completable kaydet (Yapilacaklar yapilacaklar);

    @Update
    Completable guncelle (Yapilacaklar yapilacaklar);

    @Delete
    Completable sil (Yapilacaklar yapilacaklar);

    @Query("SELECT * FROM yapilacaklar WHERE name like '%'|| :aramaKelimesi ||'%'")
    Single<List<Yapilacaklar>> ara(String aramaKelimesi);
}
