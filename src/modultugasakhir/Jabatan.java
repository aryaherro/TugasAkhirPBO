/***********************************************************************
 * Module:  Jabatan.java
 * Author:  Ajeng
 * Purpose: Defines the Class Jabatan
 ***********************************************************************/

package modultugasakhir;

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 5882c5af-60f8-40d5-8661-1f9490407925 */
public class Jabatan {
   /** @pdOid 2a4888d1-40f6-4b5e-8578-859377e01770 */
   private String idJabatan;
   /** @pdOid d526407f-58cf-4f6d-ba35-713080cf6365 */
   private String namaJabatan;
   
   /** @pdOid b64ee835-35dc-4dd9-90ee-487dd4339c4b */
   public Jabatan() {
      // TODO: implement
   }
   
   public Jabatan(String npp, String namaJabatan) {
      // TODO: implement
      autoInsertId();
      setNamaJabatan(namaJabatan);
   }
   
   /** @pdOid 660b7125-1433-4c6f-9ce8-9f74d407f3fa */
   public String getIdJabatan() {
      return idJabatan;
   }
   
   /** @param newIdJabatan
    * @pdOid 47bdd61b-e27e-412c-a6ac-4c28bf086afd */
   public void setIdJabatan(String newIdJabatan) {
      idJabatan = newIdJabatan;
   }
   
   /** @pdOid 09a08508-b3d3-448e-b88c-c2dea1844a20 */
   public String getNamaJabatan() {
      return namaJabatan;
   }
   
   /** @param newNamaJabatan
    * @pdOid 0989b1e5-b008-48bb-90d7-04234264881d */
   public void setNamaJabatan(String newNamaJabatan) {
      namaJabatan = newNamaJabatan;
   }

   @SuppressWarnings("unchecked")
   public ArrayList<Jabatan> getAllDatabase(String query){
       ArrayList<Jabatan> list = new ArrayList<>();
       try{
           if(query.equals(""))
               query = "SELECT * FROM jabatan";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Jabatan jab = new Jabatan();
               jab.setIdJabatan(rs.getString("idJabatan"));
               
               jab.setNamaJabatan(rs.getString("namaJabatan"));
               list.add(jab);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   public Jabatan getSingleDatabase(String kunci){
       Jabatan jab = new Jabatan();
       String query = "SELECT * FROM jabatan WHERE idJabatan = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               jab.setIdJabatan(rs.getString("idJabatan"));
               jab.setNamaJabatan(rs.getString("namaJabatan"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return jab;
   }
   
   public void insertToDatabase(){
       try{
           String query = "INSERT INTO jabatan VALUES (?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getIdJabatan());
           statement.setString(2, getNamaJabatan());
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   
   public int getSizeDatabase(){
       return getAllDatabase("").size();
   }
   
   public void autoInsertId(){
       setIdJabatan(""+ getSizeDatabase() + 1);
   }
}