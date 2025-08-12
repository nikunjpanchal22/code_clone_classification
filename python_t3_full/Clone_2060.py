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




def ping(host, n = 0):
    from multiping import MultiPing
    RTT = 0
    pinger = MultiPing([host])
    if n > 0:
        for _ in range(n):
            RTT += ping(host)
        RTT /= n
    else:
        pinger.send()
        responses, _ = pinger.receive(1)
        for _, rtt in responses.items():
            RTT = rtt
    return RTT


