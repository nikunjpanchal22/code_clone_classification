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
    ProgressBar progressBar = convertView.findViewById(R.id.progressBar);
    TextView tv5 = convertView.findViewById(R.id.textView5);
    ProgressItem progress = data.get(position);
    progressBar.setProgress(progress.getProgress());
    tv5.setText(progress.getProgressText());
    return convertView;
}


