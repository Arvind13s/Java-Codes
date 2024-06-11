public class Reversecharacter{
    public static void ReverseCHar(char[] arr){
        char[] reversedArr = new char[arr.length];
        for(int i=0;i< arr.length;i++){
            reversedArr[i] = arr[arr.length - i - 1];
        }
         System.out.print("Reversed Array: ");
         for (char c : reversedArr) {
            System.out.print(c + " ");
         }
    }
    public static void main(String[] args){
        char[] originalArra = {'G','e','e','k','s'};
        ReverseCHar(originalArra);
    }
}