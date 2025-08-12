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





from datetime import date

def calculate_age(dob):
    today = date.today()
    years_difference = today.year - dob.year


