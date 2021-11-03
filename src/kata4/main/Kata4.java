
package kata4.main;

import java.io.FileNotFoundException;
import kata4.model.Mail;
import kata4.view.MailListReader;
import java.util.List;
import java.util.LinkedList;
import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;

public class Kata4 {
    public List<Mail> mailList = new LinkedList<>();
    public Histogram<String> histogram = new Histogram();
    public HistogramDisplay histoDisplay;
    public String fileName = "email.txt";
        
    public static void main(String[] args) throws FileNotFoundException{
        Kata4 main = new Kata4();
        main.execute();
    }
    
    public void execute() throws FileNotFoundException{
        input();
        process();
        output();
    }
    
    public void input() throws FileNotFoundException{
        
        mailList = MailListReader.read(fileName);
    }
    public void process(){
        
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    public void output(){
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
