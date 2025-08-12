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



 def run(self) :
    while True:
        current_time = datetime(*datetime.now().timetuple()[:5])
        for e in self.events:
            e.check(current_time)
        to_wait = (timedelta(minutes=1)-datetime.now().timedelta()).seconds


