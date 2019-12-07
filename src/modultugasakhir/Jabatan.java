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
   public Dosen Dosen;
   
   /** @pdOid b64ee835-35dc-4dd9-90ee-487dd4339c4b */
   public Jabatan() {
      // TODO: implement
   }
   
   /** @pdOid 01f1ccb0-02f5-4589-862e-20bb80c43ea5 */
   public String getIdJabatan() {
      return idJabatan;
   }
   
   /** @param newIdJabatan
    * @pdOid 2d172c03-cf98-4940-96ad-f9a6afdddefb */
   public void setidJabatan(String newIdJabatan) {
      idJabatan = newIdJabatan;
   }
   
   /** @pdOid 2054c640-dae6-438e-a5fc-a85a87a522c2 */
   public String getNamaJabatan() {
      return namaJabatan;
   }
   
   /** @param newNamaJabatan
    * @pdOid 0f69134a-931a-4476-957d-32107b041b74 */
   public void setnamaJabatan(String newNamaJabatan) {
      namaJabatan = newNamaJabatan;
   }

}