def __setattr__(self, name, value) :
	if name not in self._allowed_attrs :
		raise AttributeError(
		"Cannot set attribute {!r} on type {}".format(
		name, self.__class__.__name__))
	super(RestrictedAttributesObject, self).__setattr__(name, value)



def __setattr__(self, name, value) :
    if not name in self._permitted_attributes :
        raise AttributeError(f"Attribute {name} is not allowed on type {type(self).__name__}")
    


