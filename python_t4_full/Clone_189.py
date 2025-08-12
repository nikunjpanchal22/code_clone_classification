def getmonth(day, week, year) :
	for month in range(1, 13) :
		try :
			date = DT.datetime(year, month, day)
		except ValueError :
			continue
		iso_year, iso_weeknum, iso_weekday = date.isocalendar()
		if iso_weeknum == week :
			return date.month


  def getmonth(day, week, year) :

	month = 1
	date = DT.datetime(year, month, day)

	while month <= 12 :

		iso_year, iso_weeknum, iso_weekday = date.isocalendar()
		if iso_weeknum == week :
			return month

		month = month + 1
		date = DT.datetime(year, month, day)



