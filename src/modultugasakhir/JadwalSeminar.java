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
   private String jadwal;
   
   /** @pdRoleInfo migr=no name=Mahasiswa assc=association10 mult=0..1 side=A */
   public Mahasiswa MahasiswaDalamJadwalSeminar;
      /** @pdRoleInfo migr=no name=Prodi assc=association11 mult=0..1 side=A */
   public Prodi ProdiMenentukanJadwal;

   /** @pdOid b8be38bb-13d2-45b1-8b41-7b8f07bfbf65 */
   public JadwalSeminar() {
      // TODO: implement
   }
   
   public JadwalSeminar(String nim, String idProdi, String jadwal) {
      // TODO: implement
      autoInsertId();
      MahasiswaDalamJadwalSeminar.getSingleDatabase(nim);
      ProdiMenentukanJadwal.getSingleDatabase(idProdi);
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
   public String getJadwal() {
      return jadwal;
   }
   
   /** @param newJadwal
    * @pdOid 70562bca-083a-49be-979e-a42820375953 */
   public void setJadwal(String newJadwal) {
      jadwal = newJadwal;
   }

   @SuppressWarnings("unchecked")
   public ArrayList getAllDatabase(String query){
       ArrayList<JadwalSeminar> list = new ArrayList<>();
       try{
           if(query.equals(""))
               query = "SELECT * FROM jadwalseminar";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               JadwalSeminar jad = new JadwalSeminar();
               jad.setIdJadwal(rs.getString("idJudul"));
               
               jad.MahasiswaDalamJadwalSeminar.getSingleDatabase(rs.getString("nim"));
               jad.ProdiMenentukanJadwal.getSingleDatabase(rs.getString("idProdi"));
               
               jad.setJadwal(rs.getString("jadwal"));
               
               list.add(jad);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   public void getSingleDatabase(String query){
       query = "SELECT * FROM jadwalseminar WHERE idJadwal="+query;
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               setIdJadwal(rs.getString("idJadwal"));
               
               MahasiswaDalamJadwalSeminar.getSingleDatabase(rs.getString("nim"));
               ProdiMenentukanJadwal.getSingleDatabase(rs.getString("idProdi"));
               
               setJadwal(rs.getString("jadwal"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
   }
   
   public void insertMahasiswa(){
       try{
           String query = "INSERT INTO jadwalseminar VALUES (?, ?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getIdJadwal());
           statement.setString(2, MahasiswaDalamJadwalSeminar.getNim());
           statement.setString(3, ProdiMenentukanJadwal.getIdProdi());
           statement.setString(4, getJadwal());
           
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
       setIdJadwal(""+ getSizeDatabase() + 1);
   }
}