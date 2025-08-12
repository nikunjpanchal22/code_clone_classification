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
    Spinner spinner = convertView.findViewById(R.id.spinner);
    TextView tv4 = convertView.findViewById(R.id.textView4);
    SpinnerItem spinnerItem = data.get(position);
    spinner.setAdapter(spinnerItem.getAdapter());
    tv4.setText(spinnerItem.getSpinnerText());
    return convertView;
}


