def previous_quarter(date) :
	date = DT.datetime(date.year, date.month, date.day)
	rr = rrule.rrule(
	rrule.DAILY,
	bymonth = (3, 6, 9, 12),
	bymonthday = - 1,
	dtstart = date - DT.timedelta(days = 100))
	result = rr.before(date, inc = False)
	return result.date()





def previous_quarter(input_date):
    input_date = DT.datetime(input_date.year, input_date.month, input_date.day)
    rr = rrule.rrule(rrule.DAILY, bymonth=(3, 6, 9, 12), bymonthday=-1, dtstart=input_date - DT.timedelta(days=100))


