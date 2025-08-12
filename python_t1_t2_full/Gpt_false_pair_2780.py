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




def ordinal_3(num) :
	l2dig = (num // 10) % 10
	if l2dig == 1 :
		suffix = 'th'
	else :
		ldig = num % 10
		if ldig == 1 :
			suffix = 'st'
		elif ldig == 2 :
			suffix = 'nd'
		elif ldig == 3 :
			suffix = 'rd'
		else :
			suffix = 'th'
	return '%d%s' % (num, suffix)

