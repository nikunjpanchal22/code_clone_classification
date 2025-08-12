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
    List<Integer> numbers = new ArrayList<>();
    Collections.addAll(numbers, 1, 2);
    ReplaySubject<Integer> subject = ReplaySubject.create();
    Observable.concat(Observable.fromIterable(numbers), subject).subscribe(System.out::println);
    for (int i = 0; i < 100; i++) { subject.onNext(i); }
}


