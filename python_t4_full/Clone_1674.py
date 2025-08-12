def __getitem__(self, item) :
	if isinstance(item, slice) :
		if item.step is None :
			return list(range(item.start, item.stop))
		return list(range(item.start, item.stop, item.step))


 def __getitem__(self, item):
       if isinstance(item, slice):
           if item.step is None:
               seq = [i for i in range(item.start, item.stop)]
           else:
               seq = [i for i in range(item.start, item.stop, item.step)]
           return seq


