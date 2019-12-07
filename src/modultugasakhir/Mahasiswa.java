/***********************************************************************
 * Module:  Mahasiswa.java
 * Author:  Ajeng
 * Purpose: Defines the Class Mahasiswa
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 7a6c07c2-b765-4c9d-afeb-4b7270b1ebc6 */
public class Mahasiswa extends Manusia {
   /** @pdOid 0bc653b7-bb1b-4c18-be44-739a8dd63aef */
   private String nim;
   
   /** @pdRoleInfo migr=no name=Prodi assc=association13 mult=0..1 */
   public Prodi Prodi;
   
   /** @pdOid 3ec9a720-f1a5-48ad-9e18-59d041e9a007 */
   public Mahasiswa() {
      // TODO: implement
   }
   
   /** @pdOid 1e85f4a3-1e9a-47c0-b37a-43903cc09318 */
   public String getnim() {
      return nim;
   }
   
   /** @param newNim
    * @pdOid 58be850b-3626-4c53-8a35-b68fb1b20555 */
   public void setnim(String newNim) {
      nim = newNim;
   }

}