package modultugasakhir;

import java.util.*;

/** @pdOid b8369952-17d0-4cde-8ff7-5867fa7ac308 */
public class HistoryJabatan {
   /** @pdOid d0bfabef-d22a-40da-8809-444766d9ff4d */
   private String IDHistoryJabatan;
   /** @pdOid 93075ef5-491d-4a03-8c81-79bc54c79f0c */
   private java.util.Date startDate;
   /** @pdOid 5d83929e-6b9f-4760-b8bc-6ccdfecfe745 */
   private String tahunAjaran;
   /** @pdOid ebc2e85a-ec1b-4952-9f2a-596b2922487e */
   private boolean statusAktif;
   
   /**
     * @return  *  @pdOid 9c843f2a-d191-43ba-a2b7-8386c43a2ed7 */
   public String getIDHistoryJabatan() {
      return IDHistoryJabatan;
   }
   
   /** @param newIDHistoryJabatan
    * @pdOid 0c0ec652-5505-42cf-9d17-28235ceb4beb */
   public void setIDHistoryJabatan(String newIDHistoryJabatan) 
	{
	   if (null == newIDHistoryJabatan)
            System.out.println("input salah");
        else
            System.out.println("");
      IDHistoryJabatan = newIDHistoryJabatan;
	}
   
   /**
     * @return  *  @pdOid ab31e964-e23a-4fba-a915-c430c4cd0583 */
   public java.util.Date getStartDate() {
      return startDate;
   }
   
   /** @param newStartDate
    * @pdOid 15c8a9bd-221d-4610-8192-322f1987bd39 */
   public void setStartDate(java.util.Date newStartDate) 
	{
	   if (null == newStartDate)
            System.out.println("input salah");
        else
            System.out.println("");
      startDate = newStartDate;
	}
   
   /**
     * @return  *  @pdOid bcc42829-3e4d-4f2d-80b0-750e32553ea5 */
   public String getTahunAjaran() {
      return tahunAjaran;
   }
   
   /** @param newTahunAjaran
    * @pdOid 6cd5c736-27e3-44c6-9e9f-deca079cb989 */
   public void setTahunAjaran(String newTahunAjaran) 
	{
	   if (null == newTahunAjaran)
            System.out.println("input salah");
        else
            System.out.println("");
      tahunAjaran = newTahunAjaran;
	}
   
   /**
     * @return  *  @pdOid 870df15c-118d-4166-8916-461cf5b470af */
   public boolean isStatusAktif() {
      return statusAktif;
   }
   
   /** @param newStatusAktif
    * @pdOid bdff8eee-fa1e-4310-b216-14181e0d7551 */
   public void setStatusAktif(boolean newStatusAktif) 
	{
	   if (newStatusAktif == false)
            System.out.println("input salah");
        else
            System.out.println("");
      statusAktif = newStatusAktif;
	}
   
   /** @pdOid 6640aafd-0b22-4c38-90b5-153b9be9b26c */
   public void historyJabatan() 
	{
		setStatusAktif(true);
		setTahunAjaran("-");
   }

}