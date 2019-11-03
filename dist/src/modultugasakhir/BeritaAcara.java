package modultugasakhir;

/***********************************************************************
 * Module:  BeritaAcara.java
 * Author:  Ajeng
 * Purpose: Defines the Class BeritaAcara
 ***********************************************************************/

import java.util.*;

/** @pdOid b3d9360d-3a29-4c15-9edb-644fb1fab4e7 */
public class BeritaAcara {
   /** @pdOid 62fd3ac4-62f9-4f89-93ca-e6d64baf5888 */
   private String IDBeritaAcara;
   /** @pdOid 406cbaad-8d91-4475-b79a-65b0da48bc4d */
   private String isiBeritaAcara;
   
   /**
     * @return  *  @pdOid 96450cfc-fc4e-416c-ad26-f573a6cf6426 */
   public String getIDBeritaAcara() {
      return IDBeritaAcara;
   }
   
   /** @param newIDBeritaAcara
    * @pdOid 2766f25f-c975-41c3-8250-6770df2e8f6d */
   public void setIDBeritaAcara(String newIDBeritaAcara) 
	{
	   if (null == newIDBeritaAcara)
            System.out.println("input salah");
        else
            System.out.println("");
      IDBeritaAcara = newIDBeritaAcara;
	}
   
   /**
     * @return  *  @pdOid 0dec9bb1-9a0a-4194-816c-7997450509fe */
   public String getIsiBeritaAcara() {
      return isiBeritaAcara;
   }
   
   /** @param newIsiBeritaAcara
    * @pdOid 94fa6155-88ea-47d3-8d78-d2113c9cec9d */
   public void setIsiBeritaAcara(String newIsiBeritaAcara) 
	{
	   if (null == newIsiBeritaAcara)
            System.out.println("input salah");
        else
            System.out.println("");
      isiBeritaAcara = newIsiBeritaAcara;
	}
   
   /** @pdOid b2f26ee9-f4ad-4b7e-95eb-4a4848ab8c35 */
   public void beritaAcara() 
	{
		setIsiBeritaAcara("-");
	}

}