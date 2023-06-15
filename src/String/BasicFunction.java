package String;

public class BasicFunction {
    public static void main(String[] args) {
        String str = "A quick brown fox jump over the lazy fox";
        int length = str.length();
        //charector from a given index
        char ch;
        ch = str.charAt(10);
        System.out.println("charector at 10th index:" + ch);
        //invalid index= string out of bound exception shown
       // ch = str.charAt(100);
        //System.out.println("charector at 10th index:" + ch);
        // charectors b/w the range of given indeces.
        int sourceStart = 10;
        int sourceEnd = 20  ;
        char target[] = new char[2 * length];
        int targetStart = 3;

        str.getChars(sourceStart,sourceEnd,target,targetStart);
        String targetString = new String(target);
        System.out.println("Target String" + targetString);

        // convert a string into charector array
        System.out.println("'" + str +"'"+ " in char array:" );
        char  strArr[] = str.toCharArray();
        for(int i = 0; i< length; i++){
            System.out.print(strArr[i] + " ");
        }


    }

}
