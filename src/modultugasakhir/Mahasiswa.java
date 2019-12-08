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
   
   public Mahasiswa(String nim, String npp, String idProdi, String nama, String nik, String tanggalLahir, String jenisKelamin, String alamat, String email, String agama) {
      // TODO: implement
      setNim(nim);
      DosenPembimbingMahasiswa.getSingleDatabase(npp);
      ProdiDalamMahasiswa.getSingleDatabase(idProdi);
      setNama(nama);
      setNik(nik);
      setTanggalLahir(tanggalLahir);
      setJenisKelamin(jenisKelamin.charAt(0));
      setAlamat(alamat);
      setEmail(email);
      setAgama(agama);
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
   public ArrayList getAllDatabase(String query){
       ArrayList<Mahasiswa> list = new ArrayList<>();
       try{
           if(query.equals(""))
               query = "SELECT * FROM mahasiswa";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Mahasiswa maha = new Mahasiswa();
               maha.setNim(rs.getString("nim"));
               
               maha.DosenPembimbingMahasiswa.getSingleDatabase(rs.getString("npp"));
               maha.ProdiDalamMahasiswa.getSingleDatabase(rs.getString("idProdi"));
              
               maha.setNama(rs.getString("nama"));
               maha.setNik(rs.getString("nik"));
               maha.setTanggalLahir(rs.getString("tanggalLahir"));
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
   
   public void getSingleDatabase(String kunci){
       String query = "SELECT * FROM mahasiswa WHERE nim = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               setNim(rs.getString("nim"));
               
               DosenPembimbingMahasiswa.getSingleDatabase(rs.getString("npp"));
               ProdiDalamMahasiswa.getSingleDatabase(rs.getString("idProdi"));
              
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
   
   public void insertMahasiswa(){
       try{
           String query = "INSERT INTO mahasiswa VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getNim());
           statement.setString(2, DosenPembimbingMahasiswa.getNpp());
           statement.setString(3, ProdiDalamMahasiswa.getIdProdi());
           statement.setString(4, getNama());
           statement.setString(5, getNik());
           statement.setString(6, getTanggalLahir());
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
   
   public void insertToUser(String Password) throws SQLException{
       User u = new User(getNim(), Password, "Mahasiswa");
       u.insertUser();
   }
}