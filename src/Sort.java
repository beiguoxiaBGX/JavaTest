public class Sort {
    public static void main(String args[]){
        int length = 10;
        int a[] = new int[length];
        for(int i=0;i<length;i++){
            a[i] = (int) ((Math.random())*100);
            System.out.print("a["+i+"]:"+a[i]+"   ");
        }
        System.out.println();
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j<length;j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0;i<length;i++){
            System.out.print("a["+i+"]:"+a[i]+"   ");
        }
    }
}
