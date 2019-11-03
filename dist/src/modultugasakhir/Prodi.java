package modultugasakhir;

/***********************************************************************
 * Module:  Prodi.java
 * Author:  Ajeng
 * Purpose: Defines the Class Prodi
 ***********************************************************************/

import java.util.*;

/** @pdOid d3667420-4c3c-47a1-a3b3-07b8d8163c12 */
public class Prodi {
   /** @pdOid b04f9d7c-74a3-4063-ae85-e53dbf6a4d35 */
   private String IDProdi;
   /** @pdOid 761ac1a7-e937-4684-a698-66759dcdeec7 */
   private String namaProdi;
   
   /** @pdRoleInfo migr=no name=JadwalSeminar assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<JadwalSeminar> jadwalSeminar;
   
   /**
     * @return  *  @pdOid 4e91d097-b442-4a95-abb4-50a4a6909d90 */
   public String getIDProdi() {
      return IDProdi;
   }
   
   /** @param newIDProdi
    * @pdOid fdc7da2d-cb2a-47c2-ab54-186f77e9b81d */
   public void setIDProdi(String newIDProdi) 
	{
            if (null == newIDProdi)
                System.out.println("input salah");
            else
                IDProdi = newIDProdi;
	}
   
   /**
     * @return  *  @pdOid 09c89745-5da2-45ef-a909-1a907b449c0a */
   public String getNamaProdi() {
      return namaProdi;
   }
   
   /** @param newNamaProdi
    * @pdOid 0216e797-24b9-4f37-a3c4-254fa2a3ee7e */
   public void setNamaProdi(String newNamaProdi) 
	{
            if (null == newNamaProdi)
                System.out.println("input salah");
            else
                namaProdi = newNamaProdi;
	}
   
   
   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<JadwalSeminar> getJadwalSeminar() {
      if (jadwalSeminar == null)
         jadwalSeminar = new java.util.HashSet<JadwalSeminar>();
      return jadwalSeminar;
   }
   
   /**
     * @return  *  @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorJadwalSeminar() {
      if (jadwalSeminar == null)
         jadwalSeminar = new java.util.HashSet<JadwalSeminar>();
      return jadwalSeminar.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newJadwalSeminar */
   public void setJadwalSeminar(java.util.Collection<JadwalSeminar> newJadwalSeminar) {
      removeAllJadwalSeminar();
      for (java.util.Iterator iter = newJadwalSeminar.iterator(); iter.hasNext();)
         addJadwalSeminar((JadwalSeminar)iter.next());

	  if (null == newJadwalSeminar)
            System.out.println("input salah");
        else
            System.out.println("");
   }
   
   /** @pdGenerated default add
     * @param newJadwalSeminar */
   public void addJadwalSeminar(JadwalSeminar newJadwalSeminar) {
      if (newJadwalSeminar == null)
         return;
      if (this.jadwalSeminar == null)
         this.jadwalSeminar = new java.util.HashSet<JadwalSeminar>();
      if (!this.jadwalSeminar.contains(newJadwalSeminar))
         this.jadwalSeminar.add(newJadwalSeminar);
   }
   
   /** @pdGenerated default remove
     * @param oldJadwalSeminar */
   public void removeJadwalSeminar(JadwalSeminar oldJadwalSeminar) {
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