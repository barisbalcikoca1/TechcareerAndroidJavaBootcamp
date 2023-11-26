package com.barisbalcikoca.odev7.di;

import android.content.Context;

import androidx.room.Room;

import com.barisbalcikoca.odev7.data.repo.YapilacaklarDaoRepository;
import com.barisbalcikoca.odev7.room.YapilacaklarDao;
import com.barisbalcikoca.odev7.room.YapilacaklarVeritabani;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {
    @Provides
    @Singleton

    public YapilacaklarDaoRepository provideYapilacaklarDaoRepository(YapilacaklarDao ydao){
        return new YapilacaklarDaoRepository(ydao);
    }


    @Provides
    @Singleton
    public YapilacaklarDao provideYapilacaklarDao (@ApplicationContext Context context){
        YapilacaklarVeritabani vt = Room.databaseBuilder(context, YapilacaklarVeritabani.class,"yapilacaklar.sqlite")
                .createFromAsset("yapilacaklar.sqlite").build();
        return vt.getYapilacaklarDao();
    }
}
