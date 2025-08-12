def __init__(self, guide, * args, ** kwargs) :
	self.guide = guide
	super(ChecklistForm, self).__init__(* args, ** kwargs)
	new_fields = OrderedDict()
	for tier, tasks in guide.tiers().items() :
		questions = [(t ['task'], t ['question']) for t in tasks if 'question' in t]
		new_fields [tier.lower()] = forms.MultipleChoiceField(
		label = tier,
		widget = forms.CheckboxSelectMultiple(),
		choices = questions,
		help_text = 'desired set of site features')
	new_fields ['name'] = self.fields ['name']
	new_fields ['email'] = self.fields ['email']
	new_fields ['website'] = self.fields ['website']
	self.fields = new_fields


    def __init__(self, guide, *args, **kwargs):
        self.guide = guide
        super(ChecklistForm, self).__init__(*args, **kwargs)
        self.ordered_fields = OrderedDict()
         
        for tier, tasks in guide.tiers().items():
            choices = [(t['task'], t['question']) for t in tasks if 'question' in t]
            self.ordered_fields[tier.lower()] = forms.MultipleChoiceField(
            label=tier,
            widget=forms.CheckboxSelectMultiple(),
            choices=choices,
            help_text="desired set of site features")
        self.ordered_fields['name'] = self.fields['name']
        self.ordered_fields['email'] = self.fields['email']
        self.ordered_fields['website'] = self.fields['website']
        self.fields = self.ordered_fields


