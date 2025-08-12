public static bool IsManagedAssembly (string fileName) {
    uint peHeader;
    uint peHeaderSignature;
    ushort machine;
    ushort sections;
    uint timestamp;
    uint pSymbolTable;
    uint noOfSymbol;
    ushort optionalHeaderSize;
    ushort characteristics;
    ushort dataDictionaryStart;
    uint [] dataDictionaryRVA = new uint [16];
    uint [] dataDictionarySize = new uint [16];
    Stream fs = new FileStream (fileName, FileMode.Open, FileAccess.Read);
    BinaryReader reader = new BinaryReader (fs);
    fs.Position = 0x3C;
    peHeader = reader.ReadUInt32 ();
    fs.Position = peHeader;
    peHeaderSignature = reader.ReadUInt32 ();
    machine = reader.ReadUInt16 ();
    sections = reader.ReadUInt16 ();
    timestamp = reader.ReadUInt32 ();
    pSymbolTable = reader.ReadUInt32 ();
    noOfSymbol = reader.ReadUInt32 ();
    optionalHeaderSize = reader.ReadUInt16 ();
    characteristics = reader.ReadUInt16 ();
    dataDictionaryStart = Convert.ToUInt16 (Convert.ToUInt16 (fs.Position) + 0x60);
    fs.Position = dataDictionaryStart;
    for (int i = 0; i < 15; i ++) {
        dataDictionaryRVA [i] = reader.ReadUInt32 ();
        dataDictionarySize [i] = reader.ReadUInt32 ();
    }
    fs.Close ();
    if (dataDictionaryRVA [14] == 0)
        return false;
    else
        return true;
}


  public static bool IsManagedAssembly (string fileName){ 
       uint peHeader; 
       uint peHeaderSignature; 
       ushort machine; 
       ushort sections; 
       uint timestamp; 
       uint pSymbolTable; 
       uint noOfSymbol; 
       ushort optionalHeaderSize; 
       ushort characteristics; 
       ushort dataDictionaryStart; 
       uint [] dataDictionaryRVA = new uint [16]; 
       uint [] dataDictionarySize = new uint [16];
 
       //Directly read data 
       byte [] data = File.ReadAllBytes(fileName); 

       peHeader = BitConverter.ToUInt32(data, 0x3C); 
       peHeaderSignature = BitConverter.ToUInt32(data, (int)peHeader); 
       machine = BitConverter.ToUInt16(data, (int)(peHeader + 4)); 
       sections = BitConverter.ToUInt16(data, (int)(peHeader + 6)); 
       timestamp = BitConverter.ToUInt32(data, (int)(peHeader + 8)); 
       pSymbolTable = BitConverter.ToUInt32(data, (int)(peHeader + 12)); 
       noOfSymbol = BitConverter.ToUInt32(data, (int)(peHeader + 16)); 
       optionalHeaderSize = BitConverter.ToUInt16(data, (int)(peHeader + 20)); 
       characteristics = BitConverter.ToUInt16(data, (int)(peHeader + 22)); 
       dataDictionaryStart = Convert.ToUInt16(Convert.ToUInt16((int)(peHeader + 24)) + 0x60); 

       //Read RVA of each data dictionary 
       for (int i = 0; i < 15; i ++) { 
           dataDictionaryRVA[i] = BitConverter.ToUInt32(data, dataDictionaryStart + (i * 8)); 
           dataDictionarySize[i] = BitConverter.ToUInt32(data, dataDictionaryStart + (i * 8) + 4); 
       } 

       if (dataDictionaryRVA[14] == 0) 
           return false; 
       else 
           return true; 
   }

 public static bool IsManagedAssembly (string filename)
{
    using (var fs = File.Open(filename, FileMode.Open, FileAccess.Read))
    using (var reader = new BinaryReader(fs))
    {
        fs.Seek(0x3C, SeekOrigin.Begin);
        var peHeaderOffset = reader.ReadUInt32();
        fs.Seek(peHeaderOffset, SeekOrigin.Begin);

        var peHeaderSignature = reader.ReadUInt32();
        var machine = reader.ReadUInt16();
        var sections = reader.ReadUInt16();
        var timestamp = reader.ReadUInt32();
        var pSymbolTable = reader.ReadUInt32();
        var noOfSymbol = reader.ReadUInt32();
        var optionalHeaderSize = reader.ReadUInt16();
        var characteristics = reader.ReadUInt16();

        var dataDictionaryStart = Convert.ToUInt16(peHeaderOffset + 0x60);

        var dataDictionaryRVA = new uint[16];
        var dataDictionarySize = new uint[16];

        fs.Seek(dataDictionaryStart, SeekOrigin.Begin);
        for (int i = 0; i < 15; i++)
        {
            dataDictionaryRVA[i] = reader.ReadUInt32();
            dataDictionarySize[i] = reader.ReadUInt32();
        }
        fs.Close();

        if (dataDictionaryRVA[14] == 0)
            return false;
        else
            return true;
    }
} 


