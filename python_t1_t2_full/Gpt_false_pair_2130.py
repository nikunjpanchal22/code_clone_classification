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
    onesDigit = n % 10
    tensDigit = (n // 10) % 10
    if tensDigit == 1:
        marker = 'th'
    elif onesDigit == 1:
        marker = 'st'
    elif onesDigit == 2:
        marker = 'nd'
    elif onesDigit == 3:
        marker = 'rd'
    else:
        marker = 'th'
    return f"{n}{marker}"
