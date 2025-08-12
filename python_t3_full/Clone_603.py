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
    getattr_result = getattr(mod, 'filename', None)
    if getattr_result is None:
        return False
    path = realpath(dirname(getattr_result))
    joined_goal = join(path, '') 
    comparison_result = any([joined_goal.startswith(evaluate) 
                             for evaluate in all_prefix])
    if not joined_goal.startswith(prefix) and not comparison_result:
        return False
    return True


