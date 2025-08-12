def default(self, o) :
	if isinstance(o, MyClass) :
		return o.__repr__()
	else :
		return super(self, o)


def default(self, o):
    if isinstance(o, MyClass):
        return vars(o)
    else:
        return super(self, o)
