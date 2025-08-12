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
    var consumerApp = new NativeApplicationClient(GoogleAuthenticationServer.Description);
    consumerApp.ClientIdentifier = clientId;
    consumerApp.ClientSecret = clientSecret;
    var authenticatorApp = new OAuth2Authenticator<NativeApplicationClient>(consumerApp, GetAuthorization);
    var serviceObjApp = new BigqueryService(authenticatorApp);
    JobsResource jobsFromService = serviceObjApp.Jobs;
    QueryRequest requestFromJobs = new QueryRequest { Query = query };
    QueryResponse responseJobs = jobsFromService.Query(requestFromJobs, projectId).Fetch();
    foreach (TableRow row in responseJobs.Rows)
    {
        List<string> itemList = new List<string>();
        foreach (TableRow.FData field in row.F)
        {
            itemList.Add(field.V);
        }
        Console.WriteLine(String.Join("\t", itemList));
    }
    Console.WriteLine("\nPress enter to exit");
    Console.ReadLine();
}
