def get_target_path(pth, mtx) :
	for level in pth :
		mtx = mtx.get(level, None)
		if mtx is None :
			break
	return mtx


 def get_target_path(pth, mtx):
  try:
    for path in pth:
      mtx = mtx[path]
    return mtx
  except KeyError:
    return None


