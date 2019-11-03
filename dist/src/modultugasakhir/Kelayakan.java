package modultugasakhir;

/***********************************************************************
 * Module:  Kelayakan.java
 * Author:  Ajeng
 * Purpose: Defines the Class Kelayakan
 ***********************************************************************/

import java.util.*;

/** @pdOid 796c5049-0439-4d9b-b53c-bc690e729b92 */
public class Kelayakan {
   /** @pdOid 1fd9b479-4691-47c5-9cea-daff8f8e7fd4 */
   private String IDLayak;
   /** @pdOid 3482e5a2-5701-417c-adba-6bcb39c2b5e7 */
   private boolean statusLayak;
   
   /** @pdRoleInfo migr=no name=JadwalSeminar assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<JadwalSeminar> jadwalSeminar;
   
   /**
     * @return  *  @pdOid 1695be97-ac1f-479f-aa95-a112d3fb9127 */
   public String getIDLayak() {
      return IDLayak;
   }
   
   /** @param newIDLayak
    * @pdOid fed8b2ba-ccab-4177-ad9d-bef7f62662ce */
   public void setIDLayak(String newIDLayak) 
	{
            if (null == newIDLayak)
                System.out.println("input salah");
            else
                IDLayak = newIDLayak;
	}
   
   /**
     * @return  *  @pdOid 38b8d34f-2b56-4857-99f0-667a4b6a95d5 */
   public boolean isStatusLayak() {
      return statusLayak;
   }
   
   /** @param newStatusLayak
    * @pdOid 1aed3059-8b23-44db-b929-b6cedd17d8f9 */
   public void setStatusLayak(boolean newStatusLayak) 
	{
	   if (newStatusLayak == false)
            System.out.println("input salah");
        else
            System.out.println("");
      statusLayak = newStatusLayak;
	}
   
   /** @pdOid c8ae3e3e-baab-4472-a1f9-f511bc9120d7 */
   public void kelayakan() 
	{
		setStatusLayak(true);
	}
   
   
   /** @pdG
     * @return enerated default getter */

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