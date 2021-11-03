
package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> list){
        Histogram<String> histo = new Histogram();
        for(int i = 0; i < list.size();i++){
            histo.increment(list.get(i).getDomain());
        }
        return histo;
    }
}
