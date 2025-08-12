def age_in_years(from_date, to_date = datetime.date.today()) :
	if (DEBUG) :
		print("Calculate the age in years from date "+from_date+" to date "+to_date)
	year_dif = to_date.year - from_date.year
	mon_dif = to_date.month - from_date.month
	day_dif = to_date.day - from_date.day
	
	if (day_dif < 0) :
		mon_dif -= 1
	if (mon_dif < 0) :
		year_dif -= 1
	
	return year_dif



 def age_in_years_if_else(from_date, to_date=datetime.date.today()):
	if (DEBUG):
		print("Calculate the age in years from date "+from_date+" to date "+to_date)
	year_dif = to_date.year - from_date.year
	mon_dif = to_date.month - from_date.month
	day_dif = to_date.day - from_date.day
	
	if (day_dif < 0) :
		if (mon_dif == 0):
			year_dif -= 1
		else :
			mon_dif -= 1
	if (mon_dif < 0) :
		year_dif -= 1
	
