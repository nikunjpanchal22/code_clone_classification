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



public static void main (String [] args) {
    List<Integer> originalNumbers = Arrays.asList(1, 2);
    Observable<Integer> from = Observable.fromIterable(originalNumbers);
    Subject<Integer> subject = ReplaySubject.create();
    Observable.merge(from, subject).subscribe(System.out::println);
    IntStream.range(0, 100).forEach(subject::onNext);
}


