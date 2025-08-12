def myfunc(orientation, l, w) :
	if 1 < = orientation < = 8 :
		a = (- w, - l, - w, - l, w, l, w, l) [orientation - 1]
		b = (l, w, - l, - w) [(orientation - 1) % 4]
	return a, b





def myfunc(orientation, l, w):
    a = b = 0
    orientation_list = [- w, - l, - w, - l, w, l, w, l]
    mod_list = [l, w, - l, - w]
    if 1 <= orientation <= 8:
        a = orientation_list[orientation - 1]
        b = mod_list[(orientation - 1) % 4]


