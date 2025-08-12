def previous_quarter(date) :
	date = DT.datetime(date.year, date.month, date.day)
	rr = rrule.rrule(
	rrule.DAILY,
	bymonth = (3, 6, 9, 12),
	bymonthday = - 1,
	dtstart = date - DT.timedelta(days = 100))
	result = rr.before(date, inc = False)
	return result.date()




def previous_quarter(t_date):
    t_date = DT.datetime(t_date.year, t_date.month, t_date.day)
    new_rr = rrule.rrule(rrule.DAILY, bymonth=(3, 6, 9, 12), bymonthday=-1, dtstart=t_date - DT.timedelta(days=100))
    return new_rr.before(t_date, inc=False).date()


