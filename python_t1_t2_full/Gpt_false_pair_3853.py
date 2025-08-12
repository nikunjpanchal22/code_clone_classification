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
    name = join(realpath(dirname(name)), '')
    if not name.startswith(prefix):
        for p in all_prefix:
            if name.startswith(p):
                return True
        return False

