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
    var nativeClient = new NativeApplicationClient(GoogleAuthenticationServer.Description);
    nativeClient.ClientIdentifier = clientId;
    nativeClient.ClientSecret = clientSecret;
    var auth2 = new OAuth2Authenticator<NativeApplicationClient>(nativeClient, GetAuthorization);
    var bigqueryService = new BigqueryService(auth2);
    JobsResource jobsResource = bigqueryService.Jobs;
    QueryRequest requestQ = new QueryRequest { Query = query };
    QueryResponse respQ = jobsResource.Query(requestQ, projectId).Fetch();
    foreach (TableRow row in respQ.Rows)
    {
        List<string> listItm = new List<string>();
        foreach (TableRow.FData field in row.F)
        {
            listItm.Add(field.V);
        }
        Console.WriteLine(String.Join("\t", listItm));
    }
    Console.WriteLine("\nPress enter to exit");
    Console.ReadLine();
}
