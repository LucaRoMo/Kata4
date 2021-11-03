package kata4.model;

public class Mail {
    private String domain;
    
    public Mail(String mail){
        if(mail.contains("@")){
            String[] aux = new String[2]; 
            aux = mail.split("@");
            domain = aux[1];
        }else{
            domain = null;
        }
    }
    
    public String getDomain(){
        return domain;
    }
}
