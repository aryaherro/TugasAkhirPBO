package modultugasakhir;

/***********************************************************************
 * Module:  JadwalSeminar.java
 * Author:  Ajeng
 * Purpose: Defines the Class JadwalSeminar
 ***********************************************************************/

import java.util.*;

/** @pdOid 7c4814b7-3f04-4adc-b0af-c54ac81cd325 */
public class JadwalSeminar {
   /** @pdOid d5acbfb1-a3e0-454f-9343-5be2ae1d27e3 */
   private String IDJadwal;
   /** @pdOid e713722e-752b-4019-bea5-32690ee40410 */
   private String jadwal;
   
   /** @pdRoleInfo migr=no name=BeritaAcara assc=association11 coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public BeritaAcara beritaAcara;
   
   /** @pdOid 129a99f4-b45f-4989-8efe-2da841b9972f */
   public String getIDJadwal() {
      return IDJadwal;
   }
   
   /** @param newIDJadwal
    * @pdOid 7343eb5d-ef6b-49a3-a85c-7328f3d2f86c */
   public void setIDJadwal(String newIDJadwal) 
	{
		if (null == newIDJadwal)
            System.out.println("input salah");
        else
            System.out.println("");
      IDJadwal = newIDJadwal;
	}
   
   /** @pdOid 4c7dd5ad-3a8a-40cf-ac06-3258e7a76174 */
   public String getJadwal() {
      return jadwal;
   }
   
   /** @param newJadwal
    * @pdOid c0b76a1e-2341-49b2-904a-64d0d22cb9c6 */
   public void setJadwal(String newJadwal) 
	{
	   if (null == newJadwal)
            System.out.println("input salah");
        else
            System.out.println("");
      jadwal = newJadwal;
	}
   
   /** @pdOid 788fa466-c799-443c-8701-61984cdd3616 */
   public void jadwalSeminar() 
	{
		setJadwal("-");
   }

}