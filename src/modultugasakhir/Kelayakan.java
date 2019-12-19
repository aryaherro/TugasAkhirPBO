/***********************************************************************
 * Module:  Kelayakan.java
 * Author:  Ajeng
 * Purpose: Defines the Class Kelayakan
 ***********************************************************************/

package modultugasakhir;

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 6ceddc8d-e6ee-411c-a051-d80033ebf740 */
public class Kelayakan {
   /** @pdOid 28198805-7718-491f-8f1a-7458f959ce88 */
   private String idLayak;
   /** @pdOid e9f50220-3f43-4a0b-a169-c09aa8b2b910 */
   private java.lang.Boolean statusLayak;
   
   /** @pdRoleInfo migr=no name=Judul assc=association12 mult=1..1 side=A */
   public Judul JudulDalamKelayakan;
   
   /** @pdOid cf0ff2d4-4c29-404c-87a0-1ca2d6719f37 */
   public Kelayakan() {
      // TODO: implement
   }
   
   public Kelayakan(Boolean statusLayak, String idJudul) {
      // TODO: implement
      autoInsertId();
      setStatusLayak(statusLayak);
      JudulDalamKelayakan = new Judul().getSingleDatabase(idJudul);
   }
   
   /** @pdOid 53443faf-0f30-40e5-8635-b0f723418a60 */
   public String getIdLayak() {
      return idLayak;
   }
   
   /** @param newIdLayak
    * @pdOid 3d1d2f77-cf43-43a5-a44a-bf97bd63034c */
   public void setIdLayak(String newIdLayak) {
      idLayak = newIdLayak;
   }
   
   /** @pdOid df49b37a-4c61-4ded-a8bd-bef7b3cf9663 */
   public java.lang.Boolean getStatusLayak() {
      return statusLayak;
   }
   
   /** @param newStatusLayak
    * @pdOid 37c9ef11-a6e6-4eab-b39b-830f059796cb */
   public void setStatusLayak(java.lang.Boolean newStatusLayak) {
      statusLayak = newStatusLayak;
   }

   @SuppressWarnings("unchecked")
   public ArrayList<Kelayakan> getAllDatabase(String query){
       ArrayList<Kelayakan> list = new ArrayList<>();
       try{
           if(query.equals(""))
               query = "SELECT * FROM kelayakan";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Kelayakan kel = new Kelayakan();
               kel.setIdLayak(rs.getString("idLayak"));
               
               kel.JudulDalamKelayakan = new Judul().getSingleDatabase(rs.getString("idJudul"));
               
               kel.setStatusLayak(rs.getBoolean("statusLayak"));
               
               list.add(kel);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   
   @SuppressWarnings("unchecked")
   public ArrayList<Kelayakan> getAllJudulKelayakanDatabase(String nim){
       String query = "SELECT k.idLayak, j.idJudul, k.statusLayak "
                    + "FROM judul AS j LEFT JOIN kelayakan AS k "
                    + "ON j.idJudul = k.idJudul ";
       ArrayList<Kelayakan> list = new ArrayList<>();
       try{
           PreparedStatement statement;
           if ((nim != "") || (nim != null)){
               query += "WHERE j.nim = (?)";
               statement = connect.getConnection().prepareStatement(query);
               statement.setString(1, nim);
           }   
           else{
               statement = connect.getConnection().prepareStatement(query);
           }
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Kelayakan kel = new Kelayakan();
               kel.setIdLayak(rs.getString("idLayak"));
               kel.JudulDalamKelayakan = new Judul().getSingleDatabase(rs.getString("idJudul"));
               kel.setStatusLayak(rs.getBoolean("statusLayak"));
               list.add(kel);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   public Kelayakan getSingleDatabase(String kunci){
       Kelayakan kel = new Kelayakan();
       String query = "SELECT * FROM kelayakan WHERE idLayak = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               kel.setIdLayak(rs.getString("idLayak"));
               kel.JudulDalamKelayakan = new Judul().getSingleDatabase(rs.getString("idJudul"));
               kel.setStatusLayak(rs.getBoolean("statusLayak"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return kel;
   }
   
   public Kelayakan getSingleFromJudulDatabase(String kunci){
       Kelayakan kel = new Kelayakan();
       String query = "SELECT * FROM kelayakan WHERE idJudul = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               kel.setIdLayak(rs.getString("idLayak"));
               kel.JudulDalamKelayakan = new Judul().getSingleDatabase(rs.getString("idJudul"));
               kel.setStatusLayak(rs.getBoolean("statusLayak"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return kel;
   }
   
   public Kelayakan cekExistKelayakan(String nim, String idJudul){
       Kelayakan kel = new Kelayakan();
       ArrayList<Kelayakan> KelayakanAll = new Kelayakan().getAllJudulKelayakanDatabase(nim);
       for (Kelayakan eachKelayakan : KelayakanAll) {
           if(idJudul.equals(eachKelayakan.JudulDalamKelayakan.getIdJudul()))
               kel = eachKelayakan;
       }
       return kel;
   }
   
   public void insertToDatabase(){
       try{
           String query = "INSERT INTO kelayakan VALUES (?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getIdLayak());
           statement.setString(2, JudulDalamKelayakan.getIdJudul());
           statement.setBoolean(3, getStatusLayak());
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   
   public void updateDatabase(){
       try{
           String query = "UPDATE kelayakan SET statusLayak = (?) WHERE idJudul = (?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setBoolean(1, getStatusLayak());
           statement.setString(2, JudulDalamKelayakan.getIdJudul());
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   
   public void deleteSingleDatabase(String idJudul){
       try{
           String query = "DELETE FROM kelayakan WHERE idJudul = (?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, idJudul);
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   
   public int getSizeDatabase(){
       return getAllDatabase("").size() + 1;
   }
   
   public void autoInsertId(){
       int jumlah = getSizeDatabase();
       setIdLayak("" + jumlah);
   }
}