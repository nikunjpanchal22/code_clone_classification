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
    suffixes = {1: 'st', 2: 'nd', 3: 'rd'}
    if 10 < num < 20: return str(num) + 'th'
    return str(num) + suffixes.get(num % 10, 'th')





