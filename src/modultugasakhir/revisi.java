/***********************************************************************
 * Module:  revisi.java
 * Author:  Ajeng
 * Purpose: Defines the Class revisi
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 7ab0d3c4-95ad-42b4-9631-040960023254 */
public class revisi {
   /** @pdOid fe77b6d1-f7fe-4649-9d1d-42532acbe8e5 */
   private int idRevisi;
   /** @pdOid eead993d-0f93-49d3-a77e-f8612de81be3 */
   private String isiRevisi;
   /** @pdOid bdea137f-9bca-46f0-9a6f-5e0a3ed2e8e0 */
   private Date tanggalRevisi;
   
   /** @pdRoleInfo migr=no name=judul assc=judulMemilikiRevisi coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public judul judul;
   /** @pdRoleInfo migr=no name=dosen assc=dosenMenuliskanRevisi coll=java.util.Collection impl=java.util.HashSet mult=1..1 side=A */
   public dosen dosen;
   
   /** @pdOid 34537697-e5e5-4438-aa52-dbd53315addc */
   public revisi() {
      // TODO: implement
   }
   
   /** @pdOid 5e3ed376-98b0-4b46-8219-adc5ac0e0db8 */
   public int getidRevisi() {
      return idRevisi;
   }
   
   /** @param newIdRevisi
    * @pdOid b55fd7a5-208d-42a1-96dc-68ad3fc7f829 */
   public void setidRevisi(int newIdRevisi) {
      idRevisi = newIdRevisi;
   }
   
   /** @pdOid 22e09b25-8b1d-4169-9d96-83d29b50a58c */
   public String getisiRevisi() {
      return isiRevisi;
   }
   
   /** @param newIsiRevisi
    * @pdOid d5d9fbb1-afeb-4535-800b-ceac81aa4c30 */
   public void setisiRevisi(String newIsiRevisi) {
      isiRevisi = newIsiRevisi;
   }
   
   /** @pdOid 42651afe-f9e1-46ef-b56d-c990fbdad4b9 */
   public Date gettanggalRevisi() {
      return tanggalRevisi;
   }
   
   /** @param newTanggalRevisi
    * @pdOid 31af014b-6113-4d0a-9b2b-ea49e05eeb12 */
   public void settanggalRevisi(Date newTanggalRevisi) {
      tanggalRevisi = newTanggalRevisi;
   }

}