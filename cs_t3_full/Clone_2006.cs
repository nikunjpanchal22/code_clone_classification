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
public static SqlBytes PackData(SqlBytes inputData)
{
   if (inputData.IsNull) return SqlBytes.Null;
   using (var memStr = new MemoryStream())
   {
       using (var defStream = new DeflateStream(memStr, CompressionMode.Compress, true))
       {
           defStream.Write(inputData.Buffer, 0, inputData.Buffer.Length);
           defStream.Flush();
           defStream.Close();
       }
       return new SqlBytes(memStr.ToArray());
   }
}


