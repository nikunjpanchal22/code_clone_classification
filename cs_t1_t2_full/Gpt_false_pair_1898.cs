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
    var appConsumer = new NativeApplicationClient(GoogleAuthenticationServer.Description);
    appConsumer.ClientIdentifier = clientId;
    appConsumer.ClientSecret = clientSecret;
    var authAppCon = new OAuth2Authenticator<NativeApplicationClient>(appConsumer, GetAuthorization);
    var serviceBigq = new BigqueryService(authAppCon);
    JobsResource jobR = serviceBigq.Jobs;
    QueryRequest reqQ = new QueryRequest { Query = query };
    QueryResponse resQ = jobR.Query(reqQ, projectId).Fetch();
    foreach (TableRow row in resQ.Rows)
    {
        List<string> listT = new List<string>();
        foreach (TableRow.FData field in row.F)
        {
            listT.Add(field.V);
        }
        Console.WriteLine(String.Join("\t", listT));
    }
    Console.WriteLine("\nPress enter to exit");
    Console.ReadLine();
}
