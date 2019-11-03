package modultugasakhir;

/***********************************************************************
 * Module:  Judul.java
 * Author:  Ajeng
 * Purpose: Defines the Class Judul
 ***********************************************************************/

import java.util.*;

/** @pdOid 59347f59-560c-4964-950f-d02c2aeb0601 */
public class Judul {
   /** @pdOid dd90ee62-0c4e-4e66-9e73-10b2fa40195c */
   private String IDJudul;
   /** @pdOid a3b87a87-981e-424e-a1e9-30495b613d22 */
   private String namaJudul;
   /** @pdOid aa2c9b73-b844-4b05-b7df-13c95d11bb33 */
   private String deskripsi;
   
   /** @pdRoleInfo migr=no name=Revisi assc=association16 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Revisi> revisi;
   
   /**
     * @return  *  @pdOid a8f77dbe-c289-43fd-9c60-54d4784ee014 */
   public String getIDJudul() {
      return IDJudul;
   }
   
   /** @param newIDJudul
    * @pdOid fb048467-8bdf-4a90-b10c-8cd8a28377d9 */
   public void setIDJudul(String newIDJudul) 
	{
            if (null == newIDJudul)
                System.out.println("input salah");
            else
                IDJudul = newIDJudul;
	}
   
   /**
     * @return  *  @pdOid a5b8393d-a89f-4e5a-8229-174084bee921 */
   public String getNamaJudul() {
      return namaJudul;
   }
   
   /** @param newNamaJudul
    * @pdOid ea0a7653-fd25-4f24-b8bf-c8d1ed773fdc */
   public void setNamaJudul(String newNamaJudul) 
	{
	   if (null == newNamaJudul)
            System.out.println("input salah");
        else
            System.out.println("");
      namaJudul = newNamaJudul;
	}
   
   /**
     * @return  *  @pdOid 6b500434-4bde-412a-bbdf-f9fe9aee654c */
   public String getDeskripsi() {
      return deskripsi;
   }
   
   /** @param newDeskripsi
    * @pdOid 088f0e5e-76c4-4166-adbe-1d4784fffa07 */
   public void setDeskripsi(String newDeskripsi) 
	{
	   if (null == newDeskripsi)
            System.out.println("input salah");
        else
            System.out.println("");
	   deskripsi = newDeskripsi;
	}
   
   /** @pdOid 9a8f7990-1031-47be-b9c0-5ab54af3d41f */
   public void judul() 
	{
		setNamaJudul("-");
		setDeskripsi("-");
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

}