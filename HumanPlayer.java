import java.util.Scanner;

/** 標準入力から次の手を入力する人間フ゜レーヤー */
class HumanPlayer extends AbstractPlayer {
    /** キーボード入力用のスキャナ */
    private Scanner sc;
    
    /** 引数は AbstractPlayer と同じ
        @param name プレーヤー名
        @param maruBatsu このプレーヤーがマルかバツか（ Ban.MARU または Ban.BATSU ） */
    HumanPlayer(String name, int maruBatsu) {
        //
        // 課題6 （スキャナーの初期化もここで行う）
        //
	    super(name, maruBatsu);
        sc = new Scanner(System.in);
        
    
    }

    /* 0, 1, 2 のいずれかが入力されるまでキーボードから数値を取得するメソッド */
    private int getInt() {
        //
        // 課題6
        //
        //Random rnd = new Random();
        //int nSamples = rand.nextInt(3);
          int scn=0;
        while(sc.hasNext()){
            scn = sc.nextInt();
           if(scn==0||scn==1||scn==2){
             break;
           }
        }  
         return scn;
    }

    /** 次の手を返す．次の手はキーボード（標準入力）から得る．
        @param ban 盤
        @return 次の手（の座標） */
    Zahyo next(Ban ban) {
        System.out.print("どこに置きますか: ");
        int x = getInt();
        int y = getInt();
        return new Zahyo(x,y);
    }
}
