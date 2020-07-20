import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberVerification {
    private final String regexpArabicNum = "^[ ]*([1-9]|10)[ ]*([+-/\\\\*])[ ]*([1-9]|10)[ ]*$";
    private final String regexpRomeNum = "^[ ]*(V?I|V?I{2}|V?I{3}|IV|V|IX|X)[ ]*([+-/\\\\*])[ ]*(V?I|V?I{2}|V?I{3}|IV|V|IX|X)[ ]*$";
    private Pattern pattern;
    private Matcher matcherNumber;

    public Boolean isRomanNumber(String valueStr) {
        pattern = Pattern.compile(regexpRomeNum);
        matcherNumber = pattern.matcher(valueStr);
        return matcherNumber.find();
    }

    public Boolean isArabicNumber(String valueStr) {
        pattern = Pattern.compile(regexpArabicNum);
        matcherNumber = pattern.matcher(valueStr);
        return matcherNumber.find();
    }

    public Matcher getMatcherArabicNumber(String valueStr) {
        pattern = Pattern.compile(regexpArabicNum);
        matcherNumber = pattern.matcher(valueStr);
        return matcherNumber.find() ? matcherNumber : null;
    }

    public Matcher getMatcherRomanNumber(String valueStr) {
        pattern = Pattern.compile(regexpRomeNum);
        matcherNumber = pattern.matcher(valueStr);
        return matcherNumber.find() ? matcherNumber : null;
    }
}
