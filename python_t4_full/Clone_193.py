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
	date = DT.datetime(year, 1, day)
	while date.year == year:
		iso_year, iso_weeknum, iso_weekday = date.isocalendar()
		if iso_weeknum == week:
			return date.month
		date += DT.timedelta(days=7)


