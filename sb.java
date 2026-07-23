public class sb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        System.out.println(sb);

        // charAt at any index
       System.out.println(sb.charAt(3));

        // set charAt
        sb.setCharAt(3,'p' );
        System.out.println(sb);

        // insert any char
        sb.insert(0, 'k');
        System.out.println(sb);

        // for deletion
        sb.delete(2, 4);
        System.out.println(sb);

        // append
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);

        
        
    }
    
}
