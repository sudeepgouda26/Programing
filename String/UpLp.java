public class UpLp {
    public static void main(String[] args) {
        String str  = "OverLOADIng";

        char[] ch = str.toCharArray();
  int upper=0;
  int lower =0;
        for(int i =0; i<ch.length; i++){
            if((int)ch[i] >=65 && (int)ch[i] < 97){
                upper++;
            }else if((int)ch[i] > 97){
                lower++;

            }
        }
        System.out.println("LOwer =" + lower + " upper = " +upper);
        }
}
