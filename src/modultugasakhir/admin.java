/***********************************************************************
 * Module:  admin.java
 * Author:  Ajeng
 * Purpose: Defines the Class admin
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 67578f45-1f4b-437e-9e8a-4431004fb3e5 */
public class admin {
   /** @pdOid 21a353c8-504c-4dbe-9e95-4358a4df0745 */
   private int idAdmin;
   /** @pdOid a325e2b3-450d-43b1-aeec-cfdf8b7daba4 */
   private String usernameAdmin;
   /** @pdOid 503b6a36-4667-4580-9950-0ff6e98434f3 */
   private String passwordAdmin;
   
   /** @pdRoleInfo migr=no name=mahasiswa assc=adminEditMahasiswa coll=java.util.Collection impl=java.util.ArrayList mult=1..* */
   public java.util.Collection<mahasiswa> mahasiswa;
   /** @pdRoleInfo migr=no name=prodi assc=adminEditProdi coll=java.util.Collection impl=java.util.ArrayList mult=1..* */
   public java.util.Collection<prodi> prodi;
   /** @pdRoleInfo migr=no name=dosen assc=adminEditDosen coll=java.util.Collection impl=java.util.ArrayList mult=1..* */
   public java.util.Collection<dosen> dosen;
   
   /** @pdOid 99d90e9a-43ee-42b8-8cf1-566998c9c792 */
   public admin() {
      // TODO: implement
   }
   
   /** @pdOid 010ee21a-4cf4-4684-9dd9-a7aa939c9125 */
   public int getidAdmin() {
      return idAdmin;
   }
   
   /** @param newIdAdmin
    * @pdOid a5a5edb6-7995-4a1d-a0a4-f1253249c84d */
   public void setidAdmin(int newIdAdmin) {
      idAdmin = newIdAdmin;
   }
   
   /** @pdOid d82be122-ba4a-4b24-920a-7b64f90cc021 */
   public String getusernameAdmin() {
      return usernameAdmin;
   }
   
   /** @param newUsernameAdmin
    * @pdOid 1c18708d-3573-4f3d-a847-54747cfb9ab8 */
   public void setusernameAdmin(String newUsernameAdmin) {
      usernameAdmin = newUsernameAdmin;
   }
   
   /** @pdOid 28f1e2e3-8ff6-4216-b50a-60e8edc3d936 */
   public String getpasswordAdmin() {
      return passwordAdmin;
   }
   
   /** @param newPasswordAdmin
    * @pdOid eb8b5891-2c2b-4ee2-9673-ee4024dcc7c0 */
   public void setpasswordAdmin(String newPasswordAdmin) {
      passwordAdmin = newPasswordAdmin;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<mahasiswa> getMahasiswa() {
      if (mahasiswa == null)
         mahasiswa = new java.util.ArrayList<mahasiswa>();
      return mahasiswa;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMahasiswa() {
      if (mahasiswa == null)
         mahasiswa = new java.util.ArrayList<mahasiswa>();
      return mahasiswa.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMahasiswa */
   public void setMahasiswa(java.util.Collection<mahasiswa> newMahasiswa) {
      removeAllMahasiswa();
      for (java.util.Iterator iter = newMahasiswa.iterator(); iter.hasNext();)
         addMahasiswa((mahasiswa)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMahasiswa */
   public void addMahasiswa(mahasiswa newMahasiswa) {
      if (newMahasiswa == null)
         return;
      if (this.mahasiswa == null)
         this.mahasiswa = new java.util.ArrayList<mahasiswa>();
      if (!this.mahasiswa.contains(newMahasiswa))
         this.mahasiswa.add(newMahasiswa);
   }
   
   /** @pdGenerated default remove
     * @param oldMahasiswa */
   public void removeMahasiswa(mahasiswa oldMahasiswa) {
      if (oldMahasiswa == null)
         return;
      if (this.mahasiswa != null)
         if (this.mahasiswa.contains(oldMahasiswa))
            this.mahasiswa.remove(oldMahasiswa);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMahasiswa() {
      if (mahasiswa != null)
         mahasiswa.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<prodi> getProdi() {
      if (prodi == null)
         prodi = new java.util.ArrayList<prodi>();
      return prodi;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProdi() {
      if (prodi == null)
         prodi = new java.util.ArrayList<prodi>();
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
         this.prodi = new java.util.ArrayList<prodi>();
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
   public java.util.Collection<dosen> getDosen() {
      if (dosen == null)
         dosen = new java.util.ArrayList<dosen>();
      return dosen;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDosen() {
      if (dosen == null)
         dosen = new java.util.ArrayList<dosen>();
      return dosen.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDosen */
   public void setDosen(java.util.Collection<dosen> newDosen) {
      removeAllDosen();
      for (java.util.Iterator iter = newDosen.iterator(); iter.hasNext();)
         addDosen((dosen)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDosen */
   public void addDosen(dosen newDosen) {
      if (newDosen == null)
         return;
      if (this.dosen == null)
         this.dosen = new java.util.ArrayList<dosen>();
      if (!this.dosen.contains(newDosen))
         this.dosen.add(newDosen);
   }
   
   /** @pdGenerated default remove
     * @param oldDosen */
   public void removeDosen(dosen oldDosen) {
      if (oldDosen == null)
         return;
      if (this.dosen != null)
         if (this.dosen.contains(oldDosen))
            this.dosen.remove(oldDosen);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDosen() {
      if (dosen != null)
         dosen.clear();
   }
   
}