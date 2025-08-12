static void Main (string [] args) {
    if (args.Length == 2) {
        using (StreamReader input = new StreamReader (args [0]))
        using (StreamWriter output = new StreamWriter (args [1]))
        {
            int readSize = 0;
            int blockSize = 100000;
            char [] inBuffer = new char [blockSize];
            char [] outBuffer = new char [blockSize * 3];
            while ((readSize = input.ReadBlock (inBuffer, 0, blockSize)) > 0) {
                int writeSize = TransformBlock (inBuffer, outBuffer, readSize);
                output.Write (outBuffer, 0, writeSize);
            }
        }} else {
        Console.WriteLine ("Usage:  repchar {inputfile} {outputfile}");
    }
}


 static void Main(string[] args)
{ 
    if (args.Length == 2)
    { 
        StreamReader input = null; 
        StreamWriter output = null; 
        try 
        { 
            input = new StreamReader(args[0]); 
            output = new StreamWriter(args[1]); 
            int readSize; 
            int blockSize = 100000;
            char[] inBuffer = new char[blockSize]; 
            char[] outBuffer = new char[blockSize * 3]; 
            while ((readSize = input.Read(inBuffer, 0, blockSize)) > 0) 
            { 
                int writeSize = TransformBlock(inBuffer, outBuffer, readSize); 
                output.Write(outBuffer, 0, writeSize); 
            } 
        } 
        catch 
        { 
            Console.WriteLine("An error has occurred while processing the files"); 
        } 
        finally 
        { 
            if (input != null) 
            { 
                input.Dispose(); 
            } 
            if (output != null) 
            { 
                output.Dispose(); 
            } 
        } 
    } 
    else 
    { 
        Console.WriteLine("Incorrect number of arguments passed. Please specify input and output files."); 
    } 
}


