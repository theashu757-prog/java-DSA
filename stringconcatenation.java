public class stringconcatenation {
    public static void main(String args[]) {
        // concatenation
     String firstname = "ashutosh";
        String lastname = " singh";
        String fullname= firstname + "  kumar" + lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());

        // charAt
        for(int i= 0; i<fullname.length(); i++)
        {
            System.out.println(fullname.charAt(i));
        }
    }
}