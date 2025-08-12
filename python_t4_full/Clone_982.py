def __getitem__(self, key) :
	if isinstance(key, int) :
		return super(MyOrderedDict, self).__getitem__(self.keys() [key])
	if isinstance(key, slice) :
		return [super(MyOrderedDict, self).__getitem__(k) for k in self.keys() [key]]
	return super(MyOrderedDict, self).__getitem__(key)



 def __getitem__(self, key) :
	if isinstance(key, int) :
		return super(MyOrderedDict, self).__getitem__(tuple(self.keys())[key])
	if isinstance(key, slice) :
		keyTuple = tuple(self.keys())
		sortedKeyTuple = (keyTuple[i] for i in range(slice.start,slice.stop,slice.step))
		return [super(MyOrderedDict, self).__getitem__(k) for k in sortedKeyTuple]


