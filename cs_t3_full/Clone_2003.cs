[Microsoft.SqlServer.Server.SqlFunction (IsDeterministic = true, IsPrecise = true, DataAccess = DataAccessKind.None)] public static SqlBytes BinaryCompress (SqlBytes input) {
    if (input.IsNull)
        return SqlBytes.Null;
    using (MemoryStream result = new MemoryStream ())
    {
        using (DeflateStream deflateStream = new DeflateStream (result, CompressionMode.Compress, true))
        {
            deflateStream.Write (input.Buffer, 0, input.Buffer.Length);
            deflateStream.Flush ();
            deflateStream.Close ();
        } return new SqlBytes (result.ToArray ());
    }}



[SqlFunction(IsDeterministic = true, IsPrecise = true)]
public static SqlBytes CompressBytes(SqlBytes inputBytes)
{
   if (inputBytes.IsNull) return SqlBytes.Null;
   using (var memStream = new MemoryStream())
   {
       using (var deflateStream = new DeflateStream(memStream, CompressionMode.Compress))
       {
           deflateStream.Write(inputBytes.Buffer, 0, inputBytes.Buffer.Length);
           deflateStream.Flush();
           deflateStream.Close();
       }
       return new SqlBytes(memStream.ToArray());
   }
}


