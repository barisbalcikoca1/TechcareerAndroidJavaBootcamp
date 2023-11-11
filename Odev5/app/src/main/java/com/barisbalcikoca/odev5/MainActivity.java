package com.barisbalcikoca.odev5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.barisbalcikoca.odev5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String sonuc = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btn0.setOnClickListener(view -> {
            binding.tvSonuc.setText(binding.tvSonuc.getText()+"0");
        });
        binding.btn1.setOnClickListener(view -> {
            binding.tvSonuc.setText(binding.tvSonuc.getText()+"1");
        });
        binding.btn2.setOnClickListener(view -> {
            binding.tvSonuc.setText(binding.tvSonuc.getText()+"2");
        });
        binding.btn3.setOnClickListener(view -> {
            binding.tvSonuc.setText(binding.tvSonuc.getText()+"3");
        });
        binding.btn4.setOnClickListener(view -> {
            binding.tvSonuc.setText(binding.tvSonuc.getText()+"4");
        });
        binding.btn5.setOnClickListener(view -> {
            binding.tvSonuc.setText(binding.tvSonuc.getText()+"5");
        });
        binding.btn6.setOnClickListener(view -> {
            binding.tvSonuc.setText(binding.tvSonuc.getText()+"6");
        });
        binding.btn7.setOnClickListener(view -> {
            binding.tvSonuc.setText(binding.tvSonuc.getText()+"7");
        });
        binding.btn8.setOnClickListener(view -> {
            binding.tvSonuc.setText(binding.tvSonuc.getText()+"8");
        });
        binding.btn9.setOnClickListener(view -> {
            binding.tvSonuc.setText(binding.tvSonuc.getText()+"9");
        });
        binding.btnClear.setOnClickListener(view -> {
            binding.tvSonuc.setText("");
        });
        binding.btnPlus.setOnClickListener(view -> {
            binding.tvSonuc.setText(binding.tvSonuc.getText()+"+");
        });

        binding.btnEsittir.setOnClickListener(view -> {
            sonuc = binding.tvSonuc.getText().toString(); // Sonucu alın ve String türüne çevirin
            String[] sonDeger = sonuc.split("\\+");
            int toplam = 0;
            for (String deger : sonDeger) {
                if (!deger.isEmpty()) { // Boş yerleri atlayın
                    toplam += Integer.parseInt(deger);
                }
            }
            binding.tvSonuc.setText(String.valueOf(toplam)); // Sonucun metin olarak ekrana yazılması
        });
    }
}