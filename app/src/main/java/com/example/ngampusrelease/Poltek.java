package com.example.ngampusrelease;

import android.os.Parcel;
import android.os.Parcelable;

public class Poltek implements Parcelable {
    private int img_kampus;
    private String namakampus;
    private String akreditasi;
    private String kota;
    private String detail;

    public Poltek() {

    }

    protected Poltek(Parcel in) {
        img_kampus = in.readInt();
        namakampus = in.readString();
        akreditasi = in.readString();
        kota = in.readString();
        detail = in.readString();
    }


    public static final Creator<Poltek> CREATOR = new Creator<Poltek>() {
        @Override
        public Poltek createFromParcel(Parcel in) {
            return new Poltek(in);
        }
        @Override
        public Poltek[] newArray(int size) {
            return new Poltek[size];
        }
    };

    public int getImg_kampus() {
        return this.img_kampus;
    }

    public void setImg_kampus(int img_kampus) {
        this.img_kampus = img_kampus;
    }

    public String getNamakampus() {
        return namakampus;
    }

    public void setNamakampus(String namakampus) {
        this.namakampus = namakampus;
    }

    public String getAkreditasi() {
        return akreditasi;
    }

    public void setAkreditasi(String akreditasi) {
        this.akreditasi = akreditasi;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(img_kampus);
        dest.writeString(namakampus);
        dest.writeString(akreditasi);
        dest.writeString(kota);
        dest.writeString(detail);
    }
}
