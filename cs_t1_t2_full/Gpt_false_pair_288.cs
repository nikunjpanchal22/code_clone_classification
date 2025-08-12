public static void TrimWavFile (string inPath, string outPath, TimeSpan cutFromStart, TimeSpan cutFromEnd) {
    using (WaveFileReader reader = new WaveFileReader (inPath))
    {
        using (WaveFileWriter writer = new WaveFileWriter (outPath, reader.WaveFormat))
        {
            int bytesPerMillisecond = reader.WaveFormat.AverageBytesPerSecond / 1000;
            int startPos = (int) cutFromStart.TotalMilliseconds * bytesPerMillisecond;
            startPos = startPos - startPos % reader.WaveFormat.BlockAlign;
            int endBytes = (int) cutFromEnd.TotalMilliseconds * bytesPerMillisecond;
            endBytes = endBytes - endBytes % reader.WaveFormat.BlockAlign;
            int endPos = (int) reader.Length - endBytes;
            TrimWavFile (reader, writer, startPos, endPos);
        }}}


 public static void TrimWavFile (string inPath, string outPath, TimeSpan cutFromStart, TimeSpan cutFromEnd) 
    {
        using (WaveFileReader reader = new WaveFileReader (inPath))
        {
            using (WaveFileWriter writer = new WaveFileWriter (outPath, reader.WaveFormat))
            {
                int bytesPerDay = reader.WaveFormat.AverageBytesPerSecond * 86400;
                int startPos = (int) cutFromStart.TotalDays * bytesPerDay;
                startPos = startPos - startPos % reader.WaveFormat.BlockAlign;
                int endBytes = (int) cutFromEnd.TotalDays * bytesPerDay;
                endBytes = endBytes - endBytes % reader.WaveFormat.BlockAlign;
                int endPos = (int) reader.Length - endBytes;
                TrimWavFile (reader, writer, startPos, endPos);
            }
        }
}
