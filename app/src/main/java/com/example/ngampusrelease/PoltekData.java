package com.example.ngampusrelease;

import java.util.ArrayList;

public class PoltekData {
    private static final int [] poltekImage = {
            R.drawable.polteklhok,
            R.drawable.polmed,
            R.drawable.pnj,
            R.drawable.pens,
            R.drawable.polsri
    };

    private static final String [] poltekName = {
            "POLITEKNIK NEGERI LHOKSEUMAWE (PNL)",
            "POLITEKNIK NEGERI MEDAN (POLMED)",
            "POLITEKNIK NEGERI JAKARTA (PNJ)",
            "POLITEKNIK ELEKTRONIKA NEGERI SURABAYA (PENS)",
            "POLITEKNIK NEGERI SRIWIJAYA (POLSRI)"
    };

    private static final String [] poltekAkreditasi = {
            "Akreditasi: B",
            "Akreditasi: B",
            "Akreditasi: B",
            "Akreditasi: A",
            "Akreditasi: B"
    };

    private static final String [] poltekKota = {
            "Lhokseumawe, NAD",
            "Medan, Sumatera Utara",
            "Depok, Jawa Barat",
            "Surabaya, Jawa Timur",
            "Palembang, Sumatera Selatan"
    };

    private static final String [] poltekdetail = {
                    "Politeknik Negeri Lhokseumawe dibangun pada tahun 1985, pada awalnya bernama Politeknik Unsyiah yang merupakan bagian dari Universitas Syiah Kuala. Pada saat awal didirikan Politeknik Unsyiah, yang didanai oleh Bank Dunia XIII, membuka tiga jurusan program Diploma 3 yaitu, jurusan Teknik Sipil, Teknik Kimia dan Teknik Mesin. Proses penyelenggaraan pendidikan dimulai pada tanggal 5 Oktober 1987.\n",

                    "Pada tahun 1979 Universitas Sumatera Utara ditetapkan sebagai salah satu dari 6 Universitas/Institut yang mendapat proyek pembangunan Pendidikan Politeknik Tahap I dari DIKTI, dengan nama Politeknik Universitas Sumatera Utara (Politeknik USU) Medan. Pembangunan Politeknik USU dibiayai oleh Bank Dunia (World Bank). Pada tahap I yang dibangun adalah pendidikan bidang keteknikan yang pelaksanaannya mendapat bantuan tenaga ahli dari Swiss yang ditempatkan di Medan.\n",

                    "POLITEKNIK NEGERI JAKARTA (PNJ) yang dahulu bernama Politeknik Universitas Indonesia/Fakultas Non-Gelar Teknologi (FNgT) berubah nama berdasarkan Surat Keputusan Menteri Pendidikan dan Kebudayaan Nomor 207/O/1998. PNJ merupakan institusi pendidikan tinggi otonom yang mempunyai tujuh Jurusan dan 36 Program Studi yang mempunyai jenjang D-3 (Ahli Madya-A.Md.), Sarjana Terapan (S.Tr.) dan Magister Terapan (M.Tr.).\n",

                    "Awal sejarah PENS dimulai pada tahun 1985. Saat itu, tim studi awal Japan International Cooperation Agency (JICA) untuk bantuan dan kerjasama teknik yang dikepalai oleh Prof. Y. Naito dari Tokyo Institute of Technology, datang ke politeknik ini. Setelah melakukan pengamatan dan studi kelayakan di tahun 1986, JICA menyetujui untuk memulai kerjasama teknik di tahun 1987 dengan mengirim 5 orang pengajar Indonesia ke perguruan tinggi teknologi di Jepang.\n",

                    "Politeknik Negeri Sriwijaya, dahulunya bernama Politeknik Universitas Sriwijaya secara resmi dibuka pada tanggal 20 September 1982. Pada fase pertama Politeknik hanya mempunyai 2 (dua) Jurusan yaitu Jurusan Teknik Sipil dan Jurusan Teknik Mesin dengan daya tampung maksimum 576 orang mahasiswa dan dengan sarana pendidikan, staf pengajar dan kurikulum yang dirakit secara nasional dan terpusat di Pusat Pengembangan Pendidikan Politeknik PEDC Bandung.\n"
    };

    static ArrayList<Poltek> getListData() {
        ArrayList<Poltek> list = new ArrayList<>();
        for (int position = 0; position <poltekName.length; position++) {
            Poltek poltek = new Poltek();
            poltek.setImg_kampus(poltekImage[position]);
            poltek.setNamakampus(poltekName[position]);
            poltek.setKota(poltekKota[position]);
            poltek.setAkreditasi(poltekAkreditasi[position]);
            poltek.setDetail(poltekdetail[position]);
            list.add(poltek);
        }
        return list;
    }
}
