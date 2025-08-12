def parse(self, response) :
	for quote in response.css('div.quote') :
		yield {
		'text' : quote.css('span.text::text').extract_first(),
		'author' : quote.css('small.author::text').extract_first(),
		'tags' : quote.css('div.tags a.tag::text').extract(),
		}


 def parse(self, response) :
    quotes = response.css('div.quote')
    for quote in quotes:
        result_dict = {}
        result_dict['text'] = quote.css('span.text::text').extract_first()
        result_dict['author'] = quote.css('small.author::text').extract_first()
        result_dict['tags'] = quote.css('div.tags a.tag::text').extract()
        print(result_dict)


