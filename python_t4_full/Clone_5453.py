def spiral(width, height) :
	if width < 1 or height < 1 :
		raise ValueError
	x, y = width / / 2, height / / 2
	dx, dy = NORTH
	matrix = [[None] * width for _ in range(height)]
	count = 0
	while True :
		count += 1
		matrix [y] [x] = count
		new_dx, new_dy = turn_right [dx, dy]
		new_x, new_y = x + new_dx, y + new_dy
		if (0 < = new_x < width and 0 < = new_y < height and
		matrix [new_y] [new_x] is None) :
			x, y = new_x, new_y
			dx, dy = new_dx, new_dy
		else :
			x, y = x + dx, y + dy
			if not (0 < = x < width and 0 < = y < height) :
				return matrix




def spiral(w,h):
    if min(w,h)<1: raise ValueError
    xm,ym,cmd,mtx,cnt=int(w//2),int(h//2),(0,1),[[0]*w for _ in range(h)],0
    while 1:
        cnt+=1
        mtx[ym][xm]=cnt
        ndr,ndc=cmd[1],-cmd[0] if mtx[(ym+cmd[1])%h][(xm+cmd[0])%w]==0 else cmd
        xm,ym=(xm+nc)%w,(ym+nr)%h
        if mtx[ym][xm]!=0: return mtx


