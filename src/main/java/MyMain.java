public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int[] smeerkat=new int[arr.length/2];
        for (int i=0; i<arr.length/2; i++){
            smeerkat[i]=arr[i];
        }
        int[] mykat=new int[arr.length/2];
        for (int j=arr.length/2; j<arr.length; j++){
            mykat[j-arr.length/2]=arr[j];
        }
        int[] result=new int[arr.length];
        for (int a=0; a<arr.length; a+=2){
            result[a]=smeerkat[a/2];
            result[a+1]=mykat[a/2];
        }
        return result;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr){
        int woww=0;
        for (int i=0; i<arr.length; i++){
            int nope= (int)(Math.random()*(arr.length));
            woww=arr[i];
            arr[i]=arr[nope];
            arr[nope]=woww;
        }
        return arr;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
