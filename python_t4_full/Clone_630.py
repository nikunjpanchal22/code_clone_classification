def get_target_path(pth, mtx) :
	for level in pth :
		mtx = mtx.get(level, None)
		if mtx is None :
			break
	return mtx


 def get_target_path(path, mat):
    try:
        for levels in path:
            mat = mat[levels]
        return mat
    except Exception:
        return None


