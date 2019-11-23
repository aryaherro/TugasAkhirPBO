package modultugasakhir;

/***********************************************************************
 * Module:  Dosen.java
 * Author:  Ajeng
 * Purpose: Defines the Class Dosen
 ***********************************************************************/

/** @pdOid f8074944-219a-4925-9eff-e9480b38a0ba */
public class Dosen extends Manusia {
   /** @pdOid c9c34ae2-342b-4562-80ec-56e16e50d192 */
   private String idDosen;
   /** @pdOid 6156830b-8d96-4386-b0f5-2c25e30307a9 */
   private String npp;
   /** @pdOid 89271175-ff46-4f94-906d-0b54a476ee2b */
   private String dosenPassword;

   /** @pdRoleInfo migr=no name=Jabatan assc=menjabat coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Jabatan jabatan;
   /** @pdRoleInfo migr=no name=Revisi assc=menuliskan coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Revisi> revisi;
   /** @pdRoleInfo migr=no name=Kelayakan assc=menentukan coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Kelayakan> kelayakan;
   /** @pdRoleInfo migr=no name=Prodi assc=bagian coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Prodi> prodi;

   /** @pdOid 980b8f3e-5a10-4531-be1d-90e20c904316 */
   public void dosen() {
      // TODO: implement
   }

   /**
     * @return  *  @pdOid 5b6d09fa-c2af-4d3e-91e3-c435a113dbd3 */
   public String getIDDosen() {
      return idDosen;
   }

   /** @param newIDDosen
    * @pdOid 008ef69d-49d1-4e1a-8fa2-d465cee24ce1 */
   public void setIDDosen(String newIDDosen) {
      idDosen = newIDDosen;
   }

   /**
     * @return  *  @pdOid 561af3b3-0e3e-4014-9ef4-c3ee4303ffff */
   public String getNPP() {
      return npp;
   }

   /** @param newNPP
    * @pdOid 8ee4d363-7a9b-4741-b713-7ef8b600177b */
   public void setNPP(String newNPP) {
      npp = newNPP;
   }

   /**
     * @return  *  @pdOid 54a79a30-08f1-4513-8375-46f25295d86a */
   public String getDosenPassword() {
      return dosenPassword;
   }

   /** @param newDosenPassword
    * @pdOid 1041b18a-496c-4066-a141-aae3e9a3a40d */
   public void setDosenPassword(String newDosenPassword) {
      dosenPassword = newDosenPassword;
   }


   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<Revisi> getRevisi() {
      if (revisi == null)
         revisi = new java.util.HashSet<Revisi>();
      return revisi;
   }

   /**
     * @return  *  @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRevisi() {
      if (revisi == null)
         revisi = new java.util.HashSet<Revisi>();
      return revisi.iterator();
   }

   /** @pdGenerated default setter
     * @param newRevisi */
   public void setRevisi(java.util.Collection<Revisi> newRevisi) {
      removeAllRevisi();
      for (java.util.Iterator iter = newRevisi.iterator(); iter.hasNext();)
         addRevisi((Revisi)iter.next());
   }

   /** @pdGenerated default add
     * @param newRevisi */
   public void addRevisi(Revisi newRevisi) {
      if (newRevisi == null)
         return;
      if (this.revisi == null)
         this.revisi = new java.util.HashSet<Revisi>();
      if (!this.revisi.contains(newRevisi))
         this.revisi.add(newRevisi);
   }

   /** @pdGenerated default remove
     * @param oldRevisi */
   public void removeRevisi(Revisi oldRevisi) {
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
   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<Kelayakan> getKelayakan() {
      if (kelayakan == null)
         kelayakan = new java.util.HashSet<Kelayakan>();
      return kelayakan;
   }

   /**
     * @return  *  @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorKelayakan() {
      if (kelayakan == null)
         kelayakan = new java.util.HashSet<Kelayakan>();
      return kelayakan.iterator();
   }

   /** @pdGenerated default setter
     * @param newKelayakan */
   public void setKelayakan(java.util.Collection<Kelayakan> newKelayakan) {
      removeAllKelayakan();
      for (java.util.Iterator iter = newKelayakan.iterator(); iter.hasNext();)
         addKelayakan((Kelayakan)iter.next());
   }

   /** @pdGenerated default add
     * @param newKelayakan */
   public void addKelayakan(Kelayakan newKelayakan) {
      if (newKelayakan == null)
         return;
      if (this.kelayakan == null)
         this.kelayakan = new java.util.HashSet<Kelayakan>();
      if (!this.kelayakan.contains(newKelayakan))
         this.kelayakan.add(newKelayakan);
   }

   /** @pdGenerated default remove
     * @param oldKelayakan */
   public void removeKelayakan(Kelayakan oldKelayakan) {
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

}
