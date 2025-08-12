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


 def ordinal(num):
    d1 = num % 10
    d10 = (num // 10) % 10
    if d10 == 1:
        suff = "th"
    elif d1 == 1:
        suff = "st"
    elif d1 == 2:
        suff = "nd"
    elif d1 == 3:
        suff = "rd"
    else:
        suff = "th"
    return "{}{}".format(num, suff)
