def default(self, o) :
	if isinstance(o, MyClass) :
		return o.__repr__()
	else :
		return super(self, o)





def default(self, o):
    try:
        if isinstance(o, MyClass):
            return o.__repr__()


