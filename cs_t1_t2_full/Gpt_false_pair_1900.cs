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
    var appClient = new NativeApplicationClient(GoogleAuthenticationServer.Description);
    appClient.ClientIdentifier = clientId;
    appClient.ClientSecret = clientSecret;
    var authAppClient = new OAuth2Authenticator<NativeApplicationClient>(appClient, GetAuthorization);
    var serviceBigquery = new BigqueryService(authAppClient);
    JobsResource job = serviceBigquery.Jobs;
    QueryRequest req = new QueryRequest { Query = query };
    QueryResponse res = job.Query(req, projectId).Fetch();
    foreach (TableRow row in res.Rows)
    {
        List<string> listElements = new List<string>();
        foreach (TableRow.FData field in row.F)
        {
            listElements.Add(field.V);
        }
        Console.WriteLine(String.Join("\t", listElements));
    }
    Console.WriteLine("\nPress enter to exit");
    Console.ReadLine();
}
