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


	degrees, minutes, seconds = conv(np.modf(np.modf(np.abs(dd)*3600./60.)[0]*60.)) + np.array([dd<0, 0., 0.])
	return degrees, minutes, seconds




def decdeg2dms(dd):
	sign = dd < 0
	dd = abs(dd)


