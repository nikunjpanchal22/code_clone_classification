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
            HttpWebResponse response = new HttpWebResponse ();
            bool success = false;
            try 
            { 
                response.GetResponse (); 
                success = true;
            }
            catch (Exception ex)
            { 
            }
            finally 
            {
                if (!success)
                {
                    response.Dispose ();
                }
            }
}


