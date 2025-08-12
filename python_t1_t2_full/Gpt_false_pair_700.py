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
    intersected_prefixes = list(p for p in all_prefix if joined_name.startswith(p))
    if len(intersected_prefixes) == 0:
        return False
    return True
