static void Main (string [] args) {
    HttpWebResponse response = new HttpWebResponse ();
    try {
        response.GetResponse ();
    }
    catch (Exception ex) {
    }
    finally {
        response.Dispose ();
    }
}


 static void Main(string[] args) 
{ 
                    HttpWebResponse response = CreateResponseIfPossible(() => new HttpWebResponse ()); 

                    if (response != null) 
                    { 
                        response.GetResponse (); 
                        response.Dispose(); 
                    } 
                }

                private static HttpWebResponse CreateResponseIfPossible(Func<HttpWebResponse> func)
                { 
                    try
                    { 
                        return func();
                    }
                    catch (Exception ex)
                    {
                        return null;
                    }
}


