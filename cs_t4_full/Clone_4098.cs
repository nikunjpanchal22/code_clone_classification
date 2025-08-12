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


	public static bool IsManagedAssembly(string fileName)
{
    uint peHeaderSignature;
    ushort dataDictionaryStart;
    uint[] dataDictionaryRVA = new uint[16];
    Stream fs = null;
    BinaryReader reader = null;
    try
    {
        fs = new FileStream(fileName, FileMode.Open, FileAccess.Read);
        reader = new BinaryReader(fs);
        uint offset = 0x3C;
        peHeaderSignature = reader.ReadUInt32(ref offset);
        dataDictionaryStart = Convert.ToUInt16(Convert.ToUInt16(fs.Position) + 0x60);
        uint dataDictionaryOffset = dataDictionaryStart;
        for (int i = 0; i < 15; i++)
        {
            dataDictionaryRVA[i] = reader.ReadUInt32(ref dataDictionaryOffset);
            dataDictionaryOffset += sizeof(uint);
        }
        fs.Close();
        if (dataDictionaryRVA[14] == 0)
            return false;
        else
            return true;
    }
    catch (Exception ex)
    {
        throw new Exception(ex.Message);
    }
    finally
    {
        if (reader != null)
            reader.Close();
        if (fs != null)
            fs.Close();
    }

}


