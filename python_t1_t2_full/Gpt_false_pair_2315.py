def run(self) :
	t = datetime(* datetime.now().timetuple() [: 5])
	while 1 :
		for e in self.events :
			e.check(t)
		t += timedelta(minutes = 1)
		n = datetime.now()
		while n < t :
			s = (t - n).seconds + 1
			time.sleep(s)
			n = datetime.now()




def run(self):
	t = datetime(*datetime.now().utctimetuple()[: 5])
	while True:
		for e in self.events:
			e.check(t)
		t += relativedelta(minutes = 1)
		n = datetime.utcnow()
		while n < t:
			s = (t - n).total_seconds() + 1
			time.sleep(s)
			n = datetime.utcnow()
