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
    TextView tvName = convertView.findViewById(R.id.textview_name);
    TextView tvDate = convertView.findViewById(R.id.textview_date);
    Person person = data.get(position);
    tvName.setText(person.getName());
    tvDate.setText(person.getDate().toString());
    return convertView;
}


