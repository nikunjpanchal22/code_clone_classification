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
            try 
            { 
                using (HttpWebResponse response = new HttpWebResponse ()) 
                { 
                    response.GetResponse (); 
                }  
            } 
            catch (Exception ex) 
            { 
            } 
}


