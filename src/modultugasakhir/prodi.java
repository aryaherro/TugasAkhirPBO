/***********************************************************************
 * Module:  prodi.java
 * Author:  Ajeng
 * Purpose: Defines the Class prodi
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 18b2c9b7-420e-4626-943a-7ae25d69f391 */
public class prodi {
   /** @pdOid ac073fb0-69b3-47cc-8b35-82756693cd1c */
   private int idProdi;
   /** @pdOid 166f447a-e598-42bc-b128-5aff02b01cba */
   private String namaProdi;
   /** @pdOid 32242682-74f1-48e1-bb2e-c0a86591f72d */
   private String prodiPassword;
   
   /** @pdRoleInfo migr=no name=jadwalSeminar assc=prodiMelihatJadwal coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<jadwalSeminar> jadwalSeminar;
   
   /** @pdOid b6f114f4-4913-4749-98f5-d86d94807de5 */
   public prodi() {
      // TODO: implement
   }
   
   /** @pdOid 3074a593-a7ef-4c12-8518-a010c6f6d8c3 */
   public int getidProdi() {
      return idProdi;
   }
   
   /** @param newIdProdi
    * @pdOid b16c6efb-c5a5-4f68-96a3-0fe394c2c6ea */
   public void setidProdi(int newIdProdi) {
      idProdi = newIdProdi;
   }
   
   /** @pdOid 31de1bbe-5c8f-48e1-a09e-79a6ab423bee */
   public String getNamaProdi() {
      return namaProdi;
   }
   
   /** @param newNamaProdi
    * @pdOid 72d77aaf-5db6-4992-9206-3e439ccd91ee */
   public void setnamaProdi(String newNamaProdi) {
      namaProdi = newNamaProdi;
   }
   
   /** @pdOid 224be7ad-74f4-43ec-b98c-b0cd8d2c88b0 */
   public String getProdiPassword() {
      return prodiPassword;
   }
   
   /** @param newProdiPassword
    * @pdOid 2f347c52-d229-472d-88fe-98cddc3dfa95 */
   public void setprodiPassword(String newProdiPassword) {
      prodiPassword = newProdiPassword;
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