package modultugasakhir;

/***********************************************************************
 * Module:  Dosen.java
 * Author:  Ajeng
 * Purpose: Defines the Class Dosen
 ***********************************************************************/

import java.util.*;

/** @pdOid 25130c09-13c8-4e8b-b7b1-7f928aab3f0e */
public class Dosen extends Manusia {
   /** @pdOid a6c569ad-97df-47d9-b0d7-bfe3cd16274d */
   private String IDDosen;
   /** @pdOid 24bbbcc3-41ed-42f9-acc9-165f7d6d91ec */
   private String npp;
   
   /** @pdRoleInfo migr=no name=Jabatan assc=menjabat coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Jabatan jabatan;
   /** @pdRoleInfo migr=no name=Prodi assc=association14 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Prodi> prodi;
   
   /**
     * @return  *  @pdOid b90cc494-00b7-4ae1-9aa9-e5d080d479d0 */
   public String getIDDosen() {
      return IDDosen;
   }
   
   /** @param newIDDosen
    * @pdOid 1b980929-ede3-4561-ad88-023777cd700d */
   public void setIDDosen(String newIDDosen) 
	{
	   if (null == newIDDosen)
            System.out.println("input salah");
            else
                IDDosen = newIDDosen;
	}
   
   /**
     * @return  *  @pdOid 58501c24-29ad-4de9-bb1c-4722624f7ca6 */
   public String getNPP() {
      return npp;
   }
   
   /** @param newNPP
    * @pdOid 26e8cf4e-f93c-42ba-be1f-3b82aa0d1691 */
   public void setNPP(String newNPP) 
	{
            if (null == newNPP)
                System.out.println("input salah");
            else
                npp = newNPP;
	}
   
   
   /**
     * @return  @pdGenerated default getter */
   public java.util.Collection<Prodi> getProdi() {
      if (prodi == null)
         prodi = new java.util.HashSet<Prodi>();
      return prodi;
   }
   
   /**
     * @return  @pdGenerated default iterator getter */
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

	  if (null == newProdi)
            System.out.println("input salah");
        else
            System.out.println("");
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