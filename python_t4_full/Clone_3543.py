def formatTime(self, record, datefmt = None) :
	ct = self.converter(record.created)
	if datefmt :
		s = time.strftime(datefmt, ct)
	else :
		t = time.strftime("%Y-%m-%d %H:%M:%S", ct)
		s = "%s.%03d" % (t, record.msecs)
	return s




def formatTime(self, record, datefmt = None):
    ct = self.converter(record.created)
    s = time.strftime(datefmt, ct) if datefmt else '%s.%03d' % (time.strftime('%Y-%m-%d %H:%M:%S', ct), record.msecs)
    return s


