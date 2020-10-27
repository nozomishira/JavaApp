/** 三目並べのゲームの進行役．盤面の状態とメッセーシ゛を標準出力に表示する */
class GameField {
		/** マルのプレーヤー */
		private final AbstractPlayer maru;
		/** バツのプレーヤー */
		private final AbstractPlayer batsu;
		/** 盤 */
		private final Ban ban;

		/** maru と batsu か゛ ban を使ってケ゛ームをする準備をする
				@param maru マルのプレーヤー
				@param batsu バツのプレーヤー
				@param ban 盤面 */
		GameField(AbstractPlayer maru, AbstractPlayer batsu, Ban ban) {
				//
				// 課題5
				//
				this.maru = maru;
				this.batsu = batsu;
				this.ban = ban;
		}

		/** 勝ち負けが決まるまでゲームを進行する */
		void play() {
				AbstractPlayer currentPlayer;
				Zahyo te;
				displayMsg("ゲームを開始しました");
				displayBan();
				currentPlayer = maru;
				while (! ban.isFull()) {
						//
						// 課題5 （プレーヤー maru と batsu に交互に次の手を尋ね，そのマスにマルやバツを置く）
						//
						te = currentPlayer.next(ban);
						if(currentPlayer == maru){
							ban.put(te.getX(),te.getY(),Ban.MARU);
						}else if(currentPlayer == batsu){
							ban.put(te.getX(),te.getY(),Ban.BATSU);
						}

						displayMsg(String.format("%s が(%d,%d)に %s を置きました",
																		 currentPlayer.getName(),
																		 te.getX(), te.getY(),
																		 currentPlayer.getMaruBatsu()==Ban.MARU ? "マル" : "バツ"));
						displayBan();
						//
						// 課題5 （勝敗が決まったら，勝ちプレーヤー名を表示して return する．決まっていなければ currentPlayer を次のプレーヤーに変更する）
						//
						if(ban.checkWon() == 1){
							displayMsg(maru.getName() + "の勝ち");
							return;
						}else if(ban.checkWon() == -1){
							displayMsg(batsu.getName() + "の勝ち");
							return;
						}else{
							if(currentPlayer == this.maru)
								currentPlayer = this.batsu;
							else
							currentPlayer = this.maru;
						}

				}
				//
				// 課題5 （引き分けのメッセージを標準出力に表示する）
				//
				displayMsg("引き分け");
		}

		/** ban に依頼して，盤を標準出力に表示する */
		void displayBan() {
				//
				// 課題5
				//
				ban.display();
		}

		/** メッセージを標準出力に表示する
				@param msg 表示するメッセージ */
		void displayMsg(String msg) {
				System.out.println(msg);
		}
}
