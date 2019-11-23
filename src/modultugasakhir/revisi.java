/***********************************************************************
 * Module:  revisi.java
 * Author:  Ajeng
 * Purpose: Defines the Class revisi
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 6f4db3f1-caaf-4482-8613-5c380e752624 */
public class revisi {
   /** @pdOid d828a1ce-ba01-4a20-85a2-8668d5d660bc */
   private int idRevisi;
   /** @pdOid d4f2f3e5-ff9c-4aa8-be84-dc90694eb116 */
   private String isiRevisi;
   /** @pdOid b19ae262-992d-4160-9d95-45d9fe82c1c2 */
   private Date tanggalRevisi;
   
   /** @pdRoleInfo migr=no name=judul assc=judulMemilikiRevisi coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   private judul judul;
   
   /** @pdOid 6a1975f0-4ab9-4b76-9c28-f6f05c45378b */
   public revisi() {
      // TODO: implement
   }
   
   /**
     * @return  *  @pdOid 5d1b7493-d1e2-471c-99d5-195f4277808e */
   public int getidRevisi() {
      return idRevisi;
   }
   
   /** @param newIdRevisi
    * @pdOid 69717635-ea25-4024-bebe-428e57970f96 */
   public void setidRevisi(int newIdRevisi) {
      idRevisi = newIdRevisi;
   }
   
   /**
     * @return  *  @pdOid f96cedb2-0e0d-436c-8b40-71d525251223 */
   public String getisiRevisi() {
      return isiRevisi;
   }
   
   /** @param newIsiRevisi
    * @pdOid 6a8223ec-6726-43db-ab19-eed27aacdae3 */
   public void setisiRevisi(String newIsiRevisi) {
      isiRevisi = newIsiRevisi;
   }
   
   /**
     * @return  *  @pdOid 8cc0606f-74cf-46de-82d0-732f0c8e09a5 */
   public Date gettanggalRevisi() {
      return tanggalRevisi;
   }
   
   /** @param newTanggalRevisi
    * @pdOid c45eda8f-ac31-4a5c-a683-18da97f5d16e */
   public void settanggalRevisi(Date newTanggalRevisi) {
      tanggalRevisi = newTanggalRevisi;
   }

}