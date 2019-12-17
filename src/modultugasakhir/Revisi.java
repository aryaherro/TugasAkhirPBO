/***********************************************************************
 * Module:  Revisi.java
 * Author:  Ajeng
 * Purpose: Defines the Class Revisi
 ***********************************************************************/

package modultugasakhir;

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 59b4f08f-f7e0-41ba-80a9-b92ddfb10497 */
public class Revisi {
   /** @pdOid 4c9d5cdb-40e7-4019-b692-3db478033817 */
   private String idRevisi;
   /** @pdOid f5000b06-f483-4b1b-acdd-a48be9f46ad4 */
   private String isiRevisi;
   /** @pdOid 6a55977a-c384-41d5-81e3-d37b6c14b220 */
   private Date tanggalRevisi;
   
   /** @pdRoleInfo migr=no name=Judul assc=association5 mult=1..1 side=A */
   public Judul JudulDalamRevisi;
   /** @pdRoleInfo migr=no name=Dosen assc=association9 mult=0..1 side=A */
   public Dosen DosenMemberiRevisi;
   
   /** @pdOid c43d82aa-321b-4a6f-9d09-7f283a1ce4fa */
   public Revisi() {
      // TODO: implement
   }
   
   public Revisi(String idJudul, String npp, String isiRevisi, Date tanggalRevisi) {
      // TODO: implement
      autoInsertId();
      JudulDalamRevisi = new Judul().getSingleDatabase(idJudul);
      DosenMemberiRevisi = new Dosen().getSingleDatabase(npp);
      setIsiRevisi(isiRevisi);
      setTanggalRevisi(tanggalRevisi);
   }
   /** @pdOid da845d89-d27d-4c6e-bf5a-8b6908581f60 */
   public String getIdRevisi() {
      return idRevisi;
   }
   
   /** @param newIdRevisi
    * @pdOid 8898237f-839c-4960-9069-91c3eb250e84 */
   public void setIdRevisi(String newIdRevisi) {
      idRevisi = newIdRevisi;
   }
   
   /** @pdOid 16cc6c59-b8a8-4217-97e5-5efeb2dd002d */
   public String getIsiRevisi() {
      return isiRevisi;
   }
   
   /** @param newIsiRevisi
    * @pdOid 9f685e27-fc9c-4da9-b2cb-d327a5056495 */
   public void setIsiRevisi(String newIsiRevisi) {
      isiRevisi = newIsiRevisi;
   }
   
   /** @pdOid 402ef44c-a387-4baf-9113-12401137d57e */
   public Date getTanggalRevisi() {
      return tanggalRevisi;
   }
   
   /** @param newTanggalRevisi
    * @pdOid 20ef835c-0d66-4910-9a5b-2075ee4d0405 */
   public void setTanggalRevisi(Date newTanggalRevisi) {
      tanggalRevisi = newTanggalRevisi;
   }

   @SuppressWarnings("unchecked")
   public ArrayList<Revisi> getAllDatabase(String query){
       ArrayList<Revisi> list = new ArrayList<>();
       try{
           if(query.equals(""))
               query = "SELECT * FROM revisi";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Revisi rev = new Revisi();
               rev.setIdRevisi(rs.getString("idRevisi"));
               rev.JudulDalamRevisi = new Judul().getSingleDatabase(rs.getString("idJudul"));
               rev.DosenMemberiRevisi = new Dosen().getSingleDatabase(rs.getString("npp"));
               rev.setIsiRevisi(rs.getString("isiRevisi"));
               rev.setTanggalRevisi(rs.getDate("tanggalRevisi"));
               
               list.add(rev);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   public ArrayList<Revisi> getAllIdJudulDatabase(String idJudul){
       ArrayList<Revisi> list = new ArrayList<>();
       try{
           String query = "SELECT * FROM revisi WHERE idJudul = (?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, idJudul);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Revisi rev = new Revisi();
               rev.setIdRevisi(rs.getString("idRevisi"));
               rev.JudulDalamRevisi = new Judul().getSingleDatabase(rs.getString("idJudul"));
               rev.DosenMemberiRevisi = new Dosen().getSingleDatabase(rs.getString("npp"));
               rev.setIsiRevisi(rs.getString("isiRevisi"));
               rev.setTanggalRevisi(rs.getDate("tanggalRevisi"));
               
               list.add(rev);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   public Revisi getSingleDatabase(String kunci){
       Revisi rev = new Revisi();
       String query = "SELECT * FROM revisi WHERE idRevisi = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               rev.setIdRevisi(rs.getString("idRevisi"));
               rev.JudulDalamRevisi = new Judul().getSingleDatabase(rs.getString("idJudul"));
               rev.DosenMemberiRevisi = new Dosen().getSingleDatabase(rs.getString("npp"));
               rev.setIsiRevisi(rs.getString("isiRevisi"));
               rev.setTanggalRevisi(rs.getDate("tanggalRevisi"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return rev;
   }
   
   public void insertToDatabase(){
       try{
           String query = "INSERT INTO revisi VALUES (?, ?, ?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getIdRevisi());
           statement.setString(2, JudulDalamRevisi.getIdJudul());
           statement.setString(3, DosenMemberiRevisi.getNpp());
           statement.setString(4, getIsiRevisi());
           java.sql.Date sqlDate = new java.sql.Date(getTanggalRevisi().getTime());
           statement.setDate(5, sqlDate);
           
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
       setIdRevisi("" + jumlah);
   }
}