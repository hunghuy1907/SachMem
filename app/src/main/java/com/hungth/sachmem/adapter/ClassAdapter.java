package com.hungth.sachmem.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hungth.sachmem.R;

import java.util.List;

/**
 * Created by Admin on 2/3/2018.
 */

public class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.ViewHolder>{
    private List<String> classNames;
    private LayoutInflater inflater;
    private Context context;

    public ClassAdapter(Context context, List<String> classNames) {
        this.context = context;
        this.classNames = classNames;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_class, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String className = classNames.get(position);

        holder.txtClassName.setText(className);
    }

    @Override
    public int getItemCount() {
        return classNames.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtClassName;

        public ViewHolder(View itemView) {
            super(itemView);
            txtClassName = itemView.findViewById(R.id.txt_class);
        }
    }
}
