package sk.sandeep.androidmaterialstepperdemoapp.adapter

import android.content.Context
import androidx.fragment.app.FragmentManager
import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import sk.sandeep.androidmaterialstepperdemoapp.fragments.FirstFragment
import sk.sandeep.androidmaterialstepperdemoapp.fragments.ForthFragment
import sk.sandeep.androidmaterialstepperdemoapp.fragments.SecondFragment
import sk.sandeep.androidmaterialstepperdemoapp.fragments.ThirdFragment


class StepperAdapter(fm: FragmentManager?, context: Context?) :
    AbstractFragmentStepAdapter(fm!!, context!!) {
    override fun getCount(): Int {
        return 3
    }

    override fun createStep(position: Int): Step {
        val step = when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            3 -> ForthFragment()
            else -> FirstFragment()
        }
        return step
    }
}