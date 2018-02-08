public class Each {
    public static void main(String args[]){
        int a[] = new int[]{2,55,556,32,29};
        int max = a[0];
        for(int each:a){
            if(max<each)
                max = each;
        }
        System.out.println(max);
    }
}
