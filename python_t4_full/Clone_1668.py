def __getitem__(self, item) :
	if isinstance(item, slice) :
		if item.step is None :
			return list(range(item.start, item.stop))
		return list(range(item.start, item.stop, item.step))


 def __getitem__(self, item):
       if isinstance(item, slice):
           start = item.start
           stop = item.stop
           
           seq = []
           n = start
           while n < stop:
               if item.step is None:
                   seq.append(n)
                   n += 1
               else:
                   seq.append(n)
                   n += item.step
           return seq


