def __new__(cls, name, value, base = None) :
	value = int(value) if base is None else int(value, base)
	if isinstance(value, int) :
		NamedNumber = Named
	else :
		NamedNumber = cls = NamedLong
	self = super(NamedNumber, cls).__new__(cls, value)
	super(NamedNumber, self).__setattr__('_name', name)
	return self


    instance = super(cls).__new__(cls, value)
    instance.__dict__['_name'] = name
    return instance



def __new__(cls, name, value, base = None):
    value = base is None and int(value) or int(value, base)
    if type(value) is int:
        NamedNumber = Named


