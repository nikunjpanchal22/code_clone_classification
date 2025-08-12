static void Main (string [] args) {
    ConventionPack cp = new ConventionPack ();
    cp.Add (new StringObjectIdIdGeneratorConventionThatWorks ());
    ConventionRegistry.Register ("TreatAllStringIdsProperly", cp, _ => true);
    var collection = new MongoClient ().GetDatabase ("test").GetCollection < Person > ("persons");
    Person person = new Person ();
    person.Name = "Name";
    collection.InsertOne (person);
    Console.ReadLine ();
}


 	static void Main (string [] args) {
    ConventionPack cp = new ConventionPack ();
    cp.Add (new StringObjectIdGeneratorBetterConvention ());
    ConventionRegistry.Register ("TreatAllStringIdsProperly", cp, _ => true);
    var dbClient = new MongoClient ();
    var db = dbClient.GetDatabase ("test");
    var col = db.GetCollection < Person > ("persons");
    Person person = new Person ();
    person.Name = "Name";
    col.InsertOne (person);
    Console.ReadLine ();
}


