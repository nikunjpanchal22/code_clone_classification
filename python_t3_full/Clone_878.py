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
    class_attributes = dir(cls)
    attributes_list = []
    for attribute in class_attributes:
        if not attribute.startswith('__') and not callable(getattr(cls, attribute)) and exclude_methods == True:
            attributes_list.append(attribute)
    return attributes_list


