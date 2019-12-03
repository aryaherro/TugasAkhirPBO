/***********************************************************************
 * Module:  mahasiswa.java
 * Author:  Ajeng
 * Purpose: Defines the Class mahasiswa
 ***********************************************************************/

package modultugasakhir;

import java.util.*;

/** @pdOid 080ad110-a25c-4308-98f9-4f047c2fb49e */
public class mahasiswa extends manusia {
   /** @pdOid 48d31203-866d-4539-a9c5-c1678bdc026f */
   private String nim;
   /** @pdOid 20922972-15ad-4e46-b154-da1666f34852 */
   private String mahasiswaPassword;
   
   /** @pdRoleInfo migr=no name=prodi assc=mahasiswaBagianProdi coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public prodi prodi;
   /** @pdRoleInfo migr=no name=dosen assc=dosenMembimbingMahasiswa coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public dosen dosen;
   
   /** @pdOid 6152ce3e-b520-402d-86c3-4d8170d7e1ad */
   public mahasiswa() {
      // TODO: implement
   }
   
   /** @pdOid 4f032306-6a8d-4548-8a8c-6426baf092f8 */
   public String getnim() {
      return nim;
   }
   
   /** @param newNim
    * @pdOid 575500da-0416-4371-a8c3-0a90e7943c88 */
   public void setnim(String newNim) {
      nim = newNim;
   }
   
   /** @pdOid 69e97885-6fa1-46b8-a747-64642002b46f */
   public String getmahasiswaPassword() {
      return mahasiswaPassword;
   }
   
   /** @param newMahasiswaPassword
    * @pdOid 95289361-98b9-410f-ba0b-ddc61b234978 */
   public void setmahasiswaPassword(String newMahasiswaPassword) {
      mahasiswaPassword = newMahasiswaPassword;
   }

}