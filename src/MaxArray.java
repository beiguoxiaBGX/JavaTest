public class MaxArray {
    public static void main(String args[]){
        double a[] = new double[5];
        double max;
        for(int i=0;i<5;i++){
            a[i] = (Math.random())*100;
            System.out.println("a["+i+"]:"+a[i]);
        }
        max = a[0];
        for(int i=0;i<5;i++){
            if(max<a[i])
                max = a[i];
        }
        System.out.println(max);

    }
}
