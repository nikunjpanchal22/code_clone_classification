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
   import urllib
   rules = sorted(list(app.url_map.iter_rules()), key=lambda x: x.endpoint)

   for rule in rules:
      methods = ','.join(rule.methods)


