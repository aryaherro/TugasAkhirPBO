/***********************************************************************
 * Module:  Dosen.java
 * Author:  Ajeng
 * Purpose: Defines the Class Dosen
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid d073d216-20a9-409a-bf99-fa8d8f5acf35 */
public class Dosen extends Manusia {
   /** @pdOid 1eae3a74-931a-42ea-b27d-e3f7ed6b8b0a */
   private String npp;
   
   /** @pdRoleInfo migr=no name=Prodi assc=dosenDanProdi coll=java.util.Collection impl=java.util.ArrayList mult=1..* side=A */
   public java.util.Collection<Prodi> Prodi;
   
   /** @pdOid 0884e90e-c8df-4388-a36e-91b18e496b93 */
   public Dosen() {
      // TODO: implement
   }
   
   /** @pdOid f2e654c5-335f-484e-922b-9d00c8e3976f */
   public String getNpp() {
      return npp;
   }
   
   /** @param newNpp
    * @pdOid cc25bbe9-9b70-484b-95df-60e3202dad30 */
   public void setnpp(String newNpp) {
      npp = newNpp;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Prodi> getProdi() {
      if (Prodi == null)
         Prodi = new java.util.ArrayList<Prodi>();
      return Prodi;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProdi() {
      if (Prodi == null)
         Prodi = new java.util.ArrayList<Prodi>();
      return Prodi.iterator();
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
      if (this.Prodi == null)
         this.Prodi = new java.util.ArrayList<Prodi>();
      if (!this.Prodi.contains(newProdi))
      {
         this.Prodi.add(newProdi);
         newProdi.addDosen(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldProdi */
   public void removeProdi(Prodi oldProdi) {
      if (oldProdi == null)
         return;
      if (this.Prodi != null)
         if (this.Prodi.contains(oldProdi))
         {
            this.Prodi.remove(oldProdi);
            oldProdi.removeDosen(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProdi() {
      if (Prodi != null)
      {
         Prodi oldProdi;
         for (java.util.Iterator iter = getIteratorProdi(); iter.hasNext();)
         {
            oldProdi = (Prodi)iter.next();
            iter.remove();
            oldProdi.removeDosen(this);
         }
      }
   }

}