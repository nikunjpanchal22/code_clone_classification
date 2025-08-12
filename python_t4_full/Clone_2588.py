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
    if date.month in quarter_dates:
        previous_quarter_date = datetime.date(date.year, date.month-3, 1) - datetime.timedelta(days=1)
    else:
        previous_quarter_date = datetime.date(date.year, date.month-2, 1) - datetime.timedelta(days=1)
    return previous_quarter_date


