/***********************************************************************
 * Module:  Jabatan.java
 * Author:  Ajeng
 * Purpose: Defines the Class Jabatan
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 5882c5af-60f8-40d5-8661-1f9490407925 */
public class Jabatan {
   /** @pdOid 2a4888d1-40f6-4b5e-8578-859377e01770 */
   private String idJabatan;
   /** @pdOid d526407f-58cf-4f6d-ba35-713080cf6365 */
   private String namaJabatan;
   
   /** @pdRoleInfo migr=no name=Dosen assc=association7 mult=1..1 side=A */
   public Dosen DosenDalamJabatan;
   
   /** @pdOid b64ee835-35dc-4dd9-90ee-487dd4339c4b */
   public Jabatan() {
      // TODO: implement
   }
   
   /** @pdOid 660b7125-1433-4c6f-9ce8-9f74d407f3fa */
   public String getIdJabatan() {
      return idJabatan;
   }
   
   /** @param newIdJabatan
    * @pdOid 47bdd61b-e27e-412c-a6ac-4c28bf086afd */
   public void setIdJabatan(String newIdJabatan) {
      idJabatan = newIdJabatan;
   }
   
   /** @pdOid 09a08508-b3d3-448e-b88c-c2dea1844a20 */
   public String getNamaJabatan() {
      return namaJabatan;
   }
   
   /** @param newNamaJabatan
    * @pdOid 0989b1e5-b008-48bb-90d7-04234264881d */
   public void setNamaJabatan(String newNamaJabatan) {
      namaJabatan = newNamaJabatan;
   }

}