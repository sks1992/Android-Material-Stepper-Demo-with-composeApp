package sk.sandeep.androidmaterialstepperdemoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError
import sk.sandeep.androidmaterialstepperdemoapp.compose_screen.ForthScreen
import sk.sandeep.androidmaterialstepperdemoapp.ui.theme.AndroidMaterialStepperDemoAppTheme

//before add fragment to Adapter implement it to Step and implement its function
class ForthFragment : Fragment(), Step {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                AndroidMaterialStepperDemoAppTheme {
                    ForthScreen()
                }
            }
        }
    }

    override fun verifyStep(): VerificationError? {
        return null
    }

    override fun onSelected() {
    }

    override fun onError(error: VerificationError) {
    }
}