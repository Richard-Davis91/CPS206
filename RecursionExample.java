public class RecursionExample{
int r = 0;
  public static void main(String[] args){

  RecursionExample recursion = new RecursionExample();
  System.out.println(recursion.doFactorial(7));
  }

  public int doFactorial (int n){
    //do Factorial -> Goal - no for/while/do-while loops
    if (n == 1) return 1;
    return n * doFactorial(n-1);
  }
}
