/***********************************************************************
 * Module:  JadwalSeminar.java
 * Author:  Ajeng
 * Purpose: Defines the Class JadwalSeminar
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid ff476954-2cfc-4f88-869b-f98eff99f965 */
public class JadwalSeminar {
   /** @pdOid 4da5ae69-a7b4-4e6a-8f44-3bd0a2002517 */
   private String idJadwal;
   /** @pdOid b999dd8b-e31d-4f92-9ec0-ee4cc2233881 */
   private String jadwal;
   
   /** @pdRoleInfo migr=no name=Mahasiswa assc=association10 mult=0..1 side=A */
   public Mahasiswa MahasiswaDalamJadwalSeminar;
   
   /** @pdOid b8be38bb-13d2-45b1-8b41-7b8f07bfbf65 */
   public JadwalSeminar() {
      // TODO: implement
   }
   
   /** @pdOid a1ccacef-c3b9-4d04-a383-3575018bee7e */
   public String getIdJadwal() {
      return idJadwal;
   }
   
   /** @param newIdJadwal
    * @pdOid 694061c4-af45-4fef-927d-30cc7111c12a */
   public void setIdJadwal(String newIdJadwal) {
      idJadwal = newIdJadwal;
   }
   
   /** @pdOid 5972df07-3a24-47f2-b93f-7389e03e25b1 */
   public String getJadwal() {
      return jadwal;
   }
   
   /** @param newJadwal
    * @pdOid 70562bca-083a-49be-979e-a42820375953 */
   public void setJadwal(String newJadwal) {
      jadwal = newJadwal;
   }

}