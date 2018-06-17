package cadenas.android.androidpresensesystem;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by JoaquinAntonio on 15/06/2018.
 */

public class ListOnlineViewHolder extends RecyclerView.ViewHolder {

    public TextView txtEmail;
    public ListOnlineViewHolder(View itemView) {
        super(itemView);
        txtEmail = (TextView)itemView.findViewById(R.id.txt_email);
    }
}
