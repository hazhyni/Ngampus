package com.example.ngampusrelease;

import java.util.ArrayList;

public class PTKData {
    private static final int [] ptkImage = {
            R.drawable.ipdn,
            R.drawable.sekdilu,
            R.drawable.stan,
            R.drawable.stip,
            R.drawable.stin
    };

    private static final String [] ptkName = {
            "IPDN (INSTITUT PEMERINTAH DALAM NEGERI)",
            "DIREKTUR SEKOLAH DINAS LUAR NEGERI (SEKDILU)",
            "POLITEKNIK KEUANGAN NEGARA (PKN STAN)",
            "SEKOLAH TINGGI ILMU PELAYARAN (STIP)",
            "SEKOLAH TINGGI INTELIJEN NEGARA (STIN)"
    };


    private static final String [] ptkKota = {
            "Jatinagor, Jawa Barat",
            "Senayan, DKI Jakarta",
            "Tanggerang, Banten",
            "Jakarta",
            "Bogor, Jawa Barat"
    };

    private static final String [] ptkdetail = {

                    "Institut Pemerintahan Dalam Negeri disingkat “IPDN” adalah salah satu Lembaga Pendidikan Tinggi Kedinasan di lingkungan Kementerian Dalam Negeri Republik Indonesia, yang bertujuan mempersiapkan kader pemerintahan, baik di tingkat daerah maupun di tingkat pusat. Pada 10 Oktober 2007, dalam sebuah sidang kabinet Berdasarkan Keppres No. 87 Tahun 2004, Presiden Susilo Bambang Yudhoyono memutuskan untuk menggabungkan STPDN dengan Institut Ilmu Pemerintahan (IIP) menjadi IPDN.\n",

                    "Akademi Dinas Luar Negeri (ADLN), didirikan pada tahun 1949 oleh Achmad Soebardjo, Menteri Luar Negeri Indonesia pertama. ADLN semula diadakan dengan format perkuliahan di perguruan tinggi pada umumnya, dengan waktu studi selama tiga tahun. Namun dalam perkembangannya, setelah pergantian nama menjadi Sekdilu, bentuk pendidikan diubah menjadi serupa dengan diklat prajabatan, dengan masa studi selama delapan bulan.\n",

                    "Politeknik Keuangan Negara STAN (PKN STAN) adalah pendidikan tinggi kedinasan di bawah Badan Pendidikan dan Pelatihan Keuangan, Kementerian Keuangan Republik Indonesia, yang menyelenggarakan pendidikan Program Studi Diploma bidang keuangan negara. STAN didirikan dengan dasar hukum Keputusan Presiden RI No.45 Tahun 1974 juncto Keputusan Presiden RI No.12 Tahun 1967 serta dengan landasan hukum Peraturan Menteri Keuangan RI No.1/PMK/1977 tanggal 18 Februari 1977.\n",

                    "Sekolah Tinggi Ilmu Pelayaran adalah Pendidikan pelayaran yang berada dibawah naungan Badan Diklat Perhubungan Republik Indonesia. Berdiri sejak tahun 1953 Akademi Ilmu Pelayaran yang menyelenggarakan Program Diploma III (setara dengan BSc) dengan 2 jurusan antara lain: Nautika dan Teknika (sertifikat kompetensi Klas III), lama pendidikan 3-4 tahun.\n",

                    "Sekolah Tinggi Intelijen Negara atau STIN adalah sebuah perguruan tinggi kedinasan yang berada di bawah naungan Badan Intelijen Negara. Kampusnya terletak di daerah Sentul, Bogor, Jawa Barat. Berdirinya STIN bertujuan untuk menyiapkan Taruna nya menjadi anggota masyarakat intelijen yang memiliki kemampuan akademik dan/atau keahlian profesional sehingga dapat menerapkan dan mengembangkan ilmu intelijen, ilmu pengetahuan, teknologi, dan/atau seni bidang intelijen untuk menjaga persatuan dan kesatuan Negara Kesatuan Republik Indonesia. Sesuai UU 17/2011 Alumni STIN menjadi sumber utama SDM BIN. \n"

    };

    static ArrayList<PTK> getListData() {
        ArrayList<PTK> list = new ArrayList<>();
        for (int position = 0; position <ptkName.length; position++) {
            PTK ptk = new PTK();
            ptk.setImg_kampus(ptkImage[position]);
            ptk.setNamakampus(ptkName[position]);
            ptk.setKota(ptkKota[position]);
            ptk.setDetail(ptkdetail[position]);
            list.add(ptk);
        }
        return list;
    }
}
