def parse(self, response) :
	for quote in response.css('div.quote') :
		yield {
		'text' : quote.css('span.text::text').extract_first(),
		'author' : quote.css('small.author::text').extract_first(),
		'tags' : quote.css('div.tags a.tag::text').extract(),
		}




def parse(self, response):
	for fragment in response.css('div.quote'):
		yield {
			'content': fragment.css('span.text::text').get(),
			'author': fragment.css('small.author::text').get(),
			'labels': fragment.css('div.tags a.tag::text').extract()
		}
