def list_routes() :
	import urllib
	output = []
	for rule in app.url_map.iter_rules() :
		methods = ','.join(rule.methods)
		line = urllib.unquote("{:50s} {:20s} {}".format(rule.endpoint, methods, rule))
		output.append(line)
	for line in sorted(output) :
		print (line)




def list_routes() :
	from urllib.parse import unquote_plus
	output = [unquote_plus("{:50s} {:20s} {}".format(rule.endpoint, ','.join(rule.methods), rule)) for rule in app.url_map.iter_rules()]
	print("\n".join(sorted(output)))





