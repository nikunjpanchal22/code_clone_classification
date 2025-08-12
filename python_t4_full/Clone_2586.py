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
    m = date.month
    if m in [1, 4, 7, 10, 12]:
        initial_date = datetime.date(year=date.year, month=m-3, day=1)
    elif m == 3 or m == 6 or m == 9 or m == 11:
        initial_date = datetime.date(year=date.year, month=m-2, day=1)
    else:
        return date.replace(day=1) - datetime.timedelta(days=1)
    end_date = initial_date + datetime.timedelta(days=-1)



