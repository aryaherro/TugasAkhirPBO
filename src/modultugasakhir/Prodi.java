/***********************************************************************
 * Module:  Prodi.java
 * Author:  Ajeng
 * Purpose: Defines the Class Prodi
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid f166f879-e34c-4938-8f66-7f42681dd39d */
public class Prodi {
   /** @pdOid 0e5bac82-04b7-4d83-babd-afcbe33c02e2 */
   private int idProdi;
   /** @pdOid d0267102-1b3f-4c2e-aab0-bf2deba8856e */
   private String namaProdi;
   /** @pdOid 73e26501-9a45-4966-b127-d67a0cb99a55 */
   private String prodiPassword;
   
   /** @pdRoleInfo migr=no name=JadwalSeminar assc=prodiMelihatJadwal coll=java.util.Collection impl=java.util.ArrayList mult=1..* */
   public java.util.Collection<JadwalSeminar> jadwalSeminar;
   
   /** @pdOid fd73ba5d-a4ec-49c2-ba76-c01145200dc6 */
   public void prodi() {
      // TODO: implement
   }
   
   /** @pdOid 31d40d90-1465-4e31-96ea-1f6f2ff83906 */
   public int getidProdi() {
      return idProdi;
   }
   
   /** @param newIdProdi
    * @pdOid 06437f72-7c53-44b5-b2f1-8b84442f7c3e */
   public void setidProdi(int newIdProdi) {
      idProdi = newIdProdi;
   }
   
   /** @pdOid d8e96100-0018-48bd-b9cd-5a5d0c444b13 */
   public String getNamaProdi() {
      return namaProdi;
   }
   
   /** @param newNamaProdi
    * @pdOid c2349a1c-fc8b-4e6f-ad34-90edb3d95bfa */
   public void setnamaProdi(String newNamaProdi) {
      namaProdi = newNamaProdi;
   }
   
   /** @pdOid 5ca48a64-799b-4b43-a0ed-e91dfe0a4448 */
   public String getProdiPassword() {
      return prodiPassword;
   }
   
   /** @param newProdiPassword
    * @pdOid 1848efdb-6eaa-4480-845d-6618eac48ed2 */
   public void setprodiPassword(String newProdiPassword) {
      prodiPassword = newProdiPassword;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<JadwalSeminar> getJadwalSeminar() {
      if (jadwalSeminar == null)
         jadwalSeminar = new java.util.ArrayList<JadwalSeminar>();
      return jadwalSeminar;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorJadwalSeminar() {
      if (jadwalSeminar == null)
         jadwalSeminar = new java.util.ArrayList<JadwalSeminar>();
      return jadwalSeminar.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newJadwalSeminar */
   public void setJadwalSeminar(java.util.Collection<JadwalSeminar> newJadwalSeminar) {
      removeAllJadwalSeminar();
      for (java.util.Iterator iter = newJadwalSeminar.iterator(); iter.hasNext();)
         addJadwalSeminar((JadwalSeminar)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newJadwalSeminar */
   public void addJadwalSeminar(JadwalSeminar newJadwalSeminar) {
      if (newJadwalSeminar == null)
         return;
      if (this.jadwalSeminar == null)
         this.jadwalSeminar = new java.util.ArrayList<JadwalSeminar>();
      if (!this.jadwalSeminar.contains(newJadwalSeminar))
         this.jadwalSeminar.add(newJadwalSeminar);
   }
   
   /** @pdGenerated default remove
     * @param oldJadwalSeminar */
   public void removeJadwalSeminar(JadwalSeminar oldJadwalSeminar) {
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