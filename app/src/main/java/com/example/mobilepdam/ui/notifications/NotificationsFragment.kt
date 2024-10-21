package com.example.mobilepdam.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.mobilepdam.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Set click listeners for each question to toggle visibility of its answer
        binding.faqQuestion1.setOnClickListener { toggleVisibility(binding.faqAnswer1) }
        binding.faqQuestion2.setOnClickListener { toggleVisibility(binding.faqAnswer2) }
        binding.faqQuestion3.setOnClickListener { toggleVisibility(binding.faqAnswer3) }
        binding.faqQuestion4.setOnClickListener { toggleVisibility(binding.faqAnswer4) }
        binding.faqQuestion5.setOnClickListener { toggleVisibility(binding.faqAnswer5) }

        return root
    }

    // Function to toggle the visibility of the answer
    private fun toggleVisibility(answer: TextView) {
        answer.visibility = if (answer.visibility == View.GONE) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
