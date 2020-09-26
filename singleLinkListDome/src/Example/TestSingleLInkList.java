package Example;

public class TestSingleLInkList {
    public static void main(String[] args) {

        SingleLinkList sll = new SingleLinkList();
        sll.create(15);
        sll.add(12);
        sll.append(123);
        sll.append(456);
        sll.search(456);
        sll.del(15);
        sll.travel();
    }
}
