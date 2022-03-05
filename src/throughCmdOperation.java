public class throughCmdOperation {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);

        int x= Integer.parseInt(args[0]);
        int y= Integer.parseInt(args[1]);
        int result;
        result=x+y;
        System.out.println("addition is "+result);
        result=x-y;
        System.out.println("subtraction is "+result );
        result=x*y;
        System.out.println("multiplication is "+result);
        result=x/y;
        System.out.println("division is "+result);

    }
}
