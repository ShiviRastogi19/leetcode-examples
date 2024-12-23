import java.util.HashMap;

public class RomanToInteger13 {

    public int romanToInt(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int rs =0;
        for(int i=0;i<s.length();i++){
            if(i+1==s.length() ||  hm.get(s.charAt(i)) >= hm.get(s.charAt(i + 1))){
                rs += hm.get(s.charAt(i));
            }
            else rs -= hm.get(s.charAt(i));
        }
        return rs;
    }

    public static void main(String[] arg){
        RomanToInteger13 romanToInteger13 = new RomanToInteger13();
        System.out.println("Roman value of MCMXCIV is " + romanToInteger13.romanToInt("MCMXCIV"));
    }

    //todo
    //conversion from int to roman
}
