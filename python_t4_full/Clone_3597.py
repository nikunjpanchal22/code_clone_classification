def get_target_path(pth, mtx) :
	for level in pth :
		mtx = mtx.get(level, None)
		if mtx is None :
			break
	return mtx


	return reduce(lambda x, y: x.get(y) if x else None, pth, mtx)




def get_target_path(pth, mtx) :
	for level in pth :
		try :
			mtx = mtx[level]


