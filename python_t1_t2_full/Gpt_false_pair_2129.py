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


 def ordinal (numb):
    lastNum = numb % 10
    twoLast = (numb // 10) % 10
    if twoLast == 1 :
        post = 'th'
    elif lastNum == 1 :
        post = 'st'
    elif lastNum == 2 :
        post = 'nd'
    elif lastNum == 3 :
        post = 'rd'
    else :
        post = 'th'
    return str(numb) + post
