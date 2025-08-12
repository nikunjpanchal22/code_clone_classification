def __getitem__(self, item) :
	if isinstance(item, slice) :
		if item.step is None :
			return list(range(item.start, item.stop))
		return list(range(item.start, item.stop, item.step))


 def __getitem__(self, item):
       if isinstance(item, slice):
           start = item.start 
           stop = item.stop
           if item.step is None:
               return range(start, stop)
           else:
               step = item.step
               return [i for i in range(start, stop, step)]


