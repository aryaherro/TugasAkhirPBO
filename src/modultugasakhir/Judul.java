package modultugasakhir;

/***********************************************************************
 * Module:  Judul.java
 * Author:  Ajeng
 * Purpose: Defines the Class Judul
 ***********************************************************************/

/** @pdOid edb5acc4-1795-498c-8845-b846bf427665 */
public class Judul {
   /** @pdOid b7d45387-89f7-4da8-9be4-7a67871b7db6 */
   private String idJudul;
   /** @pdOid 73014430-3950-4f1a-a5e9-6a4a8f2342ea */
   private String namaJudul;
   /** @pdOid 17289af4-a523-4235-b3c5-a99ce93c14aa */
   private String deskripsi;

   /** @pdRoleInfo migr=no name=Revisi assc=memiliki coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Revisi> revisi;

   /** @pdOid 6872e5c0-1853-447c-847d-6ee39d14e264 */
   public void judul() {
      // TODO: implement
   }

   /**
     * @return  *  @pdOid 9615b744-9dcf-4b67-916e-ccecb431c6cd */
   public String getIDJudul() {
      return idJudul;
   }

   /** @param newIDJudul
    * @pdOid 5e8f602f-50e3-48a9-9ec4-9f15843f8af2 */
   public void setIDJudul(String newIDJudul) {
      idJudul = newIDJudul;
   }

   /**
     * @return  *  @pdOid 4a5b8a14-d47c-4b0d-a0f9-126ef5fe89cf */
   public String getNamaJudul() {
      return namaJudul;
   }

   /** @param newNamaJudul
    * @pdOid 9f8a9125-cbe3-489a-afad-d00c35628f90 */
   public void setNamaJudul(String newNamaJudul) {
      namaJudul = newNamaJudul;
   }

   /**
     * @return  *  @pdOid 76007c81-9779-47e5-9362-5586af212ed0 */
   public String getDeskripsi() {
      return deskripsi;
   }

   /** @param newDeskripsi
    * @pdOid 9df24e1a-217e-4be8-8e4b-dfb23510c73a */
   public void setDeskripsi(String newDeskripsi) {
      deskripsi = newDeskripsi;
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

}
