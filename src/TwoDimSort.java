public class TwoDimSort {
    static int row = 5;
    static int col = 9;
    public static void main(String args[]){
        int arr[][] = new int[row][col];
        TwoDimSort t = new TwoDimSort();
        t.ass(arr);
        t.printArray(arr);
        System.out.println("after sort: ");
        twoDimSort(arr);
        t.printArray(arr);

    }
    public static int[][] twoDimSort(int arr[][]){
        int length = row*col;
        int arrTemp[] = new int[length];
        for(int i=0;i<row;i++){
            System.arraycopy(arr[i],0,arrTemp,i*col,col);
        }
        oneDimSort(arrTemp);
        for(int i=0;i<arr.length;i++){
            System.arraycopy(arrTemp,i*col,arr[i],0,col);
        };
        return arr;

    }
    public static int[] oneDimSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    /*给二维数组赋值assignment*/
    public void ass(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = (int)(Math.random()*100);
            }
        }
    }
    public  void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<10)
                    System.out.print(" ");
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
