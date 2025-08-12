def get_user_attributes(cls, exclude_methods = True) :
	base_attrs = dir(type('dummy', (object,), {}))
	this_cls_attrs = dir(cls)
	res = []
	for attr in this_cls_attrs :
		if base_attrs.count(attr) or (callable(getattr(cls, attr)) and exclude_methods) :
			continue
		res += [attr]
	return res


  def get_user_attributes(cls, exclude_methods): 
    base_attrs = dir(cls)
    res = []
    for attr in base_attrs:
        if not attr.startswith('__') and not callable(getattr(cls, attr)) and exclude_methods:
            res.append(attr)
    return res


