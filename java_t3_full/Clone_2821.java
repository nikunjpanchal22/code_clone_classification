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
    CheckBox cb = convertView.findViewById(R.id.checkBox);
    TextView tv1 = convertView.findViewById(R.id.textView1);
    TodoItem item = data.get(position);
    cb.setChecked(item.isDone());
    tv1.setText(item.getDescription());
    return convertView;
}


