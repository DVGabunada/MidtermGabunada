package com.example.midterms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class BillsAdapter extends ArrayAdapter<Bill> {
    int resource;
    List<Bill> bills;

    public BillsAdapter(@NonNull Context context, int resource, @NonNull List<Bill> objects) {
        super(context, resource, objects);
        this.resource = resource;
        this.bills = objects;
    }

    @NonNull
    @Override
    // TODO Milestone B: Show History.
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LinearLayout billView;

        if (convertView == null) {
            billView = new LinearLayout(getContext());
            String inflater = Context.LAYOUT_INFLATER_SERVICE;
            LayoutInflater li = (LayoutInflater) getContext().getSystemService(inflater);
            li.inflate(resource, billView, true);
        } else {
            billView = (LinearLayout) convertView;
        }

        return billView;
    }
}
