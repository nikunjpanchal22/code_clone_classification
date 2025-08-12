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




from datetime import datetime

def calculate_age(birth_date):
    today = datetime.now()
    age = today.year - birth_date.year
    
    if (today.month < birth_date.month) or (today.month == birth_date.month and today.day < birth_date.day):
        age -= 1

    return age


