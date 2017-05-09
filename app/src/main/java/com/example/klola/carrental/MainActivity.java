package com.example.klola.carrental;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int[] IMAGES ={
            R.drawable.avanza,
            R.drawable.brv,
            R.drawable.ertiga,
            R.drawable.goplus,
            R.drawable.grand,
            R.drawable.luxio,
            R.drawable.mobilio,
            R.drawable.sigra,
            R.drawable.terios,
            R.drawable.xenia
    };
    String[] NAMES ={"Toyota AVANZA","Honda BRV","Suzuki Ertiga","Datsun Go +","Nissan Grand Livina","Daihatsu Luxio","Honda Mobilio","Toyoya Sigra","Daihatsu Terios","Daihatsu Xenia"};
    String[] DESCRIPTIONS ={"APV","APV","APV","APV","APV","APV","APV","APV","APV","APV"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.ListView);

        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
    }

    //Otomatis CTRL I
    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageView=(ImageView) convertView.findViewById(R.id.imageView2);
            TextView textView_name=(TextView) convertView.findViewById(R.id.textView_name);
            TextView textView_description=(TextView) convertView.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTIONS[i]);

            return convertView;
        }
    }
}
