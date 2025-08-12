def parse(self, response) :
	for quote in response.css('div.quote') :
		yield {
		'text' : quote.css('span.text::text').extract_first(),
		'author' : quote.css('small.author::text').extract_first(),
		'tags' : quote.css('div.tags a.tag::text').extract(),
		}


 def parse(self, response) :
    objects = response.css('div.quote')
    for obj in objects:
        dictionary = {
            'text': obj.css('span.text::text').extract_first(),
            'author': obj.css('small.author::text').extract_first(),
            'tags': obj.css('div.tags a.tag::text').extract(),
        }
        print(dictionary)


