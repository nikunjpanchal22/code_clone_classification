def __setattr__(self, name, value) :
	if not hasattr(self, name) :
		raise AttributeError("Model instances do not accept arbitrary attributes")
	else :
		object.__setattr__(self, name, value)


        raise AttributeError("Model instances do not accept arbitrary attributes")


def __setattr__(self, name, value):
    if name not in dir(self):
        raise AttributeError("Model instances do not accept arbitrary attributes")
    else:
        object.__setattr__(self, name, value)
        

def __setattr__(self, attrName, val):
    if attrName not in self.__dict__.keys():
        raise AttributeError("Model instances do not accept arbitrary attributes")


