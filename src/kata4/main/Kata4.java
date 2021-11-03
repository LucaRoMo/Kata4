
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

    public static void main(String[] args) throws FileNotFoundException {
        Histogram<String> histogram = new Histogram();
        List<Mail> lista = new LinkedList<>();
        
        lista = MailListReader.read("email.txt");
        histogram = MailHistogramBuilder.build(lista);
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
