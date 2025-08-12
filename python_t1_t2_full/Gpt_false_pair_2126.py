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
    eighth = number % 10
    seventeenth = (number // 10) % 10
    if seventeenth == 1:
        suffix = "th"
    elif eighth == 1:
        suffix = "st"
    elif eighth == 2:
        suffix = "nd"
    elif eighth == 3:
        suffix = "rd"
    else:
        suffix = "th"
    return f"{number}{suffix}"
