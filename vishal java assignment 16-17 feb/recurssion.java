class recurssion01 {
        public int Factorial (int n){
            if (n<0){
                return -1;
            }
            if(n==0||n==1){
                return 1;
            }
            return n * Factorial(n-1);


        }


    }
    public class recurssion{
        public static void main(String[] args) {
            recurssion01 ob = new recurssion01();
            System.out.println(ob.Factorial(5));
        }

    }


