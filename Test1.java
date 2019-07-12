package written_test0711;

//roken KeyBoard
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s1 = in.next().toUpperCase();
            String s2 = in.next().toUpperCase();
            int len1 = s1.length();
            int len2 = s2.length();
            String result = "";
            int i=0;
            int j=0;
            char b = s2.charAt(j);
            for(; i<len1; i++){
                char a = s1.charAt(i);
                if(j<len2){
                    b = s2.charAt(j);
                    if(a!=b){
                        if(!result.contains(String.valueOf(a))){
                            result += String.valueOf(a);
                        }
                    }else{
                        j++;
                    }
                }else{
                    if(!result.contains(String.valueOf(a))){
                        result += String.valueOf(a);
                    }
                }
            }
            System.out.println(result);
        }
    }
}
