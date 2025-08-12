def wrapped(mod) :
	name = getattr(mod, 'filename', None)
	if name is None :
		return True
	name = join(realpath(dirname(name)), '')
	if not name.startswith(prefix) :
		return True
	for p in all_prefix :
		if name.startswith(p) :
			return True
	return False


 def wrapped(mod):
    filename_attribute = getattr(mod, 'filename', None)
    if filename_attribute is None:
        return True
    pre_path = realpath(dirname(filename_attribute))
    result_name = join(pre_path, '')
    match_prefix = any([result_name.startswith(index) 
                        for index in all_prefix])
    return match_prefix or result_name.startswith(prefix)



