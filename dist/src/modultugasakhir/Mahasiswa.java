package modultugasakhir;

/***********************************************************************
 * Module:  Mahasiswa.java
 * Author:  Ajeng
 * Purpose: Defines the Class Mahasiswa
 ***********************************************************************/

import java.util.*;

/** @pdOid 2fe76d86-bbfc-4824-9208-351cb9c2555c */
public class Mahasiswa extends Manusia {
   /** @pdOid 23f296af-c863-463d-a65c-93d920eaa0e4 */
   private int IDMahasiswa;
   /** @pdOid cb12d948-bb24-4136-83a6-91e4046a46a7 */
   private int nim;
   
   /** @pdRoleInfo migr=no name=Prodi assc=association17 coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Prodi prodi;
   /** @pdRoleInfo migr=no name=Judul assc=association15 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Judul> judul;
   /** @pdRoleInfo migr=no name=JadwalSeminar assc=association18 coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public JadwalSeminar jadwalSeminar;
   
   /**
     * @return  *  @pdOid d7ddaae8-b4e6-411b-b5e7-445c7ef5dce4 */
   public int getIDMahasiswa() {
      return IDMahasiswa;
   }
   
   /** @param newIDMahasiswa
    * @pdOid ad2dce34-55bb-4fec-bfb5-11d35d4d293f */
   public void setIDMahasiswa(int newIDMahasiswa) 
	{
	   if (newIDMahasiswa < 0)
            System.out.println("input salah");
        else
            System.out.println("");
      IDMahasiswa = newIDMahasiswa;
	}
   
   /**
     * @return  *  @pdOid 5fc1a4ae-6010-4682-a4d0-1701e3f9c373 */
   public int getNIM() {
      return nim;
   }
   
   /** @param newNIM
    * @pdOid 5b6eeecc-7e30-4a5a-bc45-1f5bb8554507 */
   public void setNIM(int newNIM) 
	{
            if (newNIM < 0)
                System.out.println("input salah");
            else
                nim = newNIM;
	}
   
   /** @pdOid 6bf944ae-14b7-437c-80b1-c8f8e88380f3 */
   public void mahasiswa() 
	{
		setNIM(11);
	}
   
   
   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<Judul> getJudul() {
      if (judul == null)
         judul = new java.util.HashSet<Judul>();
      return judul;
   }
   
   /**
     * @return  *  @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorJudul() {
      if (judul == null)
         judul = new java.util.HashSet<Judul>();
      return judul.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newJudul */
   public void setJudul(java.util.Collection<Judul> newJudul) {
      removeAllJudul();
      for (java.util.Iterator iter = newJudul.iterator(); iter.hasNext();)
         addJudul((Judul)iter.next());

	  if (null == newJudul)
            System.out.println("input salah");
        else
            System.out.println("");
   }
   
   /** @pdGenerated default add
     * @param newJudul */
   public void addJudul(Judul newJudul) {
      if (newJudul == null)
         return;
      if (this.judul == null)
         this.judul = new java.util.HashSet<Judul>();
      if (!this.judul.contains(newJudul))
         this.judul.add(newJudul);
   }
   
   /** @pdGenerated default remove
     * @param oldJudul */
   public void removeJudul(Judul oldJudul) {
      if (oldJudul == null)
         return;
      if (this.judul != null)
         if (this.judul.contains(oldJudul))
            this.judul.remove(oldJudul);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllJudul() {
      if (judul != null)
         judul.clear();
   }

}