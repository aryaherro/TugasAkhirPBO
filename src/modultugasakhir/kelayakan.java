/***********************************************************************
 * Module:  kelayakan.java
 * Author:  Ajeng
 * Purpose: Defines the Class kelayakan
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 646b1b37-8ab5-4aea-90c3-708265e779b0 */
public class kelayakan {
   /** @pdOid 081ac380-fca3-4546-897c-021ab537ce73 */
   private int idLayak;
   /** @pdOid c8514459-05d0-404f-9df5-a1170506531a */
   private boolean statusLayak;
   
   /** @pdRoleInfo migr=no name=judul assc=judulStatusKelayakan coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public judul judul;
   /** @pdRoleInfo migr=no name=dosen assc=dosenMenentukanKelayakan coll=java.util.Collection impl=java.util.HashSet mult=1..1 side=A */
   public dosen dosen;
   
   /** @pdOid 4ac0c62d-ea8e-47f9-a726-be1a877c3107 */
   public kelayakan() {
      // TODO: implement
   }
   
   /** @pdOid 0a311748-315c-436b-8be8-5cf44b7b6119 */
   public int getidLayak() {
      return idLayak;
   }
   
   /** @param newIdLayak
    * @pdOid a0cd0978-b4cc-40a0-a901-64c17db07569 */
   public void setidLayak(int newIdLayak) {
      idLayak = newIdLayak;
   }
   
   /** @pdOid 369d7aee-420e-4383-902d-e9ade416de93 */
   public boolean isstatusLayak() {
      return statusLayak;
   }
   
   /** @param newStatusLayak
    * @pdOid f7f1a759-e43d-45b9-aa0c-9d34666826c0 */
   public void setstatusLayak(boolean newStatusLayak) {
      statusLayak = newStatusLayak;
   }

}