import java.util.Random;
public class password{
    public static void main(String[] args){
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String use="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String all=upper+lower+numbers+use;
        String s1="";
        Random random =new Random();    
    int r1=random.nextInt(26);
    s1=s1+upper.substring(r1,r1+1)+lower.substring(r1,r1+1)+numbers.substring(r1%10,(r1%10)+1)+use.substring(r1,r1+1);
    System.out.println("Generated Password is : "+s1);
    }
}
