/***********************************************************************
 * Module:  HistoryJabatan.java
 * Author:  Ajeng
 * Purpose: Defines the Class HistoryJabatan
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid b600160e-01ee-4083-906e-55397010cd1d */
public class HistoryJabatan {
   /** @pdOid 4de69ad5-eae8-4cc6-bc2a-07ed70f0b502 */
   private String idHistoryJabatan;
   /** @pdOid 836a1d52-8cca-4285-b78c-e6e44a5b57b2 */
   private Date startDate;
   /** @pdOid 15db7d37-712c-457f-bd28-eb49582bdfff */
   private String tahunAjaran;
   /** @pdOid 4ed2ab5f-f504-4904-bdcf-da5d1a5d2f42 */
   private java.lang.Boolean statusAktif;
   
   /** @pdRoleInfo migr=no name=Jabatan assc=association8 mult=1..1 side=A */
   public Jabatan Jabatan;
   
   /** @pdOid 20bcc0c2-9052-46c1-941d-bfbda0eefd32 */
   public HistoryJabatan() {
      // TODO: implement
   }
   
   /** @pdOid 7b8cbf7d-7747-44e8-9121-a5c1f30fd127 */
   public String getIdHistoryJabatan() {
      return idHistoryJabatan;
   }
   
   /** @param newIdHistoryJabatan
    * @pdOid 57041b6c-889b-4af7-840e-622c8d54f96b */
   public void setidHistoryJabatan(String newIdHistoryJabatan) {
      idHistoryJabatan = newIdHistoryJabatan;
   }
   
   /** @pdOid 09a3ed6c-4e30-412a-9c34-315398a0e293 */
   public Date getstartDate() {
      return startDate;
   }
   
   /** @param newStartDate
    * @pdOid 66b1afe3-318d-4ba5-822b-2690644eea02 */
   public void setstartDate(Date newStartDate) {
      startDate = newStartDate;
   }
   
   /** @pdOid f08a1495-eea0-410f-b4ff-7abfe1651cf7 */
   public String gettahunAjaran() {
      return tahunAjaran;
   }
   
   /** @param newTahunAjaran
    * @pdOid 3f2d405d-b64b-4eb8-97cb-62799c567b2f */
   public void settahunAjaran(String newTahunAjaran) {
      tahunAjaran = newTahunAjaran;
   }
   
   /** @pdOid 8ac12e84-03d1-40a1-b5de-51c71fff1801 */
   public java.lang.Boolean getStatusAktif() {
      return statusAktif;
   }
   
   /** @param newStatusAktif
    * @pdOid 57cdcf14-bf71-416f-bc1c-ad668f2b67c1 */
   public void setstatusAktif(java.lang.Boolean newStatusAktif) {
      statusAktif = newStatusAktif;
   }

}