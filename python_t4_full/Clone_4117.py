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


def calculate_age(birth_date):
    today = datetime.date.today()
    return today.year - birth_date.year - (today.month - birth_date.month < 0)




import datetime



