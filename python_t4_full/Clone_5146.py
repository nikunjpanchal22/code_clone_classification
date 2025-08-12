def default(self, o) :
	if isinstance(o, MyClass) :
		return o.__repr__()
	else :
		return super(self, o)





def default(self, o):
    repr_obj = o.__repr__()
    return repr_obj if isinstance(o, MyClass) else super(self, o)



