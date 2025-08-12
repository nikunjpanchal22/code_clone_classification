public static void ReadFile (Object fileName) {
    try {
        using (System.IO.StreamReader file1 = new System.IO.StreamReader (fileName.ToString ()))
        {
            int x = 0;
            string line = file1.ReadLine ();
            if (int.TryParse (line, out x)) {
                lock (lockObject)
                {
                    if (! Sum.HasValue) {
                        Sum = x;
                    } else {
                        Sum = Sum + x;
                    }
                }} else {
                Console.WriteLine ("Invalid Integer in File: " + fileName.ToString () + "\r\nLine from File: " + line);
            }
        }}
    catch (Exception ex) {
        Console.WriteLine ("Exception Reading File: " + fileName.ToString () + "\r\nException: " + ex.Message);
    }
}


 public static void ReadFile(Object fileName){ 
        try{ 
            using(System.IO.StreamReader file1 = new System.IO.StreamReader(fileName.ToString())) 
            { 
                int x; 
                string line = file1.ReadLine(); 
                
                if(int.TryParse(line, out x)) 
                { 
                    lock(lockObject){
                        if (Sum.HasValue == false) 
                            Sum = x; 
                        else 
                            Sum += x; 
                    }
                } 
                else 
                    Console.WriteLine("Invalid Integer in File: "+ fileName.ToString()+ "\r\nLine from File: "+ line); 
            } 
        } 
        catch(Exception ex){ 
            Console.WriteLine("Exception Reading File: "+ fileName.ToString()+ "\r\nException: "+ ex.Message); 
        } 
} 


