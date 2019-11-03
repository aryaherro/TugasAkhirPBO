package modultugasakhir;

/***********************************************************************
 * Module:  Manusia.java
 * Author:  Ajeng
 * Purpose: Defines the Class Manusia
 ***********************************************************************/

import java.util.*;

/** @pdOid da6ca950-5144-4694-86c8-66fc9060a90e */
public class Manusia {
   /** @pdOid 418f6d7f-844b-4c4b-8cba-697054a49d58 */
   private String nama;
   /** @pdOid f212ab0a-f22b-4040-95de-b880395a9ad6 */
   private String nik;
   /** @pdOid abe72781-2213-495a-9bf2-1cbf0ec70f21 */
   private String tanggalLahir;
   /** @pdOid ae6d4db6-b1c1-4004-8d3c-1ef2d4f58d0b */
   private char jenisKelamin;
   /** @pdOid beca1916-cc9e-45fa-a934-8327493e3561 */
   private String alamat;
   /** @pdOid 793bfdf8-06a9-4a03-99ab-bd42b16f0d09 */
   private String email;
   /** @pdOid 3571240c-b729-4911-b2ed-e36f93458ae8 */
   private String agama;
   
   /**
     * @return  *  @pdOid 7364b4cb-5686-4a9e-8bc0-e1e482851377 */
   public String getNama() {
      return nama;
   }
   
   /** @param newNama
    * @pdOid d11b93b6-8d94-472e-b008-ba317776eaa5 */
   public void setNama(String newNama) 
	{
            if (null == newNama)
                System.out.println("input salah");
            else
                nama = newNama;
	}
   
   /**
     * @return  *  @pdOid 4efe03ac-821d-4065-a24e-2e5189612f88 */
   public String getNIK() {
      return nik;
   }
   
   /** @param newNIK
    * @pdOid 57698c38-740e-4219-9520-48849eb485f7 */
   public void setNIK(String newNIK) 
	{
            if (null == newNIK)
                System.out.println("input salah");
            else
                nik = newNIK;
	}
   
   /**
     * @return  *  @pdOid c4c3eb84-21da-4447-932d-bcce2d10a9a7 */
   public String getTanggalLahir() {
      return tanggalLahir;
   }
   
   /** @param newTanggalLahir
    * @pdOid 0c58ccce-2c4c-417e-98e7-5fa4a52b5c22 */
   public void setTanggalLahir(String newTanggalLahir) 
	{
            if (null == newTanggalLahir)
                System.out.println("input salah");
            else
                tanggalLahir = newTanggalLahir;
	}
   
   /**
     * @return  *  @pdOid 0ba973e0-f525-473d-982a-28b49eb91cfc */
   public char getJenisKelamin() {
      return jenisKelamin;
   }
   
   /** @param newJenisKelamin
    * @pdOid 7acea99c-1e3d-4ccb-9249-071d30db57b0 */
   public void setJenisKelamin(char newJenisKelamin) 
	{
            jenisKelamin = newJenisKelamin;
	}
   
   /**
     * @return  *  @pdOid 4d64d1ec-22cd-49ed-a2dd-dad551ff2cb5 */
   public String getAlamat() {
      return alamat;
   }
   
   /** @param newAlamat
    * @pdOid c4d004e4-9778-4820-9c2a-4773692917b8 */
   public void setAlamat(String newAlamat) 
	{
            if (null == newAlamat)
                System.out.println("input salah");
            else
                alamat = newAlamat;
	}
   
   /**
     * @return  *  @pdOid 1db6594f-b979-4648-8b8c-5308255bf390 */
   public String getEmail() {
      return email;
   }
   
   /** @param newEmail
    * @pdOid 73cb532b-d238-4c26-a6c4-921747ab8c79 */
   public void setEmail(String newEmail) 
	{
            if (null == newEmail)
                System.out.println("input salah");
            else
                email = newEmail;
	}
   
   /**
     * @return  *  @pdOid 16ad8fc4-a561-4495-b210-ae0ac77f632c */
   public String getAgama() {
      return agama;
   }
   
   /** @param newAgama
    * @pdOid 7c88f905-aa23-4a45-932c-5252d93f5e85 */
   public void setAgama(String newAgama) 
	{
            if (null == newAgama)
                System.out.println("input salah");
            else
                agama = newAgama;
	}

}