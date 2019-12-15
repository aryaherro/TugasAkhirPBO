/***********************************************************************
 * Module:  HistoryJabatan.java
 * Author:  Ajeng
 * Purpose: Defines the Class HistoryJabatan
 ***********************************************************************/

package modultugasakhir;

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid b600160e-01ee-4083-906e-55397010cd1d */
public class HistoryJabatan {
   /** @pdOid 4de69ad5-eae8-4cc6-bc2a-07ed70f0b502 */
   private String idHistoryJabatan;
   /** @pdOid 836a1d52-8cca-4285-b78c-e6e44a5b57b2 */
   private Date startDate;
   /** @pdOid 15db7d37-712c-457f-bd28-eb49582bdfff */
   private String tahunAjaran;
   /** @pdOid 4ed2ab5f-f504-4904-bdcf-da5d1a5d2f42 */
   private java.lang.Boolean statusAktif;
   
   /** @pdRoleInfo migr=no name=Jabatan assc=association8 mult=1..1 side=A */
   public Jabatan JabatanDalamHistoryJabatan;
   /** @pdRoleInfo migr=no name=Dosen assc=association15 mult=1..1 side=A */
   public Dosen DosenDalamHistoryJabatan;
   
   /** @pdOid 20bcc0c2-9052-46c1-941d-bfbda0eefd32 */
   public HistoryJabatan() {
      // TODO: implement
   }
   
   public HistoryJabatan(String idJabatan, String npp, Date startDate, String tahunAjaran, Boolean statusAktif) {
      // TODO: implement
      
   }
   
   /** @pdOid b024b3e7-8ec4-4e61-839f-b8ff56c8624f */
   public String getIdHistoryJabatan() {
      return idHistoryJabatan;
   }
   
   /** @param newIdHistoryJabatan
    * @pdOid add4bd58-d78f-4e83-8273-82b41cf4bfe3 */
   public void setIdHistoryJabatan(String newIdHistoryJabatan) {
      idHistoryJabatan = newIdHistoryJabatan;
   }
   
   /** @pdOid 11677266-333b-491a-badd-2c707d299f26 */
   public Date getStartDate() {
      return startDate;
   }
   
   /** @param newStartDate
    * @pdOid 38cf8eb4-013c-4b62-b2ff-0a93479dc2dd */
   public void setStartDate(Date newStartDate) {
      startDate = newStartDate;
   }
   
   /** @pdOid fa77094b-e971-4cb3-8a44-4ae5753a7699 */
   public String getTahunAjaran() {
      return tahunAjaran;
   }
   
   /** @param newTahunAjaran
    * @pdOid 8cef0c70-1749-4ecb-94ce-0428e108cbe5 */
   public void setTahunAjaran(String newTahunAjaran) {
      tahunAjaran = newTahunAjaran;
   }
   
   /** @pdOid 56857474-1c59-4078-a1d0-7698434223f9 */
   public java.lang.Boolean getStatusAktif() {
      return statusAktif;
   }
   
   /** @param newStatusAktif
    * @pdOid be279acc-2e56-4340-8db5-cb331fce3556 */
   public void setStatusAktif(java.lang.Boolean newStatusAktif) {
      statusAktif = newStatusAktif;
   }

   @SuppressWarnings("unchecked")
   public ArrayList<HistoryJabatan> getAllDatabase(String query){
       ArrayList<HistoryJabatan> list = new ArrayList<>();
       try{
           if(query.equals(""))
               query = "SELECT * FROM historyjabatan";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               HistoryJabatan his = new HistoryJabatan();
               his.setIdHistoryJabatan(rs.getString("idHistoryJabatan"));
               his.JabatanDalamHistoryJabatan = new Jabatan().getSingleDatabase(rs.getString("idJabatan"));
               his.DosenDalamHistoryJabatan = new Dosen().getSingleDatabase(rs.getString("npp"));
               his.setStartDate(rs.getDate("startDate"));
               his.setTahunAjaran(rs.getString("tahunAjaran"));
               his.setStatusAktif(rs.getBoolean("statusAktif"));
               list.add(his);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   public HistoryJabatan getSingleDatabase(String kunci){
       HistoryJabatan his = new HistoryJabatan();
       String query = "SELECT * FROM historyjabatan WHERE idHistoryJabatan = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               his.setIdHistoryJabatan(rs.getString("idHistoryJabatan"));
               his.JabatanDalamHistoryJabatan = new Jabatan().getSingleDatabase(rs.getString("idJabatan"));
               his.DosenDalamHistoryJabatan = new Dosen().getSingleDatabase(rs.getString("npp"));
               his.setStartDate(rs.getDate("startDate"));
               his.setTahunAjaran(rs.getString("tahunAjaran"));
               his.setStatusAktif(rs.getBoolean("statusAktif"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return his;
   }
   
   public void insertToDatabase(){
       try{
           String query = "INSERT INTO historyjabatan VALUES (?, ?, ?, ?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getIdHistoryJabatan());
           statement.setString(2, JabatanDalamHistoryJabatan.getIdJabatan());
           statement.setString(3, DosenDalamHistoryJabatan.getNpp());
           statement.setDate(4, (java.sql.Date) getStartDate());
           statement.setString(5, getTahunAjaran());
           statement.setBoolean(6, getStatusAktif());
           
           
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
       setIdHistoryJabatan(""+ getSizeDatabase() + 1);
   }
}