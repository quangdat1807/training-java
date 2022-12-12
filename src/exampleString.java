public class exampleString {
    public static void main(String[] args) {
        lab1();
    }

    public static void lab1() {
        String str = "Dat fda";
        String str1 = "dat g";
        String str2 = "Dao Quang Dat Dao 1807";
        Object objStr = str;

        /*      String compare by ascii return 0 if the string equal to the other string
         *       returns the ascii difference of first odd characters
         *  */
        System.out.println(str.compareTo(str1));
//      String compare by ascii (ignoring lower case and upper case differences)
        System.out.println(str.compareToIgnoreCase(str1));
        System.out.println(str.compareTo(objStr.toString()));

//        String compare by == operator
        System.out.println(str == str1); // => False : Because different characters "A" vs "a"
//        String compare by Equal()
        System.out.println(str.equals(str1)); // => False : Because different characters "A" vs "a"
//        Shows how to determine the last position of a substring inside a string
        int lastIndex = str2.lastIndexOf("Dao");
        if(lastIndex == -1) {
            System.out.println("Dao not found");
        }else {
            System.out.println("Last index "+ lastIndex);
        }
//        remove char str2 at index 3
        System.out.println(removeCharAt(str2, 3));
//        replace
        System.out.println(str2.replace("D", "H"));
        System.out.println(str2.replaceFirst("\\s", " H "));
        System.out.println(str2.replaceAll("\\d", "Xin chao"));

    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0,pos) + s.substring(pos + 1);
    }
}
