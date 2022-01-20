package com.example.ngampusrelease;

import java.util.ArrayList;

public class PTSData {
    private static final int [] ptsImage = {
            R.drawable.umsu,
            R.drawable.almuslim,
            R.drawable.binus,
            R.drawable.telkom,
            R.drawable.mercubuana
    };

    private static final String [] ptsName = {
            "Universitas Muhammadiyah Sumatera Utara",
            "Universitas Almuslim Bireuen",
            "Universitas Bina Nusantara",
            "Universitas Telkom",
            "Universitas Mercu Buana"
    };

    private static final String [] ptsAkreditasi = {
            "Akreditasi: A",
            "Akreditasi: B",
            "Akreditasi: A",
            "Akreditasi: A",
            "Akreditasi: A"
    };

    private static final String [] ptsKota = {
            "Medan, Sumatera Utara",
            "Bireuen, NAD",
            "Jakarta Barat",
            "Bandung, Jawa Barat",
            "Jakarta"
    };

    private static final String [] ptsdetail = {
                    "Universitas Muhammadiyah Sumatera Utara disingkat UMSU, adalah amal usaha dibawah persyarikatan Muhammadiyah yang berasas Islam dan bersumber pada Al-Qur'an dan Sunnah didirikan di Medan pada tanggal 27 Februari 1957 yang berkedudukan di kota Medan Propinsi Sumatra Utara.Awal berdirinya FIP UMSU merupakan binaan dari FIP Universitas Muhammadiyah Jakarta (UMJ) dan pada tahun 1974 berdiri sendiri, sedangkan FIAD yang bercabang ke Universitas Muhammadiyah Sumatera Barat berdiri sendiri dan mengubah nama menjadi Fakultas Ushuluddin. Lahirnya fakultas-fakultas lain tidak terlepas dari peran serta Kopertis Wilayah I atas nama Menteri Pendidikan dan Kebudayaan RI dan Kopertais Wilayah IX atas nama Menteri Agama RI.\n",

                    "Universitas Almuslim merupakan satu-satunya universitas di Kabupaten Bireuen, Aceh. Universitas ini merupakan perubahan bentuk dari Sekolah-sekolah Tinggi dan Akademi dalam lingkup Perguruan Tinggi Almuslim yaitu Sekolah Tinggi Ilmu Pertanian (STP), Sekolah Tinggi Keguruan dan Ilmu Pendidikan (STKIP), dan Akademi Manajemen Informatika dan Komputer (AMIK) yang didirikan pada tanggal 14 Zulqaidah 1406 H atau bertepatan dengan tanggal 1 Agustus 1985 M. Universitas ini didirikan pada tanggal 15 Januari 2003.\n",

                    "Universitas Bina Nusantara pada awalnya berasal dari sebuah institusi pelatihan komputer Modern Computer Course yang didirikan pada 21 Oktober 1974.[1] Seiring dengan perkembangan, Modern Computer Course kemudian berkembang menjadi Akademi Teknik Komputer (ATK) pada 1 Juli 1981. Akademi ini menawarkan pendidikan manajemen informatika dan teknik informatika. Tiga tahun kemudian pada 13 Juli 1984 ATK mendapatkan status terdaftar dan berubah menjadi AMIK Jakarta. Pada 1 Juli 1985, AMIK membuka kursus di bidang komputerisasi akuntansi. AMIK mulai menggunakan nama Bina Nusantara pada 21 September 1985.\n",

                    "Telkom University berdiri pada tanggal 14 Agustus 2013 berdasarkan Surat Keputusan Direktur Jenderal Pendidikan Tinggi Kemendikbud Nomor 309/E/0/2013. Universitas Telkom adalah Perguruan Tinggi Swasta yang diselenggarakan oleh Yayasan Pendidikan Telkom, merupakan penggabungan dari empat Perguruan Tinggi Swasta, yaitu Institut Teknologi Telkom (IT Telkom), Institut Manajemen Telkom (IM Telkom), Politeknik Telkom, dan Sekolah Tinggi Seni Rupa dan Desain Indonesia Telkom (STISI Telkom). Institut Teknologi Telkom sebelumnya adalah Sekolah Tinggi Teknologi Telkom (STT Telkom). Institut Manajemen Telkom sebelumnya adalah Sekolah Tinggi Manajemen dan Bisnis Telkom (STMB Telkom). STT Telkom dan STMB Telkom didirikan pada tahun 1990 atas prakarsa PT. Telkom yang saat itu dipimpin oleh Direktur Utama Ir. Cacuk Sudarijanto. Kedua sekolah tinggi tersebut merupakan perguruan tinggi pertama di Indonesia yang memiliki kekhususan pendidikan dalam bidang industri pertelekomunikasian serta teknologi informasi.\n",

                    "Universitas Mercu Buana adalah sebuah universitas swasta dengan Akreditasi A di Jakarta, Indonesia.\n",

                    "Didirikan pada tanggal 22 Oktober 1985, kampus utama yang juga dinamakan Kampus Meruya terletak di daerah Meruya, Jakarta Barat. Kampus lainnya, yaitu Kampus Menteng, terletak di Menteng, Jakarta Pusat, Kampus Warung Buncit di Jl.Warung Buncit Jakarta Selatan, serta Kampus Keranggan di Jatisampurna, Jawa Barat.\n"
    };

    static ArrayList<PTS> getListDataPTS() {
        ArrayList<PTS> list = new ArrayList<>();
        for (int position = 0; position <ptsName.length; position++) {
            PTS pts = new PTS();
            pts.setImg_kampus(ptsImage[position]);
            pts.setNamakampus(ptsName[position]);
            pts.setKota(ptsKota[position]);
            pts.setAkreditasi(ptsAkreditasi[position]);
            pts.setDetail(ptsdetail[position]);
            list.add(pts);
        }
        return list;
    }
}
