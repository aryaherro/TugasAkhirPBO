/***********************************************************************
 * Module:  revisi.java
 * Author:  Ajeng
 * Purpose: Defines the Class revisi
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid b383390d-f37d-43ed-9b37-1b889e5deb4d */
public class revisi {
   /** @pdOid 0acbb9a7-77b9-4a3b-a166-72c16dfb5ef5 */
   private int idRevisi;
   /** @pdOid 6ad7fd13-d598-4982-ad02-9852785e0df9 */
   private String isiRevisi;
   /** @pdOid f9f8e64e-11de-4ab7-9129-c62937a8cce2 */
   private Date tanggalRevisi;
   
   /** @pdRoleInfo migr=no name=judul assc=judulMemilikiRevisi mult=1..1 */
   public judul judul;
   
   /** @pdOid dacfdd7a-6c25-4606-8c67-5eb04bdb5356 */
   public revisi() {
      // TODO: implement
   }
   
   /** @pdOid 3c80dd1c-9739-4dda-bd42-9d09fa71ec65 */
   public int getidRevisi() {
      return idRevisi;
   }
   
   /** @param newIdRevisi
    * @pdOid 5ec30503-7178-4c47-b32b-849ad9ef672d */
   public void setidRevisi(int newIdRevisi) {
      idRevisi = newIdRevisi;
   }
   
   /** @pdOid 4ca503de-1b71-4e62-bef0-8161c6c30997 */
   public String getisiRevisi() {
      return isiRevisi;
   }
   
   /** @param newIsiRevisi
    * @pdOid bff2c0af-38d2-4d48-9eaf-1dd069a4c10a */
   public void setisiRevisi(String newIsiRevisi) {
      isiRevisi = newIsiRevisi;
   }
   
   /** @pdOid bd6860cd-8ac6-4524-8375-457a79a9a05e */
   public Date gettanggalRevisi() {
      return tanggalRevisi;
   }
   
   /** @param newTanggalRevisi
    * @pdOid 73f47c45-991f-44a9-90f2-8d1ea64854ad */
   public void settanggalRevisi(Date newTanggalRevisi) {
      tanggalRevisi = newTanggalRevisi;
   }

}