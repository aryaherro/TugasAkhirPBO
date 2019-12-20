/***********************************************************************
 * Module:  JadwalSeminar.java
 * Author:  Ajeng
 * Purpose: Defines the Class JadwalSeminar
 ***********************************************************************/

package modultugasakhir;

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid ff476954-2cfc-4f88-869b-f98eff99f965 */
public class JadwalSeminar {
   /** @pdOid 4da5ae69-a7b4-4e6a-8f44-3bd0a2002517 */
   private String idJadwal;
   /** @pdOid b999dd8b-e31d-4f92-9ec0-ee4cc2233881 */
   private Date jadwal;
   
   /** @pdRoleInfo migr=no name=Judul assc=association10 mult=0..1 side=A */
   public Judul JudulDalamJadwalSeminar;
   /** @pdRoleInfo migr=no name=Prodi assc=association11 mult=0..1 side=A */
   public Prodi ProdiMenentukanJadwal;

   /** @pdOid b8be38bb-13d2-45b1-8b41-7b8f07bfbf65 */
   public JadwalSeminar() {
      // TODO: implement
   }
   
   public JadwalSeminar(String idProdi, String idJudul, Date jadwal) {
      // TODO: implement
      autoInsertId();
      JudulDalamJadwalSeminar = new Judul().getSingleDatabase(idJudul);
      ProdiMenentukanJadwal = new Prodi().getSingleDatabase(idProdi);
      setJadwal(jadwal);
   }
   
   /** @pdOid a1ccacef-c3b9-4d04-a383-3575018bee7e */
   public String getIdJadwal() {
      return idJadwal;
   }
   
   /** @param newIdJadwal
    * @pdOid 694061c4-af45-4fef-927d-30cc7111c12a */
   public void setIdJadwal(String newIdJadwal) {
      idJadwal = newIdJadwal;
   }
   
   /** @pdOid 5972df07-3a24-47f2-b93f-7389e03e25b1 */
   public Date getJadwal() {
      return jadwal;
   }
   
   /** @param newJadwal
    * @pdOid 70562bca-083a-49be-979e-a42820375953 */
   public void setJadwal(Date newJadwal) {
      jadwal = newJadwal;
   }

   @SuppressWarnings("unchecked")
   public ArrayList<JadwalSeminar> getAllDatabase(String query){
       ArrayList<JadwalSeminar> list = new ArrayList<>();
       try{
           if(query.equals(""))
               query = "SELECT * FROM jadwalseminar";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               JadwalSeminar jad = new JadwalSeminar();
               jad.setIdJadwal(rs.getString("idJudul"));
               
               jad.ProdiMenentukanJadwal = new Prodi().getSingleDatabase(rs.getString("idProdi"));
               jad.JudulDalamJadwalSeminar = new Judul().getSingleDatabase(rs.getString("idJudul"));
               
               jad.setJadwal(rs.getDate("jadwal"));
               
               list.add(jad);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   public JadwalSeminar getSingleDatabase(String kunci){
       JadwalSeminar jad = new JadwalSeminar();
       String query = "SELECT * FROM jadwalseminar WHERE idJadwal = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               jad.setIdJadwal(rs.getString("idJudul"));
               
               jad.ProdiMenentukanJadwal = new Prodi().getSingleDatabase(rs.getString("idProdi"));
               jad.JudulDalamJadwalSeminar = new Judul().getSingleDatabase(rs.getString("idJudul"));
               
               jad.setJadwal(rs.getDate("jadwal"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return jad;
   }
   
   public JadwalSeminar getSingleIdJudulDatabase(String kunci){
       JadwalSeminar jad = new JadwalSeminar();
       String query = "SELECT * FROM jadwalseminar WHERE idJudul = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               jad.setIdJadwal(rs.getString("idJudul"));
               
               jad.ProdiMenentukanJadwal = new Prodi().getSingleDatabase(rs.getString("idProdi"));
               jad.JudulDalamJadwalSeminar = new Judul().getSingleDatabase(rs.getString("idJudul"));
               
               jad.setJadwal(rs.getDate("jadwal"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return jad;
   }
   
   public void insertToDatabase(){
       try{
           String query = "INSERT INTO jadwalseminar VALUES (?, ?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getIdJadwal());
           statement.setString(2, ProdiMenentukanJadwal.getIdProdi());
           statement.setString(3, JudulDalamJadwalSeminar.getIdJudul());
           java.sql.Date sqlDate = new java.sql.Date(getJadwal().getTime());
           statement.setDate(4, sqlDate);
           
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
       setIdJadwal("" + jumlah);
   }
}