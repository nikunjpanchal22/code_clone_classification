public View getView (int position, View convertView, ViewGroup parent) {
    convertView = mInflater.inflate (R.layout.listview_row, null);
    TextView tvTimer = (TextView) convertView.findViewById (R.id.textview_timer);
    TextView tvName = (TextView) convertView.findViewById (R.id.textview_name);
    Item item = data.get (position);
    tvName.setText (item.getName ());
    myTimer.setTimer (tvTimer, item.getTime ());
    return convertView;
}



 

public View getView(int position, View convertView, ViewGroup parent) {
    convertView = mInflater.inflate(R.layout.listview_row, null);
    RadioButton rb = convertView.findViewById(R.id.radioButton);
    TextView tv2 = convertView.findViewById(R.id.textView2);
    OptionItem option = data.get(position);
    rb.setChecked(option.isSelected());
    tv2.setText(option.getOptionText());
    return convertView;
}


