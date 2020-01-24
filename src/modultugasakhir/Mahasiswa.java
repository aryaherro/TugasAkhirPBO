/***********************************************************************
 * Module:  Mahasiswa.java
 * Author:  Ajeng
 * Purpose: Defines the Class Mahasiswa
 ***********************************************************************/

package modultugasakhir;

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 7a6c07c2-b765-4c9d-afeb-4b7270b1ebc6 */
public class Mahasiswa extends Manusia {
   /** @pdOid 0bc653b7-bb1b-4c18-be44-739a8dd63aef */
   private String nim;
   
   /** @pdRoleInfo migr=no name=Prodi assc=association13 mult=0..1 */
   public Prodi ProdiDalamMahasiswa;
   /** @pdRoleInfo migr=no name=Dosen assc=association14 mult=0..1 */
   public Dosen DosenPembimbingMahasiswa;
   
   /** @pdOid 3ec9a720-f1a5-48ad-9e18-59d041e9a007 */
   public Mahasiswa() {
      // TODO: implement
   }
   
   public Mahasiswa(String nim, String npp, String idProdi, String nama, String nik, Date tanggalLahir, String jenisKelamin, String alamat, String email, String agama) {
      // TODO: implement
      super(nama, nik, tanggalLahir, jenisKelamin.charAt(0), alamat, email, agama);
      setNim(nim);
      DosenPembimbingMahasiswa = new Dosen().getSingleDatabase(npp);
      ProdiDalamMahasiswa = new Prodi().getSingleDatabase(idProdi);
   }
   
   /** @pdOid 859d0c9b-83a7-4105-9e80-34ca02ee9c30 */
   public String getNim() {
      return nim;
   }
   
   /** @param newNim
    * @pdOid 160fd74b-7d76-46a0-9b2d-211e1430ec74 */
   public void setNim(String newNim) {
      nim = newNim;
   }

   @SuppressWarnings("unchecked")
   public ArrayList<Mahasiswa> getAllDatabase(String query){
       ArrayList<Mahasiswa> list = new ArrayList<>();
       try{
           if(query.equals(""))
               query = "SELECT * FROM mahasiswa";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Mahasiswa maha = new Mahasiswa();
               maha.setNim(rs.getString("nim"));
               maha.DosenPembimbingMahasiswa = new Dosen().getSingleDatabase(rs.getString("npp"));
               maha.ProdiDalamMahasiswa = new Prodi().getSingleDatabase(rs.getString("idProdi"));
               maha.setNama(rs.getString("nama"));
               maha.setNik(rs.getString("nik"));
               maha.setTanggalLahir(rs.getDate("tanggalLahir"));
               maha.setJenisKelamin(rs.getString("jenisKelamin").charAt(0));
               maha.setAlamat(rs.getString("alamat"));
               maha.setEmail(rs.getString("email"));
               maha.setAgama(rs.getString("agama"));
               list.add(maha);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   public Mahasiswa getSingleDatabase(String kunci){
       Mahasiswa maha = new Mahasiswa();
       String query = "SELECT * FROM mahasiswa WHERE nim = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               maha.setNim(rs.getString("nim"));
               if (rs.getString("npp") != null){
                   maha.DosenPembimbingMahasiswa = new Dosen().getSingleDatabase(rs.getString("npp"));
               }
               if (rs.getString("idProdi") !=null){
                   maha.ProdiDalamMahasiswa = new Prodi().getSingleDatabase(rs.getString("idProdi"));
               }
               maha.setNama(rs.getString("nama"));
               maha.setNik(rs.getString("nik"));
               maha.setTanggalLahir(rs.getDate("tanggalLahir"));
               maha.setJenisKelamin(rs.getString("jenisKelamin").charAt(0));
               maha.setAlamat(rs.getString("alamat"));
               maha.setEmail(rs.getString("email"));
               maha.setAgama(rs.getString("agama"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return maha;
   }
   
   public void insertToDatabase(){
       try{
           String query = "INSERT INTO mahasiswa VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getNim());
           
           if(DosenPembimbingMahasiswa != null)
               statement.setString(2, DosenPembimbingMahasiswa.getNpp());
           else
               statement.setString(2, null);
           if(ProdiDalamMahasiswa != null)
               statement.setString(3, ProdiDalamMahasiswa.getIdProdi());
           else
               statement.setString(3, null);
           statement.setString(4, getNama());
           statement.setString(5, getNik());
           java.sql.Date sqlDate = new java.sql.Date(getTanggalLahir().getTime());
           statement.setDate(6, sqlDate);
           statement.setString(7, ""+getJenisKelamin());
           statement.setString(8, getAlamat());
           statement.setString(9, getEmail());
           statement.setString(10, getAgama());
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   
   public void updateDatabase(){
       try{
           String query = "UPDATE mahasiswa SET npp = (?), idProdi = (?), nama = (?),"
                   + " nik = (?), tanggalLahir = (?), jenisKelamin = (?), alamat = (?), email = (?), agama = (?)"
                   + " WHERE nim = (?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           if(DosenPembimbingMahasiswa != null)
               statement.setString(1, DosenPembimbingMahasiswa.getNpp());
           else
               statement.setString(1, null);
           if(ProdiDalamMahasiswa != null)
               statement.setString(2, ProdiDalamMahasiswa.getIdProdi());
           else
               statement.setString(2, null);
           statement.setString(3, getNama());
           statement.setString(4, getNik());
           java.sql.Date sqlDate = new java.sql.Date(getTanggalLahir().getTime());
           statement.setDate(5, sqlDate);
           statement.setString(6, ""+getJenisKelamin());
           statement.setString(7, getAlamat());
           statement.setString(8, getEmail());
           statement.setString(9, getAgama());
           statement.setString(10, getNim());
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   
   public boolean cekExistData(String nim){
       Mahasiswa m = new Mahasiswa();
       m.getSingleDatabase(nim);
       if(m.getNama() == null)
           return false;
       else
           return true;
   }
}