package com.jesse.tasktracker.ui.screens.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jesse.tasktracker.R
import com.jesse.tasktracker.databinding.OnboardingFragmentBinding

class OnboardingFragment : Fragment() {

    private var _binding: OnboardingFragmentBinding? = null
    private val binding: OnboardingFragmentBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = OnboardingFragmentBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}