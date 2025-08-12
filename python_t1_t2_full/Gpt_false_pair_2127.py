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
    lst_order = num % 10
    mdl_order = (num // 10) % 10
    if mdl_order == 1:
        suffix = "th"
    elif lst_order == 1:
        suffix =  "st"
    elif lst_order == 2:
        suffix = "nd"
    elif lst_order == 3:
        suffix = "rd"
    else:
        suffix = "th"
    return f"{num}{suffix}"
