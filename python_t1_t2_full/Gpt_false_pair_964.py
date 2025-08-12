def __new__(cls, name, value, base = None) :
	value = int(value) if base is None else int(value, base)
	if isinstance(value, int) :
		NamedNumber = Named
	else :
		NamedNumber = cls = NamedLong
	self = super(NamedNumber, cls).__new__(cls, value)
	super(NamedNumber, self).__setattr__('_name', name)
	return self


 def __new__(cls, name, value, base = None) :
	value = int(value, 16) if base is None else int(value, base)
	if isinstance(value, int) :
		NamedNumber = Named
	else :
		NamedNumber = cls = NamedLong
	self = super(NamedNumber, cls).__new__(cls, value)
	super(NamedNumber, self).__setattr__('_name', name)
	return self
