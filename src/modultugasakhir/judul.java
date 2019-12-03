/***********************************************************************
 * Module:  judul.java
 * Author:  Ajeng
 * Purpose: Defines the Class judul
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid c385cccf-fe5a-4d42-be64-eab52ee25567 */
public class judul {
   /** @pdOid 476785cf-7960-45b0-adb3-2a722d9d881c */
   private int idJudul;
   /** @pdOid ebf1cb2d-3356-4e0b-b24e-f666cf5008fb */
   private String namaJudul;
   /** @pdOid d43d79a7-0ff7-4bf3-8126-b54e75a63bfe */
   private String deskripsi;
   
   /** @pdRoleInfo migr=no name=mahasiswa assc=mahasiswaMengajukanJudul coll=java.util.Collection impl=java.util.HashSet mult=1..1 side=A */
   public mahasiswa mahasiswa;
   
   /** @pdOid a3322a80-753e-4869-b935-4da9a4bf58bf */
   public judul() {
      // TODO: implement
   }
   
   /** @pdOid d9c4b13f-7376-4ab5-befa-815dc46e3906 */
   public int getidJudul() {
      return idJudul;
   }
   
   /** @param newIdJudul
    * @pdOid e94f21fc-bf99-426d-8cd5-d133944c1f6c */
   public void setidJudul(int newIdJudul) {
      idJudul = newIdJudul;
   }
   
   /** @pdOid b53d0f86-3efa-4878-ac3a-c2b2b5decad8 */
   public String getnamaJudul() {
      return namaJudul;
   }
   
   /** @param newNamaJudul
    * @pdOid ff98f9da-df5d-489a-9b91-b4f2cd179896 */
   public void setnamaJudul(String newNamaJudul) {
      namaJudul = newNamaJudul;
   }
   
   /** @pdOid 9e00d2c1-7c01-437c-8bc7-41ce9cdc2b39 */
   public String getdeskripsi() {
      return deskripsi;
   }
   
   /** @param newDeskripsi
    * @pdOid 8f5f86b7-db23-41b0-acf4-b3e7d120b22c */
   public void setdeskripsi(String newDeskripsi) {
      deskripsi = newDeskripsi;
   }

}