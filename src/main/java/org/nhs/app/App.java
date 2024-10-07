public class App{
    public static void main(String[] args){
        warmup1();
        System.out.println();
        warmup2();
        System.out.println();
        warmup3();
    }
        public static void warmup1(){
        for (int number = 1; number <= 5; number ++){
            for (int counter = number; counter >= 1; counter --){
               System.out.print(number);
            } 
          System.out.println();
        }
    }
    public static void warmup2(){
        for (int numb = 1; numb <= 5; numb ++){
            for (int numdot = 1; numdot <= 5 - numb; numdot ++){
                System.out.print(".");
            }
            for (int numdigits = 1; numdigits <= numb; numdigits ++){
                System.out.print(numb);
            }
            System.out.println();
        }
    }
    public static void warmup3(){
        for (int numb = 1; numb <= 5; numb ++){
            for (int numdot = 1; numdot <= 5; numdot ++){
                if(numdot == 6 - numb) {
                    System.out.print(numb);
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}

