
public class StringManipulator{
    // String trimAndConcat(String, String): Trim both input strings and then concatenate them. Return the new string. Feel free to use the trim method of the String class.
    public String trimAndConcat(String a, String b){
        String newStr;

        //trim both strings
        a = a.trim();
        b = b.trim();
        

        //concat
        newStr = a + b;

        return newStr;
    }

    // Integer getIndexOrNull(String, char): Get the index of the character and return either the index or null. If the character appears multiple times, return the first index. Feel free to use the indexOf method of the String class.
    public Integer getIndexOrNull(String str, char c){
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                return i;
            }
        }

        return null;
    }

    // Integer getIndexOrNull(String, String): Get the index of the start of the substring and return either the index or null. Feel free to use the indexOf method of the String class.
    public Integer getIndexOrNull(String str, String sub){
        // IndexOf: The indexOf method searches left-to-right inside the given string for a "target" string. The indexOf() method returns the index number where the target string is first found or -1 if the target is not found.
        int i = str.indexOf(sub);
        if (i == -1){
            return null;
        }
        return i;
    }

    // String concatSubstring(String, int, int, String): Get a substring using a starting and ending index, and concatenate that with the second string input to our method. Feel free to use the substring method of the String class.
    public String concatSubstring(String str, int beginIndex, int endIndex, String str2){
        String newStr;

        newStr = str.substring(beginIndex, endIndex);

        return newStr + str2;

    }
}















