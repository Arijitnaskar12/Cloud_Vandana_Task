import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        input=input.toLowerCase();
        int freq[]=new int[26];
        for(int i=0;i<input.length();i++){
            char temp=input.charAt(i);
            int index=temp-'a';
            freq[index]=1;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=1)
            {
                System.out.println("Not a panagram");
                System.exit(0);
            }
        }
        System.out.print("Panagram");
    }
}
