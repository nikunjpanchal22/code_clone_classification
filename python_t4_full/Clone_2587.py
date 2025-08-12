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
    if date.month <= 3:
        new_month = 12
        new_year = date.year - 1
    else:
        new_month = date.month - 3
        new_year = date.year

    return datetime.datetime(year=new_year, month=new_month, day=1) - datetime.timedelta(days=1)


