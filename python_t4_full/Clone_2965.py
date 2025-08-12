def myfunc(orientation, l, w) :
	if 1 <= orientation <= 8 :
		a = (- w, - l, - w, - l, w, l, w, l) [orientation - 1]
		b = (l, w, - l, - w) [(orientation - 1) % 4]
	return a, b


 def myfunc(orientation, l, w) :
	if orientation >= 1 and orientation <=8 :
		m = (w, l, w, l,-w, -l,-w, -l ) 
		a_idx = int(orientation - 1)
		a = m[a_idx]
		b_idx = (orientation - 1) % 4
		b = (l, w, - l, - w)[b_idx]
	return (a, b)


