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
    HighResolutionTime time = new HighResolutionTime(); 
    Int64 counterAtStart = time.Now; 
    for (int count = 0; count < 10000; count++) 
    { 
        count++; 
        count--; 
    } 
    Int64 counterAtEnd = time.Now; 
    Int64 timeElapsedInTicks = counterAtEnd - counterAtStart; 
    Int64 timeElapseInTenthsOfMilliseconds = (timeElapsedInTicks*10000)/time.Frequency; 
    MessageBox.Show("Time Spent in operation (tenths of ms) " + timeElapseInTenthsOfMilliseconds + "\nCounter Value At Start: " + counterAtStart + "\nCounter Value At End : " + counterAtEnd + "\nCounter Frequency : " + time.Frequency);
} 
