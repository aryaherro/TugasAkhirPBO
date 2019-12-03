/***********************************************************************
 * Module:  jadwalSeminar.java
 * Author:  Ajeng
 * Purpose: Defines the Class jadwalSeminar
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 4bb72e05-b48a-4b26-a109-dc11b89122a6 */
public class jadwalSeminar {
   /** @pdOid 5e99d88d-2f03-4b51-a585-7d2d56c9902c */
   private int idJadwal;
   /** @pdOid 1cf9e3c1-a610-49db-81cc-a7840081b3f5 */
   private String jadwal;
   
   /** @pdRoleInfo migr=no name=mahasiswa assc=mahasiswaMelihatJadwal coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public mahasiswa mahasiswa;
   /** @pdRoleInfo migr=no name=dosen assc=dosenMelihatJadwal coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public dosen dosen;
   
   /** @pdOid c12f67ec-9de9-4e38-be9b-5283a2452008 */
   public jadwalSeminar() {
      // TODO: implement
   }
   
   /** @pdOid eecb4f37-651c-48a3-a02d-0a2d0c848c71 */
   public int getidJadwal() {
      return idJadwal;
   }
   
   /** @param newIdJadwal
    * @pdOid 351e2405-24c7-4d3b-941a-8b61f1dbf142 */
   public void setidJadwal(int newIdJadwal) {
      idJadwal = newIdJadwal;
   }
   
   /** @pdOid 20f1beba-5e83-41e7-ba03-17de8e91b7a3 */
   public String getjadwal() {
      return jadwal;
   }
   
   /** @param newJadwal
    * @pdOid 708a0973-1fad-4bea-94a5-9b943059ccb2 */
   public void setjadwal(String newJadwal) {
      jadwal = newJadwal;
   }

}