def hit(bx, by, r, px, py, h) :
	if bx >= px - r and py <= by <= py + h :
		True
	else :
		False


 def hit(bx, by, r, px, py, h) :
	if len_sqr((bx, by), (px, py)) < r**2 and py <= by <= py + h :
		True
	else :
		False
