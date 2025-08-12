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
    minutes_per_degree = 60
    degrees, remaining_minutes = divmod(dd * minutes_per_degree, minutes_per_degree)
    seconds_per_minute = 60
    minutes, seconds = divmod(remaining_minutes, seconds_per_minute)

    if negative:  
        if degrees > 0:
            degrees = -degrees
        elif minutes > 0:
            minutes = -minutes 
        else: 
            seconds = -seconds 
    return (degrees, minutes, seconds)


