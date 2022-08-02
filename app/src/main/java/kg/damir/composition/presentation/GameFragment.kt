package kg.damir.composition.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kg.damir.composition.databinding.FragmentGameBinding
import kg.damir.composition.domain.entity.Level
import java.security.Key


class GameFragment : Fragment() {
    private lateinit var level: Level
    private var _binding: FragmentGameBinding? = null
    private val binding: FragmentGameBinding
        get() = _binding ?: throw RuntimeException("FragmentGameBinding == null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        parseArgs()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
    private fun parseArgs(){
        level= requireArguments().getSerializable(KEY_LEVEL) as Level
    }

    companion object{
        const val KEY_LEVEL="level"
        fun newInstance(level: Level):GameFragment{
            return GameFragment().apply {
                arguments=Bundle().apply {
                    putSerializable(KEY_LEVEL,level)
                }
            }
        }
    }
}