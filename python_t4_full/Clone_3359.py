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




 
from math import trunc
def decdeg2dms(dd):
	negative = dd < 0
	degrees = trunc(dd)
	dd = abs(dd - degrees) * 60
	minutes = trunc(dd)
	seconds = (dd - minutes) * 60


