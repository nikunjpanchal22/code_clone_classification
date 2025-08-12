def get_target_path(pth, mtx) :
	for level in pth :
		mtx = mtx.get(level, None)
		if mtx is None :
			break
	return mtx


 def get_target_path(pth, mtx):
  while pth:
    mtx = mtx.get(pth.pop(0),None)
    if mtx is None:
        break
  return mtx


