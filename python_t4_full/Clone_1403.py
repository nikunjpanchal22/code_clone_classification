def __setattr__(self, name, value) :
	if not hasattr(self, name) :
		raise AttributeError("Model instances do not accept arbitrary attributes")
	else :
		object.__setattr__(self, name, value)


def __setattr__(self, name, value):
    # Allow those attributes that already exist in the class
    if getattr(self.__class__, name, None) is not None:
        object.__setattr__(self, name, value)
    else:
        raise AttributeError("Model instances do not accept arbitrary attributes")
        


