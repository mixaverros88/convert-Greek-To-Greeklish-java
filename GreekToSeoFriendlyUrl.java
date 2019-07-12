import java.util.HashMap;
import java.util.Map;

public class GreekToSeoFriendlyUrl {

    public static String convert(String name) {

        String greeklish = name.toLowerCase();
        StringBuilder sb = new StringBuilder();
        Map<String, String> values = new HashMap<>();

        values.put("α", "a");
        values.put("ά", "a");
        values.put("β", "b");
        values.put("γ", "g");
        values.put("δ", "d");
        values.put("ε", "e");
        values.put("έ", "e");
        values.put("ζ", "z");
        values.put("η", "i");
        values.put("ή", "i");
        values.put("θ", "th");
        values.put("ι", "i");
        values.put("ί", "i");
        values.put("ϊ", "i");
        values.put("κ", "k");
        values.put("λ", "l");
        values.put("μ", "m");
        values.put("ν", "n");
        values.put("ξ", "ks");
        values.put("ο", "o");
        values.put("ό", "o");
        values.put("π", "p");
        values.put("ρ", "r");
        values.put("σ", "s");
        values.put("ς", "s");
        values.put("τ", "t");
        values.put("υ", "y");
        values.put("ύ", "y");
        values.put("φ", "f");
        values.put("χ", "x");
        values.put("ψ", "ps");
        values.put("ω", "w");
        values.put("ώ", "w");
        values.put(" ", "-");
        values.put("!", "");
        values.put(".", "");
        values.put("@", "");
        values.put("#", "");
        values.put("$", "");
        values.put("%", "");
        values.put("&", "");
        values.put("=", "");
        values.put("+", "-");
        values.put("*", "");
        values.put("{", "");
        values.put("}", "");
        values.put("?", "");
        values.put("[", "");
        values.put("]", "");
        values.put("(", "");
        values.put(")", "");
        values.put("\\", "");
        values.put("_", "");
        values.put(",", "");
        values.put("|", "");
        values.put("΅", "");
        values.put("'", "");
        values.put(";", "");
        values.put(":", "");
        values.put("/", "");
        values.put(">", "");
        values.put("<", "");
        values.put("`", "");
        values.put("^", "");
        values.put("``", "");
        values.put("~", "");
        values.put("«", "");
        values.put("»", "");

        for (int i = 0; i <greeklish.length() ; i++) {
            if( values.containsKey( String.valueOf(greeklish.charAt(i))  )){
                sb.append( values.get( String.valueOf(greeklish.charAt(i))  ) );
            }else {
                sb.append( greeklish.charAt(i) );
            }
        }

        return sb.toString();
    }
}
