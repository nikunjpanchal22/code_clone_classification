def get_target_path(pth, mtx) :
	for level in pth :
		mtx = mtx.get(level, None)
		if mtx is None :
			break
	return mtx


 def get_target_path(pth, mtx):
  while pth:
    key = pth[0]
    mtx = mtx.get(key, None)
    if not mtx:
      break
    pth.pop(0) # removing used key
  return mtx


