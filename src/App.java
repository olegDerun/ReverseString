public class App {
    public static void main(String[] args) throws Exception {
        String str = "TryToReverseIt";
        System.out.println("origin: " + str);
        System.out.println("reverse: " + reverse(str));
    }

    public static String reverse(String input) {
        char[] in = input.toCharArray();
        int begin = 0;
        int end = in.length-1;
        char temp;
        while (end > begin){
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }
}
