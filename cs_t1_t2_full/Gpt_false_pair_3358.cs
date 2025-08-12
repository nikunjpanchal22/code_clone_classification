static void Main () {
    var persons = new PersonList ();
    for (int i = 0; i < 100000; i ++) {
        persons.Add (new Person ("P" + i.ToString (), RandomString (5, true)));
    }
    var unsortedPersons = new PersonList (persons);
    const int COUNT = 30;
    Stopwatch watch = new Stopwatch ();
    for (int i = 0; i < COUNT; i ++) {
        watch.Start ();
        Sort (persons);
        watch.Stop ();
        persons.Clear ();
        persons.AddRange (unsortedPersons);
    }
    Console.WriteLine ("Sort: {0}ms", watch.ElapsedMilliseconds);
    watch = new Stopwatch ();
    for (int i = 0; i < COUNT; i ++) {
        watch.Start ();
        OrderBy (persons);
        watch.Stop ();
        persons.Clear ();
        persons.AddRange (unsortedPersons);
    }
    Console.WriteLine ("OrderBy: {0}ms", watch.ElapsedMilliseconds);
    watch = new Stopwatch ();
    for (int i = 0; i < COUNT; i ++) {
        watch.Start ();
        OrderByWithToList (persons);
        watch.Stop ();
        persons.Clear ();
        persons.AddRange (unsortedPersons);
    }
    Console.WriteLine ("OrderByWithToList: {0}ms", watch.ElapsedMilliseconds);
}


static void Main(){
    var persons = new PersonList();
    for(int i=0; i<100000; i++){
        persons.Add(new Person("P"+i.ToString(),RandomString(5,true)));
    }
    var unsortedPersons = new PersonList(persons);
    const int COUNT = 30;
    Stopwatch watch = new Stopwatch();
    for(int i=0; i<COUNT; i++){
        watch.Start();
        Sort(persons);
        watch.Stop();
        persons.Clear();
        persons.AddRange(unsortedPersons);
    }
    Console.WriteLine("Sort: {0}ms",watch.ElapsedMilliseconds);
    watch=new Stopwatch();
    for(int i=0;i<COUNT;i++){
        watch.Start();
        OrderByDescending(persons);
        watch.Stop();
        persons.Clear();
        persons.AddRange(unsortedPersons);
    }
    Console.WriteLine("OrderByDescending: {0}ms",watch.ElapsedMilliseconds);
    watch=new Stopwatch();
    for(int i=0;i<COUNT;i++){
        watch.Start();
        OrderByThenBy(persons);
        watch.Stop();
        persons.Clear();
        persons.AddRange(unsortedPersons);
    }
    Console.WriteLine("OrderByThenBy: {0}ms",watch.ElapsedMilliseconds);
}
