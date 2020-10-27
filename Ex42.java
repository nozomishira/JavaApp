/** MyQueue テスト用クラス */
class Ex42 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue("abc");
        queue.enqueue("def");
        System.out.println(queue.dequeue());
        queue.enqueue("ghi");
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
