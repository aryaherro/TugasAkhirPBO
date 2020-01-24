/***********************************************************************
 * Module:  Manusia.java
 * Author:  Ajeng
 * Purpose: Defines the Class Manusia
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 15bfc019-0562-4e90-866b-e5420213b36a */
public class Manusia {
   /** @pdOid ab29fec6-e063-47eb-9c8d-bc06c7047bb1 */
   private String nama;
   /** @pdOid dcff29dd-39da-4913-abfd-392f9719ec7f */
   private String nik;
   /** @pdOid 86e2672f-9ce0-4852-8213-f1d3eb2180dd */
   private java.util.Date tanggalLahir;
   /** @pdOid d7caf755-43c0-414f-b422-2a6691439b04 */
   private char jenisKelamin;
   /** @pdOid e4c97633-3962-4517-8214-cd380b624218 */
   private String alamat;
   /** @pdOid 82f7c2a5-b1af-43ff-a62a-0f009e0fffe5 */
   private String email;
   /** @pdOid 75e215bd-5906-4e64-b22f-ba7c3ad4925f */
   private String agama;
   
   /** @pdOid 886c3b42-f39b-495d-b288-9e2a27674f4c */
   public Manusia() {
      // TODO: implement
   }
   
   public Manusia(String nama, String nik, java.util.Date tanggalLahir, char jenisKelamin, String alamat, String email, String agama) {
      // TODO: implement
       setNama(nama);
       setNik(nik);
       setTanggalLahir(tanggalLahir);
       setJenisKelamin(jenisKelamin);
       setAlamat(alamat);
       setEmail(email);
       setAgama(agama);
   }
   
   /** @pdOid d2d2f646-45f7-4e2e-a454-7acd0488e0e6 */
   public String getNama() {
      return nama;
   }
   
   /** @param newNama
    * @pdOid 417380ac-25f0-4d0b-8333-d9aad105ea6b */
   public void setNama(String newNama) {
      nama = newNama;
   }
   
   /** @pdOid 6bfd27a8-828a-44cf-ba68-a06dc098aae6 */
   public String getNik() {
      return nik;
   }
   
   /** @param newNik
    * @pdOid 1acca3ff-ebeb-45db-9944-36854f734d0c */
   public void setNik(String newNik) {
      nik = newNik;
   }
   
   /** @pdOid f028061f-5153-405f-b137-a6ff10b71ed7 */
   public Date getTanggalLahir() {
      return tanggalLahir;
   }
   
   /** @param newTanggalLahir
    * @pdOid 9cb5b444-b832-4b1d-84b0-77dc6f5f5f44 */
   public void setTanggalLahir(Date newTanggalLahir) {
      tanggalLahir = newTanggalLahir;
   }
   
   /** @pdOid ee40f63c-c423-4073-b68b-a08db7358c01 */
   public char getJenisKelamin() {
      return jenisKelamin;
   }
   
   /** @param newJenisKelamin
    * @pdOid 7028a1e7-dafd-4447-a8c7-7754b7faa93e */
   public void setJenisKelamin(char newJenisKelamin) {
      jenisKelamin = newJenisKelamin;
   }
   
   /** @pdOid c65522b6-bef2-40bd-8762-128a9d69da2a */
   public String getAlamat() {
      return alamat;
   }
   
   /** @param newAlamat
    * @pdOid 9a37be02-d41b-42d6-b5ae-954cc4b1c90b */
   public void setAlamat(String newAlamat) {
      alamat = newAlamat;
   }
   
   /** @pdOid 3fa864ef-ddfa-40c2-9e24-4829e04a4c5d */
   public String getEmail() {
      return email;
   }
   
   /** @param newEmail
    * @pdOid 0b19e33c-b2aa-4024-8203-cddea4060b93 */
   public void setEmail(String newEmail) {
      email = newEmail;
   }
   
   /** @pdOid 64af884e-aa24-4194-b7f6-c22c0067c1e2 */
   public String getAgama() {
      return agama;
   }
   
   /** @param newAgama
    * @pdOid 3cd1f36f-0c25-4b9d-be8e-8b7046b186aa */
   public void setAgama(String newAgama) {
      agama = newAgama;
   }

}