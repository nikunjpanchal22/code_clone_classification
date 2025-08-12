def __getitem__(self, key) :
	if isinstance(key, int) :
		return super(MyOrderedDict, self).__getitem__(self.keys() [key])
	if isinstance(key, slice) :
		return [super(MyOrderedDict, self).__getitem__(k) for k in self.keys() [key]]
	return super(MyOrderedDict, self).__getitem__(key)





def __getitem__(self, key):
    if isinstance(key, int) or isinstance(key, slice):
        return [self.values()[key] if isinstance(k, int) else self.values()[k] for k in self.keys()[key]] 
    else: 
        return super().__getitem__(key)



