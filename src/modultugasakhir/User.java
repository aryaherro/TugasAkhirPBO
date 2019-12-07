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
   
   /** @pdOid 4984b886-111b-4433-bb05-840192534462 */
   public String getUsername() {
      return username;
   }
   
   /** @param newUsername
    * @pdOid b3eeecce-0b0d-496a-8bad-f52bcb9233e4 */
   public void setusername(String newUsername) {
      username = newUsername;
   }
   
   /** @pdOid d560ba92-0dd1-42ab-a06a-c1ff9f793c5c */
   public String getPassword() {
      return password;
   }
   
   /** @param newPassword
    * @pdOid 4548e4f0-9125-4569-90a4-8df514d56097 */
   public void setpassword(String newPassword) {
      password = newPassword;
   }

}