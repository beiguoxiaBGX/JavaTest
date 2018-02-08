public class ArrReversal {
    public static void main(String args[]){
        float arr[] = new float[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = (float)(Math.random())*100;
            System.out.println("arr["+i+"]"+arr[i]);
        }
        int j = (arr.length-1)/2;
        for(int i=0;i<=j;i++){
            float temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
