/***********************************************************************
 * Module:  jadwalSeminar.java
 * Author:  Ajeng
 * Purpose: Defines the Class jadwalSeminar
 ***********************************************************************/

package modultugasakhir;

/** @pdOid fe0e0153-61c6-44bd-8445-fe4a56d108d6 */
public class jadwalSeminar {
   /** @pdOid f5145d5d-12a4-46ee-a562-408e7b15bfe9 */
   private int idJadwal;
   /** @pdOid bf2e8b82-a0d9-465a-be59-4131b85b889a */
   private String jadwal;
   
   /** @pdRoleInfo migr=no name=mahasiswa assc=mahasiswaMelihatJadwal coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   private mahasiswa mahasiswa;
   
   /** @pdOid 9ccb7d96-3d00-4afa-aa22-ec19e5b4588b */
   public jadwalSeminar() {
      // TODO: implement
   }
   
   /**
     * @return  *  @pdOid eddc6a92-c7a9-4596-904b-56fe54724919 */
   public int getidJadwal() {
      return idJadwal;
   }
   
   /** @param newIdJadwal
    * @pdOid 25fb9ac2-f863-4f02-8ad0-959034620eef */
   public void setidJadwal(int newIdJadwal) {
      idJadwal = newIdJadwal;
   }
   
   /**
     * @return  *  @pdOid fe51b13f-5b03-4545-a538-39fb4259b20c */
   public String getjadwal() {
      return jadwal;
   }
   
   /** @param newJadwal
    * @pdOid c8dee733-1989-40da-9191-8985f57ec718 */
   public void setjadwal(String newJadwal) {
      jadwal = newJadwal;
   }

}