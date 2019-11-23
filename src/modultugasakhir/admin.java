package modultugasakhir;

/***********************************************************************
 * Module:  Admin.java
 * Author:  Ajeng
 * Purpose: Defines the Class Admin
 ***********************************************************************/

/** @pdOid 4ad238aa-2f4d-4661-846f-3dbe241513c7 */
public class Admin {
   /** @pdOid 6caa82ba-9bb5-42a6-bb31-279a73d6ed64 */
   private String idAdmin;
   /** @pdOid 79a9a864-ebfc-4376-98b9-d669745e26e4 */
   private String usernameAdmin;
   /** @pdOid de882e8b-c8e9-4c4a-b1fb-d733f67ba0c3 */
   private String passwordAdmin;

   /** @pdRoleInfo migr=no name=Mahasiswa assc=editMahasiswa coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Mahasiswa> mahasiswa;
   /** @pdRoleInfo migr=no name=Prodi assc=editProdi coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Prodi> prodi;
   /** @pdRoleInfo migr=no name=Dosen assc=editDosen coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Dosen> dosen;

   /** @pdOid cc0909ac-42c1-45bf-970b-74cbc9eb448f */
   public void admin() {
      // TODO: implement
   }

   /**
     * @return  *  @pdOid ad01507f-b5a5-4e01-854f-27dbb74bf7c6 */
   public String getIDAdmin() {
      return idAdmin;
   }

   /** @param newIDAdmin
    * @pdOid a128fdc8-a3c5-4224-a3cb-6ad166f6d3a9 */
   public void setIDAdmin(String newIDAdmin) {
      idAdmin = newIDAdmin;
   }

   /**
     * @return  *  @pdOid 9158c214-1194-4542-a32f-3c388a61de2b */
   public String getUsernameAdmin() {
      return usernameAdmin;
   }

   /** @param newUsernameAdmin
    * @pdOid 81d55dbe-1c26-40eb-ab83-388b0e4807e2 */
   public void setUsernameAdmin(String newUsernameAdmin) {
      usernameAdmin = newUsernameAdmin;
   }

   /**
     * @return  *  @pdOid dc48d068-178a-42ea-8877-09510fb5d6bb */
   public String getPasswordAdmin() {
      return passwordAdmin;
   }

   /** @param newPasswordAdmin
    * @pdOid 9b7b4a1f-4e36-433d-a3a4-a047cbf7354c */
   public void setPasswordAdmin(String newPasswordAdmin) {
      passwordAdmin = newPasswordAdmin;
   }


   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<Mahasiswa> getMahasiswa() {
      if (mahasiswa == null)
         mahasiswa = new java.util.HashSet<Mahasiswa>();
      return mahasiswa;
   }

   /**
     * @return  @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMahasiswa() {
      if (mahasiswa == null)
         mahasiswa = new java.util.HashSet<Mahasiswa>();
      return mahasiswa.iterator();
   }

   /** @pdGenerated default setter
     * @param newMahasiswa */
   public void setMahasiswa(java.util.Collection<Mahasiswa> newMahasiswa) {
      removeAllMahasiswa();
      for (java.util.Iterator iter = newMahasiswa.iterator(); iter.hasNext();)
         addMahasiswa((Mahasiswa)iter.next());
   }

   /** @pdGenerated default add
     * @param newMahasiswa */
   public void addMahasiswa(Mahasiswa newMahasiswa) {
      if (newMahasiswa == null)
         return;
      if (this.mahasiswa == null)
         this.mahasiswa = new java.util.HashSet<Mahasiswa>();
      if (!this.mahasiswa.contains(newMahasiswa))
         this.mahasiswa.add(newMahasiswa);
   }

   /** @pdGenerated default remove
     * @param oldMahasiswa */
   public void removeMahasiswa(Mahasiswa oldMahasiswa) {
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
   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<Prodi> getProdi() {
      if (prodi == null)
         prodi = new java.util.HashSet<Prodi>();
      return prodi;
   }

   /**
     * @return  *  @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProdi() {
      if (prodi == null)
         prodi = new java.util.HashSet<Prodi>();
      return prodi.iterator();
   }

   /** @pdGenerated default setter
     * @param newProdi */
   public void setProdi(java.util.Collection<Prodi> newProdi) {
      removeAllProdi();
      for (java.util.Iterator iter = newProdi.iterator(); iter.hasNext();)
         addProdi((Prodi)iter.next());
   }

   /** @pdGenerated default add
     * @param newProdi */
   public void addProdi(Prodi newProdi) {
      if (newProdi == null)
         return;
      if (this.prodi == null)
         this.prodi = new java.util.HashSet<Prodi>();
      if (!this.prodi.contains(newProdi))
         this.prodi.add(newProdi);
   }

   /** @pdGenerated default remove
     * @param oldProdi */
   public void removeProdi(Prodi oldProdi) {
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
   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<Dosen> getDosen() {
      if (dosen == null)
         dosen = new java.util.HashSet<Dosen>();
      return dosen;
   }

   /**
     * @return  *  @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDosen() {
      if (dosen == null)
         dosen = new java.util.HashSet<Dosen>();
      return dosen.iterator();
   }

   /** @pdGenerated default setter
     * @param newDosen */
   public void setDosen(java.util.Collection<Dosen> newDosen) {
      removeAllDosen();
      for (java.util.Iterator iter = newDosen.iterator(); iter.hasNext();)
         addDosen((Dosen)iter.next());
   }

   /** @pdGenerated default add
     * @param newDosen */
   public void addDosen(Dosen newDosen) {
      if (newDosen == null)
         return;
      if (this.dosen == null)
         this.dosen = new java.util.HashSet<Dosen>();
      if (!this.dosen.contains(newDosen))
         this.dosen.add(newDosen);
   }

   /** @pdGenerated default remove
     * @param oldDosen */
   public void removeDosen(Dosen oldDosen) {
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
