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
	found_month=False
	for month in range(1, 13):
		if found_month:
			break
		try:
			date = DT.datetime(year, month, day)
		except ValueError:
			continue
		iso_year, iso_weeknum, iso_weekday = date.isocalendar()
		if iso_weeknum == week:
			found_month=True
			return date.month


