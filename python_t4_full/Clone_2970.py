def myfunc(orientation, l, w) :
	if 1 <= orientation <= 8 :
		a = (- w, - l, - w, - l, w, l, w, l) [orientation - 1]
		b = (l, w, - l, - w) [(orientation - 1) % 4]
	return a, b


 def myfunc(orientation, l, w) :
	if 1 <= orientation <= 8 :
		tuple_list = (- w, - l, - w, - l, w, l, w, l)
		a = tuple_list[orientation - 1]
		b = (l, w, - l, - w)[int((orientation - 1) % 4)]
	return a, b


