def getmonth(day, week, year) :
	for month in range(1, 13) :
		try :
			date = DT.datetime(year, month, day)
		except ValueError :
			continue
		iso_year, iso_weeknum, iso_weekday = date.isocalendar()
		if iso_weeknum == week :
			return date.month


  def getMonth(day, week, year) :
	testDate = DT.datetime(year, 1, 1)
	
	while testDate.year == year :
		if testDate.isocalendar() == (year, week, day) :
			return testDate.month
		
		testDate += DT.timedelta(days=7)


