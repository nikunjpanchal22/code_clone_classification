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
    var natAppClient = new NativeApplicationClient(GoogleAuthenticationServer.Description);
    natAppClient.ClientIdentifier = clientId;
    natAppClient.ClientSecret = clientSecret;
    var oauth2Auth = new OAuth2Authenticator<NativeApplicationClient>(natAppClient, GetAuthorization);
    var biqServ = new BigqueryService(oauth2Auth);
    JobsResource jobRes = biqServ.Jobs;
    QueryRequest reqQuery = new QueryRequest { Query = query };
    QueryResponse resQuery = jobRes.Query(reqQuery, projectId).Fetch();
    foreach (TableRow row in resQuery.Rows)
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
