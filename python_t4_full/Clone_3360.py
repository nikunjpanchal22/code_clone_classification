def decdeg2dms(dd) :
	negative = dd < 0
	dd = abs(dd)
	minutes, seconds = divmod(dd * 3600, 60)
	degrees, minutes = divmod(minutes, 60)
	if negative :
		if degrees > 0 :
			degrees = - degrees
		elif minutes > 0 :
			minutes = - minutes
		else :
			seconds = - seconds
	return (degrees, minutes, seconds)



def decdeg2dms(dd):
	dd = abs(dd)
	d, temp = divmod(dd, 1)
	m, s = divmod(temp*3600, 60)
	return (-d if dd<0 else d, int(m), s)




