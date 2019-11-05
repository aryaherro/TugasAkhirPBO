package modultugasakhir;

/***********************************************************************
 * Module:  Mahasiswa.java
 * Author:  Ajeng
 * Purpose: Defines the Class Mahasiswa
 ***********************************************************************/

/** @pdOid 9fd0b016-bc97-40bd-b631-3488ab8f298f */
public class Mahasiswa extends Manusia {
   /** @pdOid 8b178ffb-c4c1-475e-95ef-160e2c864ac3 */
   private int idMahasiswa;
   /** @pdOid 9ca2f5cb-5d99-493c-8c45-cc6e925506af */
   private int nim;
   /** @pdOid f56fbe30-92f3-44fb-9035-5063115b889c */
   private String mahasiswaPassword;
   
   /** @pdRoleInfo migr=no name=Prodi assc=bagian coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Prodi prodi;
   /** @pdRoleInfo migr=no name=Judul assc=mengajukan coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Judul> judul;
   /** @pdRoleInfo migr=no name=JadwalSeminar assc=melihat coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public JadwalSeminar jadwalSeminar;
   
   /** @pdOid 8088bc89-d2bb-4dbf-b87e-910dc6c74dba */
   public void mahasiswa() {
      // TODO: implement
   }
   
   /**
     * @return  *  @pdOid 49306e94-3a21-4d33-beec-cbc56563d5e1 */
   public int getIDMahasiswa() {
      return idMahasiswa;
   }
   
   /** @param newIDMahasiswa
    * @pdOid 657e0593-bd22-4cd7-8ca2-4e71cb5e4661 */
   public void setIDMahasiswa(int newIDMahasiswa) {
      idMahasiswa = newIDMahasiswa;
   }
   
   /**
     * @return  *  @pdOid f4b70f5c-8b6b-43b7-b4ed-f1bae0ca44f8 */
   public int getNIM() {
      return nim;
   }
   
   /** @param newNIM
    * @pdOid 6ea43766-e7d3-4d7a-9b40-814d867992f4 */
   public void setNIM(int newNIM) {
      nim = newNIM;
   }
   
   /**
     * @return  *  @pdOid c8025785-07ff-4320-aefa-b2940d1ddbcd */
   public String getMahasiswaPassword() {
      return mahasiswaPassword;
   }
   
   /** @param newMahasiswaPassword
    * @pdOid 7644b91b-ba72-49c1-afdf-5398cc9387ec */
   public void setMahasiswaPassword(String newMahasiswaPassword) {
      mahasiswaPassword = newMahasiswaPassword;
   }
   
   
   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<Judul> getJudul() {
      if (judul == null)
         judul = new java.util.HashSet<Judul>();
      return judul;
   }
   
   /**
     * @return  *  @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorJudul() {
      if (judul == null)
         judul = new java.util.HashSet<Judul>();
      return judul.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newJudul */
   public void setJudul(java.util.Collection<Judul> newJudul) {
      removeAllJudul();
      for (java.util.Iterator iter = newJudul.iterator(); iter.hasNext();)
         addJudul((Judul)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newJudul */
   public void addJudul(Judul newJudul) {
      if (newJudul == null)
         return;
      if (this.judul == null)
         this.judul = new java.util.HashSet<Judul>();
      if (!this.judul.contains(newJudul))
         this.judul.add(newJudul);
   }
   
   /** @pdGenerated default remove
     * @param oldJudul */
   public void removeJudul(Judul oldJudul) {
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