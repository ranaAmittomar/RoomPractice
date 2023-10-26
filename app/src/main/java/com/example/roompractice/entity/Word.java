package com.example.roompractice.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table") //creating a table
public class Word {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word") //making word primary key
    private String mWord;
    public Word(String mWord) {
        this.mWord = mWord;
    }

    public String getWord() {
        return this.mWord;
    }
}
