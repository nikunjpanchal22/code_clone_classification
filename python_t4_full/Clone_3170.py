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





def main():
    from decimal import Decimal, ROUND_HALF_EVEN, ROUND_CEILING
    p, r, t = Decimal(input('Enter your loan amount:')), Decimal(input('Rate of interest (percent):')) / 100, Decimal(input('Your loan period (years):')) * 12
    i, bal, pay = (p * r).quantize(Decimal('.01'), rounding=ROUND_HALF_EVEN), p + i, (bal / t).quantize(Decimal('.01'), rounding=ROUND_CEILING)
    print("Payment\t\tAmount Paid\t\tRem.Bal.")
    for c in range(1 + t) :
        if c == 0 :
            print(c, "\t\t0.00\t\t\t", bal)
        elif c == t :
            pay = bal
            bal -= pay
            print(c, "\t\t", pay, "\t\t\t", bal)
        else :
            bal -= pay
            print(c, "\t\t", pay, "\t\t\t", bal)



