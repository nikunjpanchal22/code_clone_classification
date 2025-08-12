public static void main (String [] args) {
    List < Integer > initialNumbers = new ArrayList < Integer > ();
    initialNumbers.add (1);
    initialNumbers.add (2);
    Observable < Integer > observableInitial = Observable.from (initialNumbers);
    ReplaySubject < Integer > subject = ReplaySubject.create ();
    Observable < Integer > source = Observable.merge (observableInitial, subject);
    source.subscribe (System.out :: println);
    for (int i = 0;
    i < 100; ++ i) {
        subject.onNext (i);
    }
}





public static void main(String[] args) {
    ReplaySubject<Integer> subject = ReplaySubject.create();
    Observable.fromArray(1,2).mergeWith(subject).subscribe(System.out::println);
    Stream.iterate(0, i -> i + 1).limit(100).forEach(subject::onNext);
}


