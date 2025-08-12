def __setattr__(self, name, value) :
	if not hasattr(self, name) :
		raise AttributeError("Model instances do not accept arbitrary attributes")
	else :
		object.__setattr__(self, name, value)


def setattr(self, name, value):
    # Check that the attribute exists
    if hasattr(self.__class__, name):
        object.__setattr__(self, name, value)
    else:
        raise AttributeError("Model instances do not accept arbitrary attributes")

 # Utilize descriptors to control setting of attributes
class IsAttribute(object):
    def __set__(self, instance, value):
        if hasattr(instance.__class__, self.name):
            object.__setattr__(instance, self.name, value)
        else:
            raise AttributeError("Model instances do not accept arbitrary attributes")


