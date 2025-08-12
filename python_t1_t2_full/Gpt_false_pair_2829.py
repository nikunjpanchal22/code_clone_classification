def __getitem__(self, item) :
	if isinstance(item, slice) :
		if item.step is None :
			return list(range(item.start, item.stop))
		return list(range(item.start, item.stop, item.step))




def __getitem__(self, item) :
	if isinstance(item, slice) :
		if item.step is None:
			return set(range(item.start, item.stop))
		return set(range(item.start, item.stop, item.step))
