/** StringStack のインタフェース */
interface StringStack {
    /** スタックにデータを積む */
    void push(String x);
     /** スタックの最上位のデータを取り出す */
    String pop();
    /** スタックの最上位にあるデータを見る */
    String peek();
}
