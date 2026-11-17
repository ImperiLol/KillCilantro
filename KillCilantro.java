public class KillCilantro {
    public static String killCilantro(String one) {
        int i = 0;
        String finale = "";
        for (i = 0; i <= one.length(); i++) { 
            if (i + 6 <= one.length()) { 
                finale = one.replace("cilantro", "parsley"); 
            } 
        }
        System.out.println(finale);
        return finale;
    }

    public static void main(String[] args) {
        killCilantro("testcilantrotest");
        killCilantro("cilantrotest");
        killCilantro("nothinghere");
        killCilantro("testcilantro");
        killCilantro("cilantrocilantrocilantro");
    }
}

