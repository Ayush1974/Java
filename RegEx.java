import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx{
public static void main(String[] args)
{
Pattern pattern=Pattern.compile("W3schoolS",Pattern.CASE_INSENSITIVE);
Matcher match=pattern. matcher("Visit w3schools");
if(match.find())
{
System.out.println("Match Found");
}
else {
System.out.println("No Match Found");
}
}
}