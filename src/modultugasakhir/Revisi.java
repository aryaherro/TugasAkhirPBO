/***********************************************************************
 * Module:  Revisi.java
 * Author:  Ajeng
 * Purpose: Defines the Class Revisi
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 59b4f08f-f7e0-41ba-80a9-b92ddfb10497 */
public class Revisi {
   /** @pdOid 4c9d5cdb-40e7-4019-b692-3db478033817 */
   private String idRevisi;
   /** @pdOid f5000b06-f483-4b1b-acdd-a48be9f46ad4 */
   private String isiRevisi;
   /** @pdOid 6a55977a-c384-41d5-81e3-d37b6c14b220 */
   private Date tanggalRevisi;
   
   /** @pdRoleInfo migr=no name=Judul assc=association5 mult=1..1 side=A */
   public Judul Judul;
   
   /** @pdOid c43d82aa-321b-4a6f-9d09-7f283a1ce4fa */
   public Revisi() {
      // TODO: implement
   }
   
   /** @pdOid 6c77acf7-5f22-4ecf-8ad6-0db5db2bbf6a */
   public String getIdRevisi() {
      return idRevisi;
   }
   
   /** @param newIdRevisi
    * @pdOid 32fa2aad-ebaa-453d-b978-e67b644cb4da */
   public void setidRevisi(String newIdRevisi) {
      idRevisi = newIdRevisi;
   }
   
   /** @pdOid 9193de84-5037-48d1-ba88-6f4551258062 */
   public String getIsiRevisi() {
      return isiRevisi;
   }
   
   /** @param newIsiRevisi
    * @pdOid 731f987a-27c0-4363-9977-3abe56c559a0 */
   public void setisiRevisi(String newIsiRevisi) {
      isiRevisi = newIsiRevisi;
   }
   
   /** @pdOid 1c1a023d-8f6c-4531-8b28-e4ebd47af437 */
   public Date getTanggalRevisi() {
      return tanggalRevisi;
   }
   
   /** @param newTanggalRevisi
    * @pdOid abd512ee-bf62-4c55-a4ff-a5c4e794a35e */
   public void settanggalRevisi(Date newTanggalRevisi) {
      tanggalRevisi = newTanggalRevisi;
   }

}