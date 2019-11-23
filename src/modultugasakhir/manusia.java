/***********************************************************************
 * Module:  manusia.java
 * Author:  Ajeng
 * Purpose: Defines the Class manusia
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid cedd4ce0-6260-4948-98a4-b9b6cc024403 */
public class manusia {
   /** @pdOid 30c60689-c002-4a11-8e87-080fe1a6ba65 */
   private String nama;
   /** @pdOid 180cfe2d-85e3-47c5-a785-ccef947b2439 */
   private String nik;
   /** @pdOid aee4e53d-b8a9-4033-b334-1db338f1c1fc */
   private String tanggalLahir;
   /** @pdOid 0a4a6e70-f22b-40e6-8257-dcec1843316a */
   private char jenisKelamin;
   /** @pdOid 55d1d081-88f3-4546-bf0a-4dca555227d0 */
   private String alamat;
   /** @pdOid d206a2f2-77b4-481e-ae74-2e6d2ce0d5f5 */
   private String email;
   /** @pdOid d3c8ce12-b5e1-4980-91a1-5836c7a938d5 */
   private String agama;
   
   /** @pdOid 20e59882-c41a-433f-b23e-3d47bd54a0cd */
   public manusia() {
      // TODO: implement
   }
   
   /** @pdOid 1c175e4c-58bd-4851-a4b6-480ac6bb768e */
   public String getnama() {
      return nama;
   }
   
   /** @param newNama
    * @pdOid ef1f1831-12fa-459e-b6d4-e6f7cb2f7aa3 */
   public void setnama(String newNama) {
      nama = newNama;
   }
   
   /** @pdOid 6cfc06ae-5f1a-4f4e-a37e-6fb29aaa6007 */
   public String getnik() {
      return nik;
   }
   
   /** @param newNik
    * @pdOid a87d0848-0037-4b32-b3b0-4263e1ed3d0c */
   public void setnik(String newNik) {
      nik = newNik;
   }
   
   /** @pdOid c49d146b-ec8f-4a0f-9315-269b71703849 */
   public String gettanggalLahir() {
      return tanggalLahir;
   }
   
   /** @param newTanggalLahir
    * @pdOid 6f301436-eef8-417a-a450-465afec34356 */
   public void settanggalLahir(String newTanggalLahir) {
      tanggalLahir = newTanggalLahir;
   }
   
   /** @pdOid 7d5a8575-d546-4f37-a550-b8dafcc61b6a */
   public char getjenisKelamin() {
      return jenisKelamin;
   }
   
   /** @param newJenisKelamin
    * @pdOid 03b3d83b-b1d9-40a3-b1f8-42a0ab6ea86b */
   public void setjenisKelamin(char newJenisKelamin) {
      jenisKelamin = newJenisKelamin;
   }
   
   /** @pdOid 0f2e02c0-9ded-4f37-8dbb-85711d8c7532 */
   public String getalamat() {
      return alamat;
   }
   
   /** @param newAlamat
    * @pdOid e107470d-5e2b-41c9-b88b-7f1e528730f2 */
   public void setalamat(String newAlamat) {
      alamat = newAlamat;
   }
   
   /** @pdOid 4ace9146-81da-4d37-a444-c38b3cbdd3c5 */
   public String getemail() {
      return email;
   }
   
   /** @param newEmail
    * @pdOid 72186b0f-0dc2-430a-be49-e9b8e46f51a0 */
   public void setemail(String newEmail) {
      email = newEmail;
   }
   
   /** @pdOid cd73f746-4227-4b55-8afd-8eed6c1e663a */
   public String getagama() {
      return agama;
   }
   
   /** @param newAgama
    * @pdOid 8702fb7b-fd64-4bb8-b614-e9b19403876a */
   public void setagama(String newAgama) {
      agama = newAgama;
   }

}