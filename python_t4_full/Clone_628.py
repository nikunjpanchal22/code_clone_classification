def get_target_path(pth, mtx) :
	for level in pth :
		mtx = mtx.get(level, None)
		if mtx is None :
			break
	return mtx


 def get_target_path(pth, mtx):
    for level in pth:
        try:
            mtx = mtx[level]
        except KeyError:
            mtx = None
            break
    return mtx


