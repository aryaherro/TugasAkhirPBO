/***********************************************************************
 * Module:  Judul.java
 * Author:  Ajeng
 * Purpose: Defines the Class Judul
 ***********************************************************************/

package modultugasakhir;

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid efaf61e9-76fe-44e4-984c-1562cf4d562f */
public class Judul {
   /** @pdOid 3ba606df-ac24-445f-9e81-9ef0c4caa8ad */
   private String idJudul;
   /** @pdOid 32b27bf1-4678-4f32-ad26-b3ce694d229f */
   private String namaJudul;
   /** @pdOid 019b77e1-a929-44c7-b7e4-2e57e27f6020 */
   private String deskripsi;
   
   /** @pdRoleInfo migr=no name=Mahasiswa assc=association4 mult=1..1 side=A */
   public Mahasiswa MahasiswaDalamJudul;
   
   /** @pdOid 5cc4953e-47d4-424a-ad79-e570745d6bcb */
   public Judul() {
      // TODO: implement
   }
   
   public Judul(String nim, String namaJudul, String deskripsi) {
      // TODO: implement
       autoInsertId();
       MahasiswaDalamJudul.getSingleDatabase(nim);
       setNamaJudul(namaJudul);
       setDeskripsi(deskripsi);
   }
   
   /** @pdOid e305398a-f4e6-41d5-b97d-f52557b844d4 */
   public String getIdJudul() {
      return idJudul;
   }
   
   /** @param newIdJudul
    * @pdOid 7ab09a62-65d6-4529-b2cf-77a55ca28138 */
   public void setIdJudul(String newIdJudul) {
      idJudul = newIdJudul;
   }
   
   /** @pdOid b142ca57-8732-4486-8ed0-263bb69be630 */
   public String getNamaJudul() {
      return namaJudul;
   }
   
   /** @param newNamaJudul
    * @pdOid 5ec0b9af-cb16-4421-84d4-10255426a422 */
   public void setNamaJudul(String newNamaJudul) {
      namaJudul = newNamaJudul;
   }
   
   /** @pdOid c9094875-6e0f-4e11-8c89-aed17a31c9d8 */
   public String getDeskripsi() {
      return deskripsi;
   }
   
   /** @param newDeskripsi
    * @pdOid dff53cc1-45ee-47af-a78a-acc4df03e546 */
   public void setDeskripsi(String newDeskripsi) {
      deskripsi = newDeskripsi;
   }

   @SuppressWarnings("unchecked")
   public ArrayList getAllDatabase(String query){
       ArrayList list = new ArrayList<>();
       try{
           if(query.equals(""))
               query = "SELECT * FROM judul";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Judul jud = new Judul();
               jud.setIdJudul(rs.getString("idJudul"));
               
               MahasiswaDalamJudul.getSingleDatabase(rs.getString("nim"));
               
               jud.setNamaJudul(rs.getString("namaJudul"));
               jud.setDeskripsi(rs.getString("deskripsi"));
               list.add(jud);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   public void getSingleDatabase(String query){
       query = "SELECT * FROM judul WHERE idJudul="+query;
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               setIdJudul(rs.getString("idJudul"));
               
               MahasiswaDalamJudul.getSingleDatabase(rs.getString("nim"));
               
               setNamaJudul(rs.getString("namaJudul"));
               setDeskripsi(rs.getString("deskripsi"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
   }
   
   public void insertMahasiswa(){
       try{
           String query = "INSERT INTO judul VALUES (?, ?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getIdJudul());
           statement.setString(2, MahasiswaDalamJudul.getNim());
           statement.setString(3, getNamaJudul());
           statement.setString(4, getDeskripsi());
           
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   
   public int getSizeDatabase(){
       ArrayList list = getAllDatabase("");
       return list.size();
   }
   
   public void autoInsertId(){
       setIdJudul(""+ getSizeDatabase() + 1);
   }
}