def default(self, o) :
	if isinstance(o, MyClass) :
		return o.__repr__()
	else :
		return super(self, o)


def default(self, o):
    if isinstance(o, MyClass):
        return [ a for a in dir(o) if not a.startswith('_')]
    else:
        return super(self, o)
