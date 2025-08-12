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
                response = new HttpWebResponse(); 
                response.GetResponse (); 
            } 
            catch (Exception ex) 
            { 
            } 
            finally 
            { 
                if (response !=null) 
                { 
                    response.Dispose (); 
                }
            } 
}


