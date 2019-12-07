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
   public Mahasiswa Mahasiswa;
   
   /** @pdOid b8be38bb-13d2-45b1-8b41-7b8f07bfbf65 */
   public JadwalSeminar() {
      // TODO: implement
   }
   
   /** @pdOid 2b1da373-966a-4dff-b365-b3d1dc2c302b */
   public String getIdJadwal() {
      return idJadwal;
   }
   
   /** @param newIdJadwal
    * @pdOid 5aa2f998-c5d7-4fec-bbe5-02725c3c63d7 */
   public void setidJadwal(String newIdJadwal) {
      idJadwal = newIdJadwal;
   }
   
   /** @pdOid 942e19c4-8c7f-4a2c-8c2d-760d43d752ca */
   public String getJadwal() {
      return jadwal;
   }
   
   /** @param newJadwal
    * @pdOid cd8209ab-532d-43ab-9e0e-939f374a637b */
   public void setjadwal(String newJadwal) {
      jadwal = newJadwal;
   }

}