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
   private String tanggalLahir;
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
   
   /** @pdOid bc7f0390-fa42-4b5c-9687-f2696d2de80d */
   public String getNama() {
      return nama;
   }
   
   /** @param newNama
    * @pdOid 4cf783af-f7f0-4d19-8174-2a828d927471 */
   public void setnama(String newNama) {
      nama = newNama;
   }
   
   /** @pdOid 46fdbe74-da8d-456b-bc6d-dd2a8bcec7a2 */
   public String getnik() {
      return nik;
   }
   
   /** @param newNik
    * @pdOid f71b59a2-017c-4c41-a1c6-488efdb31851 */
   public void setnik(String newNik) {
      nik = newNik;
   }
   
   /** @pdOid 42d5de69-a51b-434c-9c3d-8bd6597e118e */
   public String gettanggalLahir() {
      return tanggalLahir;
   }
   
   /** @param newTanggalLahir
    * @pdOid 6e2a89ee-0535-4766-8ae7-671259cfe970 */
   public void settanggalLahir(String newTanggalLahir) {
      tanggalLahir = newTanggalLahir;
   }
   
   /** @pdOid b4deddfa-d800-4038-a6ce-e8f695541ff5 */
   public char getjenisKelamin() {
      return jenisKelamin;
   }
   
   /** @param newJenisKelamin
    * @pdOid e7f45216-71c7-4e84-aa00-46f39ed80642 */
   public void setjenisKelamin(char newJenisKelamin) {
      jenisKelamin = newJenisKelamin;
   }
   
   /** @pdOid 4c0df5eb-ab3d-4e93-a857-b7c7b603fddb */
   public String getalamat() {
      return alamat;
   }
   
   /** @param newAlamat
    * @pdOid 10b9ea7f-6cb0-4ca5-b4ea-817f016707ef */
   public void setalamat(String newAlamat) {
      alamat = newAlamat;
   }
   
   /** @pdOid eeb366ed-1967-4646-81ab-6b56c46d4069 */
   public String getemail() {
      return email;
   }
   
   /** @param newEmail
    * @pdOid adb25127-d5be-41fc-9889-e7abeae83362 */
   public void setemail(String newEmail) {
      email = newEmail;
   }
   
   /** @pdOid c8ed7f45-ccba-4aee-ba3e-28f2097e0409 */
   public String getagama() {
      return agama;
   }
   
   /** @param newAgama
    * @pdOid ade35d21-f6bb-4ae2-a89a-7ab7e1fd9d5c */
   public void setagama(String newAgama) {
      agama = newAgama;
   }

}