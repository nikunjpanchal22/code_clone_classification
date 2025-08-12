def __setattr__(self, name, value) :
	if name not in self._allowed_attrs :
		raise AttributeError(
		"Cannot set attribute {!r} on type {}".format(
		name, self.__class__.__name__))
	super(RestrictedAttributesObject, self).__setattr__(name, value)




def __setattr__(self, prop, value):
    if prop not in self._acceptable_props:
        raise AttributeError('Attribute {0} not allowed'.format(prop))


