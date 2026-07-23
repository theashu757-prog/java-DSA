public class reversestring{
    public static void PrintRev(String str, int idx)
    {
        if(idx==0)
        {
            System.out.println(str.charAt(idx));
        }
        System.out.print(str.charAt(idx));
        PrintRev(str , idx-1);
    }
    public static void main(String[] args) {
        String str = "ashutosh";
        PrintRev(str, str.length()-1);
    }

    
}