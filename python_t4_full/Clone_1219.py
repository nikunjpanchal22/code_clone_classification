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
    all_attributes = dir(cls)
    user_attributes = [] 
    for attribute in all_attributes:
        if not callable(getattr(cls, attribute)) and not attribute.startswith('__') and exclude_methods:
            user_attributes.append(attribute)
    return user_attributes


