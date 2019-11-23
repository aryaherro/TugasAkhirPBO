package modultugasakhir;

/***********************************************************************
 * Module:  BeritaAcara.java
 * Author:  Ajeng
 * Purpose: Defines the Class BeritaAcara
 ***********************************************************************/

/** @pdOid a6dbc9fb-a50f-4f87-ad89-66d37b851a54 */
public class BeritaAcara {
   /** @pdOid 97f6c35e-9f20-4ab6-8007-cbc74d05543b */
   private String idBeritaAcara;
   /** @pdOid 82378091-6d07-43a5-a078-7c6b0fddcd2f */
   private String isiBeritaAcara;
   
   /** @pdRoleInfo migr=no name=Dosen assc=dilihatDosen coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Dosen dosen;
   
   /** @pdOid 8c79a234-4b39-4200-8937-5d214649f61c */
   public void beritaAcara() {
      // TODO: implement
   }
   
   /**
     * @return  *  @pdOid 87887735-ac54-4d79-a54c-f05bf14092b6 */
   public String getIDBeritaAcara() {
      return idBeritaAcara;
   }
   
   /** @param newIDBeritaAcara
    * @pdOid 11af66a9-073e-465d-af61-4966b2c79c7a */
   public void setIDBeritaAcara(String newIDBeritaAcara) {
      idBeritaAcara = newIDBeritaAcara;
   }
   
   /**
     * @return  *  @pdOid 75b45aa2-4d9f-4990-a1ba-31053042edc3 */
   public String getIsiBeritaAcara() {
      return isiBeritaAcara;
   }
   
   /** @param newIsiBeritaAcara
    * @pdOid e3710af9-d3a3-45f3-9970-926cfcbd82ae */
   public void setIsiBeritaAcara(String newIsiBeritaAcara) {
      isiBeritaAcara = newIsiBeritaAcara;
   }

}