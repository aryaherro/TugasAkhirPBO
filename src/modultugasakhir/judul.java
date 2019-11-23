/***********************************************************************
 * Module:  judul.java
 * Author:  Ajeng
 * Purpose: Defines the Class judul
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid a6351650-68a7-46dc-b013-544474178f32 */
public class judul {
   /** @pdOid ff0e4946-028f-4cec-813b-8885267657e0 */
   private int idJudul;
   /** @pdOid 9a8b1b2c-dfca-4943-9523-a4b25b773664 */
   private String namaJudul;
   /** @pdOid 96306ed4-8704-4ff0-b436-2286de9511b2 */
   private String deskripsi;
   
   /** @pdOid 30a8cc76-e435-4340-b065-586de7e53c05 */
   public judul() {
      // TODO: implement
   }
   
   /** @pdOid dc966722-0bd8-4b6e-8e3a-f36f0ed48e66 */
   public int getidJudul() {
      return idJudul;
   }
   
   /** @param newIdJudul
    * @pdOid 455e657c-ae8a-4e41-b719-9b3aed7d1f4e */
   public void setidJudul(int newIdJudul) {
      idJudul = newIdJudul;
   }
   
   /** @pdOid f661d189-3a89-4f79-b8d0-4603a33d4796 */
   public String getnamaJudul() {
      return namaJudul;
   }
   
   /** @param newNamaJudul
    * @pdOid d89539cb-3172-4ca4-a12b-14311c387dc2 */
   public void setnamaJudul(String newNamaJudul) {
      namaJudul = newNamaJudul;
   }
   
   /** @pdOid c7fbe5ad-1c02-4b08-b298-65e1eef51704 */
   public String getdeskripsi() {
      return deskripsi;
   }
   
   /** @param newDeskripsi
    * @pdOid f98ed960-ce5d-48d2-a9bb-2caf550dc31b */
   public void setdeskripsi(String newDeskripsi) {
      deskripsi = newDeskripsi;
   }

}