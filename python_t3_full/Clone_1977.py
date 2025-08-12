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





import decimal

def cashflow(principle, rate, term):
    principle = decimal.Decimal(principle)
    rate = decimal.Decimal(rate) / 100
    term = decimal.Decimal(term) * 12
    interest = (principle * rate).quantize(decimal.Decimal('.01'), rounding = decimal.ROUND_HALF_EVEN)
    balance = principle + interest
    payment = (balance / term).quantize(decimal.Decimal('.01'), rounding = decimal.ROUND_CEILING)
    for count in range(1 + term) :
        if count == 0 :
            yield count, 0.00, balance
        elif count == term :
            payment = balance
            balance -= payment
            yield count, payment, balance
        else :
            balance -= payment
            yield count, payment, balance

for c, p, b in cashflow(input('Please enter your loan amount:'), input('Please enter rate of interest (percent):'), input('Please enter loan period (years):')):
    print(c, "\t\t", p, "\t\t\t", b)
 