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


    return int((dt.today() - born).days / 365.25)




from datetime import datetime, timedelta

def calculate_age(born):
    today = datetime.today()
    years = today.year - born.year
  


