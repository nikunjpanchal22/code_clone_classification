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
        days = DT.timedelta(days=1)
        while start_date.year == year:
            iso_year, iso_weeknum, iso_weekday = start_date.isocalendar()
            if iso_weeknum == week and start_date.day == day:
                return start_date.month
            start_date += days


