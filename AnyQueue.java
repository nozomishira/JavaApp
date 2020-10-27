/** Queue のインタフェース */
interface AnyQueue<E> {
    /** キューの末尾にデータを追加する */
    void enqueue(E x);
    /** キューの先頭のデータを取り出す */
    E dequeue();
    /** キューの先頭にあるデータを見る */
    E peek();
}
