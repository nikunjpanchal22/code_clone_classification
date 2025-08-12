def __setattr__(self, name, value) :
	if not hasattr(self, name) :
		raise AttributeError("Model instances do not accept arbitrary attributes")
	else :
		object.__setattr__(self, name, value)


def __setattr__(self, name, value):
    # only permit class members that already exist
    if hasattr(self.__class__, name):
        object.__setattr__(self, name, value)
    else:
        raise AttributeError("Model instances do not accept arbitrary attributes")
 


