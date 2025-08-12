def parse(self, response) :
	for quote in response.css('div.quote') :
		yield {
		'text' : quote.css('span.text::text').extract_first(),
		'author' : quote.css('small.author::text').extract_first(),
		'tags' : quote.css('div.tags a.tag::text').extract(),
		}




def parse(self, response):
	for page in response.css('div.quote'):
		yield {
			'text': page.css('span.text::text').extract(),
			'author': page.css('small.author::text').extract(),
			'tags': page.css('div.tags a.tag::text').extract()
		}

