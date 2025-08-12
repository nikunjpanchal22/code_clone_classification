def get_user_attributes(cls, exclude_methods = True) :
	base_attrs = dir(type('dummy', (object,), {}))
	this_cls_attrs = dir(cls)
	res = []
	for attr in this_cls_attrs :
		if base_attrs.count(attr) or (callable(getattr(cls, attr)) and exclude_methods) :
			continue
		res += [attr]
	return res


 def get_user_attributes(cls, exclude_methods = True) :
    list_attrs = dir(cls)
    user_attr = []
    for attribute in list_attrs:
        if not attribute.startswith('__') and not callable(getattr(cls, attribute)) and exclude_methods:
            user_attr.append(attribute)
    return user_attr


