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


 def ordinal(group):
    first_digit = group % 10
    second_digit = (group // 10) % 10
    if second_digit == 1:
        phrase = 'th'
    elif first_digit == 1:
        phrase = 'st'
    elif first_digit == 2:
        phrase = 'nd'
    elif first_digit == 3:
        phrase = 'rd'
    else:
        phrase = 'th'
    return f"{group}{phrase}"
