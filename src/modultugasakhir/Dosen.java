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
  
   public Dosen(String npp, String idProdi, String nama, String nik, String tanggalLahir, String jenisKelamin, String alamat, String email, String agama) {
      // TODO: implement
      setNpp(npp);
      setNama(nama);
      setNik(nik);
      setTanggalLahir(tanggalLahir);
      setJenisKelamin(jenisKelamin.charAt(0));
      setAlamat(alamat);
      setEmail(email);
      setAgama(agama);
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
   public ArrayList getAllDatabase(String query){
       ArrayList list = new ArrayList<>();
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
               dos.setTanggalLahir(rs.getString("tanggalLahir"));
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
   
   public void getSingleDatabase(String query){
       query = "SELECT * FROM dosen WHERE npp=" + query;
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               setNpp(rs.getString("npp"));
               setNama(rs.getString("nama"));
               setNik(rs.getString("nik"));
               setTanggalLahir(rs.getString("tanggalLahir"));
               setJenisKelamin(rs.getString("jenisKelamin").charAt(0));
               setAlamat(rs.getString("alamat"));
               setEmail(rs.getString("email"));
               setAgama(rs.getString("agama"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
   }
   
   public void insertDosen(){
       try{
           String query = "INSERT INTO dosen VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getNpp());
           statement.setString(2, getNama());
           statement.setString(3, getNik());
           statement.setString(4, getTanggalLahir());
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
   
   public void masukProdi(String Prodi){
       try{
           String query = "INSERT INTO dosendanprodi VALUES (?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, Prodi);
           statement.setString(2, getNpp());           
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   
   @SuppressWarnings("unchecked")
   public void getProdiDalamDosenDatabase(String npp){
       String query2 = "SELECT p.idProdi, p.namaProdi FROM dosendanprodi AS dpd INNER JOIN prodi as p ON dpd.idProdi = p.idProdi AND dpd.npp=" + npp;
       Prodi pro = new Prodi();
       setProdiDalamDosen(pro.getAllDatabase(query2));
   }
           
   public void insertToUser(String Password){
       User u = new User(getNpp(), Password, "Dosen");
       u.insertUser();
   }
}