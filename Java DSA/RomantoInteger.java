import java.util.*;

public class RomantoInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String roman=sc.next();
        roman=roman.toUpperCase();
        int length=roman.length();
        Map<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int ans=hm.get((roman.charAt(length-1)));
        for(int i=length-2;i>=0;i--){
            if(hm.get(roman.charAt(i))<hm.get(roman.charAt(i+1)))
            {
                ans-=hm.get(roman.charAt((i)));
            }else{
                ans+=hm.get(roman.charAt((i)));
            }
        }
        
        System.out.print(ans);
    }
}
