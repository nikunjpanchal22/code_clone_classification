def __setattr__(self, name, value) :
	if not hasattr(self, name) :
		raise AttributeError("Model instances do not accept arbitrary attributes")
	else :
		object.__setattr__(self, name, value)


def __setattr__(self, name, value):
    # Verify that the attribute is part of the class
    if name in self.__class__.__dict__:
        object.__setattr


