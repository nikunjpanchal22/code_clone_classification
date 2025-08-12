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
                    var canAccessResource = TryAccessResource(() => new HttpWebResponse ()); 
                    if (canAccessResource)
                    { 
                        DisposeResponse(); 
                    } 
                }

                private static bool TryAccessResource(Func<HttpWebResponse> func) 
                { 
                    HttpWebResponse response = null; 
                    try 
                    { 
                        response = func(); 
                        response.GetResponse(); 
                        return true; 
                    } 
                    catch (Exception ex)
                    {
                        return false; 
                    }
                    finally
                    { 
                        if (response !=null)
                        { 
                            response.Dispose ();
                        } 
                    }
}


