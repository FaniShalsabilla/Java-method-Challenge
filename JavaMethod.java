public class JavaMethod {
    
    public static void syaratMagang(int umur) {

        if (umur > 25) {
          System.out.println("Anda Tidak Dapat Magang"); 
          
        } else {
          System.out.println("Anda Dapat Magang"); 
        }
        
      } 
      public static void main(String[] args) { 
        syaratMagang(22); 
      }  
    }