/***********************************************************************
 * Module:  jabatan.java
 * Author:  Ajeng
 * Purpose: Defines the Class jabatan
 ***********************************************************************/

package modultugasakhir;

/** @pdOid 34a340d5-3367-4f97-87e3-faf1bf5afcb1 */
public class jabatan {
   /** @pdOid 2f126d47-be7e-440d-9daa-74a0689259b4 */
   private int idJabatan;
   /** @pdOid bd05d030-2dba-4d01-8ee7-2f3aeece518d */
   private String namaJabatan;
   
   /** @pdRoleInfo migr=no name=dosen assc=dosenMenjabatSebagai coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   private dosen dosen;
   /** @pdRoleInfo migr=no name=historyJabatan assc=jabatanDicatatDalamHistory coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   private java.util.Collection<historyJabatan> historyJabatan;
   
   /** @pdOid b7d8bb4d-995e-4d19-b5b3-b901867237b8 */
   public jabatan() {
      // TODO: implement
   }
   
   /**
     * @return  *  @pdOid 14ba1d12-d0c7-4a57-8ec7-0a393499cac1 */
   public int getidJabatan() {
      return idJabatan;
   }
   
   /** @param newIdJabatan
    * @pdOid dc4b4664-768d-4673-92e7-513287290bfe */
   public void setidJabatan(int newIdJabatan) {
      idJabatan = newIdJabatan;
   }
   
   /**
     * @return  *  @pdOid c78be582-a883-494a-85c4-c93880d2bdbc */
   public String getnamaJabatan() {
      return namaJabatan;
   }
   
   /** @param newNamaJabatan
    * @pdOid f9a8139b-8251-4066-9bb6-6b20cbded4fc */
   public void setnamaJabatan(String newNamaJabatan) {
      namaJabatan = newNamaJabatan;
   }
   
   
   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<historyJabatan> getHistoryJabatan() {
      if (historyJabatan == null)
         historyJabatan = new java.util.HashSet<historyJabatan>();
      return historyJabatan;
   }
   
   /**
     * @return  *  @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorHistoryJabatan() {
      if (historyJabatan == null)
         historyJabatan = new java.util.HashSet<historyJabatan>();
      return historyJabatan.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newHistoryJabatan */
   public void setHistoryJabatan(java.util.Collection<historyJabatan> newHistoryJabatan) {
      removeAllHistoryJabatan();
      for (java.util.Iterator iter = newHistoryJabatan.iterator(); iter.hasNext();)
         addHistoryJabatan((historyJabatan)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newHistoryJabatan */
   public void addHistoryJabatan(historyJabatan newHistoryJabatan) {
      if (newHistoryJabatan == null)
         return;
      if (this.historyJabatan == null)
         this.historyJabatan = new java.util.HashSet<historyJabatan>();
      if (!this.historyJabatan.contains(newHistoryJabatan))
         this.historyJabatan.add(newHistoryJabatan);
   }
   
   /** @pdGenerated default remove
     * @param oldHistoryJabatan */
   public void removeHistoryJabatan(historyJabatan oldHistoryJabatan) {
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