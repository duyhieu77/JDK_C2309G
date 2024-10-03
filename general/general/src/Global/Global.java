package Global;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Global {
    public static boolean ignoreCase (String pred, String keyword){
        Pattern p = Pattern.compile(Pattern.quote(pred),Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(pred);
        return m.matches();
    }
}
