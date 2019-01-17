package com.octashop.recyclerview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.octashop.recyclerview.R;
import com.octashop.recyclerview.model.EmpData;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {

    private Context context;
    private List<EmpData.ContactsBean> employeeList;

    public EmployeeAdapter(Context context, List<EmpData.ContactsBean> employeeList) {
        this.context = context;
        this.employeeList = employeeList;
    }

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_home, viewGroup, false);
        EmployeeViewHolder employeeViewHolder = new EmployeeViewHolder(view);
        return employeeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int i) {

        final EmpData.ContactsBean employee = employeeList.get(i);

        //holder.imgEmp.setImageResource(employeeList.get(employee.getName().charAt(0)));
        holder.txtName.setText("Employee Name: " + employee.getName());
        holder.txtEmail.setText("Email: " + employee.getEmail());
        holder.txtAddress.setText("Address: " + employee.getAddress());
        holder.txtGender.setText("Gender: " + employee.getGender());
        holder.txtMobile.setText("Mobile No.: " + employee.getPhone());

    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    public class EmployeeViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgEmp;
        private TextView txtName, txtEmail, txtAddress, txtGender, txtMobile, txtHome, txtOffice;

        public EmployeeViewHolder(@NonNull View itemView) {
            super(itemView);

            imgEmp = this.itemView.findViewById(R.id.imgEmployee);
            txtName = this.itemView.findViewById(R.id.txt_name);
            txtEmail = this.itemView.findViewById(R.id.txt_email);
            txtAddress = this.itemView.findViewById(R.id.txt_address);
            txtGender = this.itemView.findViewById(R.id.txt_gender);
            txtMobile = this.itemView.findViewById(R.id.txt_mobile);
            txtHome = this.itemView.findViewById(R.id.txt_home);
            txtOffice = this.itemView.findViewById(R.id.txt_office);

        }
    }
}
