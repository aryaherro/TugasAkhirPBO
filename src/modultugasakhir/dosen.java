/***********************************************************************
 * Module:  dosen.java
 * Author:  Ajeng
 * Purpose: Defines the Class dosen
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 9f390029-5089-4996-8e2d-bdabdb9485b2 */
public class dosen extends manusia {
   /** @pdOid 0e532b01-c5e3-43a8-8691-b9f372c7bc1c */
   private int idDosen;
   /** @pdOid 80b7f43b-2f7d-40c5-af1c-8e180e3c50ed */
   private String npp;
   /** @pdOid 57e77140-39fc-4f56-8ce5-057532d59eed */
   private String dosenPassword;
   
   /** @pdRoleInfo migr=no name=revisi assc=dosenMenuliskanRevisi coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<revisi> revisi;
   /** @pdRoleInfo migr=no name=kelayakan assc=dosenMenentukanKelayakan coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<kelayakan> kelayakan;
   /** @pdRoleInfo migr=no name=prodi assc=dosenBagianProdi coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<prodi> prodi;
   /** @pdRoleInfo migr=no name=jadwalSeminar assc=dosenMelihatJadwal coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<jadwalSeminar> jadwalSeminar;
   
   /** @pdOid 071553bc-fe48-42bd-8336-e2455d24e230 */
   public dosen() {
      // TODO: implement
   }
   
   /** @pdOid 1babdc87-054c-47bd-83df-ba9b11c40e20 */
   public int getidDosen() {
      return idDosen;
   }
   
   /** @param newIdDosen
    * @pdOid 0b65bbfd-ee1b-4f95-840f-f4b1a53be8d3 */
   public void setidDosen(int newIdDosen) {
      idDosen = newIdDosen;
   }
   
   /** @pdOid 948964a0-f06f-4703-8d9b-4526667269ee */
   public String getnpp() {
      return npp;
   }
   
   /** @param newNpp
    * @pdOid 9352a0a9-7b00-4492-b366-aa9c72235507 */
   public void setnpp(String newNpp) {
      npp = newNpp;
   }
   
   /** @pdOid cd26b463-eb2e-41ff-93c3-13735d06b71a */
   public String getdosenPassword() {
      return dosenPassword;
   }
   
   /** @param newDosenPassword
    * @pdOid 1895393e-7beb-4446-8ea0-f7688729d083 */
   public void setdosenPassword(String newDosenPassword) {
      dosenPassword = newDosenPassword;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<revisi> getRevisi() {
      if (revisi == null)
         revisi = new java.util.HashSet<revisi>();
      return revisi;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRevisi() {
      if (revisi == null)
         revisi = new java.util.HashSet<revisi>();
      return revisi.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRevisi */
   public void setRevisi(java.util.Collection<revisi> newRevisi) {
      removeAllRevisi();
      for (java.util.Iterator iter = newRevisi.iterator(); iter.hasNext();)
         addRevisi((revisi)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRevisi */
   public void addRevisi(revisi newRevisi) {
      if (newRevisi == null)
         return;
      if (this.revisi == null)
         this.revisi = new java.util.HashSet<revisi>();
      if (!this.revisi.contains(newRevisi))
         this.revisi.add(newRevisi);
   }
   
   /** @pdGenerated default remove
     * @param oldRevisi */
   public void removeRevisi(revisi oldRevisi) {
      if (oldRevisi == null)
         return;
      if (this.revisi != null)
         if (this.revisi.contains(oldRevisi))
            this.revisi.remove(oldRevisi);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRevisi() {
      if (revisi != null)
         revisi.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<kelayakan> getKelayakan() {
      if (kelayakan == null)
         kelayakan = new java.util.HashSet<kelayakan>();
      return kelayakan;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorKelayakan() {
      if (kelayakan == null)
         kelayakan = new java.util.HashSet<kelayakan>();
      return kelayakan.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newKelayakan */
   public void setKelayakan(java.util.Collection<kelayakan> newKelayakan) {
      removeAllKelayakan();
      for (java.util.Iterator iter = newKelayakan.iterator(); iter.hasNext();)
         addKelayakan((kelayakan)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newKelayakan */
   public void addKelayakan(kelayakan newKelayakan) {
      if (newKelayakan == null)
         return;
      if (this.kelayakan == null)
         this.kelayakan = new java.util.HashSet<kelayakan>();
      if (!this.kelayakan.contains(newKelayakan))
         this.kelayakan.add(newKelayakan);
   }
   
   /** @pdGenerated default remove
     * @param oldKelayakan */
   public void removeKelayakan(kelayakan oldKelayakan) {
      if (oldKelayakan == null)
         return;
      if (this.kelayakan != null)
         if (this.kelayakan.contains(oldKelayakan))
            this.kelayakan.remove(oldKelayakan);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllKelayakan() {
      if (kelayakan != null)
         kelayakan.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<prodi> getProdi() {
      if (prodi == null)
         prodi = new java.util.HashSet<prodi>();
      return prodi;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProdi() {
      if (prodi == null)
         prodi = new java.util.HashSet<prodi>();
      return prodi.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProdi */
   public void setProdi(java.util.Collection<prodi> newProdi) {
      removeAllProdi();
      for (java.util.Iterator iter = newProdi.iterator(); iter.hasNext();)
         addProdi((prodi)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProdi */
   public void addProdi(prodi newProdi) {
      if (newProdi == null)
         return;
      if (this.prodi == null)
         this.prodi = new java.util.HashSet<prodi>();
      if (!this.prodi.contains(newProdi))
         this.prodi.add(newProdi);
   }
   
   /** @pdGenerated default remove
     * @param oldProdi */
   public void removeProdi(prodi oldProdi) {
      if (oldProdi == null)
         return;
      if (this.prodi != null)
         if (this.prodi.contains(oldProdi))
            this.prodi.remove(oldProdi);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProdi() {
      if (prodi != null)
         prodi.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<jadwalSeminar> getJadwalSeminar() {
      if (jadwalSeminar == null)
         jadwalSeminar = new java.util.HashSet<jadwalSeminar>();
      return jadwalSeminar;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorJadwalSeminar() {
      if (jadwalSeminar == null)
         jadwalSeminar = new java.util.HashSet<jadwalSeminar>();
      return jadwalSeminar.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newJadwalSeminar */
   public void setJadwalSeminar(java.util.Collection<jadwalSeminar> newJadwalSeminar) {
      removeAllJadwalSeminar();
      for (java.util.Iterator iter = newJadwalSeminar.iterator(); iter.hasNext();)
         addJadwalSeminar((jadwalSeminar)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newJadwalSeminar */
   public void addJadwalSeminar(jadwalSeminar newJadwalSeminar) {
      if (newJadwalSeminar == null)
         return;
      if (this.jadwalSeminar == null)
         this.jadwalSeminar = new java.util.HashSet<jadwalSeminar>();
      if (!this.jadwalSeminar.contains(newJadwalSeminar))
         this.jadwalSeminar.add(newJadwalSeminar);
   }
   
   /** @pdGenerated default remove
     * @param oldJadwalSeminar */
   public void removeJadwalSeminar(jadwalSeminar oldJadwalSeminar) {
      if (oldJadwalSeminar == null)
         return;
      if (this.jadwalSeminar != null)
         if (this.jadwalSeminar.contains(oldJadwalSeminar))
            this.jadwalSeminar.remove(oldJadwalSeminar);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllJadwalSeminar() {
      if (jadwalSeminar != null)
         jadwalSeminar.clear();
   }

}