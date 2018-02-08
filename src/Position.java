public class Position {
    static int max = 0;
    public static void main(String args[]) {
        int row = 5;
        int column = 5;
        int a[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = (int) (Math.random() * 100);
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        Pos pos = posOfMax(a);
        System.out.print("max of the array:"+max);
        System.out.print("  and the position is:("+pos.x+","+pos.y+").");
    }
    public static Pos posOfMax(int a[][]){
        Pos postion = new Pos(0,0);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(max<a[i][j]){
                    max = a[i][j];
                    postion.x = i+1;
                    postion.y = j+1;
                }
            }
        }
        return postion;
    }
}
class Pos{
    int x;
    int y;
    Pos(int x, int y){
        this.x = x;
        this.y = y;
    }
}
