package com.example.ngampusrelease;

import android.os.Parcel;
import android.os.Parcelable;

public class PTN implements Parcelable {
    private int img_kampus;
    private String namakampus;
    private String akreditasi;
    private String kota;
    private String detail;

    public PTN() {

    }

    protected PTN(Parcel in) {
        img_kampus = in.readInt();
        namakampus = in.readString();
        akreditasi = in.readString();
        kota = in.readString();
        detail = in.readString();
    }


    public static final Creator<PTN> CREATOR = new Creator<PTN>() {
        @Override
        public PTN createFromParcel(Parcel in) {
            return new PTN(in);
        }
        @Override
        public PTN[] newArray(int size) {
            return new PTN[size];
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
