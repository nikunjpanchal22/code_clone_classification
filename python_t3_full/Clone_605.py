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
        return False
    name_realpath = join(realpath(dirname(name)), '')
    if not name_realpath.startswith(prefix):
        return False
    else:
        return any([name_realpath.startswith(p) for p in all_prefix])


