/***********************************************************************
 * Module:  Prodi.java
 * Author:  Ajeng
 * Purpose: Defines the Class Prodi
 ***********************************************************************/

package modultugasakhir;

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid f4611ccc-0ffe-4352-ad42-78ee6b4fdcf5 */
public class Prodi {
   /** @pdOid 17ef1b58-bf98-41d0-a055-6c8a9fb05258 */
   private String idProdi;
   /** @pdOid 754438f5-be27-4db6-95f8-44a03f7425f1 */
   private String namaProdi;
   
   /** @pdRoleInfo migr=no name=Dosen assc=dosenDanProdi coll=java.util.Collection impl=java.util.ArrayList mult=1..* */
   public java.util.Collection<Dosen> DosenDalamProdi;
   
   /** @pdOid 65f52ae3-c356-40c5-9684-365860c005cc */
   public Prodi() {
      // TODO: implement
   }
   
   public Prodi(String idProdi, String namaProdi) {
      // TODO: implement
      setIdProdi(idProdi);
      setNamaProdi(namaProdi);
      getDosenDalamProdiDatabase(idProdi);
   }
   
   /** @pdOid 76868d40-3b0a-4c83-b535-4e52f33efc49 */
   public String getIdProdi() {
      return idProdi;
   }
   
   /** @param newIdProdi
    * @pdOid 4f25424b-0fcb-4f79-85d4-48db63b3edc7 */
   public void setIdProdi(String newIdProdi) {
      idProdi = newIdProdi;
   }
   
   /** @pdOid f6812c32-efc0-4376-95c3-bba5bd5aa1c8 */
   public String getNamaProdi() {
      return namaProdi;
   }
   
   /** @param newNamaProdi
    * @pdOid 806c2213-cfbc-41e3-b17c-841518bbdee2 */
   public void setNamaProdi(String newNamaProdi) {
      namaProdi = newNamaProdi;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Dosen> getDosenDalamProdi() {
      if (DosenDalamProdi == null)
         DosenDalamProdi = new java.util.ArrayList<Dosen>();
      return DosenDalamProdi;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDosenDalamProdi() {
      if (DosenDalamProdi == null)
         DosenDalamProdi = new java.util.ArrayList<Dosen>();
      return DosenDalamProdi.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDosenDalamProdi */
   public void setDosenDalamProdi(java.util.Collection<Dosen> newDosenDalamProdi) {
      removeAllDosenDalamProdi();
      for (java.util.Iterator iter = newDosenDalamProdi.iterator(); iter.hasNext();)
         addDosenDalamProdi((Dosen)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDosen */
   public void addDosenDalamProdi(Dosen newDosen) {
      if (newDosen == null)
         return;
      if (this.DosenDalamProdi == null)
         this.DosenDalamProdi = new java.util.ArrayList<Dosen>();
      if (!this.DosenDalamProdi.contains(newDosen))
      {
         this.DosenDalamProdi.add(newDosen);
         newDosen.addProdiDalamDosen(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldDosen */
   public void removeDosenDalamProdi(Dosen oldDosen) {
      if (oldDosen == null)
         return;
      if (this.DosenDalamProdi != null)
         if (this.DosenDalamProdi.contains(oldDosen))
         {
            this.DosenDalamProdi.remove(oldDosen);
            oldDosen.removeProdiDalamDosen(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDosenDalamProdi() {
      if (DosenDalamProdi != null)
      {
         Dosen oldDosen;
         for (java.util.Iterator iter = getIteratorDosenDalamProdi(); iter.hasNext();)
         {
            oldDosen = (Dosen)iter.next();
            iter.remove();
            oldDosen.removeProdiDalamDosen(this);
         }
      }
   }

   @SuppressWarnings("unchecked")
   public ArrayList<Prodi> getAllDatabase(String query){
       ArrayList<Prodi> list = new ArrayList<>();
       try{
           if(query.equals(""))
               query = "SELECT * FROM prodi";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Prodi pro = new Prodi();
               pro.setIdProdi(rs.getString("idProdi"));
               pro.setNamaProdi(rs.getString("namaProdi"));
               
               getDosenDalamProdiDatabase(pro.getIdProdi());
               
               list.add(pro);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   public Prodi getSingleNamaDatabase(String kunci){
       Prodi pro = new Prodi();
       String query = "SELECT * FROM prodi WHERE namaProdi = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               pro.setIdProdi(rs.getString("idProdi"));
               pro.setNamaProdi(rs.getString("namaProdi"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return pro;
   }
   
   public Prodi getSingleDatabase(String kunci){
       Prodi pro = new Prodi();
       String query = "SELECT * FROM prodi WHERE idProdi = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               pro.setIdProdi(rs.getString("idProdi"));
               pro.setNamaProdi(rs.getString("namaProdi"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return pro;
   }
           
   public void insertToDatabase(){
       try{
           String query = "INSERT INTO prodi VALUES (?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getIdProdi());
           statement.setString(2, getNamaProdi());           
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
           
   public void updateDatabase(){
       try{
           String query = "UPDATE prodi SET namaProdi = (?) WHERE idProdi = (?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getNamaProdi());           
           statement.setString(2, getIdProdi());
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   
   @SuppressWarnings("unchecked")
   public void getDosenDalamProdiDatabase(String idProdi){
       String query = "SELECT d.npp, d.nama, d.nik, d.tanggalLahir, d.jenisKelamin, d.alamat, d.email, d.agama	FROM dosendanprodi AS dpd INNER JOIN dosen as d ON dpd.npp = d.npp AND idProdi=\"" + idProdi + "\"";
       setDosenDalamProdi(new Dosen().getAllDatabase(query));
   }
   
   public boolean cekExistData(String idProdi){
       Prodi p = new Prodi();
       p.getSingleDatabase(idProdi);
       if(p.getNamaProdi() == null)
           return false;
       else
           return true;
   }
}