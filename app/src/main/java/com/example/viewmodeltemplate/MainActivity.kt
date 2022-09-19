package com.example.viewmodeltemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeltemplate.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var viewModel : MainActivityViewModel = ViewModelProvider(this, ViewModelFactory(10)).get(MainActivityViewModel::class.java)

val txt : TextView = findViewById(R.id.text)
        txt.text = viewModel.number.toString()




 val btn : Button = findViewById(R.id.button)

        btn.setOnClickListener{
            viewModel.addone()
            txt.text = viewModel.number.toString()
        }

    }


}