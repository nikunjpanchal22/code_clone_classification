def previous_quarter(date) :
	date = DT.datetime(date.year, date.month, date.day)
	rr = rrule.rrule(
	rrule.DAILY,
	bymonth = (3, 6, 9, 12),
	bymonthday = - 1,
	dtstart = date - DT.timedelta(days = 100))
	result = rr.before(date, inc = False)
	return result.date()


 def previous_quarter(date): 
    quarter_dates = [1,4,7,10]
    month = date.month
    if month in quarter_dates:
        month = quarter_dates[quarter_dates.index(month)-1]
        year = date.year
    else:
        if month == 11: 
            month = 7
            year = date.year
        else: 
            month = quarter_dates[quarter_dates.index(month)-2]
            year = date.year 
    return datetime.datetime(year=year, month=month, day=1) - datetime.timedelta(days=1)


