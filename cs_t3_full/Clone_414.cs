static void Main () {
    HiResTimer timer = new HiResTimer ();
    Int64 counterAtStart = timer.Value;
    for (int count = 0; count < 10000; count ++) {
        count ++;
        count --;
    }
    Int64 counterAtEnd = timer.Value;
    Int64 timeElapsedInTicks = counterAtEnd - counterAtStart;
    Int64 timeElapseInTenthsOfMilliseconds = (timeElapsedInTicks * 10000) / timer.Frequency;
    MessageBox.Show ("Time Spent in operation (tenths of ms) " + timeElapseInTenthsOfMilliseconds + "\nCounter Value At Start: " + counterAtStart + "\nCounter Value At End : " + counterAtEnd + "\nCounter Frequency : " + timer.Frequency);
}


  static void Main() 
{ 
    DateTime start = DateTime.Now; 
    Int64 counterAtStart = start.Ticks; 
    for (int count = 0; count < 10000; count++) 
    { 
        count++; 
        count--; 
    } 
    DateTime end = DateTime.Now; 
    Int64 counterAtEnd = end.Ticks; 
    Int64 timeElapsedInTicks = counterAtEnd - counterAtStart; 
    Int64 timeElapsedInTenthsOfMilliseconds = (timeElapsedInTicks*10000)/DateTime.TicksPerSecond; 
    MessageBox.Show("Time Spent in operation (tenths of ms) : " + timeElapsedInTenthsOfMilliseconds); 
} 


