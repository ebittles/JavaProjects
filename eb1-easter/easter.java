import java.util.*;

public class easter {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int a,b,c,d,e,f,year;

        System.out.print("Enter year: ");
        year = scan.nextInt();

        a=year%19;
        b=year%4;
        c=year%7;
        d=(19*a+24)%30;
        e=(2*b + 4*c + 6*d + 5)%7;
        f=(22+d+e);

        if ((year==1954)||(year==1981)||(year==2049)||(year==2076)){
            f=f-7;
        }
        if(f>31){
            System.out.println("Easter is Sunday, April " + (f-31) + " " + year + "     ");
        }else{
            System.out.println("Easter is Sunday, March " + f + " " + year + "     ");
        }
    }
}
