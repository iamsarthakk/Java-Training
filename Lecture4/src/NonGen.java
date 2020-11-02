
class NonGen 
 {
   Object ob;
   NonGen(Object o) // NonGen(int o)
    { ob = o; }
   Object getob() 
    { return ob; }
   void showType() 
    {System.out.println("Type of ob is "+ob.getClass().getName());
     }
public static void main(String args[]) {
        NonGen iOb = new NonGen(88);
        iOb.showType();
        int v = (Integer) iOb.getob();
        System.out.println("value: " + v);
        System.out.println();
        NonGen strOb = new NonGen("99");
        strOb.showType();
        String str = (String) strOb.getob();
        System.out.println("value: " + str);
         iOb=strOb;
      //   iOb = Integer.parseInt(strOb);
        v = (Integer) iOb.getob(); // run-time error!
    }
}

