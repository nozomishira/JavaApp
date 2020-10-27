/** テスト用クラス */
class Ex41 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("abc");
        stack.push("def");
        System.out.println(stack.pop());
        stack.push("ghi");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
