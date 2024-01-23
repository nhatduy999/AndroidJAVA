package com.example.androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Lấy các tham chiếu đến các trường trong form
        EditText etUsername = findViewById(R.id.et_username);
        EditText etPassword = findViewById(R.id.et_password);

        // Xử lý sự kiện khi người dùng nhấn nút đăng kí
        findViewById(R.id.btn_register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy giá trị từ các trường
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                // Kiểm tra tính hợp lệ của dữ liệu
                if (username.isEmpty()) {
                    // Tên tài khoản không được để trống
                    Toast.makeText(RegisterActivity.this, "Tên tài khoản không được để trống", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.isEmpty()) {
                    // Mật khẩu không được để trống
                    Toast.makeText(RegisterActivity.this, "Mật khẩu không được để trống", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Thực hiện đăng kí
                // ...

                // Đăng kí thành công, chuyển sang màn hình chính
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}