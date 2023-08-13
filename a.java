 class vikram{
    public static void main (String[]args)
    {
        int a = 40 , b = 50;
        System.out.println("beforeswapping value are "+a+" "+b);
        //logic1 - third variable
       // int t = a;
         //  a = b;
           //b = t;
       //logic2 - use + & - without using third variable
      /* a =a+b;
       b =a-b;
       a =a-b;*/
       //logic2 - use +& - without using third variable
       a=a*b;
       b=a/b;
       a=a/b;
        System.out.println("Afterswapping value are "+a+" "+b);
    }
}