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
       while (q.Count == 0)
       {
          Monitor.Wait(q, 100);
       }
       return q.Dequeue();
   }
}


