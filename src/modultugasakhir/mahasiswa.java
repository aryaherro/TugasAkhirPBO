/***********************************************************************
 * Module:  mahasiswa.java
 * Author:  Ajeng
 * Purpose: Defines the Class mahasiswa
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 90ef432f-cd1e-4370-af94-7a8d8c7ff3fe */
public class mahasiswa extends manusia {
   /** @pdOid 19139f53-e141-41a8-a285-df33dd8f2140 */
   private int idMahasiswa;
   /** @pdOid a1bfdd15-c63f-4640-8f86-3e8bc510c614 */
   private String nim;
   /** @pdOid a5cd37fb-fe92-4cd5-8ec3-aa0fe161ec22 */
   private String mahasiswaPassword;
   
   /** @pdRoleInfo migr=no name=prodi assc=mahasiswaBagianProdi coll=java.util.Collection mult=1..1 */
   public prodi prodi;
   /** @pdRoleInfo migr=no name=judul assc=mahasiswaMengajukanJudul coll=java.util.Collection impl=java.util.ArrayList mult=1..* */
   public java.util.Collection<judul> judul;
   /** @pdRoleInfo migr=no name=dosen assc=dosenMembimbingMahasiswa coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public dosen dosen;
   
   /** @pdOid df3b74a4-3155-4e81-bc20-51a50baea930 */
   public mahasiswa() {
      // TODO: implement
   }
   
   /** @pdOid c71d39d0-d331-45d5-bf61-1e2e9aaa569b */
   public int getidMahasiswa() {
      return idMahasiswa;
   }
   
   /** @param newIdMahasiswa
    * @pdOid 4793ba12-b7ad-47cc-8d9d-b9885603c7a0 */
   public void setidMahasiswa(int newIdMahasiswa) {
      idMahasiswa = newIdMahasiswa;
   }
   
   /** @pdOid ea79ba14-e3d8-4d1b-b3e4-e50125ba8e4f */
   public String getnim() {
      return nim;
   }
   
   /** @param newNim
    * @pdOid d95a8209-4f40-48e3-bb9c-c8ccc36ca052 */
   public void setnim(String newNim) {
      nim = newNim;
   }
   
   /** @pdOid bcc07aa0-5a43-40bf-95c3-71e065cb51ae */
   public String getmahasiswaPassword() {
      return mahasiswaPassword;
   }
   
   /** @param newMahasiswaPassword
    * @pdOid e3220b94-7c0c-4928-8ca3-0f62f7ddbc8d */
   public void setmahasiswaPassword(String newMahasiswaPassword) {
      mahasiswaPassword = newMahasiswaPassword;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<judul> getJudul() {
      if (judul == null)
         judul = new java.util.ArrayList<judul>();
      return judul;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorJudul() {
      if (judul == null)
         judul = new java.util.ArrayList<judul>();
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
         this.judul = new java.util.ArrayList<judul>();
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