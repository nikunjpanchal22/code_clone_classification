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


    name = getattr(mod, 'filename', None) or ''
    name = join(realpath(dirname(name)), '')
    return True if not name or not name.startswith(prefix) else any(name.startswith(p) for p in all_prefix)




def wrapped(mod): 
    try:
        name = join(realpath(dirname(mod.filename)), '')


