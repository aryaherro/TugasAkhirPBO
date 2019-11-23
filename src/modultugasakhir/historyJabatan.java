/***********************************************************************
 * Module:  historyJabatan.java
 * Author:  Ajeng
 * Purpose: Defines the Class historyJabatan
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid e251f84f-326d-463d-b254-0d7bb94ecfbe */
public class historyJabatan {
   /** @pdOid 8bcd22a8-5848-4499-92e9-b340ca027d08 */
   private int idHistoryJabatan;
   /** @pdOid 7035bc7b-4744-41a3-aa42-6c06f58fe72a */
   private Date startDate;
   /** @pdOid d6474252-dd94-4ce6-97cd-cdfce0b06992 */
   private String tahunAjaran;
   /** @pdOid 071095c4-2823-4ba3-b4ba-8ed47dae99c5 */
   private boolean statusAktif;
   
   /** @pdOid 0d714193-f8eb-4c9f-a4b2-270f38f78a93 */
   public historyJabatan() {
      // TODO: implement
   }
   
   /**
     * @return  *  @pdOid 7dce8382-65e0-47b8-ab45-9001c1421b9e */
   public int getidHistoryJabatan() {
      return idHistoryJabatan;
   }
   
   /** @param newIdHistoryJabatan
    * @pdOid bce4f12b-c653-42f7-8cdf-9b00c16ce6cd */
   public void setidHistoryJabatan(int newIdHistoryJabatan) {
      idHistoryJabatan = newIdHistoryJabatan;
   }
   
   /**
     * @return  *  @pdOid e9444da8-fc8a-44bf-b4db-5c4f5f0cfce7 */
   public Date getstartDate() {
      return startDate;
   }
   
   /** @param newStartDate
    * @pdOid c1130328-6eec-421f-ab3e-b3971701a82d */
   public void setstartDate(Date newStartDate) {
      startDate = newStartDate;
   }
   
   /**
     * @return  *  @pdOid faa34743-749f-4654-98f9-fcb0e20c8114 */
   public String gettahunAjaran() {
      return tahunAjaran;
   }
   
   /** @param newTahunAjaran
    * @pdOid 21db574c-e7ff-456e-a80e-e62e6a1a7875 */
   public void settahunAjaran(String newTahunAjaran) {
      tahunAjaran = newTahunAjaran;
   }
   
   /**
     * @return  *  @pdOid a70a451c-2ba5-4a14-9c37-5f421cab4b3e */
   public boolean isstatusAktif() {
      return statusAktif;
   }
   
   /** @param newStatusAktif
    * @pdOid 605e1922-8574-4e37-a9fe-7c0871dc3977 */
   public void setstatusAktif(boolean newStatusAktif) {
      statusAktif = newStatusAktif;
   }

}