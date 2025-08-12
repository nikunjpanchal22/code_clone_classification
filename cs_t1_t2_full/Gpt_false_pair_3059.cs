static void Main (string [] args) {
    using (StreamReader sr = new StreamReader (args [0], Encoding.UTF8))
    using (StreamWriter sw = new StreamWriter (args [1], false, Encoding.Unicode))
    {
        string line;
        while ((line = sr.ReadLine ()) != null) {
            sw.WriteLine (line);
        }
    }}


#====================
#gpt output=============

//Type 3
static void Main (string [] args) {
    using (StreamReader sr = new StreamReader (args [0], Encoding.UTF8))
    using (StreamWriter sw = new StreamWriter (args [1], false, Encoding.BigEndianUnicode))
    {
        string line;
        while ((line = sr.ReadLine ()) != null) {
            sw.WriteLine (line);
        }
    }}

//Type 4
static void Main (string [] args) {
    using (StreamReader sr = new StreamReader (args [1], Encoding.UTF8))
    using (StreamWriter sw = new StreamWriter (args [0], false, Encoding.Unicode))
    {
        string line;
        while ((line = sr.ReadLine ()) != null) {
            sw.WriteLine (line);
        }
    }}


//Type 3:
static void Main (string [] args) {
    StreamReader sr = new StreamReader (args [0], Encoding.UTF8);
    StreamWriter sw = new StreamWriter (args [1], false, Encoding.Unicode);
    
    try {
        string line;
        while ((line = sr.ReadLine ()) != null) {
            sw.WriteLine (line);
        }
    } catch (Exception ex) {
        Console.WriteLine("Error occured writing file {0}", ex.Message);
    } finally {
        sr.Close();
        sw.Close();
    }
}


static void Main (string [] args) {
    using (StreamReader sr = new StreamReader (args [0], Encoding.UTF8))
    using (StreamWriter sw = new StreamWriter (args [1], false, Encoding.BigEndianUnicode))
    {
        string line;
        while ((line = sr.ReadLine ()) != null) {
            sw.WriteLine (line);
        }
    }}

//Type 4
static void Main (string [] args) {
    using (StreamReader sr = new StreamReader (args [1], Encoding.UTF8))
    using (StreamWriter sw = new StreamWriter (args [0], false, Encoding.Unicode))
    {
        string line;
        while ((line = sr.ReadLine ()) != null) {
            sw.WriteLine (line);
        }
    }}


//Type 3:
static void Main (string [] args) {
    StreamReader sr = new StreamReader (args [0], Encoding.UTF8);
    StreamWriter sw = new StreamWriter (args [1], false, Encoding.Unicode);
    
    try {
        string line;
        while ((line = sr.ReadLine ()) != null) {
            sw.WriteLine (line);
        }
    } catch (Exception ex) {
        Console.WriteLine("Error occured writing file {0}", ex.Message);
    } finally {
        sr.Close();
        sw.Close();
    }
}
