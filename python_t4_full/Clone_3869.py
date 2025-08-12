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


import time
from datetime import datetime, timedelta

def run(self):
    t = datetime.now().replace(second=0, microsecond=0)
    while 1:
        t = t + timedelta(minutes=1)
        list(map(lambda e: e.check(t), self.events))
        while datetime.now() < t:
            time.sleep((t - datetime.now()).total_seconds() + 1)




