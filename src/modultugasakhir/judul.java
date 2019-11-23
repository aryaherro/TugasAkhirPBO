/***********************************************************************
 * Module:  judul.java
 * Author:  Ajeng
 * Purpose: Defines the Class judul
 ***********************************************************************/

package modultugasakhir;

/** @pdOid 15d0092c-84fa-4a3b-a64a-4e012675204d */
public class judul {
   /** @pdOid 5e6f4cf9-640e-47a5-b397-41e454e98200 */
   private int idJudul;
   /** @pdOid be145657-fba7-4f67-9522-17ecdd3b6db9 */
   private String namaJudul;
   /** @pdOid 92acbe95-6382-40b9-b931-7b76abbeefa7 */
   private String deskripsi;
   
   /** @pdOid 085d3152-0ddc-460f-8793-b18c50f834ca */
   public judul() {
      // TODO: implement
   }
   
   /** @pdOid 281e3875-3299-4eae-a1a6-35083b793882 */
   public int getidJudul() {
      return idJudul;
   }
   
   /** @param newIdJudul
    * @pdOid 752ed17a-bcb8-443b-928f-29a63faf8954 */
   public void setidJudul(int newIdJudul) {
      idJudul = newIdJudul;
   }
   
   /** @pdOid 3d78d625-2973-456d-9dbd-435ed7571c96 */
   public String getnamaJudul() {
      return namaJudul;
   }
   
   /** @param newNamaJudul
    * @pdOid a83841c5-8757-4ac3-aca2-7c56e6b762ee */
   public void setnamaJudul(String newNamaJudul) {
      namaJudul = newNamaJudul;
   }
   
   /** @pdOid 1a76d629-89ee-4de8-9536-e21c70377499 */
   public String getdeskripsi() {
      return deskripsi;
   }
   
   /** @param newDeskripsi
    * @pdOid 21f3a96b-af89-405a-980a-42f324abc283 */
   public void setdeskripsi(String newDeskripsi) {
      deskripsi = newDeskripsi;
   }

}