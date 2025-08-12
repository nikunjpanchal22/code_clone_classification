def getmonth(day, week, year) :
	for month in range(1, 13) :
		try :
			date = DT.datetime(year, month, day)
		except ValueError :
			continue
		iso_year, iso_weeknum, iso_weekday = date.isocalendar()
		if iso_weeknum == week :
			return date.month


  def getmonth(day, week, year): 
          
	month = 1 
	date = DT.datetime(year, month, day) 
	flag = 0 
   
	while month <= 12: 
		iso_year, iso_weeknum, iso_weekday = date.isocalendar() 
		if iso_weeknum == week: 
			flag = 1
			return date.month 
          
		date += DT.timedelta(days = 7) 
		month += 1
   
	if flag == 0: 
		return "None"
 


