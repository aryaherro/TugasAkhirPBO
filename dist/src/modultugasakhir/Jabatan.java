package modultugasakhir;

/***********************************************************************
 * Module:  Jabatan.java
 * Author:  Ajeng
 * Purpose: Defines the Class Jabatan
 ***********************************************************************/

import java.util.*;

/** @pdOid ccad082c-5c4e-491c-a9c9-8e3aea839115 */
public class Jabatan {
   /** @pdOid 679a1225-fde5-4295-845d-3ac86cf1b37a */
   private String IDJabatan;
   /** @pdOid 76b79d34-e13a-40fb-9dec-b3adca11d685 */
   private String namaJabatan;
   
   /** @pdRoleInfo migr=no name=Revisi assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Revisi> revisi;
   /** @pdRoleInfo migr=no name=Kelayakan assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Kelayakan> kelayakan;
   /** @pdRoleInfo migr=no name=BeritaAcara assc=association12 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<BeritaAcara> beritaAcara;
   /** @pdRoleInfo migr=no name=HistoryJabatan assc=association20 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<HistoryJabatan> historyJabatan;
   
   /**
     * @return  *  @pdOid 2b9eafc4-ab65-48b8-8cfb-3ffd3d6644ff */
   public String getIDJabatan() {
      return IDJabatan;
   }
   
   /** @param newIDJabatan
    * @pdOid ba26dd83-831b-46b8-a946-0f69144a4934 */
   public void setIDJabatan(String newIDJabatan) 
	{
	   if (null == newIDJabatan)
            System.out.println("input salah");
        else
            System.out.println("");
      IDJabatan = newIDJabatan;
	}
   
   /**
     * @return  *  @pdOid 770baf3f-7e0c-486e-8964-ea62df9de3c6 */
   public String getNamaJabatan() {
      return namaJabatan;
   }
   
   /** @param newNamaJabatan
    * @pdOid 64c7a27d-df0c-489b-a138-137a62c3af86 */
   public void setNamaJabatan(String newNamaJabatan) 
	{
	   if (null == newNamaJabatan)
            System.out.println("input salah");
        else
            System.out.println("");
      namaJabatan = newNamaJabatan;
	}
   
   /** @pdOid 1e0ef1ae-884f-4a78-8bae-225ee36a2b2d */
   public void jabatan() 
	{
	   setNamaJabatan("-");
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

	  if (null == newRevisi)
            System.out.println("input salah");
        else
            System.out.println("");
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

	  if (null == newKelayakan)
            System.out.println("input salah");
        else
            System.out.println("");
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
   public java.util.Collection<BeritaAcara> getBeritaAcara() {
      if (beritaAcara == null)
         beritaAcara = new java.util.HashSet<BeritaAcara>();
      return beritaAcara;
   }
   
   /**
     * @return  *  @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBeritaAcara() {
      if (beritaAcara == null)
         beritaAcara = new java.util.HashSet<BeritaAcara>();
      return beritaAcara.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBeritaAcara */
   public void setBeritaAcara(java.util.Collection<BeritaAcara> newBeritaAcara) {
      removeAllBeritaAcara();
      for (java.util.Iterator iter = newBeritaAcara.iterator(); iter.hasNext();)
         addBeritaAcara((BeritaAcara)iter.next());

	  if (null == newBeritaAcara)
            System.out.println("input salah");
        else
            System.out.println("");
   }
   
   /** @pdGenerated default add
     * @param newBeritaAcara */
   public void addBeritaAcara(BeritaAcara newBeritaAcara) {
      if (newBeritaAcara == null)
         return;
      if (this.beritaAcara == null)
         this.beritaAcara = new java.util.HashSet<BeritaAcara>();
      if (!this.beritaAcara.contains(newBeritaAcara))
         this.beritaAcara.add(newBeritaAcara);
   }
   
   /** @pdGenerated default remove
     * @param oldBeritaAcara */
   public void removeBeritaAcara(BeritaAcara oldBeritaAcara) {
      if (oldBeritaAcara == null)
         return;
      if (this.beritaAcara != null)
         if (this.beritaAcara.contains(oldBeritaAcara))
            this.beritaAcara.remove(oldBeritaAcara);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBeritaAcara() {
      if (beritaAcara != null)
         beritaAcara.clear();
   }
   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<HistoryJabatan> getHistoryJabatan() {
      if (historyJabatan == null)
         historyJabatan = new java.util.HashSet<HistoryJabatan>();
      return historyJabatan;
   }
   
   /**
     * @return  *  @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorHistoryJabatan() {
      if (historyJabatan == null)
         historyJabatan = new java.util.HashSet<HistoryJabatan>();
      return historyJabatan.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newHistoryJabatan */
   public void setHistoryJabatan(java.util.Collection<HistoryJabatan> newHistoryJabatan) {
      removeAllHistoryJabatan();
      for (java.util.Iterator iter = newHistoryJabatan.iterator(); iter.hasNext();)
         addHistoryJabatan((HistoryJabatan)iter.next());

	  if (null == newHistoryJabatan)
            System.out.println("input salah");
        else
            System.out.println("");
   }
   
   /** @pdGenerated default add
     * @param newHistoryJabatan */
   public void addHistoryJabatan(HistoryJabatan newHistoryJabatan) {
      if (newHistoryJabatan == null)
         return;
      if (this.historyJabatan == null)
         this.historyJabatan = new java.util.HashSet<HistoryJabatan>();
      if (!this.historyJabatan.contains(newHistoryJabatan))
         this.historyJabatan.add(newHistoryJabatan);
   }
   
   /** @pdGenerated default remove
     * @param oldHistoryJabatan */
   public void removeHistoryJabatan(HistoryJabatan oldHistoryJabatan) {
      if (oldHistoryJabatan == null)
         return;
      if (this.historyJabatan != null)
         if (this.historyJabatan.contains(oldHistoryJabatan))
            this.historyJabatan.remove(oldHistoryJabatan);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllHistoryJabatan() {
      if (historyJabatan != null)
         historyJabatan.clear();
   }

}