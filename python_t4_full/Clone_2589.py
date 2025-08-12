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
    today = datetime.date(date.year, date.month, date.day)
    day_before = today - datetime.timedelta(days=1)
    if (date.month % 3 == 1) and (date.day == 1):
        return day_before 
        
    q_date = datetime.date(day_before.year, ((day_before.month//3)*3)+1, 1)
    return q_date - datetime.timedelta(days=1)


