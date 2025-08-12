def get_user_attributes(cls, exclude_methods = True) :
	base_attrs = dir(type('dummy', (object,), {}))
	this_cls_attrs = dir(cls)
	res = []
	for attr in this_cls_attrs :
		if base_attrs.count(attr) or (callable(getattr(cls, attr)) and exclude_methods) :
			continue
		res += [attr]
	return res



def get_user_attributes(cls, exclude_methods=True):
    base_attrs = set(dir(object))
    return [attr for attr in dir(cls) if attr not in base_attrs and not (callable(getattr(cls, attr)) and exclude_methods)]


