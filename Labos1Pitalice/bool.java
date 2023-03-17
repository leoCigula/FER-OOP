public class bool {      
    public static void main(String[] args) {
        boolean b1 = "Pozdrav" == "Pozdrav";
        boolean b2 = "  Pozdrav".trim() == "Pozdrav  ".trim();
        boolean b3 = " Pozdrav".trim().equals("Pozdrav  ".trim());
        System.out.print(b1 + ", "+ b2 + ", " + b3);       
     }
}
