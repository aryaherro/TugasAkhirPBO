package modultugasakhir;

/***********************************************************************
 * Module:  Kelayakan.java
 * Author:  Ajeng
 * Purpose: Defines the Class Kelayakan
 ***********************************************************************/

/** @pdOid 4d95b612-8729-4aae-8d5f-6e3e91b604c2 */
public class Kelayakan {
   /** @pdOid f760e90f-9347-4994-9bcb-4332502d82aa */
   private String idLayak;
   /** @pdOid 69287df3-c2cc-41af-9522-ee5eb52f4b52 */
   private boolean statusLayak;
   
   /** @pdRoleInfo migr=no name=JadwalSeminar assc=menentukan coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<JadwalSeminar> jadwalSeminar;
   
   /** @pdOid 92b41707-fa96-45da-99d5-295369a4af6c */
   public void kelayakan() {
      // TODO: implement
   }
   
   /**
     * @return  *  @pdOid 8a468889-fe17-4b2e-9fac-d5cccfd241b6 */
   public String getIDLayak() {
      return idLayak;
   }
   
   /** @param newIDLayak
    * @pdOid c64066ca-0013-497d-8175-13e72f0ebcd9 */
   public void setIDLayak(String newIDLayak) {
      idLayak = newIDLayak;
   }
   
   /**
     * @return  *  @pdOid df5dd429-201b-4282-a136-e1a5c7a0969b */
   public boolean isStatusLayak() {
      return statusLayak;
   }
   
   /** @param newStatusLayak
    * @pdOid 94e066a6-ef6a-4406-b482-d396c097ee3d */
   public void setStatusLayak(boolean newStatusLayak) {
      statusLayak = newStatusLayak;
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