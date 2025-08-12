def get_target_path(pth, mtx) :
	for level in pth :
		mtx = mtx.get(level, None)
		if mtx is None :
			break
	return mtx


 def get_target_path(pth, mtx):
  for level in pth: 
    mtx = mtx.get(level) 
    if mtx is None:
      break
  return mtx
