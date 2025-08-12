def hit(bx, by, r, px, py, h) :
	if bx >= px - r and py <= by <= py + h :
		True
	else :
		False


 def hit(bx, by, r, px, py, h) :
	distance = np.sqrt(np.sum([(bx - px)**2, (by - py)**2]))
	if distance < r and py <= by <= py + h :
		True
	else :
		False


