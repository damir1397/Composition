package kg.damir.composition.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kg.damir.composition.R
import kg.damir.composition.databinding.FragmentChooseLevelBinding
import kg.damir.composition.domain.entity.Level


class ChooseLevelFragment : Fragment() {
    private var _binding: FragmentChooseLevelBinding? = null
    private val binding: FragmentChooseLevelBinding
        get() = _binding ?: throw RuntimeException("FragmentChooseLevelBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChooseLevelBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonLevelTest.setOnClickListener { launchGameFragment(Level.TEST) }
        binding.buttonLevelEasy.setOnClickListener { launchGameFragment(Level.EASY) }
        binding.buttonLevelNormal.setOnClickListener { launchGameFragment(Level.NORMAL) }
        binding.buttonLevelHard.setOnClickListener { launchGameFragment(Level.HARD) }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun launchGameFragment(level: Level) {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, GameFragment.newInstance(level))
            .addToBackStack(null)
            .commit()
    }

    companion object {
        fun newInstance(): ChooseLevelFragment {
            return ChooseLevelFragment()

        }
    }
}