
/** 3x3 の盤面．盤にマルやバツを置く．盤面を標準出力に表示する．勝敗の判定を担う */
class Ban {
    /** 盤の大きさ（幅・高さ） */
    static final int N = 3;
    /** マルが置かれたマスの値．盤面の判定結果として，マルが勝ちの値 */
    static final int MARU = 1;
    /** バツが置かれたマスの値．盤面の判定結果として，バツが勝ちの値 */
    static final int BATSU = -1;
    /** 空きマスの値．判定結果として，勝敗はわからないことを示す値 */
    static final int AKI = 0;
    /** 盤のマス目の状態 */
    private int[][] masu;
    private int i;
    private int j;
    //
    // 課題3 （コンストラクタとメソッド）
    //
    Ban(){
        masu = new int [3][3];
    }
    boolean isBlank(int x,int y){
        if(masu[x][y]==AKI){
            return true;
        }else return false;
    }
    int get (int x, int y){
        if(masu[x][y]==1){
            return MARU;
        }else if(masu[x][y]==-1){
            return BATSU;
        }else return AKI;
    }
   boolean  put (int x, int y, int maruBatsu){
             if(masu[x][y]==AKI){
                 masu[x][y]=maruBatsu;
                 return true;
             }else{
                 return false;
             }
    }
    boolean isFull(){
         for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(masu[i][j]==AKI){
                    return false;
                }
                
            }
            
        }
       return true; 
    }
    void display(){
        int i=0;
        int j=0;
        System.out.println("+---+");
        
        for(i=0;i<3;i++){
            System.out.print("|");
            for(j=0;j<3;j++){
                if(masu[i][j]==0){
                    System.out.print(" ");
                }else if(masu[i][j]==1){
                    System.out.print("O");
                }else if(masu[i][j]==-1){
                    System.out.print("X");
                }
            } System.out.println("|");
        }
      
      System.out.println("+---+");
    }

    
   int checkWon(){
    int sum1,sum2,sum3,sum4,sum5,sum6,sum7,sum8;
    
    sum1=masu[0][0]+masu[0][1]+masu[0][2];
    sum2=masu[1][0]+masu[1][1]+masu[1][2];
    sum3=masu[2][0]+masu[2][1]+masu[2][2];
    sum4=masu[0][0]+masu[1][0]+masu[2][0];
    sum5=masu[0][1]+masu[1][1]+masu[2][1];
    sum6=masu[0][2]+masu[1][2]+masu[2][2];
    sum7=masu[0][0]+masu[1][1]+masu[2][2];
    sum8=masu[0][2]+masu[1][1]+masu[2][0];

    if((sum1==3)||(sum2==3)||(sum3==3)||(sum4==3)||(sum5==3)||(sum6==3)||(sum7==3)||(sum8==3)){
        return 1;
    }else if((sum1==-3)||(sum2==-3)||(sum3==-3)||(sum4==-3)||(sum5==-3)||(sum6==-3)||(sum7==-3)||(sum8==-3)){
        return -1;    
    }else return 0;
}

}
    
