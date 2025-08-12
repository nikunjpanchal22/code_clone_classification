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
    var nativeApp = new NativeApplicationClient(GoogleAuthenticationServer.Description);
    nativeApp.ClientIdentifier = clientId;
    nativeApp.ClientSecret = clientSecret;
    var authentication = new OAuth2Authenticator<NativeApplicationClient>(nativeApp, GetAuthorization);
    var bigQueryService = new BigqueryService(authentication);
    JobsResource jobReso = bigQueryService.Jobs;
    QueryRequest qReq = new QueryRequest { Query = query };
    QueryResponse responseQ = jobReso.Query(qReq, projectId).Fetch();
    foreach (TableRow row in responseQ.Rows)
    {
        List<string> listElt = new List<string>();
        foreach (TableRow.FData field in row.F)
        {
            listElt.Add(field.V);
        }
        Console.WriteLine(String.Join("\t", listElt));
    }
    Console.WriteLine("\nPress enter to exit");
    Console.ReadLine();
}
