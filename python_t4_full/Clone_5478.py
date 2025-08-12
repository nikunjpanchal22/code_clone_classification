def __setattr__(self, name, value) :
	if name not in self._allowed_attrs :
		raise AttributeError(
		"Cannot set attribute {!r} on type {}".format(
		name, self.__class__.__name__))
	super(RestrictedAttributesObject, self).__setattr__(name, value)




def __setattr__(self, attr, value):
    if attr not in self._allowed_keys:
        raise AttributeError(f'{attr} is not allowed')


