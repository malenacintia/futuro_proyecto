package com.example.hellogridview2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview = (GridView) findViewById(R.id.tabla);
        gridview.setAdapter (new ImageAdapter(this));

        gridview.setOnItemClickListener (new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
   }//Fin onCreate

public class ImageAdapter  extends BaseAdapter{
    private Context mContext;

    public  ImageAdapter(Context c){
        mContext=c;
    }

    public  int getCount(){
        return mThumbIds.length;
    }

    public Object getItem(int position){
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    public View getView(int position, View convertView,ViewGroup parent){
        ImageView imageView;
        if(convertView==null){
            imageView=new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85,85));
        }else{
            imageView=(ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    private Integer[] mThumbIds= {
            R.drawable.perrito,R.drawable.perrito,
            R.drawable.perrito,R.drawable.perrito,
            R.drawable.perrito,R.drawable.perrito,
            R.drawable.perrito,R.drawable.perrito,
            R.drawable.perrito,R.drawable.perrito,
            R.drawable.perrito,R.drawable.perrito,
            R.drawable.perrito,R.drawable.perrito,
            R.drawable.perrito,R.drawable.perrito,
            R.drawable.perrito,R.drawable.perrito,

    };

}
}//Fin MainActivity