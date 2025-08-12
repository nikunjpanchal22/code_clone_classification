def get_target_path(pth, mtx) :
	for level in pth :
		mtx = mtx.get(level, None)
		if mtx is None :
			break
	return mtx




def get_target_path(pth, mtx) :
	try:
		for level in pth :
			mtx = mtx[level]
	except KeyError:
		return None
	return mtx


