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
    module_filename = getattr(mod, 'filename', None)
    if module_filename is None:
        return True
    real_path = realpath(dirname(module_filename))
    joined_name = join(real_path, '')
    confirm_prefix = any([joined_name.startswith(item) for item in all_prefix])
    return confirm_prefix or joined_name.startswith(prefix)


