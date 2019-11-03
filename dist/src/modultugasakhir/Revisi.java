package modultugasakhir;

/***********************************************************************
 * Module:  Revisi.java
 * Author:  Ajeng
 * Purpose: Defines the Class Revisi
 ***********************************************************************/

import java.util.*;

/** @pdOid d6a63bc0-1981-46fa-aec5-b74071f0fbf3 */
public class Revisi {
   /** @pdOid 4ac221f0-38b2-4857-86cb-c1376dadc1e6 */
   private String IDRevisi;
   /** @pdOid 3ab9c2b9-418b-4849-8e72-3fca8231705f */
   private String isiRevisi;
   
   /** @pdRoleInfo migr=no name=Kelayakan assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public Kelayakan kelayakan;
   
   /** @pdOid 967e078b-84ff-4865-8e27-1519005d893b */
   public String getIDRevisi() {
      return IDRevisi;
   }
   
   /** @param newIDRevisi
    * @pdOid 478a4180-9bc9-4128-ba95-7ae4572c2461 */
   public void setIDRevisi(String newIDRevisi) 
	{
	   if (null == newIDRevisi)
            System.out.println("input salah");
        else
            System.out.println("");
      IDRevisi = newIDRevisi;
	}
   
   /** @pdOid ab86b4aa-bb66-4ca5-873d-2f6fbd5d99ee */
   public String getIsiRevisi() {
      return isiRevisi;
   }
   
   /** @param newIsiRevisi
    * @pdOid a2f83924-d38e-4075-82c4-578005a646f9 */
   public void setIsiRevisi(String newIsiRevisi) 
	{
	   if (null == newIsiRevisi)
            System.out.println("input salah");
        else
            System.out.println("");
      isiRevisi = newIsiRevisi;
	}
   
   /** @pdOid da61dbf4-4b8b-44e9-b916-afe126802a18 */
   public void revisi() 
	{
		setIsiRevisi("-");
   }

}