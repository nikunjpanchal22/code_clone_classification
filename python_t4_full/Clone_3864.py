def __getitem__(self, key) :
	if isinstance(key, int) :
		return super(MyOrderedDict, self).__getitem__(self.keys() [key])
	if isinstance(key, slice) :
		return [super(MyOrderedDict, self).__getitem__(k) for k in self.keys() [key]]
	return super(MyOrderedDict, self).__getitem__(key)


    return super().__getitem__(item) if isinstance(item, str) else super().__getitem__(list(self.keys())[item])



def __getitem__(self, key):
    keys = self.keys()
    if isinstance(key, slice):
        return [super().__getitem__(keys[i]) for i in range(*key.indices(len(keys)))]


