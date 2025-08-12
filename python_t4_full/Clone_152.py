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
	principle = float(input('Please enter your loan amount:'))
	rate = float(input('Please enter rate of interest (percent):')) / 100
	term = float(input('Please enter loan period (years):')) * 12
	interest = principle * rate
	balance = principle + interest
	payment = round(balance / term, 2)
	print("Payment\t\tAmount Paid\t\tRem.Bal.")
	num = 0;
	while num <= int(term) :
		if num == 0 :
			print("{}\t\t{:.2f}\t\t\t{:.2f}".format(num, 0.00, balance))
		elif num == int(term) :
			payment = balance
			balance -= payment
			print("{}\t\t{:.2f}\t\t\t{:.2f}".format(num, payment, balance))
		else :
			balance -= payment
			print("{}\t\t{:.2f}\t\t\t{:.2f}".format(num, payment, balance))
		num += 1


