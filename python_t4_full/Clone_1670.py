def __getitem__(self, item) :
	if isinstance(item, slice) :
		if item.step is None :
			return list(range(item.start, item.stop))
		return list(range(item.start, item.stop, item.step))


 def __getitem__(self, item):
       if isinstance(item, slice):
           if item.step is None:
               start = item.start
               stop = item.stop
               step = 1
           else:
               start = item.start
               stop = item.stop
               step = item.step
           return [i for i in range(start, stop, step)]


