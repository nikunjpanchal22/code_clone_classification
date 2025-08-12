def parse(self, response) :
	for quote in response.css('div.quote') :
		yield {
		'text' : quote.css('span.text::text').extract_first(),
		'author' : quote.css('small.author::text').extract_first(),
		'tags' : quote.css('div.tags a.tag::text').extract(),
		}


 def parse(self, response) :
    divs = response.css('div.quote')
    for represent in divs:
        document = {
            'text': represent.css('span.text::text').extract_first(),
            'author': represent.css('small.author::text').extract_first(),
            'tags': represent.css('div.tags a.tag::text').extract(),
        }
        print(document)


