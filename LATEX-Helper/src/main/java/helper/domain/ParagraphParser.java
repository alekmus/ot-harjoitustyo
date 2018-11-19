package helper.domain;
import java.util.regex.Pattern; 
import java.util.regex.Matcher;

public class ParagraphParser implements MicroParser{
    
    
    public String parse(String string){
        String pattern = "\\s";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(string);
        string = m.replaceAll("\n\n");
        return string;
    }
}