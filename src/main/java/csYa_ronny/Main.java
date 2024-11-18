package csYa_ronny;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[4];
        int[] arr2 = {111,33,44,5,66};


        Node<Integer> nd5 = new Node<>(66);
        Node<Integer> nd6 = nd5;
        System.out.println("before - nd5:"+nd5);
        nd5=null;
        System.out.println("after - nd5:"+nd5);
        System.out.println("after -nd6:"+nd6);

       /* Node<Integer> nd4 = new Node<>(5, nd5);
        Node<Integer> nd3 = new Node<>(44, nd4);
        Node<Integer> nd2 = new Node<>(33, nd3);
        Node<Integer> nd1 = new Node<>(111, nd2);

        Node<Integer> list1 = new Node<>(12, new Node<>(2,new Node<>(-1,new Node<>(77))));
        printList(nd1);
        int size = listSize(list1);
        boolean result = isInList(list1, 8);
        boolean acs = isUp(list1);*/
    }

    public static boolean isUp(Node<Integer> list1) {
        return false;
    }

    public static boolean isInList(Node<Integer> chain, int val) {
        return false;
    }

    public static int listSize(Node<Integer> lst) {
        return 0;
    }

    public static void printList(Node<Integer> list) {
        while(list!=null){
            System.out.print(list.getValue()+" ");
            list = list.getNext();
        }
        System.out.println();
    }


}