public class LinkedList{
    public static void main(String[] args) {
        LinkedList<String> link;
        link = new LinkedList<String>();
        link.add("A"); // 向链表中增加数据
        link.add("B"); // 向链表中增加数据
        link.add("C"); // 向链表中增加数据
        System.out.println("初始化链表：" + link);
        link.addFirst("X");// 在链表的表头增加内容
        link.addLast("Y");// 在链表的表尾增加内容
        System.out.println("增加头和尾之后的链表：" + link);
    }

    private void addFirst(String x) {
    }

    private void addLast(String y) {
    }

    private void add(String a) {
    }
}

