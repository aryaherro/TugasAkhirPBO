/***********************************************************************
 * Module:  Judul.java
 * Author:  Ajeng
 * Purpose: Defines the Class Judul
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid efaf61e9-76fe-44e4-984c-1562cf4d562f */
public class Judul {
   /** @pdOid 3ba606df-ac24-445f-9e81-9ef0c4caa8ad */
   private String idJudul;
   /** @pdOid 32b27bf1-4678-4f32-ad26-b3ce694d229f */
   private String namaJudul;
   /** @pdOid 019b77e1-a929-44c7-b7e4-2e57e27f6020 */
   private String deskripsi;
   
   /** @pdRoleInfo migr=no name=Mahasiswa assc=association4 mult=1..1 side=A */
   public Mahasiswa Mahasiswa;
   
   /** @pdOid 5cc4953e-47d4-424a-ad79-e570745d6bcb */
   public Judul() {
      // TODO: implement
   }
   
   /** @pdOid c452d560-bd1c-41cb-94a9-59e89f72742a */
   public String getIdJudul() {
      return idJudul;
   }
   
   /** @param newIdJudul
    * @pdOid 68716cfa-dd1b-4c5e-9d3f-f9f6060c7f00 */
   public void setidJudul(String newIdJudul) {
      idJudul = newIdJudul;
   }
   
   /** @pdOid d2ab59e2-808d-449b-b14b-0b28e2b8d36b */
   public String getNamaJudul() {
      return namaJudul;
   }
   
   /** @param newNamaJudul
    * @pdOid bf0d17b1-c579-4f2f-ad3f-90de17ea15b6 */
   public void setnamaJudul(String newNamaJudul) {
      namaJudul = newNamaJudul;
   }
   
   /** @pdOid e2295641-3f39-4f57-8f12-ec45f545dbd2 */
   public String getdeskripsi() {
      return deskripsi;
   }
   
   /** @param newDeskripsi
    * @pdOid 29377972-4939-43c6-8965-6efa959eaba4 */
   public void setdeskripsi(String newDeskripsi) {
      deskripsi = newDeskripsi;
   }

}