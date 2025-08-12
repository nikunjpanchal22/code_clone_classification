def ping(host, n = 0) :
	if (n > 0) :
		avg = 0
		for i in range(n) :
			avg += ping(host)
		avg = avg / n
	mp = MultiPing([host])
	mp.send()
	responses, no_responses = mp.receive(1)
	for addr, rtt in responses.items() :
		RTT = rtt
	if no_responses :
		mp.send()
		responses, no_responses = mp.receive(1)
		RTT = - 1
	return RTT


def ping(host,n=0):
	avgtime = 0
	if n>0:
		for i in range(n):
			avgtime += ping(host)
		avgtime = avgtime / n 
	mp = MultiPing([host])
	mp.send()
	responses, no_responses = mp.receive(1)
	if no_responses:
		mp.send()
		responses, no_responses = mp.receive(1)
		RTT = -1
	else:
		RTT = responses[host]
	return RTT

