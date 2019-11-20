/***********************************************************************
 * Module:  manusia.java
 * Author:  Ajeng
 * Purpose: Defines the Class manusia
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 5584844c-ef95-4b28-8500-3403ac7aad80 */
public class manusia {
   /** @pdOid 4a695443-df84-4dee-8e9f-ab61893107ad */
   private String nama;
   /** @pdOid 140bb309-cbf3-4d3d-8671-95315b33e135 */
   private String nik;
   /** @pdOid cd65e2d0-5fc6-4cd7-846c-c21a76ba4053 */
   private String tanggalLahir;
   /** @pdOid 6070f14e-e55d-4b20-a5b6-1457460446cb */
   private char jenisKelamin;
   /** @pdOid 1b58cd42-f920-468d-aea4-72fc8a6e23e8 */
   private String alamat;
   /** @pdOid f976c24b-7541-499f-95ff-0e1ac593ebaa */
   private String email;
   /** @pdOid 55b1c598-8e17-47cc-9fe7-dbad4d90ed19 */
   private String agama;
   
   /** @pdOid 3bfdfc1e-1ebc-43b9-ab47-2b016e5bec31 */
   public manusia() {
      // TODO: implement
   }
   
   /** @pdOid e8cbfd68-9f50-4593-aadd-b8dd4849a74e */
   public String getnama() {
      return nama;
   }
   
   /** @param newNama
    * @pdOid 69a2f4d3-b61d-4247-9d7e-b8ea34d80be1 */
   public void setnama(String newNama) {
      nama = newNama;
   }
   
   /** @pdOid a2971cce-5b9e-4a51-87ec-90984f3b67c1 */
   public String getnik() {
      return nik;
   }
   
   /** @param newNik
    * @pdOid 0ed03c90-6afd-49a7-a88d-38f36427b708 */
   public void setnik(String newNik) {
      nik = newNik;
   }
   
   /** @pdOid 19d7d018-6b1d-4fc3-b601-7fa22712b424 */
   public String gettanggalLahir() {
      return tanggalLahir;
   }
   
   /** @param newTanggalLahir
    * @pdOid a8b1a1ae-997c-4189-81bb-e3c9ff88c4a2 */
   public void settanggalLahir(String newTanggalLahir) {
      tanggalLahir = newTanggalLahir;
   }
   
   /** @pdOid f07fba8f-284a-4d48-afad-941922ae4488 */
   public char getjenisKelamin() {
      return jenisKelamin;
   }
   
   /** @param newJenisKelamin
    * @pdOid a1b546c6-3c36-4e6a-aae5-988c1ac56cff */
   public void setjenisKelamin(char newJenisKelamin) {
      jenisKelamin = newJenisKelamin;
   }
   
   /** @pdOid eaa9ed6d-1425-4a1e-aec4-6a78b79a84a2 */
   public String getalamat() {
      return alamat;
   }
   
   /** @param newAlamat
    * @pdOid 5cff7265-244b-413e-9ff5-c10088900a53 */
   public void setalamat(String newAlamat) {
      alamat = newAlamat;
   }
   
   /** @pdOid 8d36ab02-72ce-461d-8a7c-f416414019b9 */
   public String getemail() {
      return email;
   }
   
   /** @param newEmail
    * @pdOid 3fbdb10e-0e3e-4a25-b676-a49408d0c1b1 */
   public void setemail(String newEmail) {
      email = newEmail;
   }
   
   /** @pdOid 0f5a8b8a-ebf4-4861-9278-96916964a7cf */
   public String getagama() {
      return agama;
   }
   
   /** @param newAgama
    * @pdOid 61252c2a-ad9a-4586-adc7-18b29e73aa56 */
   public void setagama(String newAgama) {
      agama = newAgama;
   }

}