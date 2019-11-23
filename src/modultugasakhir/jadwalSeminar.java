package modultugasakhir;

/***********************************************************************
 * Module:  JadwalSeminar.java
 * Author:  Ajeng
 * Purpose: Defines the Class JadwalSeminar
 ***********************************************************************/

/** @pdOid e4e8551f-de74-4e50-9e79-e55094d0b390 */
public class JadwalSeminar {
   /** @pdOid 1cdffe73-ab06-4244-98e6-986364e99d53 */
   private String idJadwal;
   /** @pdOid 27618ae3-e28d-4e4b-b831-51e007f0d0b4 */
   private String jadwal;

   /** @pdRoleInfo migr=no name=BeritaAcara assc=lanjut coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public BeritaAcara beritaAcara;

   /** @pdOid 4a20dab4-d435-421c-9a04-565d6082a07a */
   public void jadwalSeminar() {
      // TODO: implement
   }

   /**
     * @return  *  @pdOid d1a1d327-031e-4eb3-9a8e-9fb7dee8569c */
   public String getIDJadwal() {
      return idJadwal;
   }

   /** @param newIDJadwal
    * @pdOid fafefaa6-ad37-45fe-acee-ea42ba4f9b09 */
   public void setIDJadwal(String newIDJadwal) {
      idJadwal = newIDJadwal;
   }

   /**
     * @return  *  @pdOid ebecfd7c-b5d7-469f-8869-11c2b3f1c0f6 */
   public String getJadwal() {
      return jadwal;
   }

   /** @param newJadwal
    * @pdOid ee84dd10-0792-4f29-af70-1b0b6fe806b0 */
   public void setJadwal(String newJadwal) {
      jadwal = newJadwal;
   }

}
