package com.barisbalcikoca.odev7.data.entitiy;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "yapilacaklar")
public class Yapilacaklar implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    @NonNull
    private int id;
    @ColumnInfo(name = "name")
    @NonNull
    private String name;

    public Yapilacaklar() {
    }

    public Yapilacaklar(int id, @NonNull String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}
