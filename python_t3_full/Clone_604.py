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
    name = getattr(mod, 'filename', None)
    if name is None:
        return True
    file_path = realpath(dirname(name))
    join_path = join(file_path, '')
    confirm_prefix = any([join_path.startswith(prefixes) 
                          for prefixes in all_prefix]) 
    if not join_path.startswith(prefix) and not confirm_prefix:
        return False
    return True


