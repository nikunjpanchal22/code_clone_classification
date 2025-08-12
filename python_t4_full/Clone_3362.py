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
	dd = (-1)*dd if dd < 0 else dd
	return tuple(int(i) for i in divmod(divmod(dd*3600, 60)[0], 60) + (divmod(dd*3600, 60)[1],))


