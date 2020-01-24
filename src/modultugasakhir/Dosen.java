/***********************************************************************
 * Module:  Dosen.java
 * Author:  Ajeng
 * Purpose: Defines the Class Dosen
 ***********************************************************************/

package modultugasakhir;

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid d073d216-20a9-409a-bf99-fa8d8f5acf35 */
public class Dosen extends Manusia {
   /** @pdOid 1eae3a74-931a-42ea-b27d-e3f7ed6b8b0a */
   private String npp;
   
   /** @pdRoleInfo migr=no name=Prodi assc=dosenDanProdi coll=java.util.Collection impl=java.util.ArrayList mult=1..* side=A */
   public java.util.Collection<Prodi> ProdiDalamDosen;
   
   /** @pdOid 0884e90e-c8df-4388-a36e-91b18e496b93 */
   public Dosen() {
      // TODO: implement
   }
  
   public Dosen(String npp, String idProdi, String nama, String nik, Date tanggalLahir, String jenisKelamin, String alamat, String email, String agama) {
      // TODO: implement
      super(nama, nik, tanggalLahir, jenisKelamin.charAt(0), alamat, email, agama);
      setNpp(npp);
   }
   
   /** @pdOid a4e163f9-a309-4722-aea4-aa33d00ecafa */
   public String getNpp() {
      return npp;
   }
   
   /** @param newNpp
    * @pdOid 7478c29d-777f-497b-b68d-e64d2b1a38d4 */
   public void setNpp(String newNpp) {
      npp = newNpp;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Prodi> getProdiDalamDosen() {
      if (ProdiDalamDosen == null)
         ProdiDalamDosen = new java.util.ArrayList<Prodi>();
      return ProdiDalamDosen;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProdiDalamDosen() {
      if (ProdiDalamDosen == null)
         ProdiDalamDosen = new java.util.ArrayList<Prodi>();
      return ProdiDalamDosen.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProdiDalamDosen */
   public void setProdiDalamDosen(java.util.Collection<Prodi> newProdiDalamDosen) {
      removeAllProdiDalamDosen();
      for (java.util.Iterator iter = newProdiDalamDosen.iterator(); iter.hasNext();)
         addProdiDalamDosen((Prodi)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProdi */
   public void addProdiDalamDosen(Prodi newProdi) {
      if (newProdi == null)
         return;
      if (this.ProdiDalamDosen == null)
         this.ProdiDalamDosen = new java.util.ArrayList<Prodi>();
      if (!this.ProdiDalamDosen.contains(newProdi))
      {
         this.ProdiDalamDosen.add(newProdi);
         newProdi.addDosenDalamProdi(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldProdi */
   public void removeProdiDalamDosen(Prodi oldProdi) {
      if (oldProdi == null)
         return;
      if (this.ProdiDalamDosen != null)
         if (this.ProdiDalamDosen.contains(oldProdi))
         {
            this.ProdiDalamDosen.remove(oldProdi);
            oldProdi.removeDosenDalamProdi(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProdiDalamDosen() {
      if (ProdiDalamDosen != null)
      {
         Prodi oldProdi;
         for (java.util.Iterator iter = getIteratorProdiDalamDosen(); iter.hasNext();)
         {
            oldProdi = (Prodi)iter.next();
            iter.remove();
            oldProdi.removeDosenDalamProdi(this);
         }
      }
   }

   @SuppressWarnings("unchecked")
   public ArrayList<Dosen> getAllDatabase(String query){
       ArrayList<Dosen> list = new ArrayList<>();
       try{
           if(query.equals(""))
               query = "SELECT * FROM dosen";
           
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Dosen dos = new Dosen();
               dos.setNpp(rs.getString("npp"));
               dos.setNama(rs.getString("nama"));
               dos.setNik(rs.getString("nik"));
               dos.setTanggalLahir(rs.getDate("tanggalLahir"));
               dos.setJenisKelamin(rs.getString("jenisKelamin").charAt(0));
               dos.setAlamat(rs.getString("alamat"));
               dos.setEmail(rs.getString("email"));
               dos.setAgama(rs.getString("agama"));
               list.add(dos);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   public Dosen getSingleDatabase(String kunci){
       Dosen dos = new Dosen();
       String query = "SELECT * FROM dosen WHERE npp = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               dos.setNpp(rs.getString("npp"));
               dos.setNama(rs.getString("nama"));
               dos.setNik(rs.getString("nik"));
               dos.setTanggalLahir(rs.getDate("tanggalLahir"));
               dos.setJenisKelamin(rs.getString("jenisKelamin").charAt(0));
               dos.setAlamat(rs.getString("alamat"));
               dos.setEmail(rs.getString("email"));
               dos.setAgama(rs.getString("agama"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return dos;
   }
   
   public Dosen getSingleNamaDatabase(String kunci){
       Dosen dos = new Dosen();
       String query = "SELECT * FROM dosen WHERE nama = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               dos.setNpp(rs.getString("npp"));
               dos.setNama(rs.getString("nama"));
               dos.setNik(rs.getString("nik"));
               dos.setTanggalLahir(rs.getDate("tanggalLahir"));
               dos.setJenisKelamin(rs.getString("jenisKelamin").charAt(0));
               dos.setAlamat(rs.getString("alamat"));
               dos.setEmail(rs.getString("email"));
               dos.setAgama(rs.getString("agama"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return dos;
   }
   
   public void insertToDatabase(){
       try{
           String query = "INSERT INTO dosen VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getNpp());
           statement.setString(2, getNama());
           statement.setString(3, getNik());
           java.sql.Date sqlDate = new java.sql.Date(getTanggalLahir().getTime());
           statement.setDate(4, sqlDate);
           statement.setString(5, ""+getJenisKelamin());
           statement.setString(6, getAlamat());
           statement.setString(7, getEmail());
           statement.setString(8, getAgama());
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   
   public void updateDatabase(){
       try{
           String query = "UPDATE dosen SET nama = (?), nik = (?), tanggalLahir = (?), jenisKelamin = (?),"
                   + " alamat = (?), email = (?), agama = (?) WHERE npp = (?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           
           statement.setString(1, getNama());
           statement.setString(2, getNik());
           java.sql.Date sqlDate = new java.sql.Date(getTanggalLahir().getTime());
           statement.setDate(3, sqlDate);
           statement.setString(4, ""+getJenisKelamin());
           statement.setString(5, getAlamat());
           statement.setString(6, getEmail());
           statement.setString(7, getAgama());
           statement.setString(8, getNpp());
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   
   public void addMasukProdi(String idProdi){
       try{
           String query = "INSERT INTO dosendanprodi VALUES (?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, idProdi);
           statement.setString(2, getNpp());           
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   
   public void editMasukProdi(String idProdi){
       try{
           String query = "UPDATE dosendanprodi SET idProdi = (?) WHERE npp = (?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, idProdi);
           statement.setString(2, getNpp());           
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   
   @SuppressWarnings("unchecked")
   public void getProdiDalamDosenDatabase(String npp){
       String query = "SELECT p.idProdi, p.namaProdi FROM dosendanprodi AS dpd INNER JOIN prodi as p ON dpd.idProdi = p.idProdi AND dpd.npp = \"" + npp + "\"";
       setProdiDalamDosen(new Prodi().getAllDatabase(query));
   }
   
   public boolean cekExistData(String npp){
       Dosen d = new Dosen();
       d.getSingleDatabase(npp);
       if(d.getNama() == null)
           return false;
       else
           return true;
   }
}