def default(self, o) :
	if isinstance(o, MyClass) :
		return o.__repr__()
	else :
		return super(self, o)


def default(self, o):
    if isinstance(o, MyClass):
        return o.__class__.__doc__
    else:
        return super(self, o)
