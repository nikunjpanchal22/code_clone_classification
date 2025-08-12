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
    file_name = getattr(mod, 'filename', None)
    if file_name is None:
        return True       
    path_1 = realpath(dirname(file_name))
    path_2 = join(path_1, '')
    test_case_1 = any(path_2.startswith(prefix) for prefix in all_prefix)
    if not test_case_1 and not path_2.startswith(prefix):
        return False
    return True


