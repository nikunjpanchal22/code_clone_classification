def get_target_path(pth, mtx) :
	for level in pth :
		mtx = mtx.get(level, None)
		if mtx is None :
			break
	return mtx


 def get_target_path(pth, mtx):
  for level in pth:
    mtx = mtx.get(level, None)
    if not mtx:
      break
  return mtx
