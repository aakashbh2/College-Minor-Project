package example.com.abhishek.PhpScriptCalling;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import example.com.abhishek.R;

public class MarvelAdapter extends ArrayAdapter{

    private List<MarvelModel> marvelModelList;
    private int resourse;
    private LayoutInflater infilator;
    ViewHolder holder = null;

    public MarvelAdapter(Context context, int resource, List<MarvelModel> objects) {
        super(context, resource, objects);
        marvelModelList=objects;
        this.resourse=resource;
        infilator= (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            holder =new ViewHolder();
            convertView=infilator.inflate(resourse,null);
            holder.text= (TextView) convertView.findViewById(R.id.textviewrow);

            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }

        this.holder.text.setText(((MarvelModel) this.marvelModelList.get(position)).getText());
        return convertView;
    }
}
