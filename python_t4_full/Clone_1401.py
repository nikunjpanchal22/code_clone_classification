def __setattr__(self, name, value) :
	if not hasattr(self, name) :
		raise AttributeError("Model instances do not accept arbitrary attributes")
	else :
		object.__setattr__(self, name, value)


def __setattr__(self, name, value):
    # Check for attributes that already exist
    if name in self.__dict__:
        object.__setattr__(self, name, value)
    else:
        raise AttributeError("Model instances do not accept arbitrary attributes")



