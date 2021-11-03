package kata4.model;

public class Mail {
    private String mail;
    
    public Mail(String mail){
        if(mail.contains("@")){
            String[] aux = new String[2]; 
            aux = mail.split("@");
            this.mail = aux[1];
        }else{
            this.mail = null;
        }
    }
    
    public String getDomain(){
        return mail;
    }
}
