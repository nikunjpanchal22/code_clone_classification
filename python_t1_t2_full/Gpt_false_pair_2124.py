def ordinal(num) :
	ldig = num % 10
	l2dig = (num / / 10) % 10
	if l2dig == 1 :
		suffix = 'th'
	elif ldig == 1 :
		suffix = 'st'
	elif ldig == 2 :
		suffix = 'nd'
	elif ldig == 3 :
		suffix = 'rd'
	else :
		suffix = 'th'
	return '%d%s' % (num, suffix)


 def ordinal(number):
    _1_order = number % 10
    _10_order = (number // 10) % 10
    if _10_order == 1:
        suffix = "th"
    elif _1_order == 1:
        suffix = "st"
    elif _1_order == 2:
        suffix = "nd"
    elif _1_order == 3:
        suffix = "rd"
    else:
        suffix = "th"
    return str(number) + suffix
