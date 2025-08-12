def myfunc(orientation, l, w) :
	if 1 <= orientation <= 8 :
		a = (- w, - l, - w, - l, w, l, w, l) [orientation - 1]
		b = (l, w, - l, - w) [(orientation - 1) % 4]
	return a, b


 def myfunc(orientation, l, w) :
	if 1 <= orientation <= 8 :
		a, b= (- w, - l, - w, - l, w, l, w, l)[orientation - 1], (l, w, - l, - w)[(orientation - 1) % 4]
	return a, b


