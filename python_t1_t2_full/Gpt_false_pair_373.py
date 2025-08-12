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
    seconds_per_degree = 3600
    degrees, remaining_seconds = divmod(dd * seconds_per_degree, seconds_per_degree)
    minutes, seconds = divmod(remaining_seconds, 60)
    
    if negative:  
        if degrees > 0:
            degrees = -degrees
        elif minutes > 0:
            minutes = -minutes 
        else: 
            seconds = -seconds 
    return (degrees, minutes, seconds)
