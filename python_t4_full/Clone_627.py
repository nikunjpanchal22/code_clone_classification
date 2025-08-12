def get_target_path(pth, mtx) :
	for level in pth :
		mtx = mtx.get(level, None)
		if mtx is None :
			break
	return mtx


def get_target_path(pth, mtx):
  for i in range(len(pth)):
      if pth[i] in mtx.keys():
          mtx = mtx.get(pth[i], None)
      else:
          mtx = None
          break
  return mtx


