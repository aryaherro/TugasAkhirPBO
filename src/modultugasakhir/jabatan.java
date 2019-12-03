/***********************************************************************
 * Module:  jabatan.java
 * Author:  Ajeng
 * Purpose: Defines the Class jabatan
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid d42a7064-f962-4cf0-8a26-21e772b55cb1 */
public class jabatan {
   /** @pdOid 071a17b1-b995-47c8-9206-10db01d68c7d */
   private int idJabatan;
   /** @pdOid cf1b5934-7ec6-433d-a31d-2be5b60c84fa */
   private String namaJabatan;
   
   /** @pdRoleInfo migr=no name=dosen assc=dosenMenjabatSebagai coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public dosen dosen;
   
   /** @pdOid 9f7029ef-201d-4b8e-bfb7-7423f50ab6de */
   public jabatan() {
      // TODO: implement
   }
   
   /** @pdOid a66b8e56-945f-4c90-af11-a53a6dfa1f74 */
   public int getidJabatan() {
      return idJabatan;
   }
   
   /** @param newIdJabatan
    * @pdOid 95b71f73-128b-4317-ad1f-e77273f202d0 */
   public void setidJabatan(int newIdJabatan) {
      idJabatan = newIdJabatan;
   }
   
   /** @pdOid 120402a3-f456-4e7b-bbc6-13e9488315ca */
   public String getnamaJabatan() {
      return namaJabatan;
   }
   
   /** @param newNamaJabatan
    * @pdOid 4a8a1c17-92d8-4c1c-affe-80058ce9c12e */
   public void setnamaJabatan(String newNamaJabatan) {
      namaJabatan = newNamaJabatan;
   }

}