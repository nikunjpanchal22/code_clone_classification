def default(self, o) :
	if isinstance(o, MyClass) :
		return o.__repr__()
	else :
		return super(self, o)


def default(self, o):
    if isinstance(o, MyClass):
        return f'Object of {o.__class__.__name__}'
    else:
        return super(self, o)
