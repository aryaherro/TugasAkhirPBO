/***********************************************************************
 * Module:  admin.java
 * Author:  Ajeng
 * Purpose: Defines the Class admin
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 1a735a3f-db9b-40ed-afe8-2a9f1c76b08f */
public class admin {
   /** @pdOid 5bd337e7-0492-4043-864b-89fcd1f8db79 */
   private String usernameAdmin;
   /** @pdOid 72b56129-b8df-4ff3-ba5c-a5bed3898395 */
   private String passwordAdmin;
   
   /** @pdOid c8950df6-6729-4f31-adca-56b0e6ff80dc */
   public admin() {
      // TODO: implement
   }
   
   /** @pdOid 99449435-80a6-4c2b-85ee-54736bb5bc0e */
   public String getusernameAdmin() {
      return usernameAdmin;
   }
   
   /** @param newUsernameAdmin
    * @pdOid 32b23fec-cf6b-4d72-8102-0e9fec2ad4a3 */
   public void setusernameAdmin(String newUsernameAdmin) {
      usernameAdmin = newUsernameAdmin;
   }
   
   /** @pdOid 03c6f5a1-1a89-4260-b3c6-041609d4cb0b */
   public String getpasswordAdmin() {
      return passwordAdmin;
   }
   
   /** @param newPasswordAdmin
    * @pdOid 5c7eed21-c2db-4836-83f0-e5cbe9bc4f18 */
   public void setpasswordAdmin(String newPasswordAdmin) {
      passwordAdmin = newPasswordAdmin;
   }

}