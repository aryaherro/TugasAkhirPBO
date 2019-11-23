/***********************************************************************
 * Module:  historyJabatan.java
 * Author:  Ajeng
 * Purpose: Defines the Class historyJabatan
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 1354cc0c-7286-4761-a68a-ea552331f0b1 */
public class historyJabatan {
   /** @pdOid e345ce29-9604-407a-9a84-b23656779525 */
   private int idHistoryJabatan;
   /** @pdOid d64c0ca1-cfd8-41a3-8ae3-2aa0e0a555b5 */
   private Date startDate;
   /** @pdOid 390f7f99-906d-487d-bbcc-246ea4c32a1e */
   private String tahunAjaran;
   /** @pdOid 476d043b-5fc6-4bbe-9aad-88c75cfef98e */
   private boolean statusAktif;
   
   /** @pdOid 2fc538ce-44be-4fb4-9303-d88ed494952f */
   public historyJabatan() {
      // TODO: implement
   }
   
   /** @pdOid d2f8ffe0-7797-4afa-8b6e-86311d95d592 */
   public int getidHistoryJabatan() {
      return idHistoryJabatan;
   }
   
   /** @param newIdHistoryJabatan
    * @pdOid 2f9edd52-939c-420a-b2d5-abeec43ea6af */
   public void setidHistoryJabatan(int newIdHistoryJabatan) {
      idHistoryJabatan = newIdHistoryJabatan;
   }
   
   /** @pdOid f460b7fa-0fae-47c7-96c5-96508d3da779 */
   public Date getstartDate() {
      return startDate;
   }
   
   /** @param newStartDate
    * @pdOid 16cc6be6-9983-43d4-8d0d-490512ea116a */
   public void setstartDate(Date newStartDate) {
      startDate = newStartDate;
   }
   
   /** @pdOid 0265f005-e83a-4044-9296-ff1407005e61 */
   public String gettahunAjaran() {
      return tahunAjaran;
   }
   
   /** @param newTahunAjaran
    * @pdOid c1f72d87-5145-4761-a655-372fe7857a98 */
   public void settahunAjaran(String newTahunAjaran) {
      tahunAjaran = newTahunAjaran;
   }
   
   /** @pdOid b2bb78ee-1baf-45e5-898e-dc9f8ddf0917 */
   public boolean isstatusAktif() {
      return statusAktif;
   }
   
   /** @param newStatusAktif
    * @pdOid 0171f625-f40a-4d95-aa80-b416c3c4a114 */
   public void setstatusAktif(boolean newStatusAktif) {
      statusAktif = newStatusAktif;
   }

}