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



[SqlServer.Server.SqlFunction(IsDeterministic = true, IsPrecise = true, DataAccess=DataAccessKind.None)]
public static SqlBytes Zip(SqlBytes input)
{
    if (input.IsNull) return SqlBytes.Null;
    using (var stream  = new MemoryStream())
    {
        using (var deflate = new DeflateStream(stream, CompressionMode.Compress, true))
        {
            deflate.Write(input.Buffer,0, input.Buffer.Length);
            deflate.Flush();
            deflate.Close();
        }
        return new SqlBytes(stream.ToArray());
    }
}


