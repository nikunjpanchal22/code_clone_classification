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


        return -1




def ping(host, n = 0):
    from multiping import MultiPing
    pinger = MultiPing([host])
    RTT = 0
    if n > 0:
        RTT = sum(ping(host, n-1) for _ in range(n))/n
    else:
        pinger.send()
        responses, _ = pinger.receive(1)


