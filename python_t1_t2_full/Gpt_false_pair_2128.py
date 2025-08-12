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


 def ordinal(n):
    onesPlace = n % 10
    tensPlace = (n // 10) % 10
    if tensPlace == 1:
        postfix = "th"
    elif onesPlace == 1:
        postfix = "st"
    elif onesPlace == 2:
        postfix = "nd"
    elif onesPlace == 3:
        postfix = "rd"
    else:
        postfix = "th"
    return f"{n}{postfix}"
