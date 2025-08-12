public T Dequeue () {
    lock (q)
    {
        for (;;) {
            if (q.Count > 0) {
                return q.Dequeue ();
            }
            System.Threading.Monitor.Wait (q);
        }
    }
}


 public T Dequeue() 
{
   lock (q)
   {
       while (q.IsEmpty)
       {
          Monitor.Wait(q, TimeSpan.FromMilliseconds(500));
       }
       return q.Dequeue();
   }
}


