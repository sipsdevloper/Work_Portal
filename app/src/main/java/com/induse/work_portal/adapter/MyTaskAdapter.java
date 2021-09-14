package com.induse.work_portal.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.induse.work_portal.Home_Page;
import com.induse.work_portal.R;
import com.induse.work_portal.databinding.ItemMytaskBinding;
import com.induse.work_portal.entity.Datum;

import java.util.ArrayList;

public class MyTaskAdapter extends RecyclerView.Adapter<MyTaskAdapter.MyHolder> {
    ItemMytaskBinding binding;
    ArrayList<Datum> mList;
    Context context;
    public  MyTaskAdapter(Context context,ArrayList<Datum> mList){
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.item_mytask, parent, false);
        return new MyHolder(binding.getRoot());

//        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
//        View listItem= layoutInflater.inflate(R.layout.item_mytask, parent, false);
//        MyHolder viewHolder = new MyHolder(listItem);
//        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        binding.tvUsername.setText(context.getResources().getString(R.string.str_Taskname, mList.get(position).getName()));
        binding.tvStatus.setText(context.getResources().getString(R.string.str_status , mList.get(position).getStatus()));
        binding.tvDesc.setText(context.getResources().getString(R.string.str_desc , mList.get(position).getDescription()));

       holder.itemView.setOnClickListener(v -> ((Home_Page) context).openDialog(mList.get(position).getTaskid()));
    }

    @Override
    public int getItemCount() {
        return (mList != null ) ? mList.size() :  0;
    }

    public static class MyHolder extends RecyclerView.ViewHolder {

//   public      TextView  txt;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
//            itemView.findViewById(R.id.txt);
        }
    }
}
