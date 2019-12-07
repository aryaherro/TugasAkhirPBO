/***********************************************************************
 * Module:  Kelayakan.java
 * Author:  Ajeng
 * Purpose: Defines the Class Kelayakan
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 6ceddc8d-e6ee-411c-a051-d80033ebf740 */
public class Kelayakan {
   /** @pdOid 28198805-7718-491f-8f1a-7458f959ce88 */
   private String idLayak;
   /** @pdOid e9f50220-3f43-4a0b-a169-c09aa8b2b910 */
   private java.lang.Boolean statusLayak;
   
   /** @pdRoleInfo migr=no name=Judul assc=association12 mult=1..1 side=A */
   public Judul Judul;
   
   /** @pdOid cf0ff2d4-4c29-404c-87a0-1ca2d6719f37 */
   public Kelayakan() {
      // TODO: implement
   }
   
   /** @pdOid 532c128a-b84e-4746-a7da-4ff3cdf1f298 */
   public String getIdLayak() {
      return idLayak;
   }
   
   /** @param newIdLayak
    * @pdOid f648f6a3-fbc2-4d9b-84f6-380883a32e4c */
   public void setidLayak(String newIdLayak) {
      idLayak = newIdLayak;
   }
   
   /** @pdOid f5ef04af-b6a6-4fdf-963a-0ede72967e6b */
   public java.lang.Boolean getStatusLayak() {
      return statusLayak;
   }
   
   /** @param newStatusLayak
    * @pdOid 3a1c3e95-4348-4450-bf78-e7dbced2c4b9 */
   public void setstatusLayak(java.lang.Boolean newStatusLayak) {
      statusLayak = newStatusLayak;
   }

}