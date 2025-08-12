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



 def age_in_years_dynamic_prog(from_date, to_date=datetime.date.today()):
	if (DEBUG):
		print("Calculate the age in years from date "+from_date+" to date "+to_date)
	cache = [[-1 for j in range(3)] for i in range(3)]
	cache[0][0] = from_date.year-to_date.year
	cache[0][1] = from_date.month-to_date.month
	cache[0][2] = from_date.day-to_date.day
	for i in range(1,3):
		if cache[i-1][1] < 0 and cache[i-1][2] < 0:
			cache[i][0] = cache[i-1][0] - 1


