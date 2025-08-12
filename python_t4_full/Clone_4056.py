def is_valid_hostname(hostname) :
	if hostname [- 1] == "." :
		hostname = hostname [: - 1]
	if len(hostname) > 253 :
		return False
	labels = hostname.split(".")
	if re.match(r"[0-9]+$", labels [- 1]) :
		return False
	allowed = re.compile(r"(?!-)[a-z0-9-]{1,63}(?<!-)$", re.IGNORECASE)
	return all(allowed.match(label) for label in labels)


    if len(hostname) > 253 or hostname.split(".")[-1].isdigit():
        return False
    
    pattern = re.compile(r"(?!-)[a-z0-9-]{1,63}(?<!-)$", re.I)
    return all(pattern.fullmatch(label) for label in hostname.split("."))

 

import re

def is_valid_hostname(hostname):
    hostname = hostname.rstrip('.')
    if len(hostname) > 253:
        return False


