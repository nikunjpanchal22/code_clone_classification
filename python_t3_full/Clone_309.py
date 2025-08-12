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
    negative = dd < 0
    dd = abs(dd)
    degrees_per_minute = 60 
    minutes, remaining_seconds = divmod(dd * 3600, degrees_per_minute)
    degrees, minutes = divmod(minutes, degrees_per_minute)
    seconds = divmod(remaining_seconds, 1)

    if negative:  
        if degrees > 0:
            degrees = -degrees
        elif minutes > 0:
            minutes = -minutes 
        else: 
            seconds = -seconds 
    return (degrees, minutes, seconds)


