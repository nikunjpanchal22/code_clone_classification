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



 def age_in_years_try_except(from_date, to_date=datetime.date.today()):
	if (DEBUG):
		print("Calculate the age in years from date "+from_date+" to date "+to_date)
	try:
		year_dif = to_date.year - from_date.year
	except:
		year_dif = -1
	try:
		mon_dif = to_date.month - from_date.month
	except:
		mon_dif = -1
	try:
		day_dif = to_date.day - from_date.day
	except:
		day_dif = -1
	
	if (day_dif < 0) :
		mon_dif -= 1
	if (mon_dif < 0) :
		year_dif -= 1
	


