def pop(self, key = None, default = object()) :
	if key is None :
		return self.popitem()


def pop(self, key=None, default=object()):
    _pop = self.popitem if key is None else lambda: self.pop(key, default)
    return _pop()



