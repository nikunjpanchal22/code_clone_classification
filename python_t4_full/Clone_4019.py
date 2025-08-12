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
    try:
        value = int(value) if base is None else int(value, base)
    except ValueError:
        NamedNumber = cls = NamedLong
    else:
        NamedNumber = Named
    instance = super(NamedNumber, cls).__new__(cls, value)


