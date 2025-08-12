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
    cp.Add (new StringObjectIdGeneratorConvention ());
    ConventionRegistry.Register ("TreatAllStringIdsProperly", cp, _ => true);
    var client = new MongoClient ();
    var db = client.GetDatabase ("test");
    var col = db.GetCollection < Person > ("persons");
    Person person = new Person ();
    person.Name = "Name";
    col.InsertOne (person);
    Console.ReadLine ();
}


