public class Kalk {
    package sample;


import java.util.Scanner;
import java.util.Arrays;






        public static void main(String[] args){
            StringBuilder nabor = new StringBuilder();
            Integer[] a = new Integer[2];
            int result;
            String x = new String();
            String[] rimsky = new String[] {"I","II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            String c = new String();
            String[] text = new String[3];
            int z = 0;

            Scanner sc = new Scanner(System.in);

            text[0] = sc.nextLine();
            text[1] = sc.nextLine();
            text[2] = sc.nextLine();
            swap(text[1], text[2]);


            for (int i=0;i < 2; i++){
                for (int j=0; j < 10; j++){
                    if (text[i] == rimsky[j]){

                        a[i] = j + 1;
                        z = z + 1;
                    } else {
                        a [i] = parseInt(text[i]);

                    }


                }
            }

            if ((z% 2 = 0) & (a[0] < 11) & (a[0] > 0) & (a[1] < 11) & (a[1] > 0)){

                if (text[2] == "+"){
                    result = a[0] + a[1];
                }else{
                    if (text[2] == "-"){
                        result = a[0] - a[1];
                    }else{
                        if (text[2] == "*"){
                            result = a[0] * a[1];
                        }else{
                            if (text[2] == "/"){
                                result = a[0] / a[1];
                            }else{
                                System.out.println("Error");
                            }
                        }
                    }
                }
            }

            if (z == 0){
                System.out.println(result);
            }

            if (z == 2){
                System.out.println(rimsky[result - 1]);
            }


        }




}
