package com.induse.work_portal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.induse.work_portal.timesheet.Datum;

import java.util.List;



//import com.bumptech.glide.Glide;


public class My_Base_Adapter extends BaseAdapter {
    List<Datum> myList;
    LayoutInflater inflater;
    Context context;
    int visible = 0;

    public My_Base_Adapter(Context context, List<Datum> bean) {
        this. myList = bean;
        this.context = context;
        inflater = LayoutInflater.from(this.context);
    }


    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Object getItem(int position) {
        return myList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.list_item_product, null);
        }

            TextView tittle=convertView.findViewById(R.id.tn);
      //  TextView  regnumber=convertView.findViewById(R.id.reg_no);

       // ImageView showimage=convertView.findViewById(R.id.editimage);
        //ImageView delete=convertView.findViewById(R.id.deleteimage);


      //  showimage.setOnClickListener(new View.OnClickListener() {
        //    @Override
         //   public void onClick(View v) {
          //      Intent intent=new Intent(context,Update_driver.class);
          //      intent.putExtra("emp_id",myList.get(position).getEmployeeId());
           //    intent.putExtra("emp_name",myList.get(position).getName());
           //     intent.putExtra("emp_code",myList.get(position).getVCode());
            //    intent.putExtra("v_code",myList.get(position).getPresent());
            //    context.startActivity(intent);
         //   }
      //  });

      //  delete.setOnClickListener(new View.OnClickListener() {
         //   @Override
          //  public void onClick(View v) {
           //     Intent intent=new Intent(context,Delete_vcode_Activity.class);
             //   intent.putExtra("demd_id",myList.get(position).getEmployeeId());
                //    intent.putExtra("v_code",myList.get(position).getPresent());
             //   context.startActivity(intent);
          //  }
      //  });

      // TextView sport=convertView.findViewById(R.id.name1);
      //  TextView eventdate=convertView.findViewById(R.id.mark);
      //  TextView  vihicalnumber=convertView.findViewById(R.id.vehicle_no);

      //  TextView coach =convertView.findViewById(R.id.vcode);
           // ImageView imag=convertView.findViewById(R.id.iv);
            tittle.setText(myList.get(position).getTaskName());
      //  regnumber.setText(myList.get(position).getReg_no());
     //   vihicalnumber.setText(myList.get(position).getVehicle_no());

      //  sport.setText(myList.get(position).getName());
       // coach.setText(myList.get(position).getVCode());
      //  eventdate.setText(myList.get(position).getMark());

        //    Glide.with(context).load(myList[position].getImageurl()).thumbnail(0.5f).into(imag);
//        mViewHolder.ivIcon.setImageResource(myList.get(position).getImgResId());


        return convertView;
    }



    static class MyViewHolder {
        public View phone;
        public View mail;
        TextView id, orgid,tittle,sport,eventdate,eventtime,coach, regnumber,vihicalnumber;
        ImageView showimage,delete;
        Button view;
        LinearLayout detail;



        public MyViewHolder(View convertView) {
        }



    }
}


