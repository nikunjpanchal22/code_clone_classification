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


def ping(host, n=0):
	RTT = 0
	if n > 0:
		sumtime = 0
		for i in range(n):
			sumtime += ping(host)
		avgtime = sumtime/n
	
	mp = MultiPing([host])
	mp.send()
	responses, no_responses = mp.receive(1)
	if responses:
		RTT = responses[host]
	else:
		mp.send()
		responses, no_responses = mp.receive(1)
		RTT = -1
	return RTT

