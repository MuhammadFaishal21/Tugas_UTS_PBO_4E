
package Biodata;


public class Karyawan {
    private final String username;
    private final String password;
    private final String nama_karyawan;
    private final String alamat;
    private final String jenis_kelamin;
    private final String noTelepon;
  
    
 public Karyawan(String username, String password, String nama_karyawan, String alamat, String jenis_kelamin, String noTelepon) {
        this.username = username;
        this.password = password;
        this.nama_karyawan = nama_karyawan;
        this.alamat = alamat;
        this.jenis_kelamin = jenis_kelamin;
        this.noTelepon = noTelepon;
 }
        
        
  public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
     public String getNama() {
        return nama_karyawan;
    }
     
      public String getAlamat() {
        return alamat;
    }
      
       public String getJenis_kelamin() {
        String Jenis_kelamin = null;
        return Jenis_kelamin;
    }

    public String getNoTelepon() {
        return noTelepon;
    }


    public void tampilkanInfoKaryawan() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Nama: " + nama_karyawan);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis_kelamin: " + jenis_kelamin);
        System.out.println("No Telepon: " + noTelepon);
     
    }

 
    }

