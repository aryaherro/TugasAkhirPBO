/***********************************************************************
 * Module:  manusia.java
 * Author:  Ajeng
 * Purpose: Defines the Class manusia
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 84fd98fc-0744-4a64-93ac-8373ffff5219 */
public class manusia {
   /** @pdOid c47f606e-9c2b-45b7-a71d-75acfd1f1e31 */
   private String nama;
   /** @pdOid 43287800-dced-4f4d-93b2-3aeaa7612b11 */
   private String nik;
   /** @pdOid cb9b1446-04b9-4d41-8fdf-eb197e5f8836 */
   private String tanggalLahir;
   /** @pdOid 9fe40f85-94a5-4c47-8fe0-0c9427a28884 */
   private char jenisKelamin;
   /** @pdOid 84e958ba-3562-4cfe-a1bb-fdd2a068b0cd */
   private String alamat;
   /** @pdOid c75fecef-38d3-42d8-ae4b-132773be298a */
   private String email;
   /** @pdOid 7344292a-c3d4-4d1c-9739-1bce09d93698 */
   private String agama;
   
   /** @pdOid c7d8db71-9d2e-4447-bfb6-964120e32b03 */
   public manusia() {
      // TODO: implement
   }
   
   /** @pdOid 433d76d7-41c9-444e-b587-7c1f0d383bc5 */
   public String getnama() {
      return nama;
   }
   
   /** @param newNama
    * @pdOid 392ef787-f992-4d70-b24b-3c5b79db2d68 */
   public void setnama(String newNama) {
      nama = newNama;
   }
   
   /** @pdOid cab1ed83-34a3-4e4a-ad9e-e0fa65c9f6ef */
   public String getnik() {
      return nik;
   }
   
   /** @param newNik
    * @pdOid 0eaa50ac-6757-4db5-b691-a5e242dd8ba8 */
   public void setnik(String newNik) {
      nik = newNik;
   }
   
   /** @pdOid 354118d0-a891-4073-bc9a-961a2ccad215 */
   public String gettanggalLahir() {
      return tanggalLahir;
   }
   
   /** @param newTanggalLahir
    * @pdOid 46eaee38-51c5-4fda-86ba-0bd3700add40 */
   public void settanggalLahir(String newTanggalLahir) {
      tanggalLahir = newTanggalLahir;
   }
   
   /** @pdOid 5507b5fb-b6f6-4f40-a51f-da43d0d4b4d1 */
   public char getjenisKelamin() {
      return jenisKelamin;
   }
   
   /** @param newJenisKelamin
    * @pdOid 5260035b-76d5-4560-b4ae-af5d41301a1e */
   public void setjenisKelamin(char newJenisKelamin) {
      jenisKelamin = newJenisKelamin;
   }
   
   /** @pdOid 0e14729d-89f6-4ed1-a512-bcab23950140 */
   public String getalamat() {
      return alamat;
   }
   
   /** @param newAlamat
    * @pdOid 2a2401c8-ed03-478f-bc4b-4e449d5a684c */
   public void setalamat(String newAlamat) {
      alamat = newAlamat;
   }
   
   /** @pdOid 151ea05c-7bd4-4b4a-943f-69d068a9a85b */
   public String getemail() {
      return email;
   }
   
   /** @param newEmail
    * @pdOid 6355593e-f73e-433d-9632-262009ee7143 */
   public void setemail(String newEmail) {
      email = newEmail;
   }
   
   /** @pdOid 43691123-da19-41b0-9d78-dc5c6dd7c1f0 */
   public String getagama() {
      return agama;
   }
   
   /** @param newAgama
    * @pdOid f2b2ca3a-55b1-4fad-89ea-34eb94b1c02a */
   public void setagama(String newAgama) {
      agama = newAgama;
   }

}