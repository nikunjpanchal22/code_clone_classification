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
    quart = [1, 4, 7, 10]
    m = date.month
    if m in quart:
        prev_q = datetime.date(year=date.year, month=m-3, day=1)
        end_date = prev_q - datetime.timedelta(days=1)
    elif m-1 in quart: 
        prev_q = datetime.date(year=date.year, month=m-2, day=1)
        end_date = prev_q - datetime.timedelta(days=1)
    else:
        return date.replace(day=1) - datetime.timedelta(days=1) 
    return end_date


