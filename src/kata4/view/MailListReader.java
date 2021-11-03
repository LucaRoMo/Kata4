package kata4.view;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import kata4.model.Mail;

public class MailListReader {
    
    public static List<Mail> read(String fileName) throws FileNotFoundException{
        List<Mail> res = new LinkedList<>();
        Scanner sc = new Scanner(new File(fileName));
        while(sc.hasNextLine()){
            String aux = sc.next();
            if(aux.contains("@")){
                Mail mail = new Mail(aux);
                res.add(mail);
            }
        }
        return res;
        
    }
}
