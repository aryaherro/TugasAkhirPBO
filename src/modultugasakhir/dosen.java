/***********************************************************************
 * Module:  dosen.java
 * Author:  Ajeng
 * Purpose: Defines the Class dosen
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid fd9527fc-2969-4a29-8e5f-28f69e82d26a */
public class dosen extends manusia {
   /** @pdOid d2f85ee7-053d-4eef-97e1-62c44ab46732 */
   private String npp;
   /** @pdOid c8e22c59-2e6d-4d48-aaec-76f7fc1ca2cc */
   private String dosenPassword;
   
   /** @pdRoleInfo migr=no name=prodi assc=dosenBagianProdi coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<prodi> prodi;
   
   /** @pdOid 9363ffee-b59b-47a1-9c4e-a7f8dee99e0e */
   public dosen() {
      // TODO: implement
   }
   
   /** @pdOid 159b3cf0-e6f1-4b9e-a613-e28c15153160 */
   public String getnpp() {
      return npp;
   }
   
   /** @param newNpp
    * @pdOid 7a9b3af7-8193-4514-8018-626d78b9ef49 */
   public void setnpp(String newNpp) {
      npp = newNpp;
   }
   
   /** @pdOid c2ee7064-18aa-4e5c-a0c8-c346a114e7d6 */
   public String getdosenPassword() {
      return dosenPassword;
   }
   
   /** @param newDosenPassword
    * @pdOid ab914467-7daf-4d16-80f2-6555fc147677 */
   public void setdosenPassword(String newDosenPassword) {
      dosenPassword = newDosenPassword;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<prodi> getProdi() {
      if (prodi == null)
         prodi = new java.util.HashSet<prodi>();
      return prodi;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProdi() {
      if (prodi == null)
         prodi = new java.util.HashSet<prodi>();
      return prodi.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProdi */
   public void setProdi(java.util.Collection<prodi> newProdi) {
      removeAllProdi();
      for (java.util.Iterator iter = newProdi.iterator(); iter.hasNext();)
         addProdi((prodi)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProdi */
   public void addProdi(prodi newProdi) {
      if (newProdi == null)
         return;
      if (this.prodi == null)
         this.prodi = new java.util.HashSet<prodi>();
      if (!this.prodi.contains(newProdi))
         this.prodi.add(newProdi);
   }
   
   /** @pdGenerated default remove
     * @param oldProdi */
   public void removeProdi(prodi oldProdi) {
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