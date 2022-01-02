package sk.sandeep.androidmaterialstepperdemoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import sk.sandeep.androidmaterialstepperdemoapp.adapter.StepperAdapter
import sk.sandeep.androidmaterialstepperdemoapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    //create a stepper layout reference
    //private var stepperLayout: StepperLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //assign reference by using find view by id
        // stepperLayout = findViewById(R.id.stepper_layout)

        //before creating adapter implement Step to Fragment and Apply Its functions
        //create an adapter and assign to stepperLayout
        binding.stepperLayout.adapter = StepperAdapter(supportFragmentManager, this)
    }
}