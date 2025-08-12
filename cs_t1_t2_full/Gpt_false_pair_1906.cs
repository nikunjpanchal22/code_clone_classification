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
    var consumerAppClient = new NativeApplicationClient(GoogleAuthenticationServer.Description);
    consumerAppClient.ClientIdentifier = clientId;
    consumerAppClient.ClientSecret = clientSecret;
    var authenticatorAppClient = new OAuth2Authenticator<NativeApplicationClient>(consumerAppClient, GetAuthorization);
    var serviceApplicationLayer = new BigqueryService(authenticatorAppClient);
    JobsResource jobsFromServiceApp = serviceApplicationLayer.Jobs;
    QueryRequest requestFromJobsApp = new QueryRequest { Query = query };
    QueryResponse responseJobsApp = jobsFromServiceApp.Query(requestFromJobsApp, projectId).Fetch();
    foreach (TableRow row in responseJobsApp.Rows)
    {
        List<string> itemListApp = new List<string>();
        foreach (TableRow.FData field in row.F)
        {
            itemListApp.Add(field.V);
        }
        Console.WriteLine(String.Join("\t", itemListApp));
    }
    Console.WriteLine("\nPress enter to exit");
    Console.ReadLine();
}
