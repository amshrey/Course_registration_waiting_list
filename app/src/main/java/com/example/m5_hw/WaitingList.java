package com.example.m5_hw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import com.example.m5_hw.R;
import com.example.m5_hw.database.Student;
import androidx.recyclerview.widget.RecyclerView;

/************************************************************************************************
 * Class WaitingList to render the RecyclerView with defined layout and data set
 ************************************************************************************************/
public class WaitingList extends RecyclerView.Adapter<WaitingList.MyViewHolder> {

    // Private members of class
    private Context context;
    private List<Student> student;

    // Nested class
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView priority;

        // Constructor of MyViewHolder
        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.name);
            priority = view.findViewById(R.id.priority);
        }
    }

    // Constructor of WaitingListAdapter
    public WaitingList(Context context, List<Student> student) {
        this.context = context;
        this.student = student;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items, parent, false);

        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Student item = student.get(position);
        holder.name.setText(item.getName());
        holder.priority.setText(item.getPriority());
    }

    @Override
    public int getItemCount() {
        return student.size();
    }
}