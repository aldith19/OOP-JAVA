package ProgramLearnJava.data;

import ProgramLearnJava.annotation.Fancy;


public enum Level {

    STANDARD("Level Standard"),
    PREMIUM("Level Premium"),
    VIP("Level Vip");

    private String dekskripsi;

    Level(String dekskripsi){
        this.dekskripsi = dekskripsi;
    }

    public String getDekskripsi() {
        return dekskripsi;
    }
}
