public class Main {
    public static boolean customIsLesser(int a, int b){
        int aTens = (a%100)/10;
        int bTens = (b%100)/10;
        System.out.println(a+" "+b+" "+aTens+" "+bTens);
        if(aTens==bTens){
            if(a<b){
                return false;
            }else{
                return true;
            }
        }else if(aTens<bTens){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{15, 11, 7, 19};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (customIsLesser(array[j],array[i])) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }

    }
}