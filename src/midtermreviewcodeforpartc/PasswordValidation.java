/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author Dell
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class PasswordValidation {
 
    private Pattern pattern;
    private Matcher matcher;
 
    private static final String PASSWORD_PATTERN = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";
 
    public PasswordValidation() {
        pattern = Pattern.compile(PASSWORD_PATTERN);
    }
 
    public boolean validate(final String password) {
 
        matcher = pattern.matcher(password);
        return matcher.matches();
 
    }
}
    

