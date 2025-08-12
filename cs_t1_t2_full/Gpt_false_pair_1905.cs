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
    var authenticClient = new NativeApplicationClient(GoogleAuthenticationServer.Description);
    authenticClient.ClientIdentifier = clientId;
    authenticClient.ClientSecret = clientSecret;
    var authenticAuth = new OAuth2Authenticator<NativeApplicationClient>(authenticClient, GetAuthorization);
    var queryService = new BigqueryService(authenticAuth);
    JobsResource jobResource = queryService.Jobs;
    QueryRequest queryReq = new QueryRequest { Query = query };
    QueryResponse responseQuery = jobResource.Query(queryReq, projectId).Fetch();
    foreach (TableRow row in responseQuery.Rows)
    {
        List<string> listItem = new List<string>();
        foreach (TableRow.FData field in row.F)
        {
            listItem.Add(field.V);
        }
        Console.WriteLine(String.Join("\t", listItem));
    }
    Console.WriteLine("\nPress enter to exit");
    Console.ReadLine();
}
