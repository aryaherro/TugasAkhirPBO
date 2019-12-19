/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     Wed 18.12.19 10:35:23                        */
/*==============================================================*/


/*==============================================================*/
/* Table: Dosen                                                 */
/*==============================================================*/
create table Dosen
(
   npp                  varchar(254) not null  comment '',
   nama                 varchar(254) not null  comment '',
   nik                  varchar(254)  comment '',
   tanggalLahir         datetime  comment '',
   jenisKelamin         char(1)  comment '',
   alamat               varchar(254)  comment '',
   email                varchar(254)  comment '',
   agama                varchar(254)  comment '',
   primary key (npp)
);

/*==============================================================*/
/* Table: Jabatan                                               */
/*==============================================================*/
create table Jabatan
(
   idJabatan            varchar(254) not null  comment '',
   namaJabatan          varchar(254) not null  comment '',
   primary key (idJabatan)
);

/*==============================================================*/
/* Table: HistoryJabatan                                        */
/*==============================================================*/
create table HistoryJabatan
(
   idHistoryJabatan     varchar(254) not null  comment '',
   idJabatan            varchar(254) not null  comment '',
   npp                  varchar(254) not null  comment '',
   startDate            datetime  comment '',
   tahunAjaran          varchar(254)  comment '',
   statusAktif          bool  comment '',
   primary key (idHistoryJabatan),
   constraint FK_HISTORYJ_ASSOCIATI_JABATAN foreign key (idJabatan)
      references Jabatan (idJabatan) on delete restrict on update restrict,
   constraint FK_HISTORYJ_ASSOCIATI_DOSEN foreign key (npp)
      references Dosen (npp) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: Prodi                                                 */
/*==============================================================*/
create table Prodi
(
   idProdi              varchar(254) not null  comment '',
   namaProdi            varchar(254) not null  comment '',
   primary key (idProdi)
);

/*==============================================================*/
/* Table: Mahasiswa                                             */
/*==============================================================*/
create table Mahasiswa
(
   nim                  varchar(254) not null  comment '',
   npp                  varchar(254)  comment '',
   idProdi              varchar(254)  comment '',
   nama                 varchar(254) not null  comment '',
   nik                  varchar(254)  comment '',
   tanggalLahir         datetime  comment '',
   jenisKelamin         char(1)  comment '',
   alamat               varchar(254)  comment '',
   email                varchar(254)  comment '',
   agama                varchar(254)  comment '',
   primary key (nim),
   constraint FK_MAHASISW_ASSOCIATI_PRODI foreign key (idProdi)
      references Prodi (idProdi) on delete restrict on update restrict,
   constraint FK_MAHASISW_ASSOCIATI_DOSEN foreign key (npp)
      references Dosen (npp) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: Judul                                                 */
/*==============================================================*/
create table Judul
(
   idJudul              varchar(254) not null  comment '',
   nim                  varchar(254) not null  comment '',
   namaJudul            varchar(254) not null  comment '',
   deskripsi            varchar(254)  comment '',
   tipeJudul            varchar(254)  comment '',
   primary key (idJudul),
   constraint FK_JUDUL_ASSOCIATI_MAHASISW foreign key (nim)
      references Mahasiswa (nim) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: JadwalSeminar                                         */
/*==============================================================*/
create table JadwalSeminar
(
   idJadwal             varchar(254) not null  comment '',
   idProdi              varchar(254)  comment '',
   idJudul              varchar(254)  comment '',
   jadwal               datetime not null  comment '',
   primary key (idJadwal),
   constraint FK_JADWALSE_ASSOCIATI_PRODI foreign key (idProdi)
      references Prodi (idProdi) on delete restrict on update restrict,
   constraint FK_JADWALSE_ASSOCIATI_JUDUL foreign key (idJudul)
      references Judul (idJudul) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: Kelayakan                                             */
/*==============================================================*/
create table Kelayakan
(
   idLayak              varchar(254) not null  comment '',
   idJudul              varchar(254) not null  comment '',
   statusLayak          bool not null  comment '',
   primary key (idLayak),
   constraint FK_KELAYAKA_ASSOCIATI_JUDUL foreign key (idJudul)
      references Judul (idJudul) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: Revisi                                                */
/*==============================================================*/
create table Revisi
(
   idRevisi             varchar(254) not null  comment '',
   idJudul              varchar(254) not null  comment '',
   npp                  varchar(254)  comment '',
   isiRevisi            varchar(254) not null  comment '',
   tanggalRevisi        datetime not null  comment '',
   primary key (idRevisi),
   constraint FK_REVISI_ASSOCIATI_DOSEN foreign key (npp)
      references Dosen (npp) on delete restrict on update restrict,
   constraint FK_REVISI_ASSOCIATI_JUDUL foreign key (idJudul)
      references Judul (idJudul) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: User                                                  */
/*==============================================================*/
create table User
(
   username             varchar(254) not null  comment '',
   password             varchar(254) not null  comment '',
   typeUser             varchar(254) not null  comment '',
   primary key (username)
);

/*==============================================================*/
/* Table: dosenDanProdi                                         */
/*==============================================================*/
create table dosenDanProdi
(
   idProdi              varchar(254) not null  comment '',
   npp                  varchar(254) not null  comment '',
   primary key (idProdi, npp),
   constraint FK_DOSENDAN_DOSENDALA_PRODI foreign key (idProdi)
      references Prodi (idProdi) on delete restrict on update restrict,
   constraint FK_DOSENDAN_PRODIDALA_DOSEN foreign key (npp)
      references Dosen (npp) on delete restrict on update restrict
);

INSERT INTO User VALUES ("Admin", "Admin","Admin");