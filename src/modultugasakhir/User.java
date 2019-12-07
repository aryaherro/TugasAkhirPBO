/***********************************************************************
 * Module:  User.java
 * Author:  Ajeng
 * Purpose: Defines the Class User
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid ac735255-5f22-4861-a9f6-324cc501ea97 */
public class User {
   /** @pdOid d389b37d-e2b1-4e9a-831f-59d7dfdfafd6 */
   private String username;
   /** @pdOid 8fb16cc6-8ac6-4ff8-97e9-c89b078beec6 */
   private String password;
   
   /** @pdOid 54d54461-5612-4beb-81e2-db38287b87ee */
   public User() {
      // TODO: implement
   }
   
   /** @pdOid 0fa9c319-0a59-421c-b67f-579ae999d1f9 */
   public String getUsername() {
      return username;
   }
   
   /** @param newUsername
    * @pdOid bb84ac02-0b07-416d-88fd-265de15027e8 */
   public void setUsername(String newUsername) {
      username = newUsername;
   }
   
   /** @pdOid 14c085eb-f995-48ed-ba53-abc7f5cb49ac */
   public String getPassword() {
      return password;
   }
   
   /** @param newPassword
    * @pdOid 640d4f20-d923-4604-a9c8-5fdfe6bb77b2 */
   public void setPassword(String newPassword) {
      password = newPassword;
   }
   
   
}