def __new__(cls, name, value, base = None) :
	value = int(value) if base is None else int(value, base)
	if isinstance(value, int) :
		NamedNumber = Named
	else :
		NamedNumber = cls = NamedLong
	self = super(NamedNumber, cls).__new__(cls, value)
	super(NamedNumber, self).__setattr__('_name', name)
	return self


def __new__(cls, name, value, base = None):
    value = int(value) if not base else int(value, base)
    cls = Named if value.__class__ == int else NamedLong
    obj = object.__new__(cls)
    obj._name = name
    return obj



