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
                AttemptToReadResource(new HttpWebResponse()); 
            }

            private static void AttemptToReadResource(HttpWebResponse response)
            {
                try
                { 
                    response.GetResponse (); 
                }
                finally
                {
                    response.Dispose ();
                }
}


