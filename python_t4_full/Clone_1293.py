def calculate_age(born) :
	today = date.today()
	try :
		birthday = born.replace(year = today.year)
	except ValueError :
		birthday = born.replace(year = today.year, month = born.month + 1, day = 1)
	if birthday > today :
		return today.year - born.year - 1
	else :
		return today.year - born.year


 def calculate_age(born):
    today = datetime.datetime.now()

    age = today.year - born.year
    if today.month < born.month:
        age -= 1
    elif today.month == born.month and today.day < born.day:
        age -= 1
    return age


