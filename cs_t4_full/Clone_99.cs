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
                    using (var response = TryGetResource ())
                    {
                        if (response != null)
                        { 
                            response.GetResponse (); 
                        }  
                    } 
                }

                private static HttpWebResponse TryGetResource()
                {
                    try
                    { 
                        return new HttpWebResponse (); 
                    }
                    catch (Exception ex)
                    { 
                        return null;
                    } 
}


