/***********************************************************************
 * Module:  historyJabatan.java
 * Author:  Ajeng
 * Purpose: Defines the Class historyJabatan
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 69e585a7-f0c0-4567-9429-b318013e12a7 */
public class historyJabatan {
   /** @pdOid c04fe4cc-26f0-4b84-a0ba-9484d74cbbee */
   private int idHistoryJabatan;
   /** @pdOid 2c7b9745-601a-48bc-9ad8-a3d5704accdc */
   private Date startDate;
   /** @pdOid 3f6e7f96-c441-4d9a-9d98-5e91e4656875 */
   private String tahunAjaran;
   /** @pdOid 5f0e7aab-2d23-4fbb-9f0d-6618dc4430c2 */
   private boolean statusAktif;
   
   /** @pdRoleInfo migr=no name=jabatan assc=jabatanDicatatDalamHistory coll=java.util.Collection impl=java.util.HashSet mult=1..1 side=A */
   public jabatan jabatan;
   
   /** @pdOid ed42367a-5e37-421b-97fd-c930c50596db */
   public historyJabatan() {
      // TODO: implement
   }
   
   /** @pdOid 1e6d3ab8-7835-41db-bb64-535698e3a204 */
   public int getidHistoryJabatan() {
      return idHistoryJabatan;
   }
   
   /** @param newIdHistoryJabatan
    * @pdOid 1cf8a4db-6508-4800-a386-3690f60bbc48 */
   public void setidHistoryJabatan(int newIdHistoryJabatan) {
      idHistoryJabatan = newIdHistoryJabatan;
   }
   
   /** @pdOid e1fc6dac-8b93-4757-a90b-e1ddd9dc2063 */
   public Date getstartDate() {
      return startDate;
   }
   
   /** @param newStartDate
    * @pdOid 774b4bb6-9d06-49f4-a768-dbdf05716cec */
   public void setstartDate(Date newStartDate) {
      startDate = newStartDate;
   }
   
   /** @pdOid 1f8b54c4-2085-4606-9fc7-b0a0d015ed5e */
   public String gettahunAjaran() {
      return tahunAjaran;
   }
   
   /** @param newTahunAjaran
    * @pdOid 7e56d6e6-f8ed-489e-8e22-e59891a0e762 */
   public void settahunAjaran(String newTahunAjaran) {
      tahunAjaran = newTahunAjaran;
   }
   
   /** @pdOid 45e64d93-01f9-4374-8349-e36448244189 */
   public boolean isstatusAktif() {
      return statusAktif;
   }
   
   /** @param newStatusAktif
    * @pdOid 37c37027-1cfa-49c2-a5ef-2c848891c407 */
   public void setstatusAktif(boolean newStatusAktif) {
      statusAktif = newStatusAktif;
   }

}