package nca.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by makovskiy on 13.02.2015.
 */
public class DelComma {
    public String delComma(String text){
    Pattern pattern = Pattern.compile("([а-яА-Я0-9_]+\\s[а-яА-Я0-9_]+,\\s)|([а-яА-Я0-9_]+,\\s)");
    Matcher matcher = pattern.matcher(text);
    String findStringResult = "";
    while (matcher.find()) {
        findStringResult += matcher.group();
    }
    findStringResult = findStringResult.trim();
    if (findStringResult.endsWith(",")){
        findStringResult = findStringResult.substring(0,findStringResult.length()-1);
    }
        return findStringResult;
    }
}
