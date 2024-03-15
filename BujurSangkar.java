
public class BujurSangkar extends BangunDatar {
    
    BujurSangkar (int s){
        super(s );
      
    }
    int hitungluas(){
        int s = super.getS();
      
        return s * s;
    }      
          
    int hitungKeliling(){
        int s = super.getS();
        return s + s + s + s;
        
    }   
        
        
    

}
