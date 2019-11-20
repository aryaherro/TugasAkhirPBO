/***********************************************************************
 * Module:  Kelayakan.java
 * Author:  Ajeng
 * Purpose: Defines the Class Kelayakan
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid d7c08cb0-07ea-49e1-ba74-6e79cf3a3c38 */
public class Kelayakan {
   /** @pdOid 17f2c9a1-9cf7-4e38-b5fd-d2523520cba1 */
   private int idLayak;
   /** @pdOid f472ec25-ce68-4025-9927-13fb32d9d769 */
   private boolean statusLayak;
   
   /** @pdRoleInfo migr=no name=Judul assc=judulStatusKelayakan mult=0..1 */
   public Judul judul;
   
   /** @pdOid b67a5890-a889-49c3-a598-a3d16e193ea7 */
   public void kelayakan() {
      // TODO: implement
   }
   
   /** @pdOid cfad942f-745b-4d4f-b32a-1408c106dc9f */
   public int getidLayak() {
      return idLayak;
   }
   
   /** @param newIdLayak
    * @pdOid 8900f27c-51aa-4be3-8c5d-19bfe02303e4 */
   public void setidLayak(int newIdLayak) {
      idLayak = newIdLayak;
   }
   
   /** @pdOid ff819e53-3980-42e4-8e51-97a9b4e321e4 */
   public boolean isstatusLayak() {
      return statusLayak;
   }
   
   /** @param newStatusLayak
    * @pdOid ebf651a9-b945-4b64-9a41-95914ebb5d4b */
   public void setstatusLayak(boolean newStatusLayak) {
      statusLayak = newStatusLayak;
   }

}