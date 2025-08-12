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
    today = date.today() 
    age = today.year - born.year - ((today.month, today.day) <  
          (born.month, born.day)) 
    return age 


