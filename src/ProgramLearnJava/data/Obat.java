package ProgramLearnJava.data;

import java.util.Objects;

public class Obat {

    public int price;

    public String name;
    public String quality;

    public Obat(String name, int price, String quality){
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    public String toString(){
        return "Nama obat:" + name +" .Harga:"+ price + " .jumlah:" + quality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Obat obat = (Obat) o;

        if (price != obat.price) return false;
        if (!Objects.equals(name, obat.name)) return false;
        return Objects.equals(quality, obat.quality);
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (quality != null ? quality.hashCode() : 0);
        return result;
    }
}
