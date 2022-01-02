package sk.sandeep.androidmaterialstepperdemoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.stepstone.stepper.StepperLayout
import sk.sandeep.androidmaterialstepperdemoapp.adapter.StepperAdapter


class MainActivity : AppCompatActivity() {

    //create a stepper layout reference
    private var stepperLayout: StepperLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //assign reference by using find view by id
        stepperLayout = findViewById(R.id.stepper_layout)

        //before creating adapter implement Step to Fragment and Apply Its functions
        //create an adapter and assign to stepperLayout
        stepperLayout!!.adapter = StepperAdapter(supportFragmentManager, this)

    }
}