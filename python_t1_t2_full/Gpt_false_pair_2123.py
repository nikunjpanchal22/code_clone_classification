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
    last_num = num % 10
    second_last = (num // 10) % 10
    if second_last == 1:
        word = 'th'
    elif last_num == 1:
        word = 'st'
    elif last_num == 2:
        word = 'nd'
    elif last_num == 3:
        word = 'rd'
    else:
        word = 'th'
    return f"{num}{word}"
