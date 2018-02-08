public class ArrayCopy {
    public static void main(String args[]){
        int lengthA1 = (int) (5+(Math.random())*5);
        int lengthA2 = (int) (5+(Math.random())*5);
        System.out.println("lengthA1:"+lengthA1);
        System.out.println("lengthA2:"+lengthA2);
        int a1[] = new int[lengthA1];
        int a2[] = new int[lengthA2];
        int a3[] = new int[lengthA1+lengthA2];
        for(int i=0;i<lengthA1;i++){
            a1[i] = (int) (100*(Math.random()));
            System.out.print(a1[i]+" ");
        }
        System.out.println();
        /*for(int i=0;i<lengthA2;i++){
            a2[i] = (int) (100*(Math.random()));
            System.out.print(a2[i]+" ");
        }*/
        for(int i=0;i<lengthA2;i++){
            a2[i] = (int) (100*(Math.random()));
            System.out.print(a2[i]+" ");
        }
        System.out.println("赋值完成");
        System.out.println();
        System.arraycopy(a1,0,a3,0,lengthA1);
        System.arraycopy(a2,0,a3,lengthA1,lengthA2);
        System.out.println("a3");
        for(int i=0;i<lengthA1+lengthA2;i++){
            System.out.print(a3[i]+" ");
        }

    }
}
