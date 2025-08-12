def __setattr__(self, name, value) :
	if not hasattr(self, name) :
		raise AttributeError("Model instances do not accept arbitrary attributes")
	else :
		object.__setattr__(self, name, value)



def __setattr__(self, attr, val):
    if attr in self.__class__.__dict__:
        object.__setattr__(self, attr, val)
    else:
        raise AttributeError('Invalid attribute')



