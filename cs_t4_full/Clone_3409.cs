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
    var auth = new OAuth2Authenticator < NativeApplicationClient >(new NativeApplicationClient (GoogleAuthenticationServer.Description) 
    { ClientIdentifier = clientId, ClientSecret = clientSecret }, GetAuthorization);
    var response = new BigqueryService(auth).Jobs.Query (new QueryRequest { Query = query }, projectId).Fetch ();
    response.Rows.ForEach(row => Console.WriteLine (row.F.Aggregate("", (current, fData) => current + (fData.V + "\t")).Trim()));
    Console.ReadLine ();
}


