package com.essam.miwok_app;

public class Word {

    private String mDefault;
    private String mMiwok;

    public Word(String def, String miwok){
        this.mDefault = def;
        this.mMiwok = miwok;
    }

    public String getmDefault() {
        return mDefault;
    }

    public void setmDefault(String mDefault) {
        this.mDefault = mDefault;
    }

    public String getmMiwok() {
        return mMiwok;
    }

    public void setmMiwok(String mMiwok) {
        this.mMiwok = mMiwok;
    }
}
