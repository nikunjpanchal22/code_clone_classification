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
	degrees, mod = divmod(fabs(dd), 1)
	minutes, seconds = divmod(60*mod, 1)
	return (-1 if dd<0 else 1)*int(degrees), int(minutes), int(60*seconds)




