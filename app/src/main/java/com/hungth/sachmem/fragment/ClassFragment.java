package com.hungth.sachmem.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hungth.sachmem.R;
import com.hungth.sachmem.adapter.ClassAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2/3/2018.
 */

public class ClassFragment extends Fragment {
    private View rootView;
    private ClassAdapter classAdapter;
    private List<String> classNames;
    private RecyclerView rcvClass;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_list_class, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
      initializeComponents();
      showClassNames();
    }

    private void initializeComponents() {
        rcvClass = rootView.findViewById(R.id.rcv_class);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rcvClass.setLayoutManager(layoutManager);

        int orient = DividerItemDecoration.VERTICAL;
        DividerItemDecoration decoration = new DividerItemDecoration(getActivity(), orient);
        rcvClass.addItemDecoration(decoration);
    }

    private void showClassNames() {
        classNames = new ArrayList<>();

        classNames.add("Lớp 1");
        classNames.add("Lớp 3");
        classNames.add("Lớp 4");
        classNames.add("Lớp 5");
        classNames.add("Lớp 12");

        classAdapter = new ClassAdapter(getActivity(), classNames);
        rcvClass.setAdapter(classAdapter);
    }
}
