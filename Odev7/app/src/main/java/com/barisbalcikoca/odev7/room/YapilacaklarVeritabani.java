package com.barisbalcikoca.odev7.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.barisbalcikoca.odev7.data.entitiy.Yapilacaklar;

@Database(entities = {Yapilacaklar.class},version = 1)

public abstract class YapilacaklarVeritabani extends RoomDatabase {
    public abstract YapilacaklarDao getYapilacaklarDao();

}
