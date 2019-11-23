/***********************************************************************
 * Module:  mahasiswa.java
 * Author:  Ajeng
 * Purpose: Defines the Class mahasiswa
 ***********************************************************************/

package modultugasakhir;

/** @pdOid dc67caf7-59f1-4f4b-b730-7060d21fc7f5 */
public class mahasiswa extends manusia {
   /** @pdOid 40e4cab4-c0a3-4660-988b-17dc17475d43 */
   private int idMahasiswa;
   /** @pdOid d8214566-66f4-4c8d-9bc6-15fb863c0a58 */
   private String nim;
   /** @pdOid 669fcf32-b895-4671-9e3d-feabc9cbc24e */
   private String mahasiswaPassword;
   
   /** @pdRoleInfo migr=no name=prodi assc=mahasiswaBagianProdi coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public prodi prodi;
   /** @pdRoleInfo migr=no name=judul assc=mahasiswaMengajukanJudul coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<judul> judul;
   /** @pdRoleInfo migr=no name=dosen assc=dosenMembimbingMahasiswa coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public dosen dosen;
   
   /** @pdOid 0fb0bd87-82a2-40a3-9c94-75b4843954af */
   public mahasiswa() {
      // TODO: implement
   }
   
   /** @pdOid 51f499da-96a3-4ba6-b87a-6bb2d6c41c90 */
   public int getidMahasiswa() {
      return idMahasiswa;
   }
   
   /** @param newIdMahasiswa
    * @pdOid eb64d828-2d5d-4b2c-a843-1005a430a535 */
   public void setidMahasiswa(int newIdMahasiswa) {
      idMahasiswa = newIdMahasiswa;
   }
   
   /** @pdOid 92119689-4c43-40df-a065-a76ad5a07806 */
   public String getnim() {
      return nim;
   }
   
   /** @param newNim
    * @pdOid eaa1c805-f0ae-4828-a2a0-981e938a4c5a */
   public void setnim(String newNim) {
      nim = newNim;
   }
   
   /** @pdOid be7410d6-ab50-4d0e-aa91-e5cf0a24b4e4 */
   public String getmahasiswaPassword() {
      return mahasiswaPassword;
   }
   
   /** @param newMahasiswaPassword
    * @pdOid 962543e7-876e-4ba8-a475-ff732b8c5c81 */
   public void setmahasiswaPassword(String newMahasiswaPassword) {
      mahasiswaPassword = newMahasiswaPassword;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<judul> getJudul() {
      if (judul == null)
         judul = new java.util.HashSet<judul>();
      return judul;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorJudul() {
      if (judul == null)
         judul = new java.util.HashSet<judul>();
      return judul.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newJudul */
   public void setJudul(java.util.Collection<judul> newJudul) {
      removeAllJudul();
      for (java.util.Iterator iter = newJudul.iterator(); iter.hasNext();)
         addJudul((judul)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newJudul */
   public void addJudul(judul newJudul) {
      if (newJudul == null)
         return;
      if (this.judul == null)
         this.judul = new java.util.HashSet<judul>();
      if (!this.judul.contains(newJudul))
         this.judul.add(newJudul);
   }
   
   /** @pdGenerated default remove
     * @param oldJudul */
   public void removeJudul(judul oldJudul) {
      if (oldJudul == null)
         return;
      if (this.judul != null)
         if (this.judul.contains(oldJudul))
            this.judul.remove(oldJudul);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllJudul() {
      if (judul != null)
         judul.clear();
   }

}