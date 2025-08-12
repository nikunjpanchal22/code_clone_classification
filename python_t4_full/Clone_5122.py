def previous_quarter(date) :
	date = DT.datetime(date.year, date.month, date.day)
	rr = rrule.rrule(
	rrule.DAILY,
	bymonth = (3, 6, 9, 12),
	bymonthday = - 1,
	dtstart = date - DT.timedelta(days = 100))
	result = rr.before(date, inc = False)
	return result.date()


def previous_quarter(d):
    d = DT.datetime(d.year, d.month, d.day)
    rule = rrule.rrule(rrule.DAILY, bymonth=(3, 6, 9, 12), bymonthday=-1, dtstart=d - DT.timedelta(days=100))
    return rule.before(d, inc=False).date()




