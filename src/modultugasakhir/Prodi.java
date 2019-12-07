/***********************************************************************
 * Module:  Prodi.java
 * Author:  Ajeng
 * Purpose: Defines the Class Prodi
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid f4611ccc-0ffe-4352-ad42-78ee6b4fdcf5 */
public class Prodi {
   /** @pdOid 17ef1b58-bf98-41d0-a055-6c8a9fb05258 */
   private String idProdi;
   /** @pdOid 754438f5-be27-4db6-95f8-44a03f7425f1 */
   private String namaProdi;
   
   /** @pdRoleInfo migr=no name=Dosen assc=dosenDanProdi coll=java.util.Collection impl=java.util.ArrayList mult=1..* */
   public java.util.Collection<Dosen> Dosen;
   
   /** @pdOid 65f52ae3-c356-40c5-9684-365860c005cc */
   public Prodi() {
      // TODO: implement
   }
   
   /** @pdOid b2b4b6f0-e1ad-4e8f-9870-6da2485631eb */
   public String getIdProdi() {
      return idProdi;
   }
   
   /** @param newIdProdi
    * @pdOid f588a02f-32ca-44a8-be36-7c4a743b2949 */
   public void setidProdi(String newIdProdi) {
      idProdi = newIdProdi;
   }
   
   /** @pdOid a2531aa7-b64d-4c8f-920e-de8408e32c58 */
   public String getNamaProdi() {
      return namaProdi;
   }
   
   /** @param newNamaProdi
    * @pdOid 8407c2df-0412-4822-bae2-7c83b173ff1b */
   public void setnamaProdi(String newNamaProdi) {
      namaProdi = newNamaProdi;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Dosen> getDosen() {
      if (Dosen == null)
         Dosen = new java.util.ArrayList<Dosen>();
      return Dosen;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDosen() {
      if (Dosen == null)
         Dosen = new java.util.ArrayList<Dosen>();
      return Dosen.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDosen */
   public void setDosen(java.util.Collection<Dosen> newDosen) {
      removeAllDosen();
      for (java.util.Iterator iter = newDosen.iterator(); iter.hasNext();)
         addDosen((Dosen)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDosen */
   public void addDosen(Dosen newDosen) {
      if (newDosen == null)
         return;
      if (this.Dosen == null)
         this.Dosen = new java.util.ArrayList<Dosen>();
      if (!this.Dosen.contains(newDosen))
      {
         this.Dosen.add(newDosen);
         newDosen.addProdi(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldDosen */
   public void removeDosen(Dosen oldDosen) {
      if (oldDosen == null)
         return;
      if (this.Dosen != null)
         if (this.Dosen.contains(oldDosen))
         {
            this.Dosen.remove(oldDosen);
            oldDosen.removeProdi(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDosen() {
      if (Dosen != null)
      {
         Dosen oldDosen;
         for (java.util.Iterator iter = getIteratorDosen(); iter.hasNext();)
         {
            oldDosen = (Dosen)iter.next();
            iter.remove();
            oldDosen.removeProdi(this);
         }
      }
   }

}