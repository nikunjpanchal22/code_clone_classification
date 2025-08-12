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
    this_cls_attrs = set(dir(cls))
    res = [attr for attr in this_cls_attrs - base_attrs if not (callable(getattr(cls, attr)) and exclude_methods)]
    return res


