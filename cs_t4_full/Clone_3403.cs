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
    var provider = new NativeApplicationClient(GoogleAuthenticationServer.Description) 
        { ClientIdentifier = clientId, ClientSecret = clientSecret };
    OAuth2Authenticator<NativeApplicationClient> auth = new OAuth2Authenticator < NativeApplicationClient > (provider, GetAuthorization); 
    var service = new BigqueryService (auth);
    IEnumerable<TableRow> rows = service.Jobs.Query (new QueryRequest { Query = query }, projectId).Fetch ().Rows;
    foreach (TableRow row in rows) 
        Console.WriteLine (String.Join (Environment.NewLine, row.F.Select(f => f.V)));
    Console.ReadLine ();
}


