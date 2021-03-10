package com.virtualstudios.findconsultant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.virtualstudios.findconsultant.databinding.ActivityQuestionsBinding

class QuestionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionsBinding
    private val totalQuestions: Int = 6
    private var currentQuestions: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageNext.setOnClickListener {

            if (currentQuestions != totalQuestions) {
                currentQuestions++
                binding.viewFlipper.showNext()
                binding.textProgress.text = "$currentQuestions/$totalQuestions"
                binding.progressBar.progress = currentQuestions
                binding.progressBar.animate()
            }
        }

        binding.imagePrevious.setOnClickListener {
            if (currentQuestions != 1) {
                currentQuestions--
                binding.viewFlipper.showPrevious()
                binding.textProgress.text = "$currentQuestions/$totalQuestions"
                binding.progressBar.progress = currentQuestions
                binding.progressBar.animate()
            }
        }
    }
}