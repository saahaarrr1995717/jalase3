public class Jalase3 {
        public static void main(String[] args) {
            int b1=0,b2=0,b3=0,b4=0,b5=0,b6=0,b7=0;
            final int I = 1,V = 5,X = 10,L = 50,C = 100,D = 500,M = 1000;
            String s1 = "IVXL";
            int a1 = Integer.parseInt(String.valueOf(I));
            int a2 = Integer.parseInt(String.valueOf(V));
            int a3 = Integer.parseInt(String.valueOf(X));
            int a4 = Integer.parseInt(String.valueOf(L));
            int a5 = Integer.parseInt(String.valueOf(C));
            int a6 = Integer.parseInt(String.valueOf(D));
            int a7 = Integer.parseInt(String.valueOf(M));
            char[] s2 = s1.toCharArray();
            for (int i = 0; i < s2.length; i++) {

                if(s2[i]=='I'){
                    b1 = a1;
                }
                else if(s2[i]=='V'){
                    b2 = a2;
                }
                else if(s2[i]=='X'){
                    b3 = a3;
                }
                else if(s2[i]=='L'){
                    b4 = a4;
                }
                else if(s2[i]=='C'){
                    b5 = a5;
                }
                else if(s2[i]=='D'){
                    b6 = a6;
                }
                else if(s2[i]=='M'){
                    b7 = a7;
                }
            }
            System.out.println(b1+b2+b3+b4+b5+b6+b7);
        }
    }
