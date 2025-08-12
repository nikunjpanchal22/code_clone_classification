def main() :
	principle = decimal.Decimal(raw_input('Please enter your loan amount:'))
	rate = decimal.Decimal(raw_input('Please enter rate of interest (percent):')) / 100
	term = decimal.Decimal(raw_input('Please enter loan period (years):')) * 12
	interest = (principle * rate).quantize(decimal.Decimal('.01'), rounding = decimal.ROUND_HALF_EVEN)
	balance = principle + interest
	payment = (balance / term).quantize(decimal.Decimal('.01'), rounding = decimal.ROUND_CEILING)
	print "Payment\t\tAmount Paid\t\tRem.Bal."
	for count in range(1 + term) :
		if count == 0 :
			print count, "\t\t0.00\t\t\t", balance
		elif count == term :
			payment = balance
			balance -= payment
			print count, "\t\t", payment, "\t\t\t", balance
		else :
			balance -= payment
			print count, "\t\t", payment, "\t\t\t", balance




def main() :
	principle = decimal.Decimal(raw_input('Please enter your loan amount:'))
	rate = decimal.Decimal(raw_input('Please enter rate of interest (per annum):'))/100
	term = decimal.Decimal(raw_input('Please enter loan period (years):')) *12
	rr = decimal.Decimal('.01')
	rd = decimal.ROUND_HALF_EVEN
	interest = (principle * rate).quantize(rr, rounding=rd)
	balance = principle + interest
	payment = (balance / term).quantize(rr, rounding=decimal.ROUND_CEILING)
	print "Payment\t\tAmount Paid\t\tRem.Bal."
	for count in range(1+term):
		if count == 0:
			print count, "\t\t0.00\t\t\t", balance
		elif count == term:
			payment = balance
			balance -= payment
			print count, "\t\t", payment, "\t\t\t", balance
		else:
			balance -= payment
			print count, "\t\t", payment, "\t\t\t", balance
