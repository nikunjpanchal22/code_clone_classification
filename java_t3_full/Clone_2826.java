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
    Switch switch1 = convertView.findViewById(R.id.switch1);
    TextView tv7 = convertView.findViewById(R.id.textView7);
    SwitchItem switchItem = data.get(position);
    switch1.setChecked(switchItem.isSwitchState());
    tv7.setText(switchItem.getSwitchText());
    return convertView;
}


