/***********************************************************************
 * Module:  jabatan.java
 * Author:  Ajeng
 * Purpose: Defines the Class jabatan
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 3063e55a-9375-4e77-8adb-f24808120c30 */
public class jabatan {
   /** @pdOid fe0df7c3-0219-4d1c-b04b-50e1308d60b3 */
   private int idJabatan;
   /** @pdOid f9e0fe80-6903-4725-9a5a-9425615d2925 */
   private String namaJabatan;
   
   /** @pdRoleInfo migr=no name=dosen assc=dosenMenjabatSebagai mult=1..1 */
   public dosen dosen;
   /** @pdRoleInfo migr=no name=historyJabatan assc=jabatanDicatatDalamHistory coll=java.util.Collection impl=java.util.ArrayList mult=1..* */
   public java.util.Collection<historyJabatan> historyJabatan;
   
   /** @pdOid e01d3a2d-ac48-41fe-ac1d-7f2d62200b83 */
   public jabatan() {
      // TODO: implement
   }
   
   /** @pdOid a41d4f96-3930-4e5c-8b01-d1836222f536 */
   public int getidJabatan() {
      return idJabatan;
   }
   
   /** @param newIdJabatan
    * @pdOid 7b4f7e15-5f08-4924-9cda-dac8d0ccaf74 */
   public void setidJabatan(int newIdJabatan) {
      idJabatan = newIdJabatan;
   }
   
   /** @pdOid ce8354ad-4896-40b8-8a48-38bc4fdc4d92 */
   public String getnamaJabatan() {
      return namaJabatan;
   }
   
   /** @param newNamaJabatan
    * @pdOid 0eb03878-df06-4020-b39a-32e7fc80a77f */
   public void setnamaJabatan(String newNamaJabatan) {
      namaJabatan = newNamaJabatan;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<historyJabatan> getHistoryJabatan() {
      if (historyJabatan == null)
         historyJabatan = new java.util.ArrayList<historyJabatan>();
      return historyJabatan;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorHistoryJabatan() {
      if (historyJabatan == null)
         historyJabatan = new java.util.ArrayList<historyJabatan>();
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
         this.historyJabatan = new java.util.ArrayList<historyJabatan>();
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