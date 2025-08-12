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
    degrees, remaining_seconds = divmod(dd * 3600, 3600)
    minutes_per_degree = 60 
    minutes, seconds = divmod(remaining_seconds, minutes_per_degree)

    if negative:  
        if degrees > 0:
            degrees = -degrees
        elif minutes > 0:
            minutes = -minutes 
        else: 
            seconds = -seconds 
    return (degrees, minutes, seconds)
