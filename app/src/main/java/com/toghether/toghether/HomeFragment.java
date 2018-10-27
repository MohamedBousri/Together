package com.toghether.toghether;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.toghether.toghether.AccountFiles.LoginActivity;

public class HomeFragment extends Fragment {

    private RecyclerView mPackagesList;
    private DatabaseReference mDatabaseReference;
    private View view;



   /* FirebaseRecyclerAdapter<BadHabit,PackageViewHolder> firebaseRecyclerAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_home, container, false);
        mDatabaseReference= FirebaseDatabase.getInstance().getReference().child("BadHaibts");
        mDatabaseReference.keepSynced(true);
        mPackagesList=view.findViewById(R.id.packages_list);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        mPackagesList.setLayoutManager(gridLayoutManager);
        FirebaseRecyclerOptions<BadHabit> options =
                new FirebaseRecyclerOptions.Builder<BadHabit>()
                        .setQuery(mDatabaseReference, BadHabit.class)
                        .build();
        firebaseRecyclerAdapter=new FirebaseRecyclerAdapter<BadHabit, PackageViewHolder>
                (options) {

            protected void populateViewHolder(PackageViewHolder viewHolder, Package model, int position){


            }

            @Override
            protected void onBindViewHolder( PackageViewHolder holder, int position,  BadHabit b) {
                holder.setNom(b.getNom());
                holder.setArgent(b.getArgent());
                holder.setTemps(b.getTemps());
                holder.setDefit(b.getDefite());
            }

            @NonNull
            @Override
            public PackageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View viewItem = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.bd_list_item,parent, false);
                return new PackageViewHolder(viewItem);
            }
        };
        mPackagesList.setAdapter(firebaseRecyclerAdapter);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        firebaseRecyclerAdapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        firebaseRecyclerAdapter.stopListening();

    }

    public static class PackageViewHolder extends RecyclerView.ViewHolder{
        View mView;
        public PackageViewHolder (View itemView){
            super(itemView);
            mView=itemView;

        }
        public void setNom(String Nom){
            TextView bd_nom=(TextView)mView.findViewById(R.id.bh_nom);
            bd_nom.setText(Nom);
        }
        public void setArgent(Float argent){
            TextView bh_argent=(TextView)mView.findViewById(R.id.bh_argent);
            bh_argent.setText(argent.toString());
        }
        public void setTemps(Float temps){
            TextView bh_temps=(TextView)mView.findViewById(R.id.bh_temps);
            bh_temps.setText(temps.toString());
        }
        public void setDefit(Integer defit){
            TextView bh_defit=(TextView)mView.findViewById(R.id.bh_defit);
            bh_defit.setText(defit.toString());
        }


    }*/
   void infosHabit (){



   }



}
