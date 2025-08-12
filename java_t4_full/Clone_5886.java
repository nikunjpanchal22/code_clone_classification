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
    List<Integer> numList = new ArrayList<>(List.of(1,2));
    ReplaySubject<Integer> subject = ReplaySubject.create();
    Observable.merge(Observable.fromIterable(numList), subject).subscribe(System.out::println);
    Stream.iterate(0, n -> n + 1).limit(100).forEach(subject::onNext);
}


