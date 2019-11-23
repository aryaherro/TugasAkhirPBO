/***********************************************************************
 * Module:  jadwalSeminar.java
 * Author:  Ajeng
 * Purpose: Defines the Class jadwalSeminar
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid f99c73bb-1de1-4f7e-8728-4a846c95a123 */
public class jadwalSeminar {
   /** @pdOid 99f568a9-4c8a-4cfd-8fa3-98279d07b576 */
   private int idJadwal;
   /** @pdOid 2ed70d90-9c39-4643-9af5-90c3612731f2 */
   private String jadwal;
   
   /** @pdRoleInfo migr=no name=mahasiswa assc=mahasiswaMelihatJadwal coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public mahasiswa mahasiswa;
   
   /** @pdOid a0ea2a99-6303-4570-9268-5358acbd6c3e */
   public jadwalSeminar() {
      // TODO: implement
   }
   
   /** @pdOid 43b5b23f-1278-4878-be48-c06684f3a5fa */
   public int getidJadwal() {
      return idJadwal;
   }
   
   /** @param newIdJadwal
    * @pdOid 43aab48f-f94d-40d8-9e32-84826fbd850a */
   public void setidJadwal(int newIdJadwal) {
      idJadwal = newIdJadwal;
   }
   
   /** @pdOid 9d868237-2714-4ce0-8a5b-a2534400e026 */
   public String getjadwal() {
      return jadwal;
   }
   
   /** @param newJadwal
    * @pdOid 1153ea4c-7e68-4c74-982b-b62fd6a9c3ca */
   public void setjadwal(String newJadwal) {
      jadwal = newJadwal;
   }

}