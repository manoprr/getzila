package manop.mytutor.com.mytutor.utility;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import manop.mytutor.com.mytutor.R;


public class TopCourseAdapter extends RecyclerView.Adapter<TopCourseAdapter.TopCourseViewHolder> {

    private Context context;
    private ArrayList<String> stringArrayList;
    private LayoutInflater layoutInflater;
    private OnClickItem onClickItem;

    public TopCourseAdapter(Context context, ArrayList<String> stringArrayList, OnClickItem onClickItem) {
        this.layoutInflater = LayoutInflater.from(context);
        this.stringArrayList = stringArrayList;
        this.onClickItem = onClickItem;
    }

    @NonNull
    @Override
    public TopCourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.recycler_topcourse, parent, false);
        TopCourseViewHolder topCourseViewHolder = new TopCourseViewHolder(view);

        return topCourseViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final TopCourseViewHolder holder, int position) {

        String pathString = stringArrayList.get(position);

        Picasso.get().load(pathString).into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickItem.onClickItem(v,holder.getAdapterPosition());
            }
        });


    }

    @Override
    public int getItemCount() {
        return stringArrayList.size();
    }

    public class TopCourseViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public TopCourseViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imvTopCourse);
        }
    }   // Second Class


}   // Main class
