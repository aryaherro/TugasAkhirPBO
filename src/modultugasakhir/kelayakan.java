/***********************************************************************
 * Module:  kelayakan.java
 * Author:  Ajeng
 * Purpose: Defines the Class kelayakan
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 0ff6429c-5241-429e-ab03-97595dadc616 */
public class kelayakan {
   /** @pdOid 2ee95c90-fa5f-4d40-ac7e-95451743d686 */
   private int idLayak;
   /** @pdOid 5a0d2d9a-1c08-4237-9ff5-f4c151630366 */
   private boolean statusLayak;
   
   /** @pdRoleInfo migr=no name=judul assc=judulStatusKelayakan coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public judul judul;
   
   /** @pdOid 22a74510-93f2-4cb0-bc79-075b0630687e */
   public kelayakan() {
      // TODO: implement
   }
   
   /** @pdOid 33e58b53-94dd-410b-b9da-17e07291b63c */
   public int getidLayak() {
      return idLayak;
   }
   
   /** @param newIdLayak
    * @pdOid 673cd197-7ba5-4297-ad1b-e48b8089989e */
   public void setidLayak(int newIdLayak) {
      idLayak = newIdLayak;
   }
   
   /** @pdOid 0eacdd2d-18f2-4017-90d4-85843d3c48c6 */
   public boolean isstatusLayak() {
      return statusLayak;
   }
   
   /** @param newStatusLayak
    * @pdOid 457886e1-bfa4-403b-87af-3aea78808447 */
   public void setstatusLayak(boolean newStatusLayak) {
      statusLayak = newStatusLayak;
   }

}