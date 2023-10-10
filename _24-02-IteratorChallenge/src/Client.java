public class Client {

    public static void print(IteratorInterface iterator) {
        while(!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        System.out.println("***Iterator Pattern Demo***");
        SubjectInterface sc_subject = new Science();
        SubjectInterface ar_subject = new Arts();

        IteratorInterface sc_iterator = sc_subject.createIterator();
        print(sc_iterator);

        IteratorInterface ar_iterator = ar_subject.createIterator();
        print(ar_iterator)
;
    }
}
