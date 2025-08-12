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
    months = [1, 4, 7, 10]
    if date.month in months:
        prev_q = date.replace(month=date.month-3, day=1) - datetime.timedelta(days=1)
    else: 
        prev_q = date.replace(month=date.month-2, day=1) - datetime.timedelta(days=1)
    return prev_q


