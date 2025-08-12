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
                        using (var response = HandleException(() => new HttpWebResponse()))
                        { 
                            response.GetResponse ();  
                        } 
                    }

                    private static T HandleException<T>(Func<T> func)
                    { 
                        try 
                        { 
                            return func();
                        } 
                        catch (Exception ex) 
                        { 
                            return default(T);
                        } 
}


