package internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Manages language selection and retrieves translated text
 * using ResourceBundle and Locale.
 * @author Ross.
 */
public class LanguageManager {
    private Locale locale;
    private ResourceBundle rb;

    public LanguageManager(){
        // default
        setEnglish();
    }

    public void setEnglish(){
        locale = Locale.ENGLISH;
        rb = ResourceBundle.getBundle("messages", locale);
    }

    public void setFrench(){
        locale = Locale.FRENCH;
        rb = ResourceBundle.getBundle("messages", locale);
    }

    public String get(String key){
        String result = rb.getString(key);
        return result;
    }
}
