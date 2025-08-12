public static void Main (string [] args) {
    var provider = new NativeApplicationClient (GoogleAuthenticationServer.Description);
    provider.ClientIdentifier = clientId;
    provider.ClientSecret = clientSecret;
    var auth = new OAuth2Authenticator < NativeApplicationClient > (provider, GetAuthorization);
    var service = new BigqueryService (auth);
    JobsResource j = service.Jobs;
    QueryRequest qr = new QueryRequest ();
    qr.Query = query;
    QueryResponse response = j.Query (qr, projectId).Fetch ();
    foreach (TableRow row in response.Rows) {
        List < string > list = new List < string > ();
        foreach (TableRow.FData field in row.F) {
            list.Add (field.V);
        }
        Console.WriteLine (String.Join ("\t", list));
    }
    Console.WriteLine ("\nPress enter to exit");
    Console.ReadLine ();
}


	public static void Main (string [] args) {
    var consumer = new NativeApplicationClient(GoogleAuthenticationServer.Description);
    consumer.ClientIdentifier = clientId;
    consumer.ClientSecret = clientSecret;
    var authenticator = new OAuth2Authenticator<NativeApplicationClient>(consumer, GetAuthorization);
    var serviceObj = new BigqueryService(authenticator);
    JobsResource jobs = serviceObj.Jobs;
    QueryRequest rqst = new QueryRequest { Query = query };
    QueryResponse respon = jobs.Query(rqst, projectId).Fetch();
    foreach (TableRow row in respon.Rows)
    {
        List<string> items = new List<string>();
        foreach (TableRow.FData field in row.F)
        {
            items.Add(field.V);
        }
        Console.WriteLine(String.Join("\t", items));
    }
    Console.WriteLine("\nPress enter to exit");
    Console.ReadLine();
}
