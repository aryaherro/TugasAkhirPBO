/***********************************************************************
 * Module:  prodi.java
 * Author:  Ajeng
 * Purpose: Defines the Class prodi
 ***********************************************************************/

package modultugasakhir;

/** @pdOid c5d3f500-c5b0-47d9-8bd6-547769a0af5e */
public class prodi {
   /** @pdOid 287aaba8-ce2d-42e8-a4da-81aad43edadd */
   private int idProdi;
   /** @pdOid 865d0ac2-ffca-417e-a229-ead393af1961 */
   private String namaProdi;
   /** @pdOid 24f2cb98-16f8-46f2-8478-ea462c6f4f29 */
   private String prodiPassword;
   
   /** @pdRoleInfo migr=no name=jadwalSeminar assc=prodiMelihatJadwal coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   private java.util.Collection<jadwalSeminar> jadwalSeminar;
   
   /** @pdOid 74b5c87d-3d33-48e1-9549-e8b3efe7a77f */
   public prodi() {
      // TODO: implement
   }
   
   /**
     * @return  *  @pdOid 48106143-a982-429f-97c4-d485756b5822 */
   public int getidProdi() {
      return idProdi;
   }
   
   /** @param newIdProdi
    * @pdOid e37741c4-f8d1-43a7-b869-10a743ef8566 */
   public void setidProdi(int newIdProdi) {
      idProdi = newIdProdi;
   }
   
   /**
     * @return  *  @pdOid db01db73-818b-46e9-bafe-3f41ae19e4a6 */
   public String getNamaProdi() {
      return namaProdi;
   }
   
   /** @param newNamaProdi
    * @pdOid 1759af5b-a581-4f0c-a4c2-6388f310d5ff */
   public void setnamaProdi(String newNamaProdi) {
      namaProdi = newNamaProdi;
   }
   
   /**
     * @return  *  @pdOid 60930ef6-fa3c-4c11-92e2-44e693701c26 */
   public String getProdiPassword() {
      return prodiPassword;
   }
   
   /** @param newProdiPassword
    * @pdOid 68af45d4-2fcd-43f1-abda-b14e382d738f */
   public void setprodiPassword(String newProdiPassword) {
      prodiPassword = newProdiPassword;
   }
   
   
   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<jadwalSeminar> getJadwalSeminar() {
      if (jadwalSeminar == null)
         jadwalSeminar = new java.util.HashSet<jadwalSeminar>();
      return jadwalSeminar;
   }
   
   /**
     * @return  *  @pdGenerated default iterator getter */
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