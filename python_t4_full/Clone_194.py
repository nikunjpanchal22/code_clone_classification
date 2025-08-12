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
	start_date = DT.datetime(year, 1, 1)
	date = start_date

	while date.year == start_date.year:
		if date.isocalendar() == (year, week, day):
			return date.month

		date = date + DT.timedelta(days=7)


