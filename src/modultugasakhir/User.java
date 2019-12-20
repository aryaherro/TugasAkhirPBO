/***********************************************************************
 * Module:  User.java
 * Author:  Ajeng
 * Purpose: Defines the Class User
 ***********************************************************************/

package modultugasakhir;

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/** @pdOid ac735255-5f22-4861-a9f6-324cc501ea97 */
public class User {
   /** @pdOid d389b37d-e2b1-4e9a-831f-59d7dfdfafd6 */
   private String username;
   /** @pdOid 8fb16cc6-8ac6-4ff8-97e9-c89b078beec6 */
   private String password;
   /** @pdOid 573860d1-78ad-4458-a192-5a2a2c262de7 */
   private String typeUser;
   
   /** @pdOid 54d54461-5612-4beb-81e2-db38287b87ee */
   public User() {
      // TODO: implement
   }
   
   public User(String username,String password, String typeUser) {
      // TODO: implement
       setUsername(username);
       setPassword(password);
       setTypeUser(typeUser);
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
   
   /** @pdOid e3ba09b1-5bb2-4e6a-8dc3-c6f40d4b9a40 */
   public String getTypeUser() {
      return typeUser;
   }
   
   /** @param newTypeUser
    * @pdOid 9bc4ef09-c381-45d5-bcd9-b64cce3f2a2c */
   public void setTypeUser(String newTypeUser) {
      typeUser = newTypeUser;
   }
   
   public User getSingleDatabase(String kunci){
       User user = new User();
       try{
           String query = "SELECT * FROM user WHERE username = (?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               user.setUsername(rs.getString("username"));
               user.setPassword(rs.getString("password"));
               user.setTypeUser(rs.getString("typeUser"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return user;
   }
   
   public void insertToDatabase(){
       try{
           String query = "INSERT INTO user VALUES (?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getUsername());
           statement.setString(2, getPassword());
           statement.setString(3, getTypeUser());
           
           statement.execute();
           statement.close();
           }
       catch(SQLException e){
           
       }
   }
   
   public void updateToDatabase(){
       try{
           String query = "UPDATE user SET password = (?), typeUser = (?) WHERE username = (?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getPassword());
           statement.setString(2, getTypeUser());
           statement.setString(3, getUsername());
           
           statement.execute();
           statement.close();
           }
       catch(SQLException e){
           
       }
   }
   
   public boolean cekLogin(String username, String pass){
       User u = new User().getSingleDatabase(username);
       if((u.getUsername() == null)||(u.getUsername().equals("")))
       {
           JOptionPane.showMessageDialog(null, "Username tidak terdaftar!");
           return false;
       }
       else
       {
           if(u.getPassword().equals(pass))
           {
               setUsername(u.getUsername());
               setPassword(u.getPassword());
               setTypeUser(u.getTypeUser());
                return true;
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Password Salah!");
               return false;
           }
       }
   }
}