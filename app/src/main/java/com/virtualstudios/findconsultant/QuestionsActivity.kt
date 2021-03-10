package com.virtualstudios.findconsultant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.virtualstudios.findconsultant.databinding.ActivityQuestionsBinding

class QuestionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageNext.setOnClickListener {

            if(binding.viewFlipper.displayedChild != binding.viewFlipper.childCount){
                binding.viewFlipper.showNext()
            }
        }

        binding.imagePrevious.setOnClickListener {
            binding.viewFlipper.showPrevious()

            if (binding.viewFlipper.displayedChild == 0) {
                binding.viewFlipper.showPrevious()
            }
        }
    }
}