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
                    HttpWebResponse response = null; 
                    try 
                    { 
                        response = GetResource(); 
                    }
                    finally
                    { 
                        if (response != null)
                        {
                            response.Dispose ();
                        } 
                    }
                }

                private static HttpWebResponse GetResource() 
                {
                    try
                    { 
                        HttpWebResponse response = new HttpWebResponse();
                        response.GetResponse (); 
                        return response;
                    }
                    catch (Exception ex)
                    {
                        return null;
                    } 
}


