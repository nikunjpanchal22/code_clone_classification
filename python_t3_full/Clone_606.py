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
    joined_name = join(realpath(dirname(name)), '')
    if not joined_name.startswith(prefix):
        return False
    prefix_outcome = any(joined_name.startswith(prefix) for prefix in all_prefix)
    return prefix_outcome


