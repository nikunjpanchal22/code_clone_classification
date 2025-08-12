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


 def is_valid_hostname(hostname):
    if hostname [-1] == ".":
        hostname = hostname [:-1]
    if len(hostname) > 253:
        return False
    labels = hostname.split(".")
    if labels[-1].isnumeric():
        return False
    allowed = re.compile(r"[a-z0-9-]{1,63}", re.IGNORECASE)
    valid = True
    for label in labels:
        if not allowed.match(label):
            valid = False
            break
    return valid


