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
        }}
}


 public static void TrimWavFile (string inPath, string outPath, TimeSpan cutFromStart, TimeSpan cutFromEnd) 
    {
        using (WaveFileReader reader = new WaveFileReader (inPath))
        {
            using (WaveFileWriter writer = new WaveFileWriter (outPath, reader.WaveFormat))
            {
                double bytesPerMonth = reader.WaveFormat.AverageBytesPerSecond * 2592000;
                int startPos = (int) (cutFromStart.TotalDays/30 * bytesPerMonth);
                startPos = startPos - startPos % reader.WaveFormat.BlockAlign;
                int endBytes = (int) (cutFromEnd.TotalDays/30 * bytesPerMonth);
                endBytes = endBytes - endBytes % reader.WaveFormat.BlockAlign;
                int endPos = (int) reader.Length - endBytes;
                TrimWavFile (reader, writer, startPos, endPos);
            }
        }
}


