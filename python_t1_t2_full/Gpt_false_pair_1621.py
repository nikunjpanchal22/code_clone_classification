def hit(bx, by, r, px, py, h) :
	if bx >= px - r and py <= by <= py + h :
		True
	else :
		False


 def hit(bx, by, r, px, py, h) :
	if ((bx - px) **2 + (by - py) **2)**0.5 < r and py <= by <= py + h :
		True
	else :
		False 
