package com.example.bitekotlinviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        imageBtn.setOnClickListener(this)
        plusBtn.setOnClickListener(this)
        minusBtn.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){

            R.id.imageBtn->{

                val value = imageBtn.text.toString()

                if(value=="Target"){
                    imageView.setImageResource(R.drawable.target)
                    imageBtn.text="Idea"
                }
                else if(value=="Idea"){
                    imageView.setImageResource(R.drawable.idea)
                    imageBtn.text="Target"
                }

            }

            R.id.plusBtn->{
                val value= numberText.text.toString()
                val num = value.toInt()+1

                numberText.text=num.toString()

            }
            R.id.minusBtn->{

                val value= numberText.text.toString()

                val num = value.toInt()
                if(num>0){
                    val n = num-1
                    numberText.text=n.toString()
                }
                else if(num==0){
                    Toast.makeText(this,"You have cross the limit",Toast.LENGTH_LONG).show()
                }


            }
        }

    }
}