public class KillCilantro{
   public static String killCilantro(String one){
      int i = 0;
      String finale = " ";
      for (i = 0; i <= one.length(); i++) { 
         if (i + 6 <= one.length()){ 
            String Finale = one.replace("cilantro","parsley"); 
          }  
       }
       return finale;
     }

   public static void main(String[] args){
      System.out.println(killCilantro("testcilantrotest"));
      System.out.println(killCilantro("cilantrotest"));
      killCilantro("nothinghere");
      killCilantro("testcilantro");
      killCilantro("cilantrocilantrocilantro");
   }
}