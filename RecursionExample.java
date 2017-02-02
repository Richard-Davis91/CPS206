public class RecursionExample{

  public static void main(String[] args){

  RecursionExample recursion = new RecursionExample();
  System.out.println(recursion.doFactorial(7));

  System.out.println(recursion.doSums(10));

  System.out.println(recursion.sumRange(1,10));
  }

  public int doFactorial (int n){
    //do Factorial -> Goal - no for/while/do-while loops
    if (n == 1) return 1;
    return n * doFactorial(n-1);
  }

  public int doSums(int n){
    return ((n*n) + n)/2;
  }

  public int sumRange(int f, int t){
    return doSums(t)-doSums(f);//needs work

  }


}
