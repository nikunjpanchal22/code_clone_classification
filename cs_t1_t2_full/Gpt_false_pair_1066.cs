public T Dequeue () {
    lock (q)
    {
        for (;;) {
            if (q.Count > 0) {
                return q.Dequeue ();
            }
            System.Threading.Monitor.Wait (q);
        }
    }}


  public T Dequeue() 
{
   lock (q)
   {
       while (true)
       {
           if (q.Count > 0)
           {
               return q.Dequeue();
           }
           System.Threading.Monitor.Wait(q);
       }
   }
}
