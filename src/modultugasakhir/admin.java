/***********************************************************************
 * Module:  admin.java
 * Author:  Ajeng
 * Purpose: Defines the Class admin
 ***********************************************************************/

package modultugasakhir;

/** @pdOid 3f384822-d0a2-4246-8885-454851d3ccac */
public class admin {
   /** @pdOid aef22040-af9c-4ca4-b49b-eb46c9ebad55 */
   private int idAdmin;
   /** @pdOid 4fa45516-f0a7-4554-a307-5dc8602dca38 */
   private String usernameAdmin;
   /** @pdOid 28c04f3f-0a78-4141-932f-717374b9ceab */
   private String passwordAdmin;
   
   /** @pdRoleInfo migr=no name=mahasiswa assc=adminEditMahasiswa coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   private java.util.Collection<mahasiswa> mahasiswa;
   /** @pdRoleInfo migr=no name=prodi assc=adminEditProdi coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   private java.util.Collection<prodi> prodi;
   /** @pdRoleInfo migr=no name=dosen assc=adminEditDosen coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   private java.util.Collection<dosen> dosen;
   
   /** @pdOid fc57862c-08f5-4300-b4b9-bfb163627ab3 */
   public admin() {
      // TODO: implement
   }
   
   /**
     * @return  *  @pdOid ba7e6c9b-335d-4a78-b517-b80a09d2b720 */
   public int getidAdmin() {
      return idAdmin;
   }
   
   /** @param newIdAdmin
    * @pdOid 3e71367a-fbd4-46e3-9c5c-b15e96e39a23 */
   public void setidAdmin(int newIdAdmin) {
      idAdmin = newIdAdmin;
   }
   
   /**
     * @return  *  @pdOid 536550ef-c0b2-419f-8be9-34804200b769 */
   public String getusernameAdmin() {
      return usernameAdmin;
   }
   
   /** @param newUsernameAdmin
    * @pdOid 5863b047-9dae-490f-bb05-73972acde612 */
   public void setusernameAdmin(String newUsernameAdmin) {
      usernameAdmin = newUsernameAdmin;
   }
   
   /**
     * @return  *  @pdOid 140c858d-c7aa-4315-b3b5-b8d54bbc1ae2 */
   public String getpasswordAdmin() {
      return passwordAdmin;
   }
   
   /** @param newPasswordAdmin
    * @pdOid e352dc61-3ce0-4627-af95-25dd42d64911 */
   public void setpasswordAdmin(String newPasswordAdmin) {
      passwordAdmin = newPasswordAdmin;
   }
   
   
   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<mahasiswa> getMahasiswa() {
      if (mahasiswa == null)
         mahasiswa = new java.util.HashSet<mahasiswa>();
      return mahasiswa;
   }
   
   /**
     * @return  *  @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMahasiswa() {
      if (mahasiswa == null)
         mahasiswa = new java.util.HashSet<mahasiswa>();
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
         this.mahasiswa = new java.util.HashSet<mahasiswa>();
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
   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<prodi> getProdi() {
      if (prodi == null)
         prodi = new java.util.HashSet<prodi>();
      return prodi;
   }
   
   /**
     * @return  *  @pdGenerated default iterator getter */
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
   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<dosen> getDosen() {
      if (dosen == null)
         dosen = new java.util.HashSet<dosen>();
      return dosen;
   }
   
   /**
     * @return  *  @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDosen() {
      if (dosen == null)
         dosen = new java.util.HashSet<dosen>();
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
         this.dosen = new java.util.HashSet<dosen>();
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