package modultugasakhir;

/***********************************************************************
 * Module:  Jabatan.java
 * Author:  Ajeng
 * Purpose: Defines the Class Jabatan
 ***********************************************************************/

import java.util.*;

/** @pdOid dd6da3f7-11fb-4e6d-b00b-a22eb6149761 */
public class Jabatan {
   /** @pdOid b810497a-2432-4656-9f56-8575057a829c */
   private String idJabatan;
   /** @pdOid 341c55c1-16e7-4e51-9b6b-322582de3aff */
   private String namaJabatan;

   /** @pdRoleInfo migr=no name=HistoryJabatan assc=pencatatan coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<HistoryJabatan> historyJabatan;

   /** @pdOid e3c8831c-5585-4013-bd03-f28581c91d9b */
   public void jabatan() {
      // TODO: implement
   }

   /** @pdOid e329c252-f48d-45f0-bdc7-b866656f0a6c */
   public String getIDJabatan() {
      return idJabatan;
   }

   /** @param newIDJabatan
    * @pdOid a86a651f-075d-4a8d-ac10-b7923ed06cdf */
   public void setIDJabatan(String newIDJabatan) {
      idJabatan = newIDJabatan;
   }

   /** @pdOid c3885193-7309-4c2e-8cae-1351cc2a99fa */
   public String getNamaJabatan() {
      return namaJabatan;
   }

   /** @param newNamaJabatan
    * @pdOid 9579be4b-f0c2-4e05-a0e4-6d90a5c259c3 */
   public void setNamaJabatan(String newNamaJabatan) {
      namaJabatan = newNamaJabatan;
   }


   /** @pdGenerated default getter */
   public java.util.Collection<HistoryJabatan> getHistoryJabatan() {
      if (historyJabatan == null)
         historyJabatan = new java.util.HashSet<HistoryJabatan>();
      return historyJabatan;
   }

   /** @pdGenerated default iterator getter */
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
