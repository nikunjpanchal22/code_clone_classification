def parse(self, response) :
	for quote in response.css('div.quote') :
		yield {
		'text' : quote.css('span.text::text').extract_first(),
		'author' : quote.css('small.author::text').extract_first(),
		'tags' : quote.css('div.tags a.tag::text').extract(),
		}


 def parse(self, response) :
    for div in response.css('div.quote') :
        content = { 
        'text' : div.css('span.text::text').extract_first(),
        'author' : div.css('small.author::text').extract_first(),
        'tags' : div.css('div.tags a.tag::text').extract(),
        }
        print(content)


