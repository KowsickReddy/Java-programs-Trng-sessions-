public class RevBuffStr {
    public static void main(String[] args) {
        @SuppressWarnings("ReplaceStringBufferByString")
        StringBuffer sb=new StringBuffer("Java");
        for(int i=sb.length()-1;i>=0;i--){
            System.out.println(sb.charAt(i));
        }
    }

}
